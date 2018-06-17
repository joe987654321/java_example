package recursion;

public class RecursionExample {

    public static void main(String[] args) {
        int number = 8;
        int x = findFibonacciNumberAt(number);
        System.out.println("No. "+ number + " fibonacci number is " + x);
    }

    public static int findFibonacciNumberAt (int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return findFibonacciNumberAt(x-1) + findFibonacciNumberAt(x-2);
        }
    }

}
