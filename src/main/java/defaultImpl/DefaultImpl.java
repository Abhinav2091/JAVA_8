package defaultImpl;

import service.DefaultInterface;

public class DefaultImpl implements DefaultInterface {
    public static void main(String ar[]) {
        DefaultImpl df = new DefaultImpl();
        df.m1();
    }
    public  void m1() {
        System.out.println("Own Implementation");
    }
}
