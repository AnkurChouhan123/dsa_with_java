package Queue;

public class DequeUsingArray {
    int front,rear,size;
    int [] arr;
    DequeUsingArray(int n){
        arr=new int[n];
        size=n;
        front=-1;
        rear=-1;
    }
    boolean isEmpty(){
        return front==-1;
    }
    boolean isFull(){
        return (rear+1)%size==front;
    }
    void push_front(int x){
        if(isEmpty()){
            front=rear=0;
            arr[front]=x;
        }
        else if(isFull()){
            System.out.println("queue is full");
            return;
        }
        else{
            front=(front-1+size)%size;
            arr[front]=x;
        }
    }
    void push_back(int x){
        if(isFull()){
            System.out.println("queue is full");
        }
        else if(isEmpty()){
            front=rear=0;
            arr[rear]=x;
        }
        else{
            rear=(rear+1)%size;
            arr[rear]=x;
        }
    }
    int pop_front() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int data = arr[front];
            if (front == rear) {
             front=-1;
             rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            System.out.println("popped element : "+data);
            return data;
        }
    }
    int pop_back(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int data=arr[rear];
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                rear=(rear-1+size)%size;
            }
            System.out.println("popped element :"+data);
            return data;
        }
    }
    void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.println(arr[i]);
            if (i == rear) break;           // include last element
            i = (i + 1) % size;
        }
    }

    public static void main(String[] args) {
        DequeUsingArray q=new DequeUsingArray(5);
        q.push_back(12);
        q.push_back(13);
        q.push_front(11);
        q.push_front(10);
        q.push_front(9);
        q.pop_front();
        q.pop_back();
        q.display();
    }

}
