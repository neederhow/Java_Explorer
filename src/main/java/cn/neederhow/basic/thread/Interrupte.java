package cn.neederhow.basic.thread;

public class Interrupte {

    public static void main(String[] args){
        try {
//            runThread(new Thread_interrupt(),1);
//            runThread(new Thread_InterruptedException(),1000);
            new Thread_running().start();
            new Thread_running().start();
        }catch (Exception e){
            System.out.println("pooooooooooooooooooooooo");
        }
    }

    private static void runThread(Thread t,int millis) throws InterruptedException {
        t.start();
        Thread.sleep(millis); // 暂停1毫秒
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

/**
 * interrupt()方法
 */
class Thread_interrupt extends Thread {
    public void run() {
        int n = 0;
        // interrupt()方法仅仅向t线程发出了“中断请求”，至于t线程是否能立刻响应，要看具体代码。
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}

/**
 * InterruptedException
 * 如果线程处于等待状态，
 * hello.start()会让thread2线程进入等待状态，此时，如果对thread2线程调用interrupt()，
 * join()方法会立刻抛出InterruptedException，
 * 因此，目标线程只要捕获到join()方法抛出的InterruptedException，
 * 就说明有其他线程对其调用了interrupt()方法，通常情况下该线程应该立刻结束运行。
 */
class Thread_InterruptedException extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start(); // 启动hello线程
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        // 去掉这一行代码，hello线程仍然会继续运行，且JVM不会退出
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

/**
 * 标志位
 */
class Thread_running extends Thread{
    private static HelloThread2 t = new HelloThread2();
    public void run(){
        System.out.println(this.hashCode()+"start");
        try {
            t.start();
            Thread.sleep(1);
            t.running = false;
        } catch (Exception e){
            System.out.println(this.hashCode());
        }
    }
}
class HelloThread2 extends Thread {
    public volatile boolean running = true;
    public void run() {
        while (running) {
            System.out.println(this.hashCode() + " hello!");
        }
        System.out.println(this.hashCode() + " end");
    }
}


