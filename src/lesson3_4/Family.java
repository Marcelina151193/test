package lesson3_4;

public class Family {

    //Tworzymy model danych dla drzewa genealogicznego

    //Przyjmujemy prosty model rodziny: 2 rodziców + 2 dzieci (syn i córka) + 2 dziadków (babcia i dziadek) z obu stron
    // (czyli w sumie 4 osoby dziadków)

    //Pojedyncza osoba powinna mieć dane: imię, nazwisko, wiek

    //Pojedyncza rodzina powinna zawierać: wszystkich członków rodziny (jako osobne pola dla każdej z osób:
    // mąż, żona, syn, córka itp)

    //Dodatkowo obiekt rodziny powinien mieć:
    //metodę, która zwróci opis całej rodziny jako String
    //metodę, która zwróci sumę lat wszystkich członków rodziny
    //metodę, która zwróci średnią arytmetyczną wieku członków rodziny

    //W osobnej klasie FamilyTest tworzymy 2-3 rodziny i wypisujemy informacje o nich na ekran

    private Person husband;  // typem danych dla członków rodziny jest obiekt Person
    private Person wife;
    private Person child;
    private String familyName;

    public Family(Person husband, Person wife, Person child, String familyName) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.familyName = familyName;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChild() {
        return child;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "husband='" + husband + '\'' +
                ", wife='" + wife + '\'' +
                ", child='" + child + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    public int sumOfYears (){

        int ageOfHusband = husband.getAge(); //tak pobieramy metody z nowo stworzonych obiektów (w tej klasie) na podstawie
        int ageOfWife = wife.getAge();//wzorca z innej klasy
        int ageOfChild = child.getAge();

        int sum = ageOfHusband + ageOfWife + ageOfChild;

        return sum;

    }
}
