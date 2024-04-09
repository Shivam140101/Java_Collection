package myMap;

import java.util.*;

public class testHashTable {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1, "Binay");
        ht.put(5, "Ranjeet");
        ht.put(2, "Ranjeet");
        ht.put(3, "Bikash");
        ht.put(4,"Lalu");
        ht.put(4,"Raju");

        System.out.println("ht:- "+ht);


        Set<Map.Entry<Integer,String>> s = ht.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> e = itr.next();
            Integer id = e.getKey();
            String name = e.getValue();
            System.out.println(id.intValue()+" "+name+"\n");
        }

        Enumeration<String> enum1 = ht.elements();
        Enumeration<Integer> enum2 = ht.keys();
        while(enum2.hasMoreElements()){
            Integer key = enum2.nextElement();
            String value = enum1.nextElement();
            System.out.println(key+" "+value);
        }

        ht.clear();
        System.out.println("Table is empty :- "+ht.isEmpty());


    }
}
