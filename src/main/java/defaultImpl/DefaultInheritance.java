package defaultImpl;

import service.LeftInterface;
import service.RightInterface;

import javax.print.DocFlavor;

public class DefaultInheritance implements LeftInterface, RightInterface {
    public void m1() {
       // System.out.println("OWN Implementatipn");
        LeftInterface.super.m1();
        RightInterface.super.m1();
    }
    public static void main(String ar[]) {
        DefaultInheritance d = new DefaultInheritance();
        d.m1();
    }
}
