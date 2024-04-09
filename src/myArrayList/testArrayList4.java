package myArrayList;

import java.util.ArrayList;

public class testArrayList4 {

    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        System.out.println("The is list is empty T/F : "+al1.isEmpty());
        System.out.println("The Size of the List : "+al1.size());
        System.out.println("al1 hashCode : "+al1.hashCode());

        al1.add(40);
        al1.add(41);
        al1.add(42);
        al1.add(43);
        al1.add(44);
        al1.add(45);
        al1.add(46);

        System.out.println("\nal1 List is : "+al1);
        System.out.println("The Size of the List : "+al1.size());
        System.out.println("al1 hashCode : "+al1.hashCode());

        ArrayList<Integer> al2 = new ArrayList<>();
        //System.out.println("\nal2 hashcode : "+al2.hashCode());

        al2.add(40);
        al2.add(41);
        al2.add(42);
        al2.add(43);
        al2.add(44);
        al2.add(45);
        al2.add(46);

        System.out.println("\nal2 List : "+al2);
        System.out.println("al2 hashcode : "+al2.hashCode());

        System.out.println("\nal1 equals al2 : "+al1.equals(al2));

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

        System.out.println("\nal1 hashCode :  "+al1.hashCode());
        System.out.println("al2 hashCode :  "+al2.hashCode());
        System.out.println("\nal1 equals al2 : "+al1.equals(al2));
        System.out.println("\nal1 list : "+al1);
        System.out.println("al2 list : "+al2);

        System.out.println("\nIterate al1 list using for each method");
        al1.forEach(e-> System.out.print(e+" "));

        System.out.println("\n\nIterate al2 list using for each method");
        al2.forEach(e-> System.out.print(e+" "));

        al1.addAll(al2);
        System.out.println("\n\nIterate al1 list using for each method After Add All Method");
        al1.forEach(e-> System.out.print(e+" "));

        //al2.removeAll(al1) Delete the element in added collection (delete al2 common al1 also)
        System.out.println("\nRemoveAll  retainAll "+al2.retainAll(al1));
        System.out.println("RemoveAll retainAll  "+al1.retainAll(al2));// (delete al1 save common al1 & al2

        System.out.println(" Iterate using forEach Method after Delete");
        al1.forEach(e->System.out.print("  "+e));


        System.out.println("\nIterate using forEach Method ");
        al2.forEach(e->System.out.print("  "+e));





    }
}
