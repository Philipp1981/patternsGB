package com.geekbrains.datamapper;

import java.util.Optional;

public interface StudentDataMapper {

    Optional<Student> find(int id);
    void insert(Student student) throws MapperException;
    void update(Student student) throws MapperException;
    void delete(Student student) throws MapperException;
}
