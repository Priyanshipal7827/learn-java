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
        if(temp > 100){
            System.out.println("You have a fever because your temp is : " + temp);
        } else{
            System.out.println("You don't have a fever because your temp is : " + temp);
        }

        sc.close();
    }

}
