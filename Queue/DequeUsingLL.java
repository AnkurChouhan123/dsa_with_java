package Queue;
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}
public class DequeUsingLL {
   Node front;
   Node rear;
    DequeUsingLL(){
        front=null;
        rear=null;
    }
    void push_front(int x){
        Node newNode=new Node(x);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
           newNode.next=front;
           front.prev=newNode;
           front=newNode;

        }
        front.prev=null;
        rear.next=null;

    }
    void push_back(int x){
        Node newNode=new Node(x);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            newNode.prev=rear;
            rear=newNode;
        }
        front.prev=null;
        newNode.next=null;
    }
    int pop_front(){
        if(front==null){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int temp=front.data;
            front=front.next;
            if(front!=null){
                front.prev=null;
            }
            else{
                rear=null;
            }
          //  System.out.println(temp);
            return temp;
        }
    }
    int pop_back(){
     if(front==null){
         System.out.println("queue is empty");
         return -1;
     }
     else{
         int temp=rear.data;
         if(rear!=null){
             rear.next=null;
         }
         else{
             front=null;
         }
        // System.out.println(temp);
         return temp;
     }
    }
    void display(){
        Node curr=front;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        DequeUsingLL q=new DequeUsingLL();
//        q.push_front(10);
//        q.push_back(20);
//        q.push_back(30);
//        q.push_front(100);
//        q.push_front(200);
        System.out.println(q.pop_front());
        System.out.println(q.pop_back());
      //  q.display();
    }
}
