package HW9_2;

import java.util.Objects;

public class MyLincedList<T> {
    static class Node<T> {
        T elements;
        Node<T> next;
        Node<T> previous;


        public Node(T elements) {

            this.elements = elements;
        }
    }
    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value){
        Node<T> newNode = new Node<>(value);
       if (first == null){
           first = newNode;
           last = newNode;
       } else {
           last.next = newNode;
           newNode.previous = first;
           last = newNode;
       }
       size++;
    }
    private Node<T> getNodeIndex(int index){
        Node<T> current = first;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }
    public T get(int index){
        Objects.checkIndex(index, size);
        return getNodeIndex(index).elements;
    }
    public void remove(int index){
        Objects.checkIndex(index, size);
        T elementNode = null;
        if(index == 0){
            elementNode = first.elements;
            first = first.next;
            if(first == null){
            last = null;
            }
        } else {

            Node<T> currentNode = getNodeIndex(index - 1);
            if(index != size - 1) {
                currentNode.next = currentNode.next.next;
                currentNode.next.previous = currentNode;
            } else {
                last = currentNode;
            }

        }
        size--;
    }
    public int size(){

        return size;
    }
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    }
