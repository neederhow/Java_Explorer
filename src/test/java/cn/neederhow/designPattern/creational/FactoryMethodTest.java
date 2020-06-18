package cn.neederhow.designPattern.creational;

import cn.neederhow.designPattern.creational.factoryMethod.factory.LogFactory;
import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;
import org.junit.Test;


public class FactoryMethodTest {

    @Test
    public void test(){
        Logger std = LogFactory.getStdoutLoggerFactory().getLogger(FactoryMethodTest.class);
        Logger file = LogFactory.getFileLoggerFactory().getLogger(FactoryMethodTest.class);
        std.log("Log to std");
        file.log("Log to file");
    }
}
