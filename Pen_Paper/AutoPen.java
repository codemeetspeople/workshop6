public class AutoPen extends Pen {
    protected boolean isOpen;

    public AutoPen(int capacity) {
        super(capacity);
        this.isOpen = false;
    }

    public AutoPen() {
        super(4096);
        this.isOpen = false;
    }

    public boolean open() {
        return this.isOpen;
    }

    public void click() {
        this.isOpen = !this.isOpen;
    }

    @Override
    public void write(Paper paper, String message) throws WritingUtencilException {
        if ( !this.isOpen ) {
            throw new ClosedPenException();
        }
        super.write(paper, message);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("AutoPen(");

        out.append(this.amount);
        out.append(", ");
        out.append(this.capacity);
        out.append(", isOpen: ");
        out.append(this.isOpen);
        out.append(")");

        return out.toString();
    }

    public static void main(String[] args) throws WritingUtencilException {
        AutoPen pen = new AutoPen();
        Paper paper = new Paper();

        System.out.println(pen);
        System.out.println(paper);

        try {
            pen.write(paper, "Hello, world!");
        } catch ( ClosedPenException obj ) {
            System.out.println("Pen is closed!");
        }

        pen.click();
        pen.write(paper, "Hello, world!");
        paper.show();

        System.out.println(pen);
        System.out.println(paper);
    }
}
