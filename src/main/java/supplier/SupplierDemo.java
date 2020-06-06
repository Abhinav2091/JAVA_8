package supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] ar) {
        Supplier<String> s = ()-> {
            String[] arr = {"Robin","Dia","Neha","Sakshi"};
            int x = (int)(Math.random()*4);
            return arr[x];

        };
        Supplier<String> str = ()-> {
          String otp="";
          for(int i=0;i<6;i++) {
              otp=otp+(int)(Math.random()*10);
          }
          return otp;
        };
        System.out.println("Randon Name : "+s.get());
        System.out.println("OTP : "+str.get());
    }
}
