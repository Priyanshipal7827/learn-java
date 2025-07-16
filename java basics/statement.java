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
        // int a = 12;
        // int b = 40;
        // if (a>b) {
        //     System.out.println("A is largest of two numbers!");
        // }else{
        //     System.out.println("B is largest of two number");
        // }
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
        // income tax calculator
        System.out.println("Enter your income : ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0;
        }else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is : " + tax);
        // find largest of three numbers
        System.out.println("Enter your number for find the largest : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if( (x>=y) && (x>=z)){
            System.out.println("X is largest number!");
        } else if(y>=z){ 
            System.out.println("Y is largest number!");
        } else{
            System.out.println("Z is largeswt number!");
        }
        // learn ternory operator
        int num = 12;
        String type = (num%2 == 0)? "even" : "odd";
        System.out.println(type);
        //  check paass or fail
        int marks = 31;
        String result = (marks >= 33) ? "pass":"fail";
        System.out.println(result);
        sc.close();
    }
}
