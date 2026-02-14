package BinaryTree;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Implementation {
    Scanner sc=new Scanner(System.in);
    Node buildTree(Node root){
        System.out.println("enter the data : ");
        int data=sc.nextInt();
        root=new Node(data);
        if(data==-1){
            return null;
        }
        System.out.println("enter the left Node data of "+ data +" : ");
        root.left=buildTree(root.left);
        System.out.println("enter the right Node data of "+ data +" : ");
        root.right=buildTree(root.right);

        return root;
    }
    //level Order tranversal

    void levelOrderTraversal(Node root){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp=q.peek();
            q.poll();
            if(temp==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }

    }
    void reveresLevelOrderTraversal(Node root){
        Queue<Node>q=new LinkedList<>();
        Stack<Node>st=new Stack<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp=q.peek();
            q.poll();
            if(temp==null){
                st.push(null);
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                st.push(temp);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        while(!st.isEmpty()){
            if(st.peek()==null){
                System.out.println();
                st.pop();
            }
            System.out.print(st.peek().data+" ");
            st.pop();
            }

    }
    public static void main(String[] args) {
        Implementation BinaryTree=new Implementation();
        Node root=null;
       root= BinaryTree.buildTree(null);
       // BinaryTree.levelOrderTraversal(root);
        BinaryTree.reveresLevelOrderTraversal(root);
    }
}
