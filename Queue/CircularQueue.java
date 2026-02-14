package Queue;

public class CircularQueue {
    int n;
    int [] arr;
    int front;
    int rear;
    int size;
   public CircularQueue(int n){
       this.arr=new int[n];
       this.n=n;
       front=0;
       rear=0;
       size=0;
   }

    void add(int x){

        if(size==n){
            System.out.println("can't be added "+x);
            return;
        }
        arr[rear]=x;
        rear=(rear+1)%n;
        size++;

    }
    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    int pop(){
       if(size==0){
           System.out.println("queue is empty");
           return -1;
       }
        int ans=arr[front];
        arr[front]=0;
        front=(front+1)%n;
        size--;
        System.out.println(ans);
        return ans;
    }
    int peek(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
       int ans=arr[front];
        System.out.println(ans);
        return ans;
    }
    boolean isEmpty(){
       if(size==0){
           System.out.println("queue is empty");
           return true;
       }
       else{
           System.out.println("queue is not empty");
           return false;
       }
    }
    public static void main(String[] args) {

        CircularQueue q=new CircularQueue(5);
        q.add(12);
        q.add(13);
        q.add(15);
        q.add(18);
        q.add(19);
      //  q.add(20);
        q.isEmpty();
      //  q.display();

    }
}
