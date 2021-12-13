package jucSemaphore;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.Semaphore;

class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

// 资源个数有限
class BoundedResource implements Serializable {
    private final Semaphore semaphore;  // 避免资源竞争，能够使用的资源为N个，而需要这些资源的线程个数又不多于N个，也就避免了资源竞争
    private final int permits;
    private final static Random random = new Random(314159);

    // 构造函数(permits为资源个数)
    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    // 使用资源
    public void use() throws InterruptedException {
        semaphore.acquire();    // 线程从acquire返回时，一定存在可用资源
        try {
            doUse();
        } finally {
            semaphore.release();
        }
    }

    // 实际使用资源(此处仅使用Thread.sleep)
    protected void doUse() throws InterruptedException {
        Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END:   used = " + (permits - semaphore.availablePermits()));
    }

    private void readObject(ObjectInputStream in) {
        System.out.println("QQ");
    }
}

// 使用资源的线程
class UserThread1 extends Thread {
    private final static Random random = new Random(26535);
    private final BoundedResource resource;

    public UserThread1(BoundedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 设置3个资源
        BoundedResource resource = new BoundedResource(3);

        // 10个线程使用资源
        for (int i = 0; i < 10; i++) {
            new UserThread1(resource).start();
        }
    }
}
