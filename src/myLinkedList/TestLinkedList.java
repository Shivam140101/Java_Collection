package myLinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(5);
        ll.add(21);
        ll.add(51);
        ll.add(27);
        ll.add(45);
        ll.add(17);
        ll.add(40);
        ll.add(50);
        ll.add(34);

        ll.addFirst(56);
        ll.addLast(99);

        System.out.println("\nList : "+ll);

        System.out.println("\nGet the elements : ");
        ll.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\nremove First element : "+ll.removeFirst());
        System.out.println("remove Last : "+ll.removeLast());

        System.out.println("\nAfter Removing first and last element: ");
        ll.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\noffer...Queue Method : "+ll.offer(96));
        System.out.println("After offer : ");
        ll.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\noffer first : "+ll.offerFirst(23));
        System.out.println("offer last : "+ll.offerLast(78));

        System.out.println("\nAfter Offer first and last : ");
        ll.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\nget object using peek not remove...Queue Method : "+ll.peek());
        System.out.println("get object using peek first : "+ll.peekFirst());
        System.out.println("get object using peek last : "+ll.peekLast());

        System.out.println("After using peek");
        ll.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\nDelete object using poll...Queue Method : "+ll.poll());
        System.out.println("Delete object using poll First : "+ll.pollFirst());
        System.out.println("Delete object using poll Last : "+ll.pollLast());

        System.out.println("\nAfter using Poll : ");
        ll.forEach(e-> System.out.print(e+" "));

        Collections.sort(ll);
        System.out.println("\n\nAfter Sorting");
        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }


    }
}
