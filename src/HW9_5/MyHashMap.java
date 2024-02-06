package HW9_5;

public class MyHashMap<K, V> {
    static class Entry<K, V> {
        V value;
        K key;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
        private static final int DEFOLT_SIZE = 8;
          private Entry<K, V>[] array = new Entry[DEFOLT_SIZE];
        private int size;

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value);
        if (array[index] == null) {
            array[index] = entry;
        } else {
            Entry<K, V> current = array[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            entry.next = array[index];
            array[index] = entry;
            }

        size++;
        }
    public V get(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = array[index];
        while (current != null) {
        if (current.key.equals(key)) {
            return current.value;
        }
            current = current.next;
        }
        return null;
    }
    private int getBucketIndex(K key) {

        return Math.abs(key.hashCode() % array.length);
    }
    public void remove(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> current = array[index];
        Entry<K, V> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    array[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }
    public void clear(){
        array = new Entry[DEFOLT_SIZE];
        size = 0;
    }
    public int size(){
        return size;
    }
    }

