package cn.neederhow.basic.basicType;

import org.junit.Assert;
import org.junit.Test;

public class EnumTest {
    @Test
    public void Test(){
        Assert.assertNotNull(Aenum.getElement("云计算"));
        Assert.assertNotNull(Aenum.getElement(5));
        Assert.assertNull(Aenum.getElement("云算"));
        Assert.assertNull(Aenum.getElement(9));
    }
}
