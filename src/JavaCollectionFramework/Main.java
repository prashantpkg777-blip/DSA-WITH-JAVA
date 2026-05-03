package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(22,"Prashant",62));
        students.add(new Student(21,"Omi",70));
        students.add(new Student(19,"Ranjeet",53));
        students.add(new Student(22,"Kumar",60));

        System.out.println(students);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight - o2.weight;
//            }
//        });

        Collections.sort(students,new WeightComparator());

        System.out.println("Sorted: "+students);
    }
}
