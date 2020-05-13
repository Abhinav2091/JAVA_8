package function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String ar[]) {
        Function<String,String> f1 = s->s.toUpperCase();
        Function<String,String> f2 = s->s.substring(0,5);
        System.out.println(f1.andThen(f2).apply("Ronney"));

    }
}
