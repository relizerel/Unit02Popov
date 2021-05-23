package by.epam.unit02.main;

public class Task08 {
    public static void main(String[] args) {
        double x = -0;
        double y = -2;
        Task08 tempObject = new Task08();
        System.out.println(tempObject.function(x, y));
    }

    private boolean function(double x, double y) {
        if (((x >= -0.5) & (x <= 0.5)) & ((y >= -2.5) & (y <= -1.5))) {
            return false;
        } else return (x >= -4) && (x <= 4) && (y >= -3) && (y <= 4);
    }
}
