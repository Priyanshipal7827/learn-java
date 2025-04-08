// import java.util.*;

// public class array {
//     public static void update(int numbers[]){
//     for(int i=0; i<numbers.length; i++){
//     numbers[i] = numbers[i] +1;
//     }
//     }

//     //this function for search number
//     public static int linearSearch(int num[], int key) {
//         for (int i = 0; i < num.length; i++) {
//             if (num[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     //this function for search food in food list
//     public static int foodsearch(String food[], String key){
//         for(int i =0; i<food.length;i++){
//             if(food[i].equals(key)){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         // int number[] = {}

//         //this code for find the food items in list
//         Scanner sc = new Scanner(System.in);
//         String food[] = {"dosa", "chilli patato", "pizza","burger", "samosa", "spring roll", "momos","pasta", "maggi"};
//         String key = sc.nextLine();
//         int index = foodsearch(food, key);
//         if(index == -1){
//             System.out.println("key is not found");
//         }else{
//             System.out.println("key at index : " + index);
//         }
//         sc.close();

//         // this code for find the index of input numbers
//         // Scanner sc = new Scanner(System.in);
//         int num[] = { 2,4,6,8,10,12,14,16,18,20,22,24,26};
//         System.out.println("Please enter key number!");
//         // int key = sc.nextInt();
//         System.out.println("Key is : " + key);
//         // int index = linearSearch(num, key);
//         if(index == -1){
//         System.out.println("Key is not found");
//         }else{
//         System.out.println("Key at index : " + index );
//         }
//         sc.close();

//         // this code for print marks
//         int marks[] = new int[50];
//         Scanner scn = new Scanner(System.in);
//         marks[0] = scn.nextInt();
//         marks[1] = scn.nextInt();
//         marks[2] = scn.nextInt();
//         System.out.println("phy is : " + marks[0]);
//         System.out.println("math is : " + marks[1]);
//         System.out.println("chem is : " + marks[2]);
//         marks[2] = 100;
//         System.out.println("chem is : " + marks[2]);
//         scn.close();
//         int numbers[] = {97,98,99};
//         update(numbers);
//         for(int i=0; i<numbers.length;i++){
//         System.out.print(numbers[i] + " ");
//         }
//         System.out.println(" ");
//     }
// }
public class arrays {

    // this code for binary search
    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // this code for reverse array
    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    // this code for print pairs in array item
    public static void printpairs(int num1[]) {
        for (int i = 0; i < num1.length; i++) {
            int curr = num1[i];
            for (int j = i + 1; j < num1.length; j++) {
                System.out.print("(" + curr + "," + num1[j] + ")");
            }
            System.out.println();
        }
    }

    // this code for print subarrays
    public static void printsubarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + ts);
    }

    // this code for print mas sum of subarray
    public static void maxsubarrays(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
            System.out.println();
        }
        System.out.println("max sum  : " + maxsum);
    }

    //this code for find max num by using kadane's algo
     public static void kadanes(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            currsum = currsum + num[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(currsum,maxsum);
        }
        System.out.println("sum of subarray is : " + maxsum);
    }

    public static void main(String args[]) {



        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
        // this code for finding max num
        // int arr[] = { 2, 45, 67, 89, 3, 4, 856, 32, 789 };
        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     if (max < arr[i]) {
        //         max = arr[i];
        //     }
        // }
        // for(int i = 0; i < arr.length; i++){
        //     if(smax< arr[i] && arr[i] != max){
        //         smax = arr[i];
        //     }
        // }

        // System.out.println("first max value : " + max);
        // System.out.print("second max value is : " + smax);

        // this code for print mas sum of sub array
        // int numbers[] = {1,-2,6,-1,3};
        // maxsubarrays(numbers);

        // this code for print sub array
        // int numbers[] = {2,4,6,8,10};
        // printsubarrays(numbers);

        // this code for print pairs of array
        // int num1[] = {2,4,6,8,10};
        // printpairs(num1);

        // this code for reverse the array
        // int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // reverse(num);
        // for(int i = 0; i < num.length; i++){
        // System.out.print(num[i] + " ");
        // }
        // System.out.println();

        // this code for binary search
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        // System.out.println("please enter your key : " + key);
        // System.out.println("index for key is : " + binarySearch(num, key));
        // sc.close();
    }
}