
class Worker {

    private static long count = 0;

    public synchronized void increment() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
    }

    public void run() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (long i = 0; i < 10; i++) {
                    increment();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (long i = 0; i < 10; i++) {
                    increment();
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Worker().run();
        System.out.println("Done in: " + (System.currentTimeMillis() - start));
    }
}
