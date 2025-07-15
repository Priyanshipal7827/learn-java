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
    }
}
