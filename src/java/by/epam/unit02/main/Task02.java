package by.epam.unit02.main;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;                                                 //  Стандартное решение
        Task02 tempObject = new Task02();                           //  int temp;
        List<Integer> result = tempObject.function(x, y);           //  if (x > y) {
        x = result.get(0);                                          //      temp = x;
        y = result.get(1);                                          //      x = y;
        System.out.println("x = " + x + ", y = " + y);              //      y = temp;
    }                                                               //  }
                                                                    //  else {
    private List<Integer> function(int x, int y) {                   //      temp = y;
        List<Integer> result = new ArrayList<>();                   //      y = x;
        if (x > y){                                                 //      x = temp;
            result.add(0, x);                                 //  }
            result.add(1, y);
        } else {
            result.add(0, y);
            result.add(1, x);
        }
        return result;
    }
}
