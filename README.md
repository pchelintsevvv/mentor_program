# Коллекции в Java. Задания
###1. Создать динамический массив
1. Создать динамический массив, содержащий объекты класса HeavyBox.                    
2. Распечатать его содержимое используя for each.                          
3. Изменить вес первого ящика на 1.
4. Удалить последний ящик.
5. Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
6. Удалить все ящики.
###2. Создать TreeSet
1. Создать TreeSet содержащий HeavyBox.
2. HeavyBox должен реализовать интерфейс Comparable.
3. Распечатать содержимое с помощью for each.
###3. Набор чисел
1. Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
2. Избавиться от повторяющихся элементов в строке.
3. Вывести результат на экран.
###4. Методы union() и intersect()
1. Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
2. Протестируйте работу этих методов на предварительно заполненных множествах.
###5. Создать очередь
1. Создать очередь, содержащую объекты класса HeavyBox.
2. Используем класс ArrayDeque.
3. Поместить объекты в очередь с помощью метода offer().
4. Удалить объекты методом poll().
###6. Разделение коллекции
1. Создать коллекцию, содержащую объекты HeavyBox.
2. Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
3. Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
###7. Создать HashMap
1. Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
2. Перебрать и распечатать пары значений - entrySet().
3. Перебрать и распечатать набор из имен продуктов  - keySet().
4. Перебрать и распечатать значения продуктов - values().
5. Для каждого перебора создать свой метод.
###8. Добавить студентов в коллекцию
1. Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
2. Создать коллекцию, содержащую объекты класса Student.
3. Написать метод, который удаляет студентов со средним баллом <3.
4. Если средний балл>=3, студент переводится на следующий курс.
5. Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
6. А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
###9. Домашние животные
1. Создайте класс Pet и его наследников Cat, Dog, Parrot.
2. Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
3. Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
