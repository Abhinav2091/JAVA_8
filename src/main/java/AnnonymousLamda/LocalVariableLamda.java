package AnnonymousLamda;

import service.LocalInterface;

public class LocalVariableLamda {
    int x=10;
    public void m2() {
        int y = 12;                           //value freezed for Lamda Expression
        LocalInterface i = () -> {
            System.out.println("Local : "+y); //Local Variable referenced from lamda must be final
            System.out.println("Value of X : "+x);
        };
        i.m1();
    }
    public static void main(String ar[]) {
        LocalVariableLamda l =new LocalVariableLamda();
        l.m2();
    }
}
