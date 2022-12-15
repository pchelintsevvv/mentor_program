package Collections.Task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfNumbers {
    public static void main(String[] args) {
        /**
         Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
         */
        String string = "1, 2, 3, 4, 4, 5";   //I understand it's just learning task, but it would be better to name
                                             // variables in self-descriptive way

        /**
         Избавиться от повторяющихся элементов в строке.
         */
        splitStringAndAddItemsToSet(string);  //you may assign the result of this method to variable
                                             // and then use it for next task

        /**
         Вывести результат на экран.
         */
        System.out.println(splitStringAndAddItemsToSet(string));

    }

    public static Set<String> splitStringAndAddItemsToSet(String string) {  //the same with variables name here
        return new HashSet<>(Arrays.asList(string.split(",")));
    }
}
