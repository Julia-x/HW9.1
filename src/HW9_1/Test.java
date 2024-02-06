package HW9_1;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.add("Four");
        myArrayList.add("Five");
        myArrayList.add("Six");
        myArrayList.add("Seven");
        myArrayList.add("Eight");
        myArrayList.add("Nine");
        myArrayList.add("Ten");
        myArrayList.add("Eleven");
//        for(int i = 0; i < myArrayList.size(); i++){
//            System.out.println(myArrayList.get(i));
//       }
        myArrayList.remove(5);
        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }
            System.out.println(myArrayList.size());
            myArrayList.clear();
            myArrayList.add("Hello");
            myArrayList.add("World");
        for(int i = 0; i < myArrayList.size(); i++){
           System.out.println(myArrayList.get(i));
       }

        }
    }

