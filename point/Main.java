public class Main {
    public static void main(String[] args) {
        Point a = new Point(10, 5);
        Point b = new Point(3, 7);

        Point c = a.add(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(b.distance(a));

        if ( a == b ) {
            System.out.println("Points are equals");
        } else {
            System.out.println("Points are not equals");
        }
    }
}