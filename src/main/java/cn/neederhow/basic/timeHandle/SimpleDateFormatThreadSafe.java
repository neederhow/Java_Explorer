package cn.neederhow.basic.timeHandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatThreadSafe {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; ++i) {
            Thread thread = new Thread(() -> {
                try {//(3)使用单例日期实例解析文本
                    System.out.println(sdf.parse("2019-12-13 15:17:27"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
            thread.start();//(4)启动线程
        }
    }
}