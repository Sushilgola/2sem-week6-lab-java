/**
 * Problem 2: Multiple Inheritance with Interfaces
 * You need to develop a module for a software design tool that supports
 * multiple
 * inheritances using interfaces. Implement a standalone Java program that
 * demonstrates this concept.
 */

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Calling Method A from interface A!");
    }

    @Override
    public void methodB() {
        System.out.println("Calling Method B from interface B!");
    }
}

public class P2_Interface {
    public static void main(String[] args) {
        C c = new C();

        c.methodA();
        c.methodB();
    }
}
