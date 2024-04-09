package myMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class testTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(222,"Rohit");
        tm.put(333,"Ronit");
        tm.put(444,"Vijay");
        tm.put(555, "Shuvam");
        tm.put(777, "Rohit");
        tm.put(666, "Arti");

        tm.put(22, "Rajesh");
        tm.put(44, "Ajay");
        tm.put(55, "Ajit");
        tm.put(33, "Nitin");
        tm.put(77, "Sachin");
        tm.put(66, "Sanjay");

        System.out.println("tm :- "+tm);

        Set<Integer> keyset = tm.keySet();
        Iterator<Integer> itr = keyset.iterator();
        System.out.println("Key\tValue");
        while (itr.hasNext()){
            Integer key = itr.next();
            System.out.println(key.intValue()+"\t"+tm.get(key));
        }

        System.out.println("\nFirst key :- "+tm.firstKey());
        System.out.println("last key :- "+tm.lastKey());
        System.out.println("HeadMap before 66 :- "+tm.headMap(66));
        System.out.println("HeadMap before 60 :- "+tm.headMap(60));
        System.out.println("TailMap from 77 :- "+tm.tailMap(77));
        System.out.println("TailMap from 225 :- "+tm.tailMap(225));
        System.out.println("subMap :- "+tm.subMap(350,600));
        System.out.println("Return just before or same :- "+tm.floorKey(45));



    }
}
