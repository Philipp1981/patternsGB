package com.geekbrains.datamapper;

import java.io.Serializable;


public final class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String lastName;
    private String firstName;
    private int grade;

    public Student(){}

    public Student(final int id, final String lastName, final String firstName, final int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName=firstName;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(final Object inputObject) {
        boolean isEqual = false;

        if (this == inputObject) {
            isEqual = true;
        } else if (inputObject != null && getClass() == inputObject.getClass()) {
            final Student inputStudent = (Student) inputObject;

            if (this.getId() == inputStudent.getId()) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return this.getId();
    }

    @Override
    public String toString() {
        return "Student [studentId=" + id + ", lastname=" + lastName + ", firstname=" + firstName + ", grade=" + grade + "]";
    }
}
