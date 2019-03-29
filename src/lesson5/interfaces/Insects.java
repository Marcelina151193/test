package lesson5.interfaces;

public class Insects implements Animal, Flyable {
    public String getName(){
        return "Mucha";
    }
    public String speak(){
        return "Bzzz";
    }

    @Override
    public String fly() {
        return null;
    }
}
