package array;

public class ArrayIntExample {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 8;
        array[1] = 7;
        array[2] = 3;
        array[3] = 1;
        array[4] = 4;

        findMaxNumber(array);
        findMinNumber(array);

        int [] array2 = {8,7,3,1,4};
        findMaxNumber(array2);
        findMinNumber(array2);

    }

    public static void findMinNumber(int[] array) {
        int min = 10000000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum number in array is " + min);
    }

    public static void findMaxNumber(int[] array) {
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximum number in array is " + max);
    }
}
