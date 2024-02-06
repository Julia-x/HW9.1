package HW9_4;

public class Demo {
    public static void main (String[] args){
        MyStack myStack = new MyStack<>();
        myStack.push(36);
        myStack.push(48);
        myStack.push(15);
        System.out.println(myStack.size());
        myStack.remove(1);
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        myStack.clear();
        System.out.println(myStack.size());
    }
}
