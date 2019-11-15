package cn.neederhow.basic.basicType;

public class IntegerCache {
    public static void main(String[] args) {
        Integer a = new Integer(127);
        Integer b = 127;
        System.out.println("a = new Integer(127)");
        System.out.println("b = 127");
        System.out.println("a == b > " + (a == b));
        System.out.println("a equals b > " + a.equals(b));
        Integer c = 127;
        System.out.println("b = 127");
        System.out.println("c = 127");
        System.out.println("b == c > " + (b == c));
        System.out.println("b equals c > " + b.equals(c));
        Integer d = 128;
        Integer e = 128;
        System.out.println("d = 128");
        System.out.println("e = 128");
        System.out.println("d == e > " + (d == e));
        System.out.println("d equals e > " + d.equals(e));
    }
}
