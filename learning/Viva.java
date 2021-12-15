class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Thread1 thread yielded");
                Thread.yield();
            }
            System.out.println("Thread1 i : " + i);
        }
    }

}

class Thread2 implements Runnable {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 2) {
                try {
                    System.out.println("Thread2 thread goes into sleep");
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Thread2 j : " + j);
        }
    }
}

public class Viva {
    public static void main(String[] args) {
        System.out.println("Start of main thread");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.print("Last line main\n");
        Thread o1 = new Thread(t1);
        Thread o2 = new Thread(t2);
        o1.start();
        o2.start();
    }
}
