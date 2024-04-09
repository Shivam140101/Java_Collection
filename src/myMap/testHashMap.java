package myMap;

import java.security.KeyStore;
import java.util.*;

public class testHashMap {

    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        System.out.println("Map is Empty : "+hm.isEmpty());
        System.out.println("Size of Map : "+hm.size());
        System.out.println("hm:- "+hm);

        System.out.println("put add in list :- "+hm.put(111,"Nitin"));
        System.out.println("hm :- "+hm);
        hm.put(222,"Rohit");
        hm.put(333, "Shuvam");
        hm.put(444, "Vinay");
        hm.put(555, "Vijay");
        hm.put(777, "Rohit");
        hm.put(666, "Arti");
        hm.put(null, null);
        hm.put(101, null);
        System.out.println("put add in list "+ hm.put(111,"Raju"));
        System.out.println("hm   "+hm);
        hm.put(null,"ABC");
        System.out.println("hm : "+hm );

        System.out.println("\nMap is Empty : "+hm.isEmpty());
        System.out.println("Size of Map : "+hm.size());

        Set<Map.Entry<Integer,String>> set = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        System.out.println("key\tValue");
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"\t"+value);
        }

        Set<Integer> kset = hm.keySet();
        Iterator<Integer>itr1 = kset.iterator();
        System.out.println("\nkey\tValue");
        while (itr1.hasNext()){
            Integer key = itr1.next();
            System.out.println(key+"\t"+hm.get(key));
        }

        Collection<String> values = hm.values();
        Iterator <String> itr2 = values.iterator();
        System.out.println("\nOnly Values");
        while (itr2.hasNext()){
            System.out.println(itr2.next()+" ");
        }

        System.out.println("\ncontains Key T/F 111 "+hm.containsKey(111));
        System.out.println("contains Key 1110 "+hm.containsKey(1110));
        System.out.println("\ncontainsValue  T/F Raju T   "+hm.containsValue("Raju"));
        System.out.println("containsvlaue  T/F Nitin F   "+hm.containsValue("Nitin"));

        System.out.println("\nRemove Key T/F 111 T   "+hm.remove(111));
        System.out.println("Remove Key T/F 1112 T   "+hm.remove(1112));
        System.out.println("Remove Key T/F 333 shivam T   "+hm.remove(333, "Shivam"));
        System.out.println("Remove Key T/F 333 shivam T   "+hm.remove(330, "Shuvam"));
        System.out.println("Remove Key T/F 333 shuvam T   "+hm.remove(333, "Shuvam"));
        System.out.println("hm   "+hm);
        System.out.println("\nReplace Key  value  "+hm.replace(777, "Rahul"));
        System.out.println("hm   "+hm);

        HashMap<Integer, String > hm1 = new HashMap<Integer, String>();
        hm1.put(22, "Ritika");
        hm1.put(33, "Mushkan");
        hm1.put(44, "Vikash");
        hm1.put(55, "Vijay");
        hm1.put(77, "Ajit");
        hm1.put(66, "Amit");
        hm.putAll(hm1);
        Set <Map.Entry<Integer,String >> set3= hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr3=  set3.iterator();
        System.out.println("Key \t Value ");
        while(itr3.hasNext()) {
            Map.Entry<Integer,String> entry = itr3.next();
            System.out.println(entry.getKey()+" \t "+entry.getValue());
        }
        Set <Integer> set4 = hm.keySet();
        //Iterator< Integer> itr4 = set4.iterator();
        System.out.println("Iterate the map using foreach method  ");
        for(Integer iobj : set4 )
            System.out.println(iobj+"\t "+hm.get(iobj));

        hm.clear();
        System.out.println("\nThe map is empty T/F  "+hm.isEmpty());
        System.out.println("The size is of map  "+hm.size());

    }
}
