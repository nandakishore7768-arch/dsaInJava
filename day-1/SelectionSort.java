public class SelectionSort {
    public static int findMin(int arr[], int low){
        int min = low;
        int min_value = arr[low];

        for(int i = low; i < arr.length; i++){
            if(arr[i] < min_value){
                min_value = arr[i];
                min = i;
            }
        }

        return min;
    }
    public static void main(String[] args){
        int arr[] = {6,5,2,8,3,7};
        
        for(int i = 0; i < arr.length - 1; i++){
            int index = findMin(arr, i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
