package com.company.Collections.ListExercise;

import java.util.List;

public class Coton extends Car{
    private String model;
    private int yearOfProduction;
    private boolean highClass;

    public Coton(String model, int yearOfProduction, boolean highClass) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.highClass = highClass;
    }
    public Coton(String color, String maxSpeed, boolean roof, String model, int yearOfProduction, boolean highClass) {
        super(color, maxSpeed, roof);
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.highClass = highClass;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public boolean isHighClass() {
        return highClass;
    }
    public void setHighClass(boolean highClass) {
        this.highClass = highClass;
    }

    public static void carGiveAway(List<Person> thePeople, List<Coton> theCars){
        for (Person p:thePeople){
            p.getsNewCoton(theCars);
        }
    }
    @Override
    public String toString() {
        return "Coton{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", highClass=" + highClass +
                '}';
    }
}
