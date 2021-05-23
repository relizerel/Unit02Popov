package by.epam.unit02.main;

import static java.lang.Math.*;

public class Task04 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 2;
        int x2 = -2;
        int y2 = -2;
        Task04 tempObject = new Task04();
        System.out.println(tempObject.function(x1, y1, x2, y2));
    }

    private double function(int x1, int y1, int x2, int y2){
        return sqrt(pow(x2-x1, 2) + pow(y2 - y1, 2)) ;
    }
}
