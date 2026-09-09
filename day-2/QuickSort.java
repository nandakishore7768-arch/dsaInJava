public class QuickSort{
    public static int partition(int arr[], int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int[] quicksort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr,pi + 1, high);
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,1,4,2};
        int arr1[] = quicksort(arr, 0, arr.length - 1);
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();
        

        
    }
}