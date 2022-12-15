package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload", "Medium", "Mediumload");
        List<String> listStrings = Arrays.asList("f10", "f15", "f2", "f4");

        /**
         Посчитаем, сколько раз объект «High» встречается в коллекции:
         */
        countValues("High", collection);
        /**
         А теперь посмотрим, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0
         */
        getFirstElementOfCollections(collection, "0");

        /**
         Допустим, нам нужно вернуть последний элемент. Получили пустую коллекцию — пусть возвращается 0.
         Используем метод skip, чтобы пропустить заданное количество элементов. А findFirst, чтобы вывести первое встреченное совпадение:
         */
        returnLastElementOfCollection(collection, "0");

        /**
         Можно также использовать методы skip и limit, чтобы явно задавать, сколько элементов нужно пропустить, а сколько — вернуть.
         Полученные значения соберем в массив:
         */
        skipAndReturnAppropriateValueOfElements(collection, 2, 3);

        /**
         Пусть у нас будет коллекция строк вида Arrays.asList("f10", "f15", "f2", "f4"). Найти самый маленький элемент
         */
        returnMinValue(listStrings);
        returnMaxValue(listStrings);

        naturalSort(listStrings);
    }

    public static <T> void countValues(String value, Collection<T> collection) {
        System.out.println(collection.stream().filter(value::equals).count());
        //I guess there should be method 'contains', not equals
    }

    public static <T> void getFirstElementOfCollections(Collection<T> collection, T value) {
        System.out.println(collection.stream().findFirst().orElse(value));
    }

    public static <T> void returnLastElementOfCollection(Collection<T> collection, T value) {
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse(value));
    }

    public static <T> void skipAndReturnAppropriateValueOfElements(Collection<T> collection, long skipValue, long returnValue) {
        System.out.println(collection.stream().skip(skipValue).limit(returnValue).collect(Collectors.toList()));
    }

    public static void returnMinValue(List<String> collection) {
        System.out.println(collection.stream().min(String::compareTo).orElse(null));
    }

    public static void returnMaxValue(List<String> collection) {
        System.out.println(collection.stream().max(String::compareTo).orElse(null));
    }

    public static void naturalSort(List<String> list) {
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }
}
