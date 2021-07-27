package SecondCourseJava1;

public class test1 {
    private static int counter;
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized(this) {
                    counter = 0;
                    for(int i = 0; i < 5; i++) {
                        counter = counter + 1;
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
