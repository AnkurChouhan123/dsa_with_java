class Stack{
    private int stackArray[];
    private int size;
    private int top;

    public Stack(int size){
        this.size=size;
        this.stackArray=new int [size];
        this.top=-1;
    }
    public void push(int value){
        if(size-top>1){
            top++;
            stackArray[top]=value;

        }
            else{
                System.out.println("Stack is full");
        }
    }
    public void pop(){
        if(top>=0){
          top--;
        }
        else{
            System.out.println("Stack is empty");
        }
    }
    public int peek(){
        if(top>=0){
            return stackArray[top];
        }
        else{
            System.out.println("Stack is empty");
        }
        return -1;
    }
    public boolean isEmpty(){
        if(top>=0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack(5);
        /*st.push(10);
        st.push(20);
        st.push(30);
        st.push(35);
        st.push(70);*/
        if(st.isEmpty()){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        

    }
}