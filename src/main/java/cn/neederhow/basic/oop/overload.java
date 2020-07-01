package cn.neederhow.basic.oop;

public class overload {
    void method(){};

    void method(String s){}

    void method(int i){}

//    int method(int i){return 0;} // 提示方法method(int)已定义

    int method(String s,int i){return 0;}

    public static void main(String[] args) {

    }
}
