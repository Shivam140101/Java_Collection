package myVector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVector {

    public static void main(String[] args) {

        Vector<Integer> vobj = new Vector<>();

        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());
        System.out.println("The vector is empty : "+vobj.isEmpty());

        vobj.addElement(10);
        vobj.addElement(7);
        vobj.addElement(17);
        vobj.addElement(15);
        vobj.addElement(20);
        vobj.addElement(25);
        vobj.addElement(27);
        vobj.addElement(25);
        vobj.addElement(28);
        vobj.addElement(30);

        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());
        System.out.println("The vector is empty : "+vobj.isEmpty());
        System.out.println("Vector List : "+vobj);
        Collections.sort(vobj);
        System.out.print("\n\nList after sort : "+vobj);

        Enumeration <Integer> enum1 = vobj.elements();
        System.out.println("Iterate list using Enum ");
        while (enum1.hasMoreElements()){
            Integer i = enum1.nextElement();
            System.out.print(" "+i.intValue());
        }


        /*
        System.out.println("Iterate using for Each Method ");
        vobj.forEach(e-> {
            System.out.println(" "+e);
        }); */

        System.out.println("\n\nGet First element : "+vobj.firstElement());
        System.out.println("Get last element : "+vobj.lastElement());
        System.out.println("Get using index 4 : "+vobj.elementAt(4));
        System.out.println("Get using index 7 : "+vobj.get(7));

        System.out.println("Delete removeElementAt index : ");
        vobj.removeElementAt(3);
        System.out.println("Delete removeElement object : "+vobj.removeElement(40));
        System.out.println("Delete removeElement object : "+vobj.removeElement(28));
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        vobj.trimToSize();
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        Iterator<Integer> itr = vobj.iterator();
        System.out.println("\nIterating the Vector List using iterator ");
        while (itr.hasNext()) {
            System.out.print(" " + itr.next().intValue());
        }

        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        Vector<Integer> vobj1 = new Vector<>();
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        vobj1.add(40);
        vobj1.add(41);
        vobj1.add(42);
        vobj1.add(43);
        vobj1.add(44);
        vobj1.add(45);
        vobj1.add(46);
        vobj1.add(47);
        vobj1.add(48);

        /*
        System.out.println("\nIterate list 2 using for Each method ");
        vobj1.forEach(e-> {
            System.out.print(" "+e);
        });*/

        System.out.println("Iterate using Enumeration ");
        Enumeration <Integer> enum2 = vobj1.elements();
        while (enum2.hasMoreElements()){
            System.out.print(" "+enum2.nextElement().intValue());
        }

        vobj.addAll(5,vobj1);
        System.out.println("\n\nIterate the list 1 using for Each method ");
        vobj.forEach(e-> System.out.print(" "+e));
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        vobj.removeAllElements();
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        System.out.println("\nAfter trim to size : ");
        vobj.trimToSize();
        System.out.println("The size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

    }
}
