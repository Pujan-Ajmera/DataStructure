import java.util.*;

public class InsertIntoBSTiterative{
    public static void main(String[] args){
        BST b = new BST();
        b.insert(15);
        b.insert(5);
        b.insert(53);
        b.insert(2);
        b.inOrder(b.root);
    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
    }
}
class BST{
    public Node root;
    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }
        else{
            Node temp = root;
            Node prev = new Node(-1);
            while(true){
                prev = temp;
                if(data<temp.data){
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                }
                else{
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                }
            }
           // prev.right = newNode;
        }
    }

    public void inOrder(Node root){
       Stack<Node> st = new Stack<>();
       Node temp = root;
       while(temp!=null){
        st.add(temp);
        temp = temp.left;
       }
       while(st.size()!=0){
           System.out.println(st.pop().data);
       }
       
       temp = root.right;
       while(temp!=null){
        st.add(temp);
        temp = temp.right;
       }
       while(st.size()!=0){
           System.out.println(st.pop().data);
       }
        }
    }
