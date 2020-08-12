package cn.neederhow.basic.oop.two_interface_same_method;

import java.lang.reflect.Field;

public class DoubleFaceMan implements FaceA, FaceB {
    String age;
    Integer a;
    int b;
    @Override
    public void creapySmile() {
        System.out.println("xixixixixi");
    }

    public static void main(String[] args) {
        FaceA a = new DoubleFaceMan();
        FaceB b = new DoubleFaceMan();
        a.creapySmile();
        b.creapySmile();

        DoubleFaceMan man = new DoubleFaceMan();

        FaceA man_a = man;
        man_a.creapySmile();
        FaceB man_b = man;
        man_b.creapySmile();

        Field[] fs = DoubleFaceMan.class.getDeclaredFields();
        for (Field f : fs) {
            System.out.println(f.getName() + " " + f.getType());
        }

    }
}
