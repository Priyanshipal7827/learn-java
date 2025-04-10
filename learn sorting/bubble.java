public class bubble{
    public static void bubblesort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i=0; i<n; i++){
            swapped = false;
            for(int j=0; j<n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       bubblesort(arr);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
