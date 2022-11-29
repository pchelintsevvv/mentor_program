package Stream;

import java.util.Arrays;
import java.util.Collection;

public class StudentsDemo {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 29, Gender.MAN));

        getAverageAgeOfStudents(students);
        getStudentsByGender(students, Gender.WOMAN);
        getStudentsByGenderAndAge(students, Gender.MAN, 18, 28);

    }

    public static void getAverageAgeOfStudents(Collection<Student> students) {
        System.out.println(students.stream().mapToInt(Student::getAge).average().getAsDouble());
    }

    public static void getStudentsByGender(Collection<Student> students, Gender value) {
        students.stream().filter(s -> s.getGender() == value).forEach(System.out::println);
    }

    public static void getStudentsByGenderAndAge(Collection<Student> students, Gender value, int ageFrom, int ageTo) {
        students.stream()
                .filter(s -> s.getGender() == value)
                .filter(s -> s.getAge() >= ageFrom && s.getAge() <= ageTo)
                .forEach(System.out::println);
    }
}
