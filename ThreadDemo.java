class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }
    public void run() {
        String name = getName();
        for (int i = 0; i < 5; i++) {
            Wait();
            System.out.println(name + ": " + i);
        }
    }
    void Wait() {
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}
