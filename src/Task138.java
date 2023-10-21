public class Task138 {
    public static boolean isPowerOfTwo2(int a) {

        return (a > 0) && (Integer.bitCount(a) == 1);
    }
}

