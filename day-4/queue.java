class Queue{
    int arr[] = new int[5];
    int size = 0;
    int front = 0;
    int back = 0;

    public void enque(int element){
        if(!isFull()){
            arr[back] = element;
            back = (back + 1) % 5;
            size += 1;
        }
        else{
            System.out.println("Queue is full");
        }

    }

    public void show(){
        for(int i = 0; i< size; i++){
            System.out.print(arr[(front + i) % 5] + " ");
        }
        System.out.println();
    }

    public int deque(){
        if(!isEmpty()){
            int element = arr[front];
            front = (front + 1) % 5;
            size = size - 1;
            return element;
        }
        else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isFull(){
        return size == 5;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

public class queue{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(5);
        q.enque(4);
        q.enque(3);
        q.enque(2);
        q.enque(8);
        q.enque(7);

        q.show();

        q.deque();
        q.show();
    }
}