package cn.neederhow.basic.oop;

import java.time.Duration;
import java.time.Instant;
import java.util.StringJoiner;

public class StringConcatTest {

    public static void main(String[] args) {
        Instant start = Instant.now();
        testAddint();
        Instant moment1 = Instant.now();
        testAdd();
        Instant moment2 = Instant.now();
        testBuilderAppend();
        Instant moment3 = Instant.now();
        testBufferAppend();
        Instant moment4 = Instant.now();
        testJoin();
        Instant end = Instant.now();
        System.out.println("Time cost for String add int:" + Duration.between(start,moment1).toString());
        System.out.println("Time cost for add: " + Duration.between(moment1,moment2).toString());
        System.out.println("Time cost for StringBuilder append: " + Duration.between(moment2,moment3).toString());
        System.out.println("Time cost for StringBuffer append: " + Duration.between(moment3,moment4).toString());
        System.out.println("Time cost for join: " + Duration.between(moment4,end).toString());
    }

    /**
     * 测试使用+连接字符串
     */
    private static void testAddint() {
        String a = "1";
        for (int i = 1; i < 1000000; i++) {
            a = a + 1;
        }
    }

    /**
     * 测试使用+连接字符串
     */
    private static void testAdd() {
        String a = "1";
        for (int i = 1; i < 1000000; i++) {
            a = a + "1";
        }
    }

    /**
     * 测试使用StringBuilder
     */
    private static void testBuilderAppend() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("1");
        }
        String s = stringBuilder.toString();
    }

    /**
     * 测试Stringbuffer
     */
    private static void testBufferAppend(){
        StringBuffer stringBuffer= new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("1");
        }
        String s = stringBuffer.toString();
    }

    /**
     * 测试StringJoiner
     */
    private static void testJoin(){
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 1; i < 1000000; i++) {
            stringJoiner.add("1");
        }
        String s = stringJoiner.toString();
    }

}