package lamdaCode;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaComparator {
    public  static void  main (String ar[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(13);
        al.add(15);
        al.add(10);
        al.add(4);
        al.add(12);
        System.out.println("List Before Sorting : "+al);
        Collections.sort(al, (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println(al);
    }
}
