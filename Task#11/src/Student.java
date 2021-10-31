import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public boolean compareCourse(Student other) {
        if ((this.name == other.name) && (this.course == other.course)) {
            return true;
        }
        return false;
    }

    public void output() {
        System.out.println("Student " + this.name + " studies in course " + this.course);
    }

    @Override
    public String toString() {
        return "Student " + this.name + " studies in course " + this.course;
    }

    public void printStudents(List<Student> students, Integer course) {
        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).getCourse() == course) {
                students.get(i).output();
            }
        }
    }

    public int compareByName(Student other) {
        String n1 = this.getName();
        String n2 = other.getName();
        return n1.compareTo(n2);
    }

    public int compareByCourse(Student other) {
        int c1 = this.getCourse();
        int c2 = other.getCourse();

        if (c1 > c2) {
            return 1;
        } else if (c1 < c2) {
            return -1;
        } else {
            return 0;
        }
    }
}

        class SortedByName implements Comparator<Student> {
            public int compare(Student obj1, Student obj2) {
        return obj1.compareByName(obj2);
    }
}

        class SortedByCourse implements Comparator<Student> {
            public int compare(Student obj1, Student obj2) {
        return obj1.compareByCourse(obj2);
    }
}


