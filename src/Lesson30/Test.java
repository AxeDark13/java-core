package Lesson30;

public class Test {
    public static void main(String[] args) {
        //float f = (float)123.2;
        //int a = 123;
        //long l = a; //неявное

        //int x = (int)l; //явное

        int a = 123;
        double x = a; //неявное
        int y = (int)x; //явное

        long l = Math.round(x); //округление

        byte b = (byte)128; // = -128
    }
}
