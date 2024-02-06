package HW9_3;

public class Demo {
    public static void main (String[] args){
        MyQueue myQueue = new MyQueue();
        myQueue.add(15);
        myQueue.add(25);
        myQueue.add(37);
        myQueue.add(4);
        System.out.println(myQueue.size());
        myQueue.clear();
        myQueue.add("Hello");
        myQueue.add("World");
        myQueue.add("Java");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
    }
}
