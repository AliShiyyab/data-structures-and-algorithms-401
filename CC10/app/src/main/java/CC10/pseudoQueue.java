package CC10;

public class pseudoQueue<P> {
    //Internally, utilize 2 Stack instances to create and manage the queue
    private Stack stack1;
    private Stack stack2;
    //Constructor
    public pseudoQueue(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    //Methods:
    //First One:
    public void enQueue(P value){
        this.stack1.pushStack(value);
    }

    //Second function
    public P deQueue(){
        if(stack1.isEmpty()){
            return (P)"Empty stack data";
        }
        while (!stack1.isEmpty()){
            this.stack2.pushStack(stack1.peek());
            this.stack1.popStack();
        }
        P finallValue = (P) this.stack2.popStack();
        while(!this.stack2.isEmpty()){
            this.stack1.pushStack(this.stack2.peek());
            this.stack2.popStack();
        }
        return finallValue;
    }

    @Override
    public String toString() {
        return "pseudoQueue{" +
                "stack1=" + stack1.toString() +
                '}';
    }
}
