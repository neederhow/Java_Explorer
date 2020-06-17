package cn.neederhow.designPattern.creational.factoryMethod.product.impl;

import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private String className;
    private FileOutputStream fos;

    public FileLogger(String className) {
        this.className = className;
        LocalDate now = LocalDate.now();
        try {
            fos = new FileOutputStream("log-" + now.getYear() + now.getMonth());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String info) {
    }
}
