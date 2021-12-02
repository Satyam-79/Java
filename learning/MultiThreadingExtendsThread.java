class First extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("First thread yielded");
                Thread.yield();
            }
            System.out.println("First  i : " + i);
        }
    }

}

class Second extends Thread {

    public void run() {
        for (int j = 1; j <= 10; j++) {
            if (j == 2) {
                try {
                    System.out.println("Second thread goes into sleep");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Second j : " + j);
        }
    }
}

class Third extends Thread {
    public void run() {
        for (int k = 1; k <= 10; k++) {
            if (k == 6) {
                stop();
            }
            System.out.println("Third  k : " + k);
        }
    }
}

public class MultiThreadingExtendsThread {
    public static void main(String[] args) {
        System.out.println("Start of main thread");
        First t1 = new First();
        Second t2 = new Second();
        Third t3 = new Third();
        System.out.print("Last line main");
        t1.start();
        t2.start();
        t3.start();
    }
}
