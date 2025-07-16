import java.util.*;
public class statement {
    public static void main(String arg[]){
        // *************conditional statement************
        // if else statement
      
        int age = 14;
        if (age>=18) {
            System.out.println("Adult : you can drive, vote.");
        } 
        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not adult!");
        }
        // find the largest of two numbers
        int a = 12;
        int b = 40;
        if (a>b) {
            System.out.println("A is largest of two numbers!");
        }else{
            System.out.println("B is largest of two number");
        }
        // print even and odd number useing input
        System.out.println("Enter your number :  ");
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even : " + number);
        } else{
            System.out.println("Number is odd : " +  number);
        }
        // learn else if statement 
        System.out.println("Enter your age :  ");
        int age1 = sc.nextInt();
        if(age1 >= 18){
            System.out.println("Adult");
        } else if(age1 >= 113 && age1 <= 18){
            System.out.println("Teenager");
        } else{
            System.out.println("Child");
        }

        sc.close();
    }
}
