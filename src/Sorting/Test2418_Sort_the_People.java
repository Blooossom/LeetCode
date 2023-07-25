package Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2418_Sort_the_People {
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            List<People> list = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                People people = new People(names[i], heights[i]);
                list.add(people);
            }
            list.sort((o1, o2) -> Integer.compare(o2.height, o1.height));
            String[] result = new String[names.length];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i).name;
            }
            return result;
        }
    }
    class People {
        private String name;
        private int height;

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }

        public People(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
