package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieMain {
    public static void main(String ar[]) {
        ArrayList<Movie> al = new ArrayList<Movie>();
        populate(al);
        Consumer<Movie> c = m->{
            System.out.println("Movie Name : "+m.name);
            System.out.println(("Actor : "+m.actor));
            System.out.println("Actress : "+m.actress);
        };
        for(Movie m:al) {
            c.accept(m);
        }

    }
    public static void populate(ArrayList<Movie> al) {
        al.add(new Movie("Dhoom2","Hritik","Aish"));
        al.add(new Movie("Dhoom","John","Anushka"));
        al.add(new Movie("Bajirao","Ranveer","Deepika"));
    }
}
