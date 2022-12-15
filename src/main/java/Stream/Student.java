package Stream;

public class Student {
    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }   //don't create methods which you will not use

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Student(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
