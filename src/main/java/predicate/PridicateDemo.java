package predicate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PridicateDemo  {
    public static void main(String ar[]) {
        Predicate<Integer> p = I->I>10;
        Predicate<String> x =S->S.length()>5;
        System.out.println(p.test(16));
        System.out.println(x.test("abcdef"));
        Predicate<Collection> pc = c->c.isEmpty();
        List<Integer> al = new ArrayList<Integer>();
        System.out.println("Empty"+pc.test(al));
        al.add(12);
        System.out.println("Not Empty"+pc.test(al));

    }
}
