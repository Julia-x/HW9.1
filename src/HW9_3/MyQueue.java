package HW9_3;
public class MyQueue<T> {
static class Node<T> {
    T elements;
    Node<T> next;
    public Node(T elements) {

        this.elements = elements;
    }

}
    private Node<T> first;
    private Node<T> last;
    private int size;

public void add(T value){
    Node<T> nodeNew = new Node<>(value);
    if(first == null){
        first = nodeNew;
        last = nodeNew;
    }
    last = nodeNew;
    size++;
}
public T poll() {
    if (first == null) {
        return null;
    }
     T elementFirst = first.elements;
    if (first != last) {
        first = first.next;
    } else{
        first = null;
        last = null;
        size = 0;
    }
    size--;
    return elementFirst;
}
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    public int size(){

    return size;
    }
    public T peek(){

    return first.elements;
    }
}
