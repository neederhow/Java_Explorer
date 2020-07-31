package cn.neederhow.basic.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Int {
    private static AtomicInteger aInt = new AtomicInteger();
    public static void main(String[] args) {
        System.out.println(aInt.incrementAndGet());
    }
}
