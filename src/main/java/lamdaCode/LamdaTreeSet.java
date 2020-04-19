package lamdaCode;

import java.util.ArrayList;
import java.util.TreeSet;

public class LamdaTreeSet {
    public  static void main(String ar[]) {
        TreeSet<Integer> al = new TreeSet<Integer>( (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        al.add(13);
        al.add(15);
        al.add(10);
        al.add(4);
        al.add(12);
        System.out.println("Customize Sorting Set "+al);
    }
}
