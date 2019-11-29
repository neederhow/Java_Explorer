package cn.neederhow.basic.thread;

public class Daemon {

    public static void main(String[] args) {
        Thread_deamon t = new Thread_deamon();
        // 如果注释下一行，观察Thread1的执行情况:
        t.setDaemon(true);
        t.start();
        System.out.println("main: wait 3 sec...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("main: end.");
    }

}

class Thread_deamon extends Thread {
    public void run() {
        System.out.println("Deamon thread start!");
        while (true){
            try {
                System.out.println("Deamon thread running....");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
