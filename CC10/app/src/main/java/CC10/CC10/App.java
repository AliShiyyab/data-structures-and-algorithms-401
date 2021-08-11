package CC10.CC10;

public class App {

    public static void main(String[] args) {
        System.out.println("================================================STACK================================================");
        Stack<Integer> stack = new Stack<>();
        System.out.println("If the stack is empty return true else return false : " + stack.isEmpty());
        stack.pushStack(1);
        stack.pushStack(2);
        stack.pushStack(3);
        stack.pushStack(4);
        stack.pushStack(5);
        stack.pushStack(6);
        System.out.println("Max Size of Stack is " + stack.getMaxSize());
        System.out.println("Last value in the Stack is : " + stack.peek());
        stack.pushStack(7);
        stack.pushStack(10);
        System.out.println("Max Size of Stack after push tow value is " + stack.getMaxSize());
        System.out.println("Last value in the Stack after edited is : " + stack.peek());
        System.out.println(stack.toString());
        stack.popStack();
        System.out.println(stack.toString());
        System.out.println("Peek after edited value : " + stack.peek());
        System.out.println("If the stack is empty return true else return false : " + stack.isEmpty());
        System.out.println("================================================QUEUE================================================");
        Queue<Integer> queue = new Queue<>();
        System.out.println("If Empty return false else return True : " + queue.isEmpty());
        queue.enQueue(11);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);
        queue.enQueue(19);
        queue.enQueue(22);
        queue.enQueue(29);
        queue.enQueue(82);
        System.out.println("The Size of Queue : " + queue.getMaxSize());
        System.out.println("If Empty return true else return False : " + queue.isEmpty());
        System.out.println("Peek Value before Dequeue is : " + queue.peekQueue());
        System.out.println("The Value is deQueue is : " + queue.deQueue());
        System.out.println("Peek Value after Dequeue is : " + queue.peekQueue());
        System.out.println("The Size of Queue : " + queue.getMaxSize());
        System.out.println(queue.toString());
        System.out.println("================================================PseudoQUEUE================================================");
        pseudoQueue<Integer> pseudo = new pseudoQueue<>();
        pseudo.enQueue(5);
        System.out.println(pseudo.toString());
        pseudo.enQueue(6);
        pseudo.enQueue(7);
        pseudo.enQueue(8);
        pseudo.enQueue(9);
        pseudo.deQueue();
        System.out.println(pseudo.toString());
        System.out.println("================================================AnimalShelter================================================");
        AnimalShelter<String> animal = new AnimalShelter<>();
        System.out.println(animal.enqueue("cat"));
        System.out.println(animal.enqueue("dog"));
        System.out.println(animal.enqueue("Terminal"));
        System.out.println(animal.toString());
        System.out.println(animal.dequeue("Terminal"));
        System.out.println(animal.dequeue("cat"));
        System.out.println(animal.toString());
    }
}
