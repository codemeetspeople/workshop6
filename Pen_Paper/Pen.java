public class Pen {
    protected int amount;
    protected int capacity;

    public Pen(int capacity) {
        this.amount = capacity;
        this.capacity = capacity;
    }

    public Pen() {
        this(4096);
    }

    public int getAmount() {
        return this.amount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void write(Paper paper, String message) throws WritingUtencilException {
        if ( this.amount == 0 ) {
            throw new OutOfInkException();
        }
        if ( message.length() > this.amount ) {
            paper.addContent(message.substring(0, this.amount));
            this.amount = 0;
            throw new OutOfInkException();
        }
        paper.addContent(message);
        this.amount -= message.length();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Pen(");

        out.append(this.amount);
        out.append(", ");
        out.append(this.capacity);
        out.append(")");

        return out.toString();
    }
}
