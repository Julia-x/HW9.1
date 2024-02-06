package HW9_2;

public class Demo {
    public static void main(String[] args){
    MyLincedList myLincedList = new MyLincedList();
    myLincedList.add("One");
        myLincedList.add("Two");
        myLincedList.add("Three");
        myLincedList.add("Four");
        myLincedList.add("Five");
        myLincedList.add("Six");
        myLincedList.add("Seven");
        myLincedList.add("Eight");
        myLincedList.add("Nine");
        myLincedList.add("Ten");
        myLincedList.add("Eleven");
        myLincedList.remove(10);
        for(int i = 0; i < myLincedList.size(); i++){
       System.out.println(myLincedList.get(i));
    }
        System.out.println(myLincedList.size());
        myLincedList.clear();
        myLincedList.add(5);
        myLincedList.add(10);
       for(int i = 0; i < myLincedList.size(); i++){
      System.out.println(myLincedList.get(i));
  }
        System.out.println(myLincedList.size());

}
}
