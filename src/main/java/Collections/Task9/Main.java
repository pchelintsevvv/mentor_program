package Collections.Task9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         Создайте класс Pet и его наследников Cat, Dog, Parrot.
         Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
         */
        Map<String, Animal> map = new HashMap<>();
        map.put("Vaska", new Dog("Dog"));
        map.put("Murzic", new Cat("Cat"));
        map.put("Gosha", new Parrot("Parrot"));

        /**
         Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
         */
        printPetKeySet(map);
    }

    public static void printPetKeySet(Map<String, Animal> map) {
        for (String pet : map.keySet()) {
            System.out.println(pet);
        }
    }
}
