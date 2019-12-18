package com.geekbrains.datamapper;

import java.sql.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StudentMapper {

    Map<Integer, Student> identityMap=new ConcurrentHashMap<>();

    private final Connection connection;
    private boolean next;

    public StudentMapper(Connection connection) {
        this.connection = connection;
    }

//    public Student findById(int id) throws SQLException {
//        Student student = new Student();
//        PreparedStatement statement = connection.prepareStatement("SELECT ID, FIRSTNAME, LASTNAME, FIRSTNAME, GRADE FROM STUDENT WHERE ID = ?");
//        statement.setInt(1, id);
//        try (ResultSet resultSet = statement.executeQuery()) {
//            while (resultSet.next()) {
//                student.setId(resultSet.getInt(1));
//                student.setFirstName(resultSet.getString(2));
//                student.setLastName(resultSet.getString(3));
//                student.setGrade(resultSet.getInt(4));
//            }
//        }
//        return student;
//    }

    public void insert(Connection connection, Student student) throws SQLException {

        String insertion = "INSERT into students values (?, ?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(insertion);
        try {
            student.setId(Sequence.nextVal(connection));
            ps.setInt(1, student.getId());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getFirstName());
            ps.setInt(4, student.getGrade());
            ps.executeUpdate();
            identityMap.put(student.getId(), student);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Connection connection, Student student) throws SQLException {

        String insertion = "UPDATE students SET lastname=?, firstname=?, grade=? WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(insertion);
        try {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getFirstName());
            ps.setInt(4, student.getGrade());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void delete(Connection connection, Student student) throws SQLException {
        int result = -1;
        String insertion = "DELETE from students WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(insertion);
        try {
            ps.setInt(1, student.getId());
            int count = ps.executeUpdate();
            result = 0;
            identityMap.remove(student.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Student getById(Connection connection, Integer id) {
        Student student=null;

        PreparedStatement ps = null;
        if(identityMap.containsKey(id)) return identityMap.get(id);
        try {
            String insertion = "SELECT * from students WHERE id=?;";
            ps=connection.prepareStatement(insertion);
            ps.setInt(1, id);
            ResultSet resultSet= ps.executeQuery();
            if(resultSet.next()){
                student=new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                        resultSet.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return student;
    }

    public List<Student> selectAll(Connection connection){
        Statement statement = null;
        List<Student> students=null;
        try {
            String insertion = "SELECT * from students;";
            statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(insertion);
            if(resultSet.next()){
                students.add(new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
                        resultSet.getInt(4)));
                System.out.println(resultSet.getString(2) +" "+ resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }return students;
    }

}


