package AnnonymousLamda;

import service.Annonymous;

public class Test {
    int x=88;
    public void m2() {
        Annonymous i = () -> { //this concept in Lamda Expression
            int x=99;
            System.out.println("Local : "+x);
            System.out.println("This variable : "+this.x);
        };
        i.m1();
    }
    public static void main(String ar[]) {
        Test t = new Test();
        t.m2();
    }
}
