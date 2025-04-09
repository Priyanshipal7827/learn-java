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
    public static void kadanes(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currsum = currsum + num[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("sum of subarray is : " + maxsum);
    }

    public static int trapperWater(int height[]) {
        //for find leftmax boundry
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        //for find rightmax boundry
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        //loops
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            //find waterlevel = min(leftmax boundry, rightmax boundry)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //find trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    //this code for buy and sell stock
    public static int buyandsellstock(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    //this code for find the water in the tawars
    public static int findwater(int height[]){
        int n = height.length;
        int maxarea = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int h = Math.min(height[i], height[j]);
                int w = j-i;
            
                int currarea = h*w;
                maxarea = Math.max(maxarea, currarea);
            }
        }
        return maxarea;

    }
    public static void main(String args[]) {

        //this code for find the water in the tawars
        int heigth[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(findwater(heigth));

        //this code for buy and sell stock
        // int prices[] = {7,1,5,3,6,4};
        // System.out.println(buyandsellstock(prices));
        //this code for find trapped water in bars
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trapperWater(height));
        // int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadanes(num);
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
