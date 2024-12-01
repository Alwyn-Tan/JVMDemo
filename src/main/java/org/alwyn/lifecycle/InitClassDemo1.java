package org.alwyn.lifecycle;

public class InitClassDemo1 {
    public static void main(String[] args) {
        System.out.println("A");
        new InitClassDemo1();
        new InitClassDemo1();
    }

    public InitClassDemo1(){
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }
}
