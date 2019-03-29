package lesson7.Generics;

/*import java.util.List;

public class NumbersBox<T extends Number> {
    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty() {
        boolean a;
        if (items.size() == 0) {     // albo return items.isEmpty()   <- "gotowa metoda"
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    public T firstElement() {
        if (!isEmpty()) {
            return null;
        }
        return items.get(0);
    }

    public int firstElementAsInt(){

        int a = (int) items.get(0);
        return a;          // return firstElement.intValue();
    }

    public T lastElement() {
        if (!isEmpty()) {
            return null;
        }
        return items.get(items.size()-1);

    }

    public int lastElementAsInt() {

        int a = (int) items.get(items.size()-1);
        return a;
    }
}*/
