class First implements Runnable {
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

class Second implements Runnable {

    public void run() {
        for (int j = 1; j <= 10; j++) {
            if (j == 2) {
                try {
                    System.out.println("Second thread goes into sleep");
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Second j : " + j);
        }
    }
}

class Third implements Runnable {
    public void run() {
        for (int k = 1; k <= 10; k++) {
            if (k == 6) {
                // stop();
            }
            System.out.println("Third  k : " + k);
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        System.out.println("Start of main thread");
        First t1 = new First();
        Second t2 = new Second();
        Third t3 = new Third();
        System.out.print("Last line main");
        Thread o1 = new Thread(t1);
        Thread o2 = new Thread(t2);
        Thread o3 = new Thread(t3);
        o1.start();
        o2.start();
        o3.start();
        // t1.run();
        // t2.run();
        // t3.run();
    }
}
