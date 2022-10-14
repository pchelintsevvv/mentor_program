package Collections.Task2;

import Collections.HeavyBox;

import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {
        /**
         Создать TreeSet содержащий HeavyBox.
         */
        Set<HeavyBox> set = new java.util.TreeSet<>();
        set.add(new HeavyBox(1));
        set.add(new HeavyBox(5));
        set.add(new HeavyBox(4));
        set.add(new HeavyBox(9));
        set.add(new HeavyBox(7));
        set.add(new HeavyBox(2));

        /**
         Распечатать содержимое с помощью for each.
         */
        set.forEach(System.out::println);
    }
}
