import java.util.*;

public class question {
    public static void main(String arg[]) {
        // ************question 1 find the average of two numbers*********
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double avg = (a + b + c)/ 3;
        System.out.println(avg);
        // *******************question 2 find the area of the side ***********
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println( "area of squre is : " + area);
        // ******************qusetion 3 3 item with 18% gst**********
        // float pen = sc.nextFloat();
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // Float total = pen + pencil + eraser;
        // System.out.println("Total of : " + total);
        // float newtotal = total + (0.18f * total);
        // System.out.println("Bill of : " + newtotal);
        
        sc.close();
    }
}
