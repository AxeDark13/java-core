package SecondCourseJava12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker(123, "Васльев Евстахий Борисович", "+129381832", 5));
        workerList.add(new Worker(151, "Коновалов Степан Петрович", "+234432334", 7));
        workerList.add(new Worker(332, "Калинин Артём Валериевич", "+2234234423", 2));
        workerList.add(new Worker(432, "Предыбайло Григорий Анатаольевич", "+2342344234", 5));
        workerList.add(new Worker(556, "Степанов Кирослав Андрееевич", "+6678877777", 3));
        workerList.add(new Worker(556, "Пупкин Василий Степанович", "+6678877777", 2));

        Collections.sort(workerList, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int result = o1.qualification - o2.qualification;
                if(result == 0) {
                    return o1.name.compareTo(o2.name);
                }
                return result;
            }
        });

        for(Worker worker: workerList) {
            System.out.println(worker);
        }
    }

    public static class Worker {
        int id;
        String name;
        String phone;
        int qualification;

        public Worker(int id, String name, String phone, int qualification) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.qualification = qualification;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", qualification=" + qualification +
                    '}';
        }
    }
}
