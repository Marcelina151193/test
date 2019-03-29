package lesson3_4.inheritance.inheritance_tasks;

public class Saw extends Tool {

    private int length;

    public Saw(String model, int price, int length) {
        super(model, price);
        this.length = length;
    }

    public Saw(int length) {
        this.length = length;
    }
}
