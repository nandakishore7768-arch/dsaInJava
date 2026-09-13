public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = 0;j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
            else{
                count += 1;
            }
        }

        for(int x: arr){
            System.out.println(x);
        }

        System.out.println("Takes " + count + " Iterations to sort");
    }
}