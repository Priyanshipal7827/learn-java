import java.util.*;

public class question {
    public static void main(String arg[]) {
        // ************question 1 find the average of two numbers*********
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();
        double avg = (a + b + c) / 3;
        System.out.println(avg);
        // *******************question 2 find the area of the side ***********
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println( "area of squre is : " + area);
        // ******************qusetion 3 3 item with 18% gst**********
        System.out.println("print  three item with 18% gst ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        Float total = pen + pencil + eraser;
        System.out.println("Total of : " + total);
        float newtotal = total + (0.18f * total);
        System.out.println("Bill of : " + newtotal);

        // ***************quetion based on operators ***********
        // question 1
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println(exp1);
        // System.out.println(exp2);

        // question 2
        int x1 = 200, y1 = 50, z1 = 100;
        if (x1 > y1 && y1 > z1) {
            System.out.println("Hello");
        }
        if (z1 > y1 && z1 < x1) {
            System.out.println("Java");
        }
        if ((y1 + 200) < x1 && (y1 + 150) < z1) {
            System.out.println("Hello Java");

        }
        // question 3 
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);

        sc.close();
    }
}
