package by.epam.unit02.main;

import static java.lang.Math.*;

public class Task05 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Task05 tempObject = new Task05();
        System.out.println(tempObject.function(x, y));
    }

    private double function(int x, int y){
        double temp1 = sin(x) + cos(y);
        double temp2 = cos(x) - sin(y);
        double temp3 = tan(x*y);
        return temp1 * temp2 / temp3;
    }
}
