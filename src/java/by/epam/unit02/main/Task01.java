package by.epam.unit02.main;

public class Task01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        Task01 tempObject = new Task01();
        System.out.println("z = " + tempObject.functionVar1(a, b, c));
        System.out.println("z = " + tempObject.functionVar2(a, b, c));
    }

    private int functionVar1(int a, int b, int c) {
        return (a - 3) * b / 2 + c;
    }

    private int functionVar2(int a, int b, int c) {
        // убрал деление
        return ((a - 3) * b) + (2 * c);
    }
}
