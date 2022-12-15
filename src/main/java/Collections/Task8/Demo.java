package Collections.Task8;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    static List<Student> studentList = new ArrayList<>();
    static Student students = new Student(); //name should be student not students

    public static void main(String[] args) {
        /**
         Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
         Создать коллекцию, содержащую объекты класса Student.
         */
        studentList.add(new Student("Mark Zuckerberg", "GR130", 1));
        studentList.add(new Student("Steve Jobs", "GR230", 2));
        studentList.add(new Student("Bill Gates", "GR430", 4));
        studentList.add(new Student("Linus Torvalds", "GR530", 5));
        studentList.add(new Student("Ken Thompson", "GR330", 3));
        studentList.add(new Student("James Gosling", "GR130", 1));
        studentList.add(new Student("Steve Wozniak", "GR230", 2));
        studentList.add(new Student("Blake Ross", "GR330", 3));
        studentList.add(new Student("Mike Krieger", "GR430", 4));
        studentList.add(new Student("John Carmack", "GR530", 5));
        System.out.println("\nStudents before updating info\n");
        students.printListOfStudents(studentList);

        System.out.println("\nStudents on second course before updating info\n");
        students.printStudents(studentList, 2);

        /**
         Написать метод, который удаляет студентов со средним баллом <3.
         Если средний балл>=3, студент переводится на следующий курс.
         */
        students.updateStudentsInfo(studentList);

        System.out.println("\nGraduated students after updating info\n");
        students.getGraduatedStudents();

        /**
         Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
         А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
         */
        System.out.println("\nStudents on second course after updating info\n");
        students.printStudents(studentList, 2);

        System.out.println("\nStudents after updating info\n");
        students.printListOfStudents(studentList);
    }
}
