package Generics;

import Collections.Task9.Cat;

public class GenericsDemo {
    public static void main(String[] args) {

        /**
         Создать обобщенный класс с тремя параметрами (T, V, K).
         Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
         методы возвращающие значения трех переменных.
         Создать метод, выводящий на консоль имена классов для трех переменных класса.
         Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
         V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
         */

        GenericsClass<String, Cat, Float> genericsClass = new GenericsClass<>("SomeString", new Cat("Vaska") , 1.45f);
        genericsClass.getTypes();
    }
}
