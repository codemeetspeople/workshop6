public class Tiger implements Cat {
    public void eat() {
        System.out.println("Tiger eats meat...");
    }
    
    public void meow() {
        System.out.println("Tiger say meow...");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        
        tiger.eat();
        tiger.meow();
    }
}
