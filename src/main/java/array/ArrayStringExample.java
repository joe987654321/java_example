package array;

public class ArrayStringExample {
    public static void main(String[] args) {
        String s = "hello world";
        String s2 = toUpperCase(s);
        System.out.println(s2);
    }

    private static String toUpperCase(String s) {
        char [] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] <= 'z' && charArray[i] >= 'a') {
                charArray[i] = (char)(charArray[i] + ('A' - 'a'));
            }
        }
        String s2 = new String(charArray);
        return s2;
    }
}

