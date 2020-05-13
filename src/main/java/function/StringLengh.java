package function;
import java.util.function.*;
public class StringLengh {
    public static void main(String ar[]) {
        Function<String,Integer> f = s->s.length();
        Function<Integer,Integer> s = i->i*i;
        System.out.println(f.apply("Robin"));
        System.out.println(s.apply(5));
        String str = "I am going to School";
        Function<String, String> st = string->string.replaceAll(" ","");
        System.out.println(st.apply(str));
        Function<String,Integer> count  = len->len.length()-len.replaceAll(" ","").length();
        System.out.println(count.apply(str));
    }
}
