package Collections.Task7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки
         */
        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put("Monster Jam", new Toy("Monster Jam", 200));
        toyMap.put("Pokemon", new Toy("Pokemon", 234));
        toyMap.put("Tee Turtle", new Toy("Tee Turtle", 459));
        toyMap.put("Dollhouse", new Toy("Dollhouse", 1298));
        toyMap.put("Lego", new Toy("Lego", 1509));
        toyMap.put("Nintendo", new Toy("Nintendo", 565));
        toyMap.put("Funko Pop", new Toy("Funko Pop", 345));

        /**
         Перебрать и распечатать пары значений - entrySet()
         */
        printEntrySet(toyMap);
        /**
         Перебрать и распечатать набор из имен продуктов  - keySet()
         */
        printKeySet(toyMap);
        /**
         Перебрать и распечатать значения продуктов - values().
         */
        printValues(toyMap);

    }

    public static void printEntrySet(Map<String, Toy> toyMap) {
        System.out.println("EntrySet of Toys");
        for (Map.Entry<String, Toy> toy : toyMap.entrySet()) {
            System.out.println(toy);
        }
    }

    public static void printKeySet(Map<String, Toy> toyMap) {
        System.out.println("\nKeySet of Toys");
        for (String toy : toyMap.keySet()) {
            System.out.println(toy);
        }
    }

    public static void printValues(Map<String, Toy> toyMap) {
        System.out.println("\nValues of Toys");
        for (Toy toy : toyMap.values()) {
            System.out.println(toy);
        }
    }
}
