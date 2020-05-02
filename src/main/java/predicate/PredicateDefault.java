package predicate;

import java.util.function.Predicate;

public class PredicateDefault {
    public static void main(String ar[]) {
        String[] names = {"Reena","Robin","Dia","Dikshu","Madhu"};
        int[] x = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2==0;
        Predicate<String> starts = s->s.charAt(0)=='D';
        System.out.println("Printing Names>>>> :");
        stringPrint(starts,names);

        System.out.println("Greater than 10 : ");
        m(p1,x);
        System.out.println("Even Numbers :");
        m(p2,x);
        System.out.println("Not greater than 10 :");
        m(p1.negate(), x);
        System.out.println("Greater than 10 and Even :");
        m(p1.and(p2),x);
        System.out.println("Greate than 10 OR Even :");
        m(p1.or(p2),x);
    }
    public static void stringPrint(Predicate<String> s, String[] names) {
        for(String a:names) {
            if(s.test(a)) {
                System.out.println("Name with R :"+a);
            }
        }
    }

    public static void m(Predicate<Integer> p, int[] x) {
        for(int x1:x) {
            if(p.test(x1)) {
                System.out.println("Numbers : "+x1);
            }
        }
    }
}
