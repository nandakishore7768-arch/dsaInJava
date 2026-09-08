public class Main{
    public static int linear_search(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int nums[], int target){
        int low = 0;
        int high = nums.length - 1;
        System.out.println("Binary Search Algorithm");
        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int RecursiveBS(int nums[], int target){
        int low = 0;
        int high = nums.length - 1;
        return RecursiveBinarySearch(nums, target, low, high);
    }

    public static int RecursiveBinarySearch(int nums[], int target, int low, int high){
        int mid = low + (high - low)/2;
        System.out.println("Recursive Binary Search Algorithm");
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            high = mid;
        }
        else{
            low = mid + 1;
        }
        if(low > high){
            return -1;
        }
        return RecursiveBinarySearch(nums, target, low, high);
    }
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13,15};
        int target = 15;
        int index = RecursiveBS(nums, target);
        if(index != -1){
            System.out.println(index);
        }
        else{
            System.out.println("target not found");
        }      
    }
}