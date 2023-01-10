import java.util.Arrays;

public class Test706_Design_HashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(3, 1);
        System.out.println(map.toString());
    }

    static class MyHashMap {

        int[] map;

        public MyHashMap() {
            map = new int[1000001];
            Arrays.fill(map, -1);
        }

        public void put(int key, int value) {
            map[key] = value;
        }

        public int get(int key) {
            return map[key];
        }

        public void remove(int key) {
            map[key] = -1;
        }

    }
}