package oops;

import java.util.Scanner;

public class ClassObjects {
    public static void main(String[] args) {
        //print the name, technology
        //print the student name, technology
        Trainer trainer = new Trainer();
        trainer.trainerName = "Pragya Singh";
        trainer.trainerTechnology = "JAVA";

        //to call the method of trainer class to print profile

        System.out.println("My name is: " + trainer.trainerName + "my technology is: " + trainer.trainerTechnology);
        Student student = new Student();
        System.out.println("Enter the your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        student.studentName= name;
        student.studentEnrolledTechnology= trainer.trainerTechnology;
        System.out.println(student.studentName);
        System.out.println(student.studentEnrolledTechnology);

    }
}


class Trainer{
    String trainerName;
    String trainerTechnology;

    void printTrainerProfile( String name, String tecnology){
        System.out.println("Name: " + name + " Technology: " + tecnology);
    }
}
class Student{
    String studentName;
    String studentEnrolledTechnology;


}