package lesson3_4.inheritance;

public class Animal {
private String name;
private int age;

    public Animal(String name, int age) {    // To jest PRZECIĄŻANIE KONSTRUKOTORA. Jeśli podczas tworzenia obiektu
        this.name = name;                     // nie podamy wieku, to z automatu będzie 13
        this.age = age;
    }

    public Animal(String name) {
        this (name, 13);
    }

    public Animal() {
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Animal is moving!"); // PRZECIĄŻANIE metody move. Jak podamy w nawiasie przy wywoływaniu jakieś
    }                                            // parametry, to uzyskamy inne sout, ale i tak coś się zadzieje (jak nie
                                                 // podamy to też :)
    public void move(int speed) {
        System.out.println("Animal is moving, speed: " + speed + "!");
    }

    public void move(String destination) {
        System.out.println("Animal is moving, destination: " + destination + "!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
