public abstract class WritingUtencil {
    protected int amount;
    protected int capacity;

    public WritingUtencil(int capacity) {
        this.amount = capacity;
        this.capacity = capacity;
    }

    public WritingUtencil() {
        this(4096);
    }

    public int getAmount() {
        return this.amount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public abstract void write(Paper paper, String message) throws WritingUtencilException;
}
