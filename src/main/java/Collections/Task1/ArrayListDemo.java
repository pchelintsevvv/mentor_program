package Collections.Task1;

import Collections.HeavyBox;

import java.util.ArrayList;
import java.util.List;

import static Collections.HeavyBox.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         1. Создать динамический массив, содержащий объекты класса HeavyBox.
         */
        List<HeavyBox> heavyBoxList = new ArrayList<>();
        heavyBoxList.add(new HeavyBox(1));
        heavyBoxList.add(new HeavyBox(3));
        heavyBoxList.add(new HeavyBox(5));
        heavyBoxList.add(new HeavyBox(6));
        heavyBoxList.add(new HeavyBox(9));
        heavyBoxList.add(new HeavyBox(41));

        /**
         2. Распечатать его содержимое используя for each.
         */
        printList(heavyBoxList);

        /**
         Изменить вес первого ящика на 1
         */
        changeWeightOfBox(heavyBoxList, 0, new HeavyBox(1));

        /**
         Удалить последний ящик.
         */
        deleteLastBox(heavyBoxList);

        /**
         Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
         */
        printArrayWithIterator(heavyBoxList);

        printArrayWithForEach(heavyBoxList);

        printArrayWithForLoop(heavyBoxList);

        /**
         Удалить все ящики.
         */
        removeAllBoxes(heavyBoxList);
    }
}
