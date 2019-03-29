package lesson3_4.inheritance.inheritance_tasks;

public class Hammer extends Tool {

    private int weight;

    public Hammer(String model, int price, int weight) {
        super(model, price);
        this.weight = weight;
    }

    public Hammer(int weight) {
        this.weight = weight;
    }

    public String getDetails(){
          return "Model to: " + super.getModel() + " Cena to:" + super.getPrice() + " Waga to: " +weight;
    }

    @Override
    public String toString() {
        return "Hammer{" + "model " + super.getModel() + "cena: " +super.getPrice()+
                " weight=" + weight +
                '}';
    }
}

