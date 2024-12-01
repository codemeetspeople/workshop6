public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double value) {
        this.x = value;
    }

    public void setY(double value) {
        this.y = value;
    }

    public double distance(Point other) {
        return Math.hypot(this.x-other.x, this.y-other.y);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("(");
        out.append(this.x);
        out.append(", ");
        out.append(this.y);
        out.append(")");

        return out.toString();
    }

    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public static void main(String[] args) {
        Point a = new Point(10, 5);
        Point b = new Point(3, 7);

        Point c = a.add(b);

        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
    } 
}
