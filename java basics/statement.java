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
        int a = 12;
        int b = 40;
        if (a>b) {
            System.out.println("A is largest of two numbers!");
        }else{
            System.out.println("B is largest of two number");
        }
    }
}
