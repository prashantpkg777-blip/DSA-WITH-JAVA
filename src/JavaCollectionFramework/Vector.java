package JavaCollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Vector {
    public static void main(String[] args) {


        // Vector -> concrete class
        java.util.Vector<Integer> list1 = new java.util.Vector<>();
        List<Integer> list2 = new java.util.Vector<>();
        Collection<Integer> list3 = new java.util.Vector<>();

        // add
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);

        // remove
        list1.remove(0);
        System.out.println(list1);

        // add all
        list2.add(99);
        list2.add(88);
        list2.add(30);

        list1.addAll(list2);
        System.out.println(list1);

        // remove all
        list1.removeAll(list2);
        System.out.println(list1);

        // size
        System.out.println(list1.size());

        // clear
        list2.clear();
        System.out.println("After clear "+ list2);

        // iterator ( i want to traverse list using iterator )
        Iterator<Integer> iterator = list1.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }

        // get and set
        List<Integer> list4 = new java.util.Vector<>();
        list4.add(11);
        list4.add(12);
        list4.add(13);
        System.out.println(list4.get(0));
        System.out.println(list4.get(1));

        System.out.println("Before set "+ list4);
        list4.set(0,100);
        System.out.println("After set " +list4);

        // toArray
        Object arr[] = list4.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contain

        System.out.println(list4.contains(100)); // true
        System.out.println(list4.contains(120)); // false

        list1.add(95);
        list1.add(25);
        System.out.println("Printing Entire List: " +list1);

        // sort to ArrayList
        Collections.sort(list1);
        System.out.println("Printing Sorted List: " +list1);
        Collections.reverse(list1);
        System.out.println("Printing Reverse List: " +list1);
        Collections.shuffle(list1);
        System.out.println("Printing Random List: " +list1);

        // isEmpty

        System.out.println(list1.isEmpty()); //false

        // indexOf
        System.out.println(list1.indexOf(40));
        list1.add(40);
        list1.add(20);
        list1.add(40);
        list1.add(30);
        // lastIndexOf
        System.out.println(list1);
        System.out.println(list1.lastIndexOf(40));

        // addFirst and addLast

        List<Integer> ll = new java.util.Vector<>();
        ll.add(20);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(100);
        System.out.println(ll);

        // removeFirst and removeLast
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

        // getFirst and getLast
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

    }
}
