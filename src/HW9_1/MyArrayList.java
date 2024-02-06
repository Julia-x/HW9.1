package HW9_1;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private Object[] array;
    private static final int DEFAULT_SIZE = 10;
    private int size;
    public MyArrayList(){
        this.array = new Object[DEFAULT_SIZE];
        size = 0;
    }
    public void add(Object value){
        resizeArray();
        array[size] = value;
        size++;

    }
    private void resizeArray(){
        if(array.length == size){
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0,newArray, 0, size);
            array = newArray;
        }
    }
    public void remove(int index){
        Objects.checkIndex(index, size);
        System.arraycopy(array, index+1, array, index, size - index - 1);
                    size--;
    }
    public Object get(int index){
        Objects.checkIndex(index, size);
        return array[index];
    }
    public int size(){

        return size;
    }
    public void clear(){
        size = 0;
        array = new Object[DEFAULT_SIZE];
    }
}
