public class DLL {
    Node head;
    void insertFirst(int val){
        Node newNode=new Node(val);

        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }

        head=newNode;
    }

    void displayRev(){

        if(head==null){
            System.out.println("head is null");
        }
        Node temp=head;
        Node last=null;

        while(temp!=null){
            last=temp;
           // System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
        while(last!=null){
            System.out.print(last.val+"-->");
            last=last.prev;
        }
    }
    void display(){

        if(head==null){
            System.out.println("head is null");
        }
        Node temp=head;
       // Node last=null;

        while(temp!=null){
           // last=temp;
             System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    void insertLast(int val){
        Node newNode=new Node(val);
         if(head==null){
             insertFirst(val);
             return;
         }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        newNode.prev=temp;
        temp=newNode;
    }
    void deleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deleteLast(){
        if(head==null||head.next==null){
            head=null;
            return ;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
//        list.insertFirst(10);
//        list.insertFirst(20);
        list.insertLast(40);
        list.insertLast(50);
        list.insertFirst(30);
//        list.deleteFirst();
//        list.deleteFirst();
      //  list.displayRev();
        list.deleteLast();
        list.deleteFirst();
        list.display();
    }

}
