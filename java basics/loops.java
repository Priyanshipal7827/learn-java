import java.util.*;

public class loops {
    public static void main(String arg[]) {
        // learn loops
        int count = 1;
        while (count < 5) {
            System.out.println(count + " hello priyanshi!");
            count++;
        }
        // print 1 to 10 number using while loop
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        // print number 1 to n
        // System.out.println("Print n numbers ");
        Scanner sc = new Scanner(System.in);
        // int i = 1;
        // int n = sc.nextInt();
        // while(i <= n){
        // System.out.println(i);
        // i++;
        // }

        // print sum of natural numbers
        System.out.print("Enter value of n1 : ");
        int j = 1;
        int n1 = sc.nextInt();
        int sum = 0;
        while (j <= n1) {
            sum += j;
            j++;
        }
        System.out.println("Sum is : " + sum);

        sc.close();

    }
}
