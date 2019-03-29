package lesson7.IO;


// klasa live coding przepisana ze zrozumieniem

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LiveCodingExcercise {
    public static void main(String[] args) {

        //symboliczne odwołania
        Path folder = Paths.get(".");  // <--tworzy nową ścieżkę do pliku lub katalogu
        System.out.println("baseFolder = " + folder);
        System.out.println("baseFolder = " + folder.toAbsolutePath()); // <--zwraca bezwględną ścieżkę do pliku lub katalogu

        try {
            System.out.println("baseFolder= " + folder.toRealPath()); //<-- zwraca bezwzględną ścieżkę bez . i ..; to realPath
        } catch (IOException e) {                                      //podkreśla się na czerwono, bo może wystąpić wyjątek;
            e.printStackTrace();                                       // alt+enter -> automatyczna obsługa wyjątków
        }

        //tworzenie Path do konkretnego katalogu
        Path baseFolder = Paths.get("C:\\io_test"); //io_test to nazwa folderu
        System.out.println("baseFolder = " + baseFolder);

        //tworzenie tego katalogu na dysku

        if (Files.exists(baseFolder.getParent()) && !Files.exists(baseFolder)) { //jeśli istnieje nadkatalog i nie istnieje folder,
            // który chcemy stworzyć; alt+ enter dla wyjątku
            try {
                Files.createDirectory(baseFolder);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Path path = baseFolder.resolve("text.txt");//<--do ścieżki dodajemy nazwę pliku, który powstanie w folderze
        // teraz dopiero fizycznie utworzymy katalog na dysku:
        if(!Files.exists(path)) { //jeżeli plik o tej ścieżce NIE istnieje
            try {
                Files.createFile(path); //utwórz plik o podanej ścieżce
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
