package lesson5.interfaces;

public class Reptails implements Animal, Swimmable {
    public String getName(){
        return "Gad";
    }
    public String speak(){
        return "gaaad";

    }

    @Override
    public String swimm() {
        return null;
    }
}
