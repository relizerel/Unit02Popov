package by.epam.unit02.main;

public class Task07 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 5;
        int thirdNumber = -2;
        Task07 tempObject = new Task07();
        tempObject.function(firstNumber);
        tempObject.function(secondNumber);
        tempObject.function(thirdNumber);
    }

    private void function(int someNumber) {
        if (someNumber == 0){
            System.out.println("Данное число рано 0");
        } else if (someNumber > 0) {
            System.out.println("Положительное число, возведенное в квадрат: " + squaredNumber(someNumber));
        } else {
            System.out.println("Отрицательное чило, возведенное в 4-ю степень: " + squaredNumber(squaredNumber(someNumber)));
        }
    }

    private double squaredNumber(double someNumber){
        return someNumber * someNumber;
    } // Игрался с мелкими оптимизациями, смотрел на разницу с методом из Math
}
