package Collections;

import java.util.List;

public class HeavyBox implements Comparable<HeavyBox> {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public static void printList(List<HeavyBox> list) {
        list.forEach(System.out::println);
    }

    public static void changeWeightOfBox(List<HeavyBox> list, int index, HeavyBox weight) {
        list.set(index, weight);
    }

    public static void deleteLastBox(List<HeavyBox> list) {
        list.remove(list.size() - 1);
    }

    public static void removeAllBoxes(List<HeavyBox> list) {
        list.clear();
    }

    public static void printArrayWithIterator(List<HeavyBox> list) {
        for (HeavyBox heavyBox : list) {
            System.out.println(heavyBox);
        }
    }

    public static void printArrayWithForEach(List<HeavyBox> list) {
        list.forEach(System.out::println);
    }

    public static void printArrayWithForLoop(List<HeavyBox> list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public int compareTo(HeavyBox box) {
        int anotherBox = box.getWeight();
        return this.weight - anotherBox;
    }
}
