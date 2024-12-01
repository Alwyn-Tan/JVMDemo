package org.alwyn.lifecycle;

public class InitClassDemo2 {
    public static void main(String[] args) {
        System.out.println(B.a);
    }
}

class A{
    static int a = 0;
    static {
        a = 1;
    }
}

class B extends A{
    static {
        a = 2;
    }
}
