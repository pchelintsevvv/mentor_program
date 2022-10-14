package Collections.Task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfNumbers {
    public static void main(String[] args) {
        /**
         Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
         */
        String string = "1, 2, 3, 4, 4, 5";

        /**
         Избавиться от повторяющихся элементов в строке.
         */
        splitStringAndAddItemsToSet(string);

        /**
         Вывести результат на экран.
         */
        System.out.println(splitStringAndAddItemsToSet(string));

    }

    public static Set<String> splitStringAndAddItemsToSet(String string) {
        return new HashSet<>(Arrays.asList(string.split(",")));
    }
}
