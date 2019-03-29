package lesson3_4;

public class Person {

    //do polecenia w klasie Family

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {  // konstruktor działa na zasadzie podobnej do settera (wymiennie)
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {   // gettery są po to, żeby dostać się do pól będąc w innej klasie
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {     //  po wywołaniu toString, zwrócone zostaną wartości wszystkich pól na konsolę (możemy
        return "Person{" +              // zrobić sout z nazwą obiektu w nawiasie
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
