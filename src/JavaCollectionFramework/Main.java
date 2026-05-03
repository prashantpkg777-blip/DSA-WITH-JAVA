package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(22,"Prashant",62));
        students.add(new Student(21,"Omi",70));
        students.add(new Student(19,"Ranjeet",53));
        students.add(new Student(22,"Kumar",60));

        System.out.println(students);

        Collections.sort(students);
        System.out.println("Sorted: "+students);
    }
}
