package cn.neederhow.designPattern.creational.factoryMethod.factory;

import cn.neederhow.designPattern.creational.factoryMethod.product.Logger;

public interface LogFactory {
    Logger getLogger();
}
