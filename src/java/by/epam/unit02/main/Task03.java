package by.epam.unit02.main;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        int t = 9000;
        Task03 tempObject = new Task03();
        System.out.println(
                tempObject.function(t).get(0) + " ч, " +
                tempObject.function(t).get(1) + " мин, " +
                tempObject.function(t).get(2) + " сек"
        );
    }

    private List<Integer> function(int t) {
        int hour = t / 3600;
        t = t - (hour * 3600);
        int minute = t / 60;
        t = t - (minute * 60);
        int second = t;
        return new ArrayList<>(List.of(hour, minute, second));// возврат разномастных значений в одной коллекции - опасен, очень легко ошибиться с параметрами. В этом случае может помочь DTO
    }
}
