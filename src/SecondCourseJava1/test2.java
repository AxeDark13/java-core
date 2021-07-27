package SecondCourseJava1;

public class test2 {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                stringBuilder
                        .append("long hello world long hello world long hello world long hello world long hello world long hello world long hello world long hello world")
                        .append(Thread.currentThread().getName())
                        .append("\n");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
    }
}
