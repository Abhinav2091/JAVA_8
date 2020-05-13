package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMain {
    public static void main(String ar[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        populate(al);
        Predicate<Student> p = s->s.marks>60;
        System.out.println("*******Implementinf Predicate******");
        for(Student s : al) {
            System.out.println(s.name+" "+p.test(s));
        }

        Function<Student,String> f = s->{
            int marks=s.marks;
            if(marks>80)
                return "A Grade";
                else if (marks>60)
                    return "B Grade";
                else
                    return "Failed";
        };
        System.out.println("*******Implememting Function**********");
        for(Student s:al) {
            System.out.println(s.name+" "+f.apply(s));
           // System.out.println(f.apply(s));
        }
    }
    public static void populate(ArrayList<Student> al) {
        al.add(new Student("Robin",92));
        al.add(new Student("Ronney",72));
        al.add(new Student("Akhil",62));
        al.add(new Student("Diljeet",52));
    }
}
