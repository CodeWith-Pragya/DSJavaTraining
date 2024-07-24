import java.util.Scanner;

public class name{
    public static void main(String[] args) {
       System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("your name" +name+"your age"+age);
        //to check whether user eligible for voting or not
       /*  if(age>=18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("yor are not eligible");
        }*/
        String output =(age>=18)?"you are eligible":"you are not eligible";
        System.out.println(output);


        }



    }
