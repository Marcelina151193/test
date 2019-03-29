package lesson5.ABSTR;

public abstract class Food {
    //Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
    // która zwróci string z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot, Salad rozszerzające klasę Food
    // oraz zaimplementuj w każdej z nich wymaganą metodę.


    //Utwórz dwie nowe klasy abstrakcyjne: Meat i Vegetable rozszerzające klasę Food.
    // Zmień klasy bazowe dla klas: Chicken, Ham, Carrot, Salad tak by dziedziczyły po jednej z klas: Meat lub Vegetable

    // Dodaj do klasy Food metodę abstrakcyjną getType(), która zwróci rodzaj jedzenia w postaci enuma (utwórz enum).
    // W klasach Meat i Vegetable zaimplementuj nową metodę.


    public Food() {
    }

    public abstract String getTaste();

}
