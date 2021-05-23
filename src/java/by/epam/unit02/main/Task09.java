package by.epam.unit02.main;

public class Task09 {
    public static void main(String[] args) {
        int x = -3;
        Task09 tempObject = new Task09();
        tempObject.function(x);
    }

    private void function(int x){
        if (x <= -3){
            System.out.println(9);
        } else if (x > 3) {
            System.out.println(formula(x));
        }
    }

    private double formula(double x){
        return 1 / (x * x + 1);
    }
}
