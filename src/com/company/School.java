package com.company;

public class School {
    private String name;
    private Student[] students;

    public School(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    @SuppressWarnings(value="unchecked")
    public Student getStudentbyID(String id)throws ArrayIndexOutOfBoundsException{
        // for circumstance where id is not withing the bound of the array in question.
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getId().equals(id)){
                return this.students[i];
            }
        }

        return null;
    }
}
