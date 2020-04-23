package AnnonymousLamda;

public class ThreadDemo {
    public static void main(String ar[]) {
        //Annonymous class replaced by Lamda
       /* Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("Child Thread");
                }
            }
        };
        Thread t = new Thread(r);*/

        Thread  t = new Thread(()->{
            for(int i=0;i<3;i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();
        for(int i=0;i<3;i++) {
            System.out.println("Main Thread");
        }
    }
}
