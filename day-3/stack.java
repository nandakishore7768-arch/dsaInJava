class Stack{
    int top = -1;
    int capacity = 100;
    int stack_[] = new int[capacity];

    public void push(int data){
        if(this.isFull() == false){
            stack_[top + 1] = data;
            top += 1;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public int top_element(){
        if(top > -1){
            return stack_[top];
        }
        return -1;
    }

    public void pop(){
        if(this.isEmpty() == false){
            stack_[top] = 0;
            top -= 1;
        }
    }

    public boolean find(int element){
        for(int i = 0; i <= top; i++){
            if(stack_[i] == element){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(int i =0; i<= top; i++){
            System.out.print(stack_[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public int return_size(){
        return top + 1;
    }
}


public class stack {
    public static void main(String[] args){
        Stack sc = new Stack();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        sc.print();

        System.out.println(sc.top_element());
        sc.pop();
        System.out.println(sc.isEmpty());

        System.out.println(sc.top_element());
        sc.pop();
        System.out.println(sc.isEmpty());

        System.out.println(sc.top_element());
        sc.pop();
        System.out.println(sc.isEmpty());

        System.out.println(sc.top_element());
        sc.pop();
        System.out.println(sc.isEmpty());

        System.out.println(sc.top_element());
        sc.pop();
        System.out.println(sc.isEmpty());
        System.out.println(sc.top_element());

        System.out.println(sc.isFull());
        System.out.println(sc.return_size());
    }
}
