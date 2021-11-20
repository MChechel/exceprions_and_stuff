package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //try blocks, catch blocks and finally block have different scopes
        School school = new School("TTU");
        Student abhita = new Student("Abi",23,"he009",school,"abc");
        //school.setStudents(new Student[]{abhita});
        try{
        school.getStudentbyID("he009");
        }catch(NullPointerException e){
           // System.out.println(e.getMessage());
             e.printStackTrace();
            //System.out.println("The error occurred - student not found");
        }finally {
            System.out.println("There was an error and the person could not be found in school - "+school.getName());
        }



    }
}
