package cn.neederhow.designPattern.creational.factoryMethod.product.impl;

import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;

import java.time.LocalDateTime;

public class StdoutLogger implements Logger {
    private String className;

    public StdoutLogger(String className) {
        this.className = className;
    }

    @Override
    public void log(String info) {
        System.out.printf(LocalDateTime.now().toString() + " " + className + ": " + info);
    }
}
