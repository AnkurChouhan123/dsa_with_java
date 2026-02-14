package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuildFromLevelOrder extends Implementation {
    Scanner sc=new Scanner(System.in);
    Node buildFromLevelOrder(Node root){

        Queue<Node>q =new LinkedList<>();

        System.out.println("enter data for root : ");
        int data=sc.nextInt();

        root=new Node(data);
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.println("enter left node for : " + temp.data);

            int leftData=sc.nextInt();

            if(leftData!=-1){
                temp.left=new Node(leftData);
                q.add(temp.left);
            }

            System.out.println("enter right node for : "+ temp.data);

            int rightData=sc.nextInt();

            if(rightData!=-1){
                temp.right=new Node(rightData);
                q.add(temp.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        BuildFromLevelOrder obj=new BuildFromLevelOrder();
        Node root=null;
        root=obj.buildFromLevelOrder(root);
        obj.levelOrderTraversal(root);

    }
}
