package Collections.Task8;

import java.util.*;

public class Student {
    String name;
    String group;
    int course;
    Map<Subject, Integer> results;

    public Student(String name, String group, int course) {
        this(name);
        this.group = group;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
        results = new EnumMap<>(Subject.class);
    }

    public Student() {
    }

    List<Student> graduated = new ArrayList<>();

    public void getSubjectMarks() {
        for (Subject subject : Subject.values()) {
            if (subject.getCourses().contains(course)) {
                results.put(subject, new Random().nextInt(4) + 2);
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer marks : student.results.values()) {
            averageMark += marks;
        }
        return averageMark / student.results.size();
    }

    public void getGraduatedStudents() {
        if (graduated.size() > 1) {
            System.out.println("Graduated students");
        } else if (graduated.size() == 1) {
            System.out.println("Graduated student");
        } else {
            return;
        }
        for (Student graduate : graduated) {
            System.out.println(graduate);
        }
    }

    public void printListOfStudents(List<Student> list) {
        list.forEach(System.out::println);
    }

    public void updateStudentsInfo(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            student.getSubjectMarks();
            if (averageMark(student) >= 3) {
                updateCourse(student);
                if (isGraduated(student)) {
                    iterator.remove();
                    graduated.add(student);
                }
            } else {
                iterator.remove();
            }
        }
    }

    public boolean isGraduated(Student student) {
        return student.course == -1;
    }

    public void updateCourse(Student student) {
        if (student.course <= 5) {
            student.course++;
            student.group = student.group.substring(0, 2) + student.course + student.group.substring(3);
        }
        if (student.course > 5) {
            student.group = "Graduated";
            student.course = -1;
        }
    }

    public void printStudents(List<Student> students, int course) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.course == course) {
                list.add(student);
            }
        }
        if (list.size() > 1) {
            System.out.println(course + "-year students");
        } else if (list.size() == 1) {
            System.out.println(course + "-year student");
        } else {
            return;
        }
        for (Student student : list) {
            System.out.println(student.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + (course != -1 ? course : "-") +
                ", result=" + results +
                '}';
    }
}
