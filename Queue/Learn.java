package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Learn {
    Queue<Integer>q1;
    ArrayDeque<Integer>dq;
    Learn(){
        q1=new LinkedList<>();
        dq=new ArrayDeque<>();
    }

    public static void main(String[] args) {

        Learn obj=new Learn();
        obj.enqueue(12);
        obj.enqueue(11);
        obj.enqueue(15);
        obj.enqueue(113);
        obj.enqueue(18);
        obj.enqueue(14);
        obj.dequeue();
        obj.getMin();
        obj.display();


    }
    void enqueue(int x){
        q1.add(x);
        while(!dq.isEmpty()&&x<dq.getLast()){
            dq.removeLast();
        }
        dq.addLast(x);

    }
    int dequeue(){
        if(q1.isEmpty()){
            return -1;
        }
        int val=q1.poll();
        if(!dq.isEmpty()&&dq.getFirst()==val){
            dq.removeLast();
        }
        System.out.println("popped element is :  "+val);
        return val;
    }
    int getMin(){
        if(dq.isEmpty()){
            System.out.println("no min element");
            return -1;
        }
        System.out.println("min element is : "+ dq.getFirst());
        return dq.getFirst();
    }
    void display(){
        System.out.println(q1);
    }
}
