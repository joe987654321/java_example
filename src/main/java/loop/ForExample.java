package loop;

public class ForExample {
    public static void main(String[] args) {
        printNumberSmallerThanInput(1);
        printNumberSmallerThanInput(3);
        printNumberSmallerThanInput(10);
        printNumberSmallerThanInput(-3);
    }

    public static void printNumberSmallerThanInput(int input) {
        System.out.println("input is " + input);
        for (int i = 0; i < input; i++) {
            System.out.println(i + "");
        }
        System.out.println("================");
    }
}
