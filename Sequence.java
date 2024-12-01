import java.util.Scanner;

public class Sequence {
    public static void loop1(int limit) {
        for ( int i = 0; i < limit; i++ ) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(limit);
    }

    public static void loop2(int limit) {
        String out = "";

        for ( int i = 0; i < limit; i++ ) {
            out += String.valueOf(i);
            out += " ";
        }
        out += String.valueOf(limit);

        System.out.println(out);
    }

    public static void loop3(int limit) {
        StringBuffer out = new StringBuffer();

        for ( int i = 0; i < limit; i++ ) {
            out.append(i);
            out.append(" ");
        }
        out.append(limit);

        System.out.println(out);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();

        loop3(limit);

        in.close();
    }
}