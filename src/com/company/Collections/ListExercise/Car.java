package com.company.Collections.ListExercise;

import java.util.List;

public class Car {
    private String color;
    private String maxSpeed;
    private boolean roof = true;

    public Car() {
    }
    public Car(String color, String maxSpeed, boolean roof) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.roof = roof;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public boolean isRoof() {
        return roof;
    }
    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", roof=" + roof +
                '}';
    }
}
