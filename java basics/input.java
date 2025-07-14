import java.util.*;

public class input {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // sum of a , b
        int a = sc.nextInt("Enter  First Num :");
        int b = sc.nextInt("Enter Second Num :");
        int sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}
