import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x;

        x = cin.nextInt();

        if ( x % 2 == 0 ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        cin.close();
    }
}