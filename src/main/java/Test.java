import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String atr[]){
        LocalDate l = LocalDate.of(2016,9,20);
        LocalDate ld = LocalDate.now();
        Period p = Period.between(l,ld);
        System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());

    }
}
