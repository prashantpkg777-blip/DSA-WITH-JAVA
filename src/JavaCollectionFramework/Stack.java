package JavaCollectionFramework;

import java.util.*;

public class Stack {

    static void main() {


        // Stack -> concrete class
        java.util.Stack<Integer> list1 = new java.util.Stack<>();
        List<Integer> list2 = new java.util.Stack<>();
        Collection<Integer> list3 = new java.util.Stack<>();

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
        System.out.println("After clear " + list2);

        // iterator ( i want to traverse list using iterator )
        Iterator<Integer> iterator = list1.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }

        // get and set
        List<Integer> list4 = new java.util.Stack<>();
        list4.add(11);
        list4.add(12);
        list4.add(13);
        System.out.println(list4.get(0));
        System.out.println(list4.get(1));

        System.out.println("Before set " + list4);
        list4.set(0, 100);
        System.out.println("After set " + list4);

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
        System.out.println("Printing Entire List: " + list1);

        // sort to ArrayList
        Collections.sort(list1);
        System.out.println("Printing Sorted List: " + list1);
        Collections.reverse(list1);
        System.out.println("Printing Reverse List: " + list1);
        Collections.shuffle(list1);
        System.out.println("Printing Random List: " + list1);

        // clone
//        java.util.ArrayList<Integer> NewList = (java.util.ArrayList<Integer>)list1.clone();
//        System.out.println("Printing New List clone: " +NewList);

        // ensureCapacity
        java.util.ArrayList<Integer> marks = new java.util.ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty
        System.out.println(marks.isEmpty()); //true
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

        List<Integer> ll = new java.util.Stack<>();
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

        // method
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        //push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        // pop
        stack.pop();
        System.out.println(stack);

        // peek
        System.out.println(stack.peek());

        // search
        System.out.println(stack.search(20)); // 2
        System.out.println(stack.search(50)); // -1

        // isEmpty
        System.out.println(stack.isEmpty()); // false

        // Deque
        Deque<Integer> deque = new java.util.ArrayDeque<>();

        deque.push(10);
        deque.push(20);
        deque.push(30);
        System.out.println(deque);

        deque.pop();
        System.out.println(deque);

        System.out.println(deque.peek());

    }
}
