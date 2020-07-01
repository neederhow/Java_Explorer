package cn.neederhow.basic.oop.two_interface_same_method;

public class DoubleFaceMan implements FaceA, FaceB {
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
    }
}
