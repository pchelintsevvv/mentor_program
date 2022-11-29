package Lambda;

import Collections.HeavyBox;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /**
         Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
         */
        Printable printable = System.out::println;
        printable.print("Printed from 'Printable' interface");

        /**
         Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.
         */
        System.out.println("Check that string is not null");
        Predicate<String> checkStringNotNull = s -> s != null;
        System.out.println(checkStringNotNull.test("Hello"));
        System.out.println(checkStringNotNull.test(null));
        System.out.println(checkStringNotNull.test(""));

        /**
         Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
         */
        System.out.println("Check that string is not empty");
        Predicate<String> checkStringNotNullAndNotEmpty = s -> !s.isEmpty();
        System.out.println(checkStringNotNullAndNotEmpty.test("Hello"));
        System.out.println(checkStringNotNullAndNotEmpty.test(""));

        /**
         Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
         */
        System.out.println("Check that string is not null and not empty");
        System.out.println(checkStringNotNullAndNotEmpty.and(checkStringNotNullAndNotEmpty).test("Hello"));
        System.out.println(checkStringNotNullAndNotEmpty.and(checkStringNotNullAndNotEmpty).test(""));

        /**
         Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.
         */
        System.out.println("Check that string begins from 'J' or 'N' and ends with 'A'");
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        Predicate<String> startsWithN = s -> s.startsWith("N");
        Predicate<String> endsWithA = s -> s.endsWith("A");

        System.out.println(startsWithJ.or(startsWithN).and(endsWithA).test("JavA"));
        System.out.println(startsWithJ.or(startsWithN).and(endsWithA).test("Java"));
        System.out.println(startsWithJ.or(startsWithN.and(endsWithA)).test("Python"));

        /**
         Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение “Отгрузили ящик с весом n”.
         “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.
         */
        Consumer<HeavyBox> heavyBoxLoaded = heavyBox -> System.out.println("Отгрузили ящик с весом " + heavyBox.getWeight());
        Consumer<HeavyBox> heavyBoxSent = heavyBox -> System.out.println("Отправляем ящик с весом " + heavyBox.getWeight());
        heavyBoxLoaded.andThen(heavyBoxSent).accept(new HeavyBox(10));

        /**
         Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
         “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
         */
        Function<Integer, String> function = i -> {
            String result = "The number is zero";
            if (i > 0) {
                result = "The number is greater than zero";
            } else if (i < 0) {
                result = "The number is less than zero";
            }
            return result;
        };
        System.out.println(function.apply(6));
        System.out.println(function.apply(0));
        System.out.println(function.apply(-4));

        /**
         Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный интерфейс Supplier.
         */
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * ((10) + 1));
        System.out.println(randomNumber.get());
    }
}
