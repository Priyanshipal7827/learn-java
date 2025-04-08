import java.util.*;

public class basics {

    public static void main(String args[]) {
        // ********************question num 1 ***********************
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a + b + c) / 3;
        // System.out.println("num 1 is : " + a);
        // System.out.println("num 2 is : " + b);
        // System.out.println("num 2 is : " + c);
        // System.out.println("Average is : " + avg);
        // sc.close();
        // ***************** question number 2 **************
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println("Side of :" + a);
        // int area = a * a;
        // System.out.println("Area of side of squre : " + area);
        // sc.close();
        // ***************** question number 3 *************
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // System.out.println("price of pencil : " + pencil);
        // System.out.println("price of pen : " + pen);
        // System.out.println("price of eraser : " + eraser);
        // float total = pen + pencil + eraser;
        // System.out.println("Total is : " + total);
        // float newTotal = total + (0.18f * total);
        // System.out.println("New total is : " + newTotal);
        // sc.close();
        // int $ = 24;
        // System.out.println($);
        // ***************operators*************
        // *&&&&&&&&&&&&&&&&& Arithmetic Operator&&&&&&&&&&&&*
        // int A = 10;
        // int B = 5;
        // System.out.println(" add = " + (A + B));
        // System.out.println(" sub = " + (A - B));
        // System.out.println(" mul = " + (A * B));
        // System.out.println(" div = " + (A / B));
        // System.out.println(" mod = " + (A % B));
        // System.out.println(A++);
        // System.out.println(++A);
        // System.out.println(--A);
        // System.out.println(A--);
        // *&&&&&&&&&&&&&&&& Relational Operators &&&&&&&&&&&&*
        // int a = 10;
        // int b = 5;
        // System.out.println(a == b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);
        // *&&&&&&&&&&&&& logical operators &&&&&&&&&&&&*
        // int a = 10 ;
        // a += 10;
        // int b = 20;
        // b -= 10;
        // int c = 30;
        // c *= 2;
        // int d = 40;
        // d /= 2;
        // int e = 10;
        // e %= 5;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // int x = 2;
        // int y = 5;
        // int exp1 =( x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println(exp1);
        // System.out.println(exp2);
        // int age = 12;
        // if (age >= 18) {
        // System.out.print("You are adult");
        // } else{
        // System.out.println("Not adult");

        // int a = 45;
        // int b = 50;
        // if (a>b) {
        // System.out.print("The largest num is a : " + a);

        // } else{
        // System.out.println("The largest num is b : " + b);
        // }
        // Scanner nc = new Scanner(System.in);
        // int number = nc.nextInt();
        // System.out.println("Number is : " + number);
        // if (number % 2 == 0){
        // System.out.println("Number is Even.");
        // } else {
        // System.out.println("Number is ODD.");
        // }
        // nc.close();
        // int Age = 34;
        // if ( Age >= 18){
        // System.out.println("Adult.");
        // } else if ( Age >= 13 && Age < 18) {
        // System.out.println("Teenager");
        // } else {
        // System.out.println("Child");
        // }
        // Scanner nc = new Scanner(System.in);
        // int income = nc.nextInt();
        // int tax;
        // if ( income < 500000) {
        // tax = 0;
        // } else if ( income >= 500000 && income <1000000) {
        // tax = (int) (income * 0.2);
        // } else {
        // tax = (int) (income * 0.3);
        // }
        // System.out.println("Your tax is : " + tax);
        // nc.close();

        // }
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Num 1 is : " + a);
        // System.out.println("Num 2 is : " + b);
        // System.out.println("Num 3 is : " + c);
        // if ( a >= b && a >= c) {
        // System.out.println("Largest number is A: " + a);
        // } else if ( b >= a && b >= c){
        // System.out.println("Largest number is B: " + b);
        // } else {
        // System.out.println("Largest number is C: " + c);
        // }
        // sc.close();
        // int num = 6;
        // String type = ((num % 2) == 0) ? "Even" : "odd";
        // System.out.println(type);
        // Scanner sc = new Scanner(System.in);

        // int marks = sc.nextInt();
        // String status = marks >= 33 ? "Pass" : "Fail" ;
        // System.out.println(status);
        // sc.close();
        // int number = 2;
        // switch (number) {
        // case 1: System.out.println("day one");
        // break;
        // case 2: System.out.println("day two");
        // break;
        // case 3: System.out.println("day three");
        // break;
        // case 4: System.out.println("day four");
        // break;
        // default: System.out.println("nothing");
        // break;
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter Operation : ");
        // char operation = sc.next().charAt(0);

        // switch (operation) {
        // case '+': System.out.println(a + b);
        // break;
        // case '-': System.out.println(a - b);
        // break;
        // case '*': System.out.println(a * b);
        // break;
        // case '/': System.out.println(a / b);
        // break;
        // case '%': System.out.println(a % b);
        // break;
        // }
        // sc.close();
        // int count = 0;
        // while (count < 100) {
        // System.out.println("hello priyanshi! "+ count);
        // count++;
        // }
        // System.out.println("hello code is end!");
        // int num = 1;
        // while (num <= 10) {
        // System.out.println(num);
        // num++;
        // }
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int count = 1;
        // while (count <= range) {
        // System.out.print(count + " ");
        // count++;
        // }
        // sc.close();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("n is : " + n );
        // int i = 1;
        // int sum = 0;
        // while ( i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.print("sum is : " + sum);
        // sc.close();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for ( int i = 1; i <= n; i++){
        // System.out.println("Number is : " + i );
        // }
        // sc.close();
        // for( int line = 1; line <= 4; line++){
        // System.out.println("****");
        // }
        // int n = 123456789;
        // while ( n > 0){
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n /= 10;
        // }
        // int i = 1;
        // do{
        // System.out.println("hello priyanshi! " + i);
        // i++;
        // } while (i <= 10);
        // Scanner sc = new Scanner( System.in);

        // do {
        // System.out.print( "Enteryour number : ");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // break;
        // }
        // } while (true);
        // sc.close();
        // System.out.println("Hey! it's outer of loop !");
        // System.out.println("Next statement is start! ");
        // for( int i = 1; i <= 5; i++) {
        // if(i == 3){
        // continue;
        // }
        // System.out.println(i);

        // }
        // System.out.println("Ending of these code & statement !");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // if (n == 2){
        // System.out.println("N is prime Number.");
        // } else{
        // boolean isprime = true;
        // for( int i = 2; i <= Math.sqrt(n); i++){
        // if (n % i ==0) {
        // isprime = false;
        // }
        // }
        // if (isprime == true) {
        // System.out.println("N is prime number.");
        // }else{
        // System.out.println("N is composite number.");
        // }
        // sc.close();
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter num 1 : " );
        // int a = sc.nextInt();
        // System.out.print("Enter num 2 : " );
        // int b = sc.nextInt();
        // System.out.print("Enter num 3 : " );
        // int c = sc.nextInt();
        // int avg = (a + b + c) / 3;
        // System.out.println("Average of three numbers are : " + avg);
        // sc.close();
        // Scanner scn = new Scanner(System.in);
        // int year = scn.nextInt();
        // System.out.println("Enter your year : " + year);
        // if ( year % 400 == 0) {
        // System.out.println("It's a leap year.");
        // } else if ( year % 4 == 0 && year % 100 != 0) {
        // System.out.println("It's a leap year.");
        // }else {
        // System.out.println("It's not a leap year.");

        // }scn.close();
        // Scanner sc = new Scanner(System.in);
        // int month = sc.nextInt();

        // switch (month) {
        // case 1: System.out.println("jan & day's 31");
        // break;
        // case 2 : System.out.println("feb & day's 28");
        // break;
        // case 3 : System.out.println("mar & day's 31");
        // break;
        // case 4 : System.out.println("apr");
        // break;
        // case 5 : System.out.println("may");
        // break;
        // case 6 : System.out.println("jun");
        // break;
        // case 7 : System.out.println("july");
        // break;
        // case 8 : System.out.println("agu");
        // break;
        // case 9 : System.out.println("sep");
        // break;
        // case 10 : System.out.println("oct");
        // break;
        // case 11 : System.out.println("nov");
        // break;
        // case 12 : System.out.println("dec");
        // break;
        // default: System.out.println("condition is mismatched!");
        // break;
        // }
        // sc.close();
        // int i = 0;
        // int j = 10;
        // while (i<=j) {
        // System.out.println(i + " " + j + " ");
        // i++;
        // j--;
        // }
        //
        // int i = 0;
        // int j = 10;
        // do {
        // System.out.println(i + " " + j + " ");
        // i++;
        // j--;
        // } while (i<=j);
        // for ( int i = 0; i<=5; i++) {
        // System.out.println(i + " hello world!");
        // i +=2;
        // }
        System.out.println("Next statment is started by while loop.");

        int p = 0;
        int q = 10;
        while (p <= q) {
            System.out.println(p + " " + q + "");
            p++;
            q--;
        }
        System.out.println("Next statment is started by for loop.");

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println(i + " " + j + " ");
        }
        System.out.println("Next statment is started by  do while loop.");
        int a = 0;
        int b = 10;
        do {
            System.out.println(a + " " + b + " ");
            a++;
            b--;
        } while (a <= b);
        System.out.println("so next statement is stated!");
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("next statement is started!");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Next statement is started!");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
    
        }
        System.out.println("Next statement is started!");
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println(" ");
        }
        System.out.println("Next statement is started!");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println("your number is : " + num);
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= num - line + 1; star++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("next statement is started!");
        int hight = scn.nextInt();
        System.out.println("Enter your hight stars : " + hight);
        int width = scn.nextInt();
        
        System.out.println("Enter your width stars : " + width);
        for (int row = 0; row < hight; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == hight - 1 || col == 0 || col == width - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
       scn.close();
    }
}