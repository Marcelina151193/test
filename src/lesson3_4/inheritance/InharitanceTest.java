package lesson3_4.inheritance;

public class InharitanceTest {
    public static void main(String[] args) {

        Animal animal = new Animal ("Aza");
        Animal otherAnimal = new Animal ("Azor", 15);
        Lion lion = new Lion ("Simba", 34);

        System.out.println(animal);
        System.out.println(otherAnimal);
        System.out.println(lion);

        System.out.println(animal.getName());
        System.out.println(lion.getName());
    }


}
