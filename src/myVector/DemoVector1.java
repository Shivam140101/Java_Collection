package myVector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVector1 {

    public static void main(String[] args) {

        Vector<String> vobj = new Vector<>();
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        vobj.addElement("Shivam");
        vobj.addElement("Java");
        vobj.addElement("FullStack");

        System.out.println("\nList : "+vobj);
        System.out.println("The size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        System.out.println("\nTraversing the list using Enumeration ");
        Enumeration<String> enum1 = vobj.elements();
        while (enum1.hasMoreElements()){
           // String name = enum1.nextElement();
           // System.out.println(name+" ");
            System.out.print(enum1.nextElement()+" ");
        }

        Vector<String> vobj1 = new Vector<>();
        vobj1.add("XYZ");
        vobj1.add("ABC");
        vobj1.add("JKL");
        vobj.addElement("Shivam");
        vobj.addElement("Java");


        vobj.addAll(vobj1);

        System.out.println("Traverse using Enumeration ");
        Enumeration<String> enum2 = vobj.elements();
        while (enum2.hasMoreElements()){
            System.out.print(enum2.nextElement()+" ");
        }

        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        System.out.println("\nElementAt() method : "+vobj.elementAt(3));
        System.out.println("\n\nGet First element : "+vobj.firstElement());
        System.out.println("Get last element : "+vobj.lastElement());

        System.out.println("removeElement : "+vobj.removeElement("XYZ"));
        System.out.println("retainAll : "+vobj.retainAll(vobj1));
        Collections.sort(vobj);
        System.out.println("Iterate After calling retain Method");
        Iterator<String> itr1 = vobj.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next()+" ");
        }

        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());

        System.out.println("After using trim to size ");
        vobj.trimToSize();
        System.out.println("\nThe size of vector : "+vobj.size());
        System.out.println("The capacity of vector : "+vobj.capacity());









    }
}
