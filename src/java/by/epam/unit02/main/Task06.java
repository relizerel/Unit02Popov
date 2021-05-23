package by.epam.unit02.main;

public class Task06 {
    public static void main(String[] args) {
        int m = 25;
        int n = 5;
        Task06 tempObject = new Task06();
        tempObject.function(m, n);
    }

    private void function(int m, int n){
        System.out.println("Старшая цифра дробной части: " + ((m*10)/n)%10 + "\n" +
                "Младшая цифра целой части: " + (m/n)%10);
    }
}
