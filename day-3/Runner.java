class Node{
    int data;
    Node next;
}

class LinkedList{
    Node start;
    
    public void insert(int data){
        Node current = start;
        Node n = new Node();
        n.data = data;

        if(current == null){
            current = n;   
            start = n;
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = n;
        }
    }

    public void insert(int index, int data){
        if(index == 0){
            this.insertAtStart(data);
            return;
        }

        Node n = new Node();
        n.data = data;
        Node current= start;

        for(int i = 0; i < index -1; i++){
            current = current.next;
        }

        Node copy = current.next;
        current.next = n;
        n.next = copy;
    }

    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        n.next = start;
        start = n;
    }
    public void print(){
        Node Current = start;

        while(Current != null){
            System.out.print(Current.data + " ");
            Current = Current.next;
        }
        System.out.println();
    }

    public void delete(int data){
        if(start == null){
            return;
        }

        if(start.data ==  data){
            start = start.next;
            return;
        }

        Node current = start;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if(current.next == null){
            return;
        }

        current.next = current.next.next;
    }

    public void delete_index(int index){
        if(index == 0){
            start = start.next;
            return;
        }   
        Node current = start;

        while(index > 1){
            current = current.next;
            index -= 1;
            if(current == null && index > 1){
                return;
            }
        }

        if(current.next == null){
            return;
        }

        current.next = current.next.next;

    }
}

public class Runner{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(0, 17);
        l.print();

        l.delete_index(5);
        l.print();
    }
}