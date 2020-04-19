package lamdaCode;

import java.util.TreeMap;

public class LamdaTreeMap {
    public  static  void main(String ar[]) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0 );
        tm.put(100,"Robin");
        tm.put(300, "Ajay");
        tm.put(200,"Dogra");
        tm.put(500,"Abhi");
        tm.put(400,"Guri");
        System.out.println("Map Values : "+tm);
    }
}
