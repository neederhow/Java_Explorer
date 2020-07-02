package cn.neederhow.basic.basicType;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}
