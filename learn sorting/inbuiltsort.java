import java.util.*;
public class inbuiltsort {
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}
