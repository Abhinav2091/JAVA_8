package service;

public interface LeftInterface {
    default void m1() {
        System.out.println("Left default method");
    }
}
