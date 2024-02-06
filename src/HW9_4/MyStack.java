package HW9_4;

import java.util.Objects;

public class MyStack<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {

            this.element = element;
        }
    }

    private Node<T> last;
    private int size;

    public void push(T value) {
        Node<T> elementNode = new Node<>(value);
        Node<T> newNode = new Node<>(value);
        newNode.next = last;
        last = newNode;
        size++;
    }
    public void remove(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            last = last.next;
        } else {
            Node<T> current = last;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }
//    private Node<T> getNodeIndex(int index){
//        Node<T> current = last;
//        for(int i = 0; i < index; i++){
//            current = current.next;
//       }
//        return current;
//    }
    public void clear(){
 //       first = null;
        last = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public T peek(){
        if(last == null){
           return null;
        }
        return last.element;
    }
public T pop(){
    if(last == null){
        return null;
    }
        T elementLast = last.element;
        if(last != null){
            last = last.next;
    }
        size--;
    return elementLast;
}
}
