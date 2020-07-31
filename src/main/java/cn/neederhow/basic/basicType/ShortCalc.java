package cn.neederhow.basic.basicType;

public class ShortCalc {
    public static void main(String[] args) {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }
}
