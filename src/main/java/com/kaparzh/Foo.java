package com.kaparzh;

public class Foo {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.first(this);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.second(this);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.third(this);
            }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }

    public void first(Runnable r) {
        System.out.print("first");
    }

    public void second(Runnable r) {
        System.out.print("second");
    }

    public void third(Runnable r) {
        System.out.print("third");
    }
}

