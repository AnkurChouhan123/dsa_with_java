

public class circularQueue {
    private int queue[];
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public circularQueue(int k) {
        front = 0;
        rear = -1;
        capacity = k;
        queue = new int[capacity];
        size = 0;
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = val;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val=queue[front];
        front = (front + 1) % capacity;
        size--;

        return val;
    }

    int getFront() {
        if (size > 0) {
            return queue[front];
        }
        return -1;
    }

    int getRear() {
        if (size > 0) {
            return queue[rear];
        }
        return -1;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }
    int size(){
        return size;
    }
    void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        for(int i=0;i<size;i++){
            int index=(front+i)%capacity;
            System.out.println(queue[index]);
        }
    }


    public static void main(String[] args) {
        circularQueue q = new circularQueue(9);

        q.enqueue(8);
        q.enqueue(0);
        q.enqueue(76);
        System.out.println(q.size());




    }
}
