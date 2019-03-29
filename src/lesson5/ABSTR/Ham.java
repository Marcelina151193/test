package lesson5.ABSTR;

public class Ham extends Meat {

    //Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
    // która zwróci string z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot,
    // Salad rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.


    public String getTaste() {
        return "Pyszny!" ;
    }
}
