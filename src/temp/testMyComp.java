package temp;

import java.util.Comparator;
import java.util.TreeSet;

class temp{
    int salary;

    public temp(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return (Integer.valueOf(salary)).toString();
    }
}

class Mycomp implements Comparator<temp>{
    public int compare(temp t1,temp t2){
        if (t1.salary > t2.salary)
            return 1;
        else if (t1.salary< t2.salary)
            return -1;
        else
            return 0;
    }
}

public class testMyComp {

    public static void main(String[] args) {
        Mycomp com = new Mycomp();
        TreeSet<temp> ts = new TreeSet<>(com);
        ts.add(new temp(10));
        ts.add(new temp(2));
        ts.add(new temp(7));
        ts.add(new temp(10));
        ts.add(new temp(9));
        ts.add(new temp(11));
        ts.add(new temp(6));
        ts.add(new temp(17));
        ts.add(new temp(30));
        ts.add(new temp(25));
        System.out.println("\nts "+ts);
    }
}
