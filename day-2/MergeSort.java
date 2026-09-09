public class MergeSort {
    public static int[] merge(int arr[], int arr2[]){
        int i = 0;
        int j = 0;
        int merged_list[] = new int[arr.length + arr2.length];
        while(i < arr.length && j < arr2.length){
            if(arr[i] > arr2[j]){
                merged_list[i + j] = arr2[j];
                j = j + 1;
            }
            else{
                merged_list[i + j] = arr[i];
                i = i + 1;
            }
        }

        while(j < arr2.length){
            merged_list[i + j] = arr2[j];
            j++;
        }

        while(i < arr.length){
            merged_list[i + j] = arr[i];
            i++;
        }
        return merged_list;
    }
    public static int[] merge_sort(int arr[], int low, int high){
        if(low >= high){
            return new int[]{arr[low]};
        }
        else if(low < high){
            int mid = (high + low)/2;
            int arr1[] = merge_sort(arr, low, mid);
            int arr2[] = merge_sort(arr, mid + 1, high);
            return merge(arr1, arr2);
        }   
        return arr;     
    }
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 1, 6, 7};
        int arr1[] = merge_sort(arr, 0, arr.length - 1);
        for(int i: arr1){
            System.out.println(i);
        }
    }
}
