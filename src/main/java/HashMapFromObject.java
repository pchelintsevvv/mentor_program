import java.util.HashMap;
import java.util.Map;

public class HashMapFromObject {
    public static void main(String[] args) {
        /**
         * Коллекция HashMap из Object
         * Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
         * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
         */
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("Sim", 5);
        objectMap.put("Greeting", "Hello");
        objectMap.put("Cat name", new Cat("Simba"));
        objectMap.put("Year", 2022);
        objectMap.put("Free fall", 9.87);
        objectMap.put("Food", "Meet");
        objectMap.put("Cat", new Cat("Lucy"));
        for (Map.Entry<String, Object> object : objectMap.entrySet()){
            System.out.println(object.getKey() + " - " + object.getValue());
        }
    }
}
