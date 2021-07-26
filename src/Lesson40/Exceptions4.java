package Lesson40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {

        try {
            run();
        } catch (IOException | ParseException e) { //multicatch
            e.printStackTrace();
        } catch (Exception e) { // all of exceptions

        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException { //Several exceptions

    }
}
