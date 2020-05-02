package service;

public interface DefaultInterface {
    default void m1() {
        System.out.println("Default Implementation");
    }
}
