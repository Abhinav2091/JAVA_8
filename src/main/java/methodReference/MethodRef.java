package methodReference;

public class MethodRef {

    public static void referMethod() {
        System.out.println("Method Reference");
    }

    public static void main(String[] ar) {
        MethodInterface mi = MethodRef::referMethod;
        mi.m();
    }
}
