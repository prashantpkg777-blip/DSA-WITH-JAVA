package JavaCollectionFramework;

public class Set {
    public static void main(String[] args) {
        // Sets

        // Set
        java.util.Set<Integer> st1 = new java.util.HashSet<>();

        st1.add(10);
        st1.add(10);
        st1.add(10);
        st1.add(40);
        st1.add(20);
        st1.add(20);
        st1.add(30);

        System.out.println(st1);
        // output - random order

        // LinkedHashSet
        java.util.Set<Integer> st2 = new java.util.LinkedHashSet<>();

        st2.add(10);
        st2.add(10);
        st2.add(10);
        st2.add(40);
        st2.add(20);
        st2.add(20);
        st2.add(30);

        System.out.println(st2);
        // output - input order

        // TreeSet
        java.util.Set<Integer> st3 = new java.util.TreeSet<>();

        st3.add(10);
        st3.add(10);
        st3.add(10);
        st3.add(40);
        st3.add(20);
        st3.add(20);
        st3.add(30);

        System.out.println(st3);
        // output - sort order

        // Time complexity

        // HashSet -> O(1)
        // LinkedHashSet -> O(n)
        // TreeSet -> O(log n) (BST)


        // Method
        java.util.Set<Integer> set1 = new java.util.HashSet<>();
        java.util.Set<Integer> set2 = new java.util.HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);

        System.out.println(set1);
        System.out.println(set2);

        // retainAll
        set1.retainAll(set2); // InterSection (Common values)
        System.out.println(set1);

        // containAll
        System.out.println(set2);
        System.out.println(set1.containsAll(set2)); // false
        System.out.println(set2.containsAll(set1)); // true

    }
}
