package staticImpl;

import service.StaticInterface;

public class StaticImpl implements StaticInterface {
    public static void main(String ae[]) {
        StaticImpl s = new StaticImpl();
        //s.m1(); //Error
        //StaticImpl.m1(); //Error Static method may be invoked on containing interface class only
        StaticInterface.m1();
    }
}
