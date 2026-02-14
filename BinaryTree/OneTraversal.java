package BinaryTree;


public class OneTraversal extends Implementation{
    void traversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        traversal(root.left);
        System.out.println(root.data);
        traversal(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
       // Implementation tree=new Implementation();
        OneTraversal obj=new OneTraversal();
        Node root=null;
        obj.buildTree(root);
        obj.traversal(root);



    }

}
