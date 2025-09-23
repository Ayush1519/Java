class ThreadPrint extends Thread {
    public void run() {
        System.out.println("Thread using thread class");//giving the output
    }
}

class EvenThread extends Thread {//making a class named as even thread
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}

class OddThread extends Thread {//making a class named as odd thread to store odd values 
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd number: " + i);
        }
    }
}

class MultipleThread extends Thread {//making a class named multiple thread to print multiple of 5 from 1 to 20
    public void run() {
        for(int i=1; i<20;i++) {
            System.out.println("Multiple of 5 is:"+ i*5);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        EvenThread thread1 = new EvenThread();//creating object
        OddThread thread2 = new OddThread();
        MultipleThread thread3 = new MultipleThread();

        thread1.start();//calling EvenThread 
        thread2.start();//calling OddThread
        thread3.start();//calling MultipleThread
    }
}
