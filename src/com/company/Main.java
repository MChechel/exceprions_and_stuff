package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //try blocks, catch blocks and finally block have different scopes
        School school = new School("TTU");
        Student abhita = new Student("Abi",23,"he009",school,"abc");
        //school.setStudents(new Student[]{abhita});
//        try{
//        school.getStudentbyID("he009");
//        }catch(NullPointerException e){
//           // System.out.println(e.getMessage());
//             e.printStackTrace();
//            //System.out.println("The error occurred - student not found");
//        }finally {
//            System.out.println("There was an error and the person could not be found in school - "+school.getName());
//        }

        //
//try{
//    sleepAndOpenFile("C:\\Users\\Mykhailo\\IdeaProjects\\StudentManagment\\Stude151ntManagment.iml");
//    System.out.println("The file was found");
//}catch (InterruptedException e){
//    System.out.println("Thread was disrupted - please run again");
//} catch(FileNotFoundException e){
//    System.out.println("FIle in question is not found!");
//}

        //creating our own exception - what is user enter not an integer?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//        if(age<0){
//            throw new IllegalArgumentException();
//        }
//        System.out.println("The age is "+age);




    }


    //new method for exceptions

    public static void sleepAndOpenFile(String filePath)throws InterruptedException, FileNotFoundException {
        Thread.sleep(2000);
        new FileReader(filePath);

    }

}
