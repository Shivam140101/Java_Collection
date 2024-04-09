package myArrayList;

import java.util.ArrayList;

public class testArrayList3 {

    public static void main(String[] args) {

        ArrayList <Integer> al1 = new ArrayList<>();
        System.out.println("The list is Empty T/F : "+al1.isEmpty());
        System.out.println("Size of the list : "+ al1.size());

        al1.add(10);
        al1.add(34);
        al1.add(5);
        al1.add(7);
        al1.add(25);
        al1.add(35);
        al1.add(32);
        al1.add(31);
        al1.add(37);
        al1.add(28);
        al1.add(39);


        al1.add(40);
        al1.add(41);
        al1.add(42);
        al1.add(43);
        al1.add(44);
        al1.add(45);
        al1.add(46);

        /*System.out.println("The list  is empty  T / F   "+al1.isEmpty());
		System.out.println("The Size of List "+al1.size());
		System.out.println("list1   "+al1);


		System.out.println("Iterate the list  using for-each Loop");
     	for(Integer element  : al1)
			System.out.print("   "+element);

		System.out.println("Iterate the list  using for Loop");
		Object[] objArr = al1.toArray();
		for(int i =0; i < objArr.length; i++)
			System.out.println("list["+i+"] =  "+objArr[i]);


		System.out.println("Iterate the list  using Iterator<intr>");
		Iterator itr = al1.iterator();
		while (itr.hasNext()) {
			Integer iobj = (Integer) itr.next();
			System.out.print("   "+iobj.intValue());
		} */

        System.out.println("\nIterate the list 1 using forEach method ");
        al1.forEach(e -> System.out.print("  "+e));

        ArrayList<Integer> al2=  new ArrayList<>();

        al2.add(40);
        al2.add(41);
        al2.add(42);
        al2.add(43);
        al2.add(44);
        al2.add(45);
        al2.add(46);

        System.out.println("\n\nIterate the list 2 ");
        al2.forEach(e-> System.out.print("  "+e));

        System.out.println("\n\nContains 80 T/F : "+al1.contains(80));
        System.out.println("Contains 25 T/F : "+al1.contains(25));
        System.out.println("Contains 22 T/F : "+al1.contains(22));
        System.out.println("Contains 7 T/F : "+al1.contains(7));

        System.out.println("\nal1 ContainsAll al2 : "+al1.containsAll(al2));
        System.out.println("al2 ContainsAll al1 : "+al2.containsAll(al1));

        al1.addAll(al2);
        System.out.println("\nAfter adding al1 in al2");
        System.out.println("al1 ContainsAll al2 T/F : " +al1.containsAll(al2));
        System.out.println("al2 ContainsAll al1 T/F : " +al2.containsAll(al1));

        System.out.println("Remove  object  "+al1.remove((25)));
        System.out.println("Remove  object  "+al1.remove((7)));
        System.out.println("Remove  object  "+al1.remove((22)));
        System.out.println("Remove  object  "+al1.remove((37)));
        System.out.println("Iterate the list After Delete ");
        Object[] objArr1 = al1.toArray();
        for(int i =0; i < objArr1.length; i++)
            System.out.println("list["+i+"] =  "+objArr1[i]);


        System.out.println("Remove  index  "+al1.remove(7));
        System.out.println("Remove index  "+al1.remove(9));
        System.out.println("Remove index  "+al1.remove(11));
        System.out.println("\nIterate the list after del " );
        al1.forEach(e->System.out.print("  "+e));

        System.out.println("RemoveAll  "+al1.removeAll(al2));
        System.out.println("RemoveAll  "+al2.removeAll(al1));

        System.out.println("\nIterate the list after del " );
        al1.forEach(e->System.out.print("  "+e));
        al1.clear();
        System.out.println("\nThe list  is empty  T / F   "+al1.isEmpty());
        System.out.println("The Size of List "+al1.size());


    }
}
