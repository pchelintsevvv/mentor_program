package Collections.Task6;

import Collections.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class DividingCollections {
    static List<HeavyBox> listOfSortedBoxes = new ArrayList<>();

    public static void main(String[] args) {
        /**
         Создать коллекцию, содержащую объекты HeavyBox.
         */
        List<HeavyBox> list = new ArrayList<>();
        createList(list, 10);

        /**
         Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
         Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
         */
        sortBoxes(list, 300);
        printSortedBoxes(listOfSortedBoxes);
    }

    public static void createList(List<HeavyBox> list, int listSize) {
        while (listSize-- > 0) {
            list.add(new HeavyBox((int) (Math.random() * 1000)));
        }
    }

    public static void sortBoxes(List<HeavyBox> list, int weight) {
        for (HeavyBox currentBox : list) {
            if (currentBox.getWeight() > weight) {
                listOfSortedBoxes.add(currentBox);
            }
        }
    }

    public static void printSortedBoxes(List<HeavyBox> list) {
        list.forEach(System.out::println);
    }
}
