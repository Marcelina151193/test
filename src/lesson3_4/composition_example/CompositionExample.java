package lesson3_4.composition_example;

public class CompositionExample {
    public static void main(String[] args) {
        // deklaracja i inicjalizacja klasy Engine
        Engine engine = new Engine(2000, EngineType.PETROL);
        Entertainment enetertainment = new Entertainment(EntertainmentTypes.B);
/* // deklaracja i incjalizacja klasy Car z podanym obiektem klasy Engine jako 2 argument
        Car car1 = new Car("Toyota", engine); */
Car car1 = new Car ("Toyota", engine, enetertainment);


//public void radioMute()   <- wywołanie metod z klas Engine i Entertainment
// engine.start();
// entertainment.radioOn();

        System.out.println(car1); // wyświetlamy informacje o samochodzie (toString())

        // wyświetlamy typ silnika zastosowanego w samochodzie,
        // wewnętrznie wykonuje się metoda na obiekcie klasy Engine
       // System.out.println("Car is: " + car1.getType());

       // Car car2 = new Car("Toyota", new Engine(3000, EngineType.DIESEL, ));
     //   System.out.println(car2);
      //  System.out.println("Car is: " + car2.getType());
    }//
}
