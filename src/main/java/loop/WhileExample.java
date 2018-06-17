package loop;

public class WhileExample {
    public static void main(String[] args) {
        printNumberSmallerThanInput(1);
        printNumberSmallerThanInput(3);
        printNumberSmallerThanInput(10);
        printNumberSmallerThanInput(-3);
    }

    public static void printNumberSmallerThanInput(int input) {
        System.out.println("input is " + input);
        input = input -1;
        while (input >= 0) {
            System.out.println(input);
            input--;
        }
        System.out.println("================");
    }


}
