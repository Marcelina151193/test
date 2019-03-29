package lesson2;

public class Triangle {
    public boolean isRectangular(int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return true;
        } else {
            return false;
        }
    }
}

