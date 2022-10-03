import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        /**
         * HashMap из 10 пар
         *
         * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава,
         * вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода,
         * ирис – цветок, картофель – клубень.
         * Вывести содержимое коллекции на экран, каждый элемент с новой строки.*/
        Map<String, String> plants = new java.util.HashMap<>();
        plants.put("Watermelon", "berry");
        plants.put("Banana", "herb");
        plants.put("Cherry", "berry");
        plants.put("Pear", "fruit");
        plants.put("Melon", "vegetable");
        plants.put("Blackberry", "bush");
        plants.put("Man-Plant", "root");
        plants.put("Strawberry", "berry");
        plants.put("Iris", "flower");
        plants.put("Potatoes", "tuber");
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + " - " + plant.getValue());
        }

        System.out.println("-------------/////////////---------------");

        /**
         * Вывести на экран список ключей
         * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
         * Вывести на экран список ключей, каждый элемент с новой строки.*/
        for (String plantsKey : plants.keySet()) {
            System.out.println(plantsKey);
        }

        System.out.println("-------------/////////////---------------");

        /**
         * Вывести на экран список значений
         * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
         * Вывести на экран список значений, каждый элемент с новой строки.*/
        for (String plantsValue : plants.values()){
            System.out.println(plantsValue);
        }
    }
}
