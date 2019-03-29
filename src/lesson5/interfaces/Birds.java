package lesson5.interfaces;

public class Birds implements Animal, Flyable {
    public String getName(){
        return "Wrona";
    }
    public String speak(){
        return "Kra kra";
    }

    @Override
    public String fly() {
        return null;
    }
}
