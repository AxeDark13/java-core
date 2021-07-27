package SecondCourseJava4;

public class Millis {
    public static void main(String[] args) {
        long time = System.currentTimeMillis(); //wall-clock time
        System.out.println("Число в миллисекундах, прошедших с 00:00:00 UTC 1 января 1970 года: " + time);

        long nanoTime = System.nanoTime();
        System.out.println("Число в наносекундах, прошедших с какого-то момента X: " + nanoTime);

        System.out.println("Измерение времени работы кода: " + measureTime(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public static long measureTime(Runnable codeToMeasure) {
        Long startTime = System.nanoTime();
        codeToMeasure.run();
        return System.nanoTime() - startTime;
    }
}
