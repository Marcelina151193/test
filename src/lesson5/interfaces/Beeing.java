package lesson5.interfaces;

public interface Beeing {

    int getAge();
    final int MAX_AGE = 100;

    default boolean isAlive(){

        boolean z;

       if (getAge() < MAX_AGE) {

           z = true;} else {
           z = false;
       }
       return z;

    }


}
