package cn.neederhow.basic.oop;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class Show_bean_info {
    public static void main(String[] args) {
        try {
            BeanInfo info = Introspector.getBeanInfo(SampleBean.class);
            info.getBeanDescriptor();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
