class ThreadPrint extends Thread {
    public void run() {
        System.out.println("Thread using thread class");
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd number: " + i);
        }
    }
}

class MultipleThread extends Thread {
    public void run() {
        for(int i=1; i<20;i++) {
            System.out.println("Multiple of 5 is:"+ i*5);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        EvenThread thread1 = new EvenThread();
        OddThread thread2 = new OddThread();
        MultipleThread thread3 = new MultipleThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
