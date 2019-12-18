package com.geekbrains.datamapper;

import java.sql.Connection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static final Random RANDOM=new Random();
    public static final String EXIT="exit";
    public static final StudentDataMapper DATA_MAPPER=new StudentDataMapperImpl();

    public static void main(String[] args) {
        Connection connection=DBConnector.getConnection();
        if(connection==null){
            exit(0);
            System.out.println("Connection not found");
        }

        DBObjects.createObjects(connection);

        generateStudents(connection, 100);
        Scanner input=new Scanner(System.in);
        String console;
        while (true){
            System.out.println("Введите команду (exit-выход): ");
            System.out.println("Команды: ");
            System.out.println("Номер: ");
            System.out.println("Фамилия: ");
            System.out.println("Имя: ");
            console=input.nextLine();
            if(console.equals(EXIT)) break;;
            String[] commands=console.split(" ");
            if(commands.length<2)continue;
            
        }
        DBObjects.dropObjects(connection);

        DBConnector.close();
    }

    public static void print(List<Student> list){
        System.out.println("Список студентов");

        for(Student student: list){
            System.out.printf(" %5d %s %8.2f\n", student.getId(), student.getLastName(), student.getFirstName(), student.getGrade());
        }
        System.out.println("_____________________________________");
    }

    public static void generateStudents(Connection connection, int num){
        System.out.println("Создайте студента");
        for(int i=0; i<num; i++){
            Student student=new Student(i,"Фамилия"+i, "Имя"+i, RANDOM.nextInt(5));
            DATA_MAPPER.insert(student);
        }
    }

}
