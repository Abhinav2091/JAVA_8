package methodReference;

public class ThreadDemo {
    public void thread() {
        for(int i=0;i<3;i++) {
            System.out.println("Child Thread");
        }
    }
    public static void main(String [] ar) {
        ThreadDemo threadDemo = new ThreadDemo();
        Runnable r = threadDemo::thread;
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<3;i++)
            System.out.println("Main Thread");
    }
}
