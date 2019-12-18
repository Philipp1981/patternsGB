package com.geekbrains.datamapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class StudentDataMapperImpl implements StudentDataMapper {

    private List<Student> students = new ArrayList<>();

    @Override
    public Optional<Student> find(int id) {
        return this.getStudents().stream().filter(x -> x.getId() == id).findFirst();
    }



    @Override
    public void update(Student studentToBeUpdated) throws MapperException {
        String lastName = studentToBeUpdated.getLastName();
        String firstName = studentToBeUpdated.getFirstName();
        Integer index = Optional.of(studentToBeUpdated)
                .map(Student::getId)
                .flatMap(this::find)
                .map(students::indexOf)
                .orElseThrow(() -> new MapperException("Student [" + lastName +  firstName + "] is not found"));

        students.set(index, studentToBeUpdated);
    }

    @Override
    public void insert(Student studentToBeInserted) throws MapperException {
        Optional<Student> student = find(studentToBeInserted.getId());
        if (student.isPresent()) {
            String lastName = studentToBeInserted.getLastName();
            String firstName = studentToBeInserted.getFirstName();
            throw new MapperException("Student already [" + lastName + firstName + "] exists");
        }

        students.add(studentToBeInserted);
    }

    @Override
    public void delete(Student studentToBeDeleted) throws MapperException {
        if (!students.remove(studentToBeDeleted)) {
            String lastName = studentToBeDeleted.getLastName();
            String firstName = studentToBeDeleted.getFirstName();
            throw new MapperException("Student already [" + lastName + firstName + "] is not found");
        }
    }


    public List<Student> getStudents() {
        return this.students;
    }
}