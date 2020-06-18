package cn.neederhow.designPattern.creational.factoryMethod.factory.impl;

import cn.neederhow.designPattern.creational.factoryMethod.factory.LogFactory;
import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;
import cn.neederhow.designPattern.creational.factoryMethod.product.impl.StdoutLogger;

public class StdoutLoggerFactory implements LogFactory {

    @Override
    public Logger getLogger(Class clazz) {
        return new StdoutLogger(clazz.getSimpleName());
    }
}
