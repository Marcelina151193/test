package lesson3_4;

public class FamilyTest {
    public static void main(String[] args) {
        Person husband1 = new Person ("David", "Green", 23);
        Person wife1 = new Person ("Kate", "Green", 23);
        Person child1 = new Person ("John", "Green", 1);
        System.out.println(husband1);
        System.out.println(wife1);
        System.out.println(child1);

        Family family1 = new Family (husband1, wife1, child1, "Happy Family");
        System.out.println(family1);
        System.out.println(family1.sumOfYears());



    }
}
