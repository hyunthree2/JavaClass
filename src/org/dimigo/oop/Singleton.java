package org.dimigo.oop;

public class Singleton {

    private static Singleton instance = new Singleton();

    // 외부에서 new로 객체 생성 못 하도록 생성자를 private으로 막음
    private Singleton() {

    }

//    static {
//        instance = new Singleton();
//    }

    public static Singleton getInstance() {
        return instance;
    }

    // Lazy initialization
    public static synchronized Singleton getInstance2() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
