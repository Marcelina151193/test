package lesson3_4.inheritance;

public class Lion extends Animal {

    private int dailyMeetDemand;

    public Lion(String name, int dailyMeetDemand) {
        super(name);
        this.dailyMeetDemand = dailyMeetDemand;
    }

    public int getDailyMeetDemand() {
        return dailyMeetDemand;
    }

    public String getName() {                    //przywołanie metody z bazowego obiektu
        return "Lion: " + super.getName();
    }

    //@Override - opcjonalny element, adnotacja, która wskazuje, że nadpisujemy metodę
    public void move() {   //przywołanie i nadpisanie
        super.move(); // odnosimy się do metody `move` w klasie nadrzędnej
        System.out.println("Lion is moving! Wrr!");
    }


    @Override
    public String toString() {
        return "Lion{name=" + getName() + ", " +        //getName możemy w środku toString dopisać sami, żeby fajniej się wyświetlało
                "dailyMeetDemand=" + dailyMeetDemand +
                '}';
    }
}
