package Collections.Task5;

import Collections.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        /**
         Создать очередь, содержащую объекты класса HeavyBox.
         Используем класс ArrayDeque.
         */
        Deque<HeavyBox> arrayDeque = new ArrayDeque<>();

        /**
         Поместить объекты в очередь с помощью метода offer().
         */
        arrayDeque.offer(new HeavyBox(2));
        arrayDeque.offer(new HeavyBox(5));
        arrayDeque.offer(new HeavyBox(7));
        arrayDeque.offer(new HeavyBox(1));
        arrayDeque.offer(new HeavyBox(89));
        arrayDeque.offer(new HeavyBox(56));
        arrayDeque.offer(new HeavyBox(34));

        /**
         Удалить объекты методом poll().
         */
        deleteObjects(arrayDeque);
    }

    public static void deleteObjects(Deque<HeavyBox> deque) {
        while (deque.poll() != null) ;
    }
}
