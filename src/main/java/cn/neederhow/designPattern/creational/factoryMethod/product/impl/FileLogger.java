package cn.neederhow.designPattern.creational.factoryMethod.product.impl;

import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private String className;

    public FileLogger(String className) {
        this.className = className;
    }

    @Override
    public void log(String info) {
        LocalDate now = LocalDate.now();
        info = LocalDateTime.now().toString() + " " + className + ": " + info + "\n";
        try {
            Files.write(
                    Paths.get("log-" + now.getYear() + now.getMonthValue()),
                    info.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
