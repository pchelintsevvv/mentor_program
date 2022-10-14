package Collections.Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Subject {

    MATHEMATICS(1, 2, 3, 4, 5),
    INFORMATICS(1, 2, 3, 4, 5),
    PHYSICS(3, 4, 5),
    CHEMISTRY(1),
    ENGLISH(2, 3, 4),
    HISTORY(1, 2);

    Subject(Integer... courses) {
        this.courses = new ArrayList<>();
        Collections.addAll(this.courses, courses);
    }

    public List<Integer> getCourses() {
        return courses;
    }

    private List<Integer> courses;
}
