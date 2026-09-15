class Node{
    int data;
    Node left_node;
    Node right_node;

    Node(int data){
        this.data = data;
    }
}

class BinaryTree{
    Node root;

    public void insert(int data){
        root = insertRec(root, data);
    }

    public Node insertRec(Node root_node, int data){
        if(root_node == null){
            root_node = new Node(data);
        }
        else if(data < root_node.data){
            root_node.left_node = insertRec(root_node.left_node, data);
        }
        else{
            root_node.right_node = insertRec(root_node.right_node, data);
        }

        return root_node;
    }

    public void Inorder(){
        InorderRec(root);
    }

    public void InorderRec(Node root){
        if(root != null){
            InorderRec(root.left_node); 
            System.out.print(root.data + " ");
            InorderRec(root.right_node);
        }
    }

    public void Preorder(){
        PreorderRec(root);
    }

    public void PreorderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            PreorderRec(root.left_node); 
            PreorderRec(root.right_node);
        }
    }

    public void Postorder(){
        PostorderRec(root);
    }

    public void PostorderRec(Node root){
        if(root != null){
            PostorderRec(root.left_node); 
            PostorderRec(root.right_node);
            System.out.print(root.data + " ");
        }
    }
}

public class tree {
    public static void main(String[] args){
        BinaryTree btree = new BinaryTree();
        btree.insert(8);
        btree.insert(7);
        btree.insert(12);
        btree.insert(15);
        btree.insert(2);
        btree.insert(5);
        
        btree.Postorder();
    }
}
