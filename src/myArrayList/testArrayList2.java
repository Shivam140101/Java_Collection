package myArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer>  al = new ArrayList<>();
        System.out.println("The list is empty T/F : "+al.isEmpty());
        System.out.println("Size of the List : "+al.size());

        int[] x = {1,-1,2,-2,3,-3,4,-4,5,-5};
        for (int i=0 ; i<x.length ; i++){
            al.add(x[i]);
        }


        System.out.println("The list is empty T/F : "+al.isEmpty());
        System.out.println("Size of the List : "+al.size());
        System.out.println("List is : "+al);

        System.out.println("Iterate the list using Iterator ");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Integer iobj = (Integer) itr.next();
            System.out.print("  "+iobj.intValue());
            if (iobj.intValue() < 0){
                itr.remove();
            }
        }

        System.out.println("\nIterate the list after delete: ");
        Iterator itr1 = al.iterator();
        while (itr1.hasNext()){
           // Integer iobj = (Integer) itr.next();
            System.out.print("  " + ((Integer)itr1.next()).intValue());
        }

    }
}
