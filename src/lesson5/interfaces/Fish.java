package lesson5.interfaces;

public class Fish implements Animal, Swimmable {

    public String getName(){
        return "Dorsz";
    }
    public String speak(){
        return "Plum";
    }

    public String swimm(){
        return "Pływam";
    }
}
