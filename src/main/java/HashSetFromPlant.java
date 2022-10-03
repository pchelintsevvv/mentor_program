import java.util.HashSet;
import java.util.Set;

public class HashSetFromPlant {
    public static void main(String[] args) {
        /**
         * 1. HashSet из растений
         *
         * Создать коллекцию HashSet с типом элементов String.
         * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
         * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
         * Посмотреть, как изменился порядок добавленных элементов. */
        Set<String> plants = new HashSet<>();
        plants.add("Watermelon");
        plants.add("Banana");
        plants.add("Cherry");
        plants.add("Pear");
        plants.add("Melon");
        plants.add("Blackberry");
        plants.add("Man-Plant");
        plants.add("Strawberry");
        plants.add("Iris");
        plants.add("Potatoes");
        for (String plant : plants) {
            System.out.println(plant);
        }
    }
}
