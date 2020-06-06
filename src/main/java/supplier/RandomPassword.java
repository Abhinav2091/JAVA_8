package supplier;

import java.util.function.Supplier;

public class RandomPassword {
    public  static void main(String[] ar) {
        Supplier<String> s = ()->{
            String pwd="";
          Supplier<Integer> d = ()->(int)(Math.random()*10);
          Supplier<Character> c = ()->{
              String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
              return symbol.charAt((int)(Math.random()*29));
          };
          for(int i=0;i<8;i++) {
              if(i%2==0){
                  pwd=pwd+d.get();
              } else {
                  pwd=pwd+c.get();
              }
          }

          return pwd;
        };
        System.out.println("Random Password Using Supplier : "+s.get());
    }
}
