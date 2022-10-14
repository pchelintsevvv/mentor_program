package Collections.Task4;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectDemo {
    public static void main(String[] args) {
        /**
         Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
         Протестируйте работу этих методов на предварительно заполненных множествах.
         */
        Set<String> setA = new HashSet<>();
        setA.add("a");
        setA.add("b");
        setA.add("c");
        setA.add("d");
        Set<String> setB = new HashSet<>();
        setB.add("c");
        setB.add("d");
        setB.add("e");
        setB.add("f");
        printSet(union(setA, setB));
        printSet(intersect(setA, setB));
    }

    public static Set<String> union(Set<String> setA, Set<String> setB) {
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        return union;
    }

    public static Set<String> intersect(Set<String> setA, Set<String> setB) {
        Set<String> intersect = new HashSet<>(setA);
        intersect.retainAll(setB);
        return intersect;
    }

    public static void printSet(Set<String> set) {
        System.out.println(set);
    }
}
