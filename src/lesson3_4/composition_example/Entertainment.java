package lesson3_4.composition_example;

public class Entertainment {

    //Rozwiń przykład kompozycji w oparciu o klasę Car - dodaj klasę Entertainment,
    // która zarządzać będzie systemem rozrywki w Twoim samochodzie, a następnie zadbaj o to,
    // by tworząc obiekt typu Car konieczne było podanie obiektu typu Entertainment.
    // Klasa Car powinna wykorzystywać metody dostępne w klasie Entertainment.

    private EntertainmentTypes enetertainmentType;

    public Entertainment(EntertainmentTypes enetertainmentType) {
        this.enetertainmentType = enetertainmentType;
    }

    public EntertainmentTypes getEnetertainmentType() {
        return enetertainmentType;
    }

    @Override
    public String toString() {  // musimy dać toString, żeby potem, jak będziemy chcieli zrobić sout z cara , to argument
        return "Entertainment{" +   //entertainment będzie się tak wyświetlał
                "enetertainmentType=" + enetertainmentType +
                '}';
    }
}
