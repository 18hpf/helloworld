package com.classbook.chapter.twelve;

public class Demo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1--");
        RunnableImp runnableImp = new RunnableImp();
        Thread thread2 = new Thread(runnableImp,"Thread2--");
        Thread thread3 = new Thread("Thread3--"){
            @Override
            //线程的主方法
            public void run() {
                System.out.println(getName() );
            }
        };
        //设置优先级
        thread1.setPriority(10);
        //启动线程
        thread3.start();
        thread1.start();
        thread2.start();
        try {
            //让线程睡眠
            thread1.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
