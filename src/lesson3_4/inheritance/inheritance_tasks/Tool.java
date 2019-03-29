package lesson3_4.inheritance.inheritance_tasks;

public class Tool {
    //Utwórz klasę Tool, która będzie reprezentować narzędzia do kupienia w sklepie.
    // Każde narzędzie powinno mieć swój model i cenę.
    // Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
    // Klasa Hammer powinna mieć dodatkowe pole z wagą młotka, a klas Saw z długością piły.
    // Utwórz klasę ToolsShop w której utworzysz kilka narzędzi i wyświetlisz ich ceny.

    //Dodaj do klasy Tool metodę która zwraca opis narzędzia (model + cena).
    // Dodatkowo klasy Hammer i Saw powinny rozszerzać opis o swoje unikatowe cechy.

    private String model;
    private int price;

    public Tool() {
    }

    public Tool(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
