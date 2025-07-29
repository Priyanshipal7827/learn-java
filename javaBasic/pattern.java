

public class pattern {
    public static void main(String[] args) {
        // learn nested loops 

        // print star pattern
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


        // inverted star pattern 
        System.out.println("print inverted star pattern.");
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // print half pyarmid 
        System.out.println("print half  pyramid");

        for(int i=1;i<=4;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
