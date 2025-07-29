import java.util.*;

public class conditionalStatement {
    public static void main(String arg[]) {
        // *************conditional statement************
        // if else statement

        int age = 14;
        if (age >= 18) {
            System.out.println("Adult : you can drive, vote.");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not adult!");
        }
        // find the largest of two numbers
        // int a = 12;
        // int b = 40;
        // if (a>b) {
        // System.out.println("A is largest of two numbers!");
        // }else{
        // System.out.println("B is largest of two number");
        // }
        // print even and odd number useing input
        System.out.println("Enter your number :  ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even : " + number);
        } else {
            System.out.println("Number is odd : " + number);
        }
        // learn else if statement
        System.out.println("Enter your age :  ");
        int age1 = sc.nextInt();
        if (age1 >= 18) {
            System.out.println("Adult");
        } else if (age1 >= 113 && age1 <= 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
        // income tax calculator
        System.out.println("Enter your income : ");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is : " + tax);
        // find largest of three numbers
        System.out.println("Enter your number for find the largest : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x >= y) && (x >= z)) {
            System.out.println("X is largest number!");
        } else if (y >= z) {
            System.out.println("Y is largest number!");
        } else {
            System.out.println("Z is largeswt number!");
        }
        // learn ternory operator
        int num = 12;
        String type = (num % 2 == 0) ? "even" : "odd";
        System.out.println(type);
        // check paass or fail
        int marks = 31;
        String result = (marks >= 33) ? "pass" : "fail";
        System.out.println(result);
        // switch statement
        String name = "dipanshu";
        switch (name) {
            case "himanshi":
                System.out.println("akdu jhagdalu!");
                break;
            case "priyanshi":
                System.out.println("gussal bigdel");
                break;
            case "dipanshu":
                System.out.println("nalayak aulad");
                break;
            case "sweety":
                System.out.println("kaamchor sbse bigdel");
                break;
        }
        // calculator using switch statement
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter operation : ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("wrong operator");
        }

        // assignment questions

        // ************* question 1 *************

        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("Number is positive : " + num1);
        } else if (num1 < 0) {
            System.out.println("Number is negative : " + num1);
        } else {
            System.out.println("Number is zero : " + num1);
        }

        // *************** question 2 **********
        System.out.print("Enter your temperature : ");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("You have a fever because your temp is : " + temp);
        } else {
            System.out.println("You don't have a fever because your temp is : " + temp);
        }

        // ************ question 3 ****************
        System.out.print("Enter the week number : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Sunday.");
                break;
            case 2:
                System.out.println("Today is Monday.");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday.");
                break;
            case 5:
                System.out.println("Today is thursday.");
                break;
            case 6:
                System.out.println("Today is friday.");
                break;
            case 7:
                System.out.println("Today is saturday.");
                break;
            default:
                System.out.println("Something went wrong!");

        }

        // ************** question 4 *************

        int a1 = 63, b1 = 36;
        boolean x1 = (a1 < b1) ? true : false;
        int y1 = (a1 > b1) ? a1 : b1;
        System.out.println("The value of X : " + x1);
        System.out.println("The value of Y : " + y1);

        // *************** question 5 **********

        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("This year is leap ");
        } else {
            System.out.println("This year is not leap ");

        }

        sc.close();
    }
}
