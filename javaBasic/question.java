import java.util.*;

public class question {
    public static void main(String arg[]) {
        // ************question 1 find the average of two numbers*********
        Scanner sc = new Scanner(System.in);
        // double a = sc.nextFloat();
        // double b = sc.nextFloat();
        // double c = sc.nextFloat();
        // double avg = (a + b + c) / 3;
        // System.out.println(avg);
        // *******************question 2 find the area of the side ***********
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println( "area of squre is : " + area);
        // ******************qusetion 3 3 item with 18% gst**********
        // System.out.println("print three item with 18% gst ");
        // float pen = sc.nextFloat();
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // Float total = pen + pencil + eraser;
        // System.out.println("Total of : " + total);
        // float newtotal = total + (0.18f * total);
        // System.out.println("Bill of : " + newtotal);

        // ***************quetion based on operators ***********
        // question 1
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println(exp1);
        // System.out.println(exp2);

        // question 2
        // int x1 = 200, y1 = 50, z1 = 100;
        // if (x1 > y1 && y1 > z1) {
        // System.out.println("Hello");
        // }
        // if (z1 > y1 && z1 < x1) {
        // System.out.println("Java");
        // }
        // if ((y1 + 200) < x1 && (y1 + 150) < z1) {
        // System.out.println("Hello Java");

        // }
        // question 3
        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        // question 4
        // int x = 9, y = 12;
        // int a1 = 2, b1 = 4, c1 = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a1 + b1 * c1) + (3 + y * (2 + a1)) / (a1 +
        // b1 * y);
        // System.out.println(exp);

        // question 5

        // int p = 10, q = 5;
        // int exp1 = (q * (p / q + p / q));
        // int exp2 = (q * p / q + q * p / q);
        // System.out.println(exp1);
        // System.out.println(exp2);
        // conditional statement
        // question 1
        // int num = sc.nextInt();
        // if (num > 0) {
        // System.out.println("Positive number");
        // } else if (num < 0) {
        // System.out.println("Negative number");
        // } else {
        // System.out.println("Zero");
        // }

        // check numer is positive or not

        // question 2
        // check you have fever or not
        // System.out.print("Enter your tempreture : ");
        // double temp = sc.nextDouble();

        // if (temp > 100) {
        // System.out.println("You have fever.");
        // } else {
        // System.out.println("You have not fever.");
        // }
        // question number 3
        // Write a Java program to input week number(1-7) and print day of week name

        // System.out.print("Enter week number : ");
        // int week = sc.nextInt();
        // switch (week) {
        // case 1:
        // System.out.println("Monday");

        // break;
        // case 2:
        // System.out.println("Tuseday");

        // break;
        // case 3:
        // System.out.println("Wednesday");

        // break;
        // case 4:
        // System.out.println("Thursday");

        // break;
        // case 5:
        // System.out.println("Friday");

        // break;
        // case 6:
        // System.out.println("Saturday");

        // break;
        // case 7:
        // System.out.println("Sunday");

        // break;

        // default:
        // System.out.println("Somthing is wrong");
        // break;
        // }

        // question number 4
        // find the value of x and y
        // int a = 63;
        // int b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println("Value of X : " + x);
        // System.out.println("Value of Y : " + y);

        // question number 5
        // leap year or not

        // int year = sc.nextInt();
        // if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
        // System.out.println("Leap year");
        // } else {
        // System.out.println("Not a leap year");
        // }
        // question number 6
        // calculator using switch statement

        int a = 10;
        int b = 20;
        char operation = '+';
        // switch (operation) {
        // case '+':
        // System.out.println(a + b);
        // break;

        // case '-':
        // System.out.println(a - b);
        // break;

        // case '*':
        // System.out.println(a * b);
        // break;

        // case '/':
        // System.out.println(a / b);
        // break;

        // default:
        // System.out.println("Not valid operator");
        // break;

        // }

        // design a calculator using if else statement

        if (operation == '+') {
            System.out.println("Your answer is : " + (a + b));

        } else if (operation == '-') {
            System.out.println("Your answer is : " + (a - b));
        } else if (operation == '*') {
            System.out.println("Your answer is : " + (a * b));
        } else if (operation == '/') {
            System.out.println("Your answer is : " + (a / b));
        } else {
            System.out.println("Not valid operation!");
        }

        // number of month
        System.out.println("Enter month number : ");

        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("month is Jan.");
                break;

            case 2:
                System.out.println("month is Feb.");
                break;

            case 3:
                System.out.println("month is Mar.");
                break;

            case 4:
                System.out.println("month is Apr.");
                break;

            case 5:
                System.out.println("month is May.");
                break;

            case 6:
                System.out.println("month is June.");
                break;

            case 7:
                System.out.println("month is July.");
                break;

            case 8:
                System.out.println("month is Aug.");
                break;

            case 9:
                System.out.println("month is Sep.");
                break;

            case 10:
                System.out.println("month is Oct.");
                break;

            case 11:
                System.out.println("month is Nov.");
                break;

            case 12:
                System.out.println("month is Dec.");
                break;

            default:
                System.out.println("Month number is incorrect!");
                break;

        }

        

        sc.close();
    }
}
