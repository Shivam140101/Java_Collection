package myArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class testArrayList5 {

    public static void main(String[] args) {

        ArrayList<Integer> al1 =  new ArrayList<Integer>();
        System.out.println("\nThe list  is empty  T / F   "+al1.isEmpty());
        System.out.println("The Size of List "+al1.size());
        al1.add(10);
        al1.add(34);
        al1.add(5);
        al1.add(7);
        al1.add(25);

        al1.add(2,35);
        al1.add(32);
        al1.add(31);
        al1.add(5, 37);
        al1.add(28);
        al1.add(39);
        Object []list = al1.toArray();
        System.out.println("Get object using Array ");
        for(int i = 0 ; i< list.length; i++) {
            System.out.println("List [ "+i+"]="+list[i]);
        }
        System.out.println("set object using  index basis "+al1.set(8, 67));
        System.out.println("dele object index basis "+al1.remove(10));

        ArrayList<Integer> al2=  new ArrayList<Integer>();

        al2.add(40);
        al2.add(41);
        al2.add(42);
        al2.add(43);
        al2.add(44);
        al2.add(45);
        al2.add(46);

        System.out.println("\nIterate the list2 ");
        al2.forEach(e->System.out.print("  "+e));

        al1.addAll(7,al2);
        Object []list1 = al1.toArray();
        System.out.println("Get object using Array ");
        for(int i = 0 ; i< list1.length; i++) {
            System.out.println("List1 [ "+i+"]="+list1[i]);
        }
        Iterator< Integer> itr = al1.iterator();
        System.out.println("Get object using iterator  forward Direction only ");
        while (itr.hasNext()) {
            Integer iobj = (Integer) itr.next();
            System.out.print("  "+iobj.intValue());
        }

        ListIterator< Integer> litr = al1.listIterator();
        System.out.println("\nIterate the list Using ListIterator Forward ");
        while (litr.hasNext()) {
            System.out.println("list ["+litr.nextIndex()+"] = "+litr.next());
        }
        System.out.println("\nIterate the list Using ListIterator Backward ");
        while (litr.hasPrevious()) {
            System.out.println("list ["+litr.previousIndex()+"] = "+litr.previous());
        }
    }
}
