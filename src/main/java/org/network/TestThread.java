package org.network;

public class TestThread {
    public static void main(String[] args){
        // 멀티스레드 테스트용
        /*A a = new A();
        B b = new B();

        ThreadA t1 = a;
        ThreadB t2 = b;*/

        /*ThreadA t1 = new A();
        ThreadB t2 = new B();*/

        // Runnable 인터페이스 상속 시
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
