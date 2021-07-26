package Lesson47;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -4253824958882683735L;

    private int id;
    private String personName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() { return this.id; }
    public String getName () {return this.personName;}

    public String toString() {return id + ": " + personName; }
}
