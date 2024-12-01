public class Paper {
    private StringBuilder content;
    private int maxSymbols;

    public Paper(int maxSymbols) {
        this.maxSymbols = maxSymbols;
        this.content = new StringBuilder();
    }

    public Paper() {
        this(1024);
    }

    public int getMaxSymbols() {
        return this.maxSymbols;
    }

    public int getSymbols() {
        return this.content.length();
    }

    public void show() {
        System.out.println(this.content);
    }

    public void addContent(String message) throws WritingUtencilException {
        if ( this.content.length() == this.maxSymbols ) {
            throw new OutOfSpaceException();
        }
        int availableSymbols = this.maxSymbols - this.content.length();
        
        if ( message.length() > availableSymbols ) {
            this.content.append(message.substring(0, availableSymbols));
            throw new OutOfSpaceException();
        }

        this.content.append(message);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("Paper(");
        out.append(this.content.length());
        out.append("/");
        out.append(this.maxSymbols);
        out.append(")");

        return out.toString();
    }
}
