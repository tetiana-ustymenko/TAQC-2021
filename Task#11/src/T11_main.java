
import java.util.ArrayList;
import java.util.List;

public class T11_main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        String[] name = new String[]{"Olivia", "George", "Scott", "Harry", "Amelia"};
        int[] course = new int[]{3, 5, 2, 4, 3};

        Student st;
        for (int i = 0; i < 5; ++i) {
            st = new Student(name[i], course[i]);
            students.add(st);
        }

        System.out.println("  Original students' list:");
        for (Object person : students) {
            System.out.println(person);
        }

        students.sort(new SortedByName());
        System.out.println("\n  Sorted by Name:");

        for (Student product : students)
            System.out.println(product.toString());

        students.sort(new SortedByCourse());
        System.out.println("\n  Sorted by Course:");

        for (Student product : students)
            System.out.println(product.toString());
    }

}

