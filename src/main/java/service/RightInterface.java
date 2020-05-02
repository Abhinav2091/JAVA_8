package service;

public interface RightInterface {
    default void m1() {
        System.out.println("Right default method");
    }
}
