import java.util.HashMap;
import java.util.Map;

public class Cat {
    String name;

    @Override
    public String toString() {
        return  name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /**
         * Коллекция HashMap из котов
         * Есть класс Cat, с полем имя (name, String).
         * Создать коллекцию HashMap<String, Cat>.
         * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
         * Вывести результат на экран, каждый элемент с новой строки.
         */
        Map<Cat, String> cats = new HashMap<>();
        cats.put(new Cat("Luna"), "first cat");
        cats.put(new Cat("Milo"), "second cat");
        cats.put(new Cat("Oliver"), "third cat");
        cats.put(new Cat("Leo"), "forth cat");
        cats.put(new Cat("Loki"), "fifth cat");
        cats.put(new Cat("Bella"), "six cat");
        cats.put(new Cat("Charlie"), "seven cat");
        cats.put(new Cat("Willow"), "eight cat");
        cats.put(new Cat("Lucy"), "nine cat");
        cats.put(new Cat("Simba"), "ten cat");
        for (Map.Entry<Cat, String> cat : cats.entrySet()){
            System.out.println(cat.getKey() + " - " + cat.getValue());
        }
    }
}
