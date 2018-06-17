package condition;

public class IfExample {
    public static void main(String[] args) {
        testEven(0);
        testEven(1);
        testEven(2);
        testEven(100);
        testEven(101);
        testEven(-1);
    }

    public static void testEven(int input) {
        if (input <0) {
            System.out.println(input + " is negative");
        } else if (input % 2 == 0) {
            System.out.println(input + " is even");
        } else {
            System.out.println(input + " is odd");
        }
    }
}
