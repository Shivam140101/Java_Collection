package driver;

import beans.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class testStudent {

    public static void main(String[] args) {

        ArrayList<student> stlist = new ArrayList<>();

        stlist.add(new student(101,"AAAA","aaa@gmail","Noida",78.87f));
        stlist.add(new student(102,"BBBB","bbb@gmail","Delhi",89.99f));
        stlist.add(new student(103,"CCCC","ccc@gmail","Delhi",99.99f));
        stlist.add(new student(104,"DDDD","ddd@gmail","Delhi",56.78f));
        stlist.add(new student(105,"EEEE","eee@gmail","Noida",78.87f));

        System.out.println("\nList of Student : "+stlist);

        System.out.println("Get Record of Student object using Iterator");
        System.out.println("ID\tName \tE-mail \t\tAddress \tMarks");

        Iterator<student> itr = stlist.iterator();
        while (itr.hasNext()){
            student s = itr.next();
            System.out.print(s.getId());
            System.out.print("\t"+s.getName());
            System.out.print("\t"+s.getEmail());
            System.out.print("\t"+s.getAddress());
            System.out.println("\t\t"+s.getMarks());
        }


        System.out.println("=======================================================================================");
        System.out.println("=======================================================================================");



        Scanner sc = new Scanner(System.in);
        System.out.println("How many Students you want to add");
        int num = sc.nextInt();
        System.out.println();
        for (int i=1 ; i<=num ; i++){
            student stud = new student();
            System.out.print("Enter Id of Student "+i+" : ");
            stud.setId(sc.nextInt());

            System.out.print("Enter Name of Student :  ");
            stud.setName(sc.next());

            System.out.print("Enter Student Email : ");
            stud.setEmail(sc.next());

            System.out.print("Enter Student Address : ");
            stud.setAddress(sc.next());

            System.out.print("Enter Student Marks : ");
            stud.setMarks(sc.nextFloat());

            stlist.add(stud);
            System.out.println();

        }

        System.out.println("Get Record of Student object using Iterator");
        System.out.println("ID\tName \tE-mail \t\tAddress \tMarks");

        Iterator<student> itr1 = stlist.iterator();
         while (itr1.hasNext()){
            student s1 = itr1.next();
            System.out.print(s1.getId());
            System.out.print("\t"+s1.getName());
            System.out.print("\t"+s1.getEmail());
            System.out.print("\t"+s1.getAddress());
            System.out.println("\t\t"+s1.getMarks());
        }



    }
}
