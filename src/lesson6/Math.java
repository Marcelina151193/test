package lesson6;

public class Math {

    private Math(){}; //<-konstruktor prywatny, który nie pozwala stworzyć obiektu w nowej klasie

    private static final double PI = 3.14;

    public static int add(int x, int y) {
        return x+y;
    }

    public static int subtract(int x, int y) {
        int s = x - y;
        return s;
    }

    public static int multiply(int x, int y) {
        int m = x * y;
        return m;
    }

    public static int divide(int x, int y) {
        int d = x / y;
        return d;
    }

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;

        }
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;

        }

    }

    public static double area (int r){
        return PI*r*r;
    }

    public static void main(String[] args) {

        System.out.println(Math.max(4,5));
        System.out.println(Math.min(4,5));
        System.out.println(Math.add(4,5));

        System.out.println(Math.area(8));



    }
}
