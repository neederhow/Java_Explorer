package cn.neederhow.basic.timeHandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SimpleDateFormatThreadSafe {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {
        SimpleDateFormatThreadSafe sdfts = new SimpleDateFormatThreadSafe();
        sdfts.exec("不安全方法",() -> {
            try {
                return sdf.parse("2019-12-13 15:17:27");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        });

        sdfts.exec("synchronized方法",() -> {
            try {
                synchronized (sdf){
                    return sdf.parse("2019-12-13 15:17:27");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        });

        sdfts.exec("每次新建对象方法",() -> {
            try {
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return sdf1.parse("2019-12-13 15:17:27");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        });

        sdfts.exec("threadLocal方法",() -> {
            SimpleDateFormat sdf = threadLocal.get();
            if (sdf == null) {
                sdf = new SimpleDateFormat("yyyy-MM-hh");
                threadLocal.set(sdf);
            }
            try {
                return sdf.parse("2019-12-13 15:17:27");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    public void exec(String name,Callable task) {

        ExecutorService executorService = Executors.newFixedThreadPool(50);
        List<Future<Date>> resultList = new ArrayList<Future<Date>>();
        Instant befor = Instant.now();

        IntStream.range(0, 10000).forEach(
                i -> {
                    Future<Date> future = executorService.submit(task);
                    resultList.add(future);
                }
        );

        resultList.stream().forEach(
                i -> {
                    try {
                        while (!i.isDone())
                        i.get().getTime();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } finally {
                        executorService.shutdown();
                    }
                }
        );
        System.out.println("[ " + name + " ] 用时: " + Duration.between(befor, Instant.now()).toMillis() + " ms");
    }
}