import java.util.Scanner;

public class Arrays {
    public static void printArray(int[] array, int limit) {
        StringBuffer out = new StringBuffer();
        int last = limit - 1;

        for ( int i = 0; i < last; i++ ) {
            out.append(array[i]);
            out.append(" ");
        }
        out.append(array[last]);

        System.out.println(out);
    }

    public static void fillArray(int[] array, int limit) {
        for ( int i = 0; i < limit; i++ ) {
            array[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        int y;

        // fillArray(array, size);
        printArray(array, size);
        // System.out.println(y);
    }
}