package assignmentQuestion;

import java.util.*;

public class conditionalStastement {

    // ************* question 1 *************
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive : " + num);
        } else if (num < 0) {
            System.out.println("Number is negative : " + num);
        } else {
            System.out.println("Number is zero : " + num);
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

        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println("The value of X : " + x);
        System.out.println("The value of Y : " + y);

        sc.close();
    }

}
