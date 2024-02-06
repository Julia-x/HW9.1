package HW9_5;

public class Main {
    public static void main(String[] args){
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(5, "Java");
        myHashMap.put(10, "Hello");
        myHashMap.put(5, "World");
        myHashMap.put("1", "Test");
        System.out.println("Size " + myHashMap.size());
        myHashMap.remove(10);
        System.out.println("Size " + myHashMap.size());
        System.out.println(myHashMap.get("1"));
        System.out.println(myHashMap.get(75));
        myHashMap.clear();
        System.out.println("Size " + myHashMap.size());
    }
}
