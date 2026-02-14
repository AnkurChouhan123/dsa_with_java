package BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversal extends Implementation{
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void traversal(Node root,List<Integer>pre,List<Integer>in,List<Integer>post){
        if(root==null){
            return;
        }
        pre.add(root.data);
        traversal(root.left,pre,in,post);
        in.add(root.data);
        traversal(root.right,pre,in,post);
        post.add(root.data);
    }
    public static void main(String[] args) {
        TreeTraversal obj=new TreeTraversal();
        List<Integer>pre=new ArrayList<>();
        List<Integer>in=new ArrayList<>();
        List<Integer>post=new ArrayList<>();
        Node root=null;
        root=obj.buildTree(root);
        obj.traversal(root,pre,in,post);
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);



    }
}
