package com.company.Collections.ListExercise;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private ArrayList<Coton> cotonsOwned;
    private boolean likesCotons;

    public void setCotonsOwned(Coton myCar){
        this.cotonsOwned.add(myCar);
    }
    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cotonsOwned=" + cotonsOwned+
                ", likesCotons=" + likesCotons +
                '}';
    }
    public void setLikesCotons(boolean likesCotons) {
        this.likesCotons = likesCotons;
    }
    public Person(String name, int age, ArrayList<Coton> cotonsOwned, boolean likesCotons) {
        this.name = name;
        this.age = age;
        this.cotonsOwned = cotonsOwned;
        this.likesCotons = likesCotons;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<Coton> getCotonsOwned() {
        return cotonsOwned;
    }
    public boolean isLikesCotons() {
        return likesCotons;
    }

    public void getsNewCoton(List<Coton> theList){
        if (((this.getCotonsOwned().size())<1)&(this.likesCotons)){
            this.setCotonsOwned(theList.get((int)(Math.random() * theList.size())));
        }else{
            System.out.println("The person is already have a coton or DOES NOT LIKE IT!");
        }
    }


}
