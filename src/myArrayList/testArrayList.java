package myArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class testArrayList {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        System.out.println("The list is empty T/F : "+al.isEmpty());
        System.out.println("Size of list : " +al.size());
        al.add(10);
        al.add(20);
        al.add(1001);
        al.add(222.22f);
        al.add(16.5656565656);
        al.add(988.7976f);
        al.add(2345538L);
        al.add((byte)11);
        al.add("AAAA");
        al.add("BBBB");
        al.add("CCCC");
        al.add(25);
        al.add(55);
        al.add(Arrays.asList(9999));

        System.out.println("The list is Empty T/F : "+al.isEmpty());
        System.out.println("Size of the list : " + al.size());
        System.out.println("List : "+al);

        System.out.println("\nIterate the list using for-each loop ");
        for (Object element : al ){
            System.out.print("  "+element);
        }

        System.out.println("\n\niterate the list using for-loop ");
        /*for (int i = 0 ; i < al.size() ; i++){
            System.out.print("  "+al.get(i));
        }*/
        Object[] objArr = al.toArray();
        for (int i=0 ; i<objArr.length ; i++){
            System.out.println("List ["+i+"] = "+objArr[i]);
        }

        System.out.println("Iterate the list using Iterator<intr> ");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Object obj = itr.next();
            System.out.print("  "+obj);
        }

    }
}
