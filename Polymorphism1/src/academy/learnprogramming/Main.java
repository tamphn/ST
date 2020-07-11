package academy.learnprogramming;

class PCBuilder {
    private String parts;

    public PCBuilder(String parts) {
        this.parts = parts;
    }
    public String getParts() {
        return parts;
    }

    public String shoppingList() {
        return "Finish";
    }
}

class Motherboard extends PCBuilder {
    public Motherboard() {
        super("1");
    }

    @Override
    public String shoppingList() {
        return "Motherboard: Core i9";
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        PCBuilder mtb = new Motherboard();
        System.out.println(mtb.shoppingList());
    }
}
