package com.company;

public class Student extends Person{
    private School school;
    private String grade;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(School school, String grade,String id) {
        this.school = school;
        this.grade = grade;
        this.id=id;
    }

    public Student(String name, int age, String id,School school, String grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
        this.id=id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public String getName(){
        return this.getName();
    }

}
