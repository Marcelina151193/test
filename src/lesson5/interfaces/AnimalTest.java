package lesson5.interfaces;

public class AnimalTest {
    public static void main(String[] args) {

        Animal bird = new Birds ();
        Animal fish = new Fish ();
        Animal reptail = new Reptails ();
        Animal insect = new Insects ();
        Animal mammal = new Mammals ();

        Animal [] animals = {bird, fish, reptail, insect, mammal};
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " " + animal.speak());
        }

    }


}
