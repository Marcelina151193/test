package lesson3_4.arrays;

public class ArrayTest {
    public static void main(String[] args) {

        String table1[] = {"raz", "dwa", "trzy"};
        Array1 newTable = new Array1();
        newTable.display(table1);

        int table2[] = {5, 6, 7, 8};

        Array2 newTable2 = new Array2();
        int z = newTable2.sum(table2);
        System.out.println(z);


    }
}
