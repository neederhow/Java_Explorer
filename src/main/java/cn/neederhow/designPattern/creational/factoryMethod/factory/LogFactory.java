package cn.neederhow.designPattern.creational.factoryMethod.factory;

import cn.neederhow.designPattern.creational.factoryMethod.factory.impl.FileLoggerFactory;
import cn.neederhow.designPattern.creational.factoryMethod.factory.impl.StdoutLoggerFactory;
import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;

public interface LogFactory {
    Logger getLogger(Class clazz);

    LogFactory fileLoggerFactory = new FileLoggerFactory();
    LogFactory stdoutLoggerFactory = new StdoutLoggerFactory();

    static LogFactory getFileLoggerFactory(){
        return fileLoggerFactory;
    }

    static LogFactory getStdoutLoggerFactory(){
        return stdoutLoggerFactory;
    }
}
