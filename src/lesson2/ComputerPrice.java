package lesson2;

public class ComputerPrice {
    public static void main(String[] args) {
        //W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera na podstawie jego części.
        // Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor,
        // pamięć RAM, dysk twardy i osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.

        float allComputerPrice;
        double allComputerPriceNetto;
        float motherboard = 500;
        float processor = 700;
        float RAM = 400;
        float hardDrive = 400;
        float monitor = 600;
        double monitorNetto = monitor / 1.23;

        allComputerPrice = motherboard + processor + RAM + hardDrive;
        allComputerPriceNetto = allComputerPrice / 1.23;

        float computerPlusMonitor = allComputerPrice + monitor;
        double computerPlusMonitorNetto = computerPlusMonitor / 1.23;

        System.out.println("Cena komputera brutto: " +allComputerPrice + "i netto: " + allComputerPriceNetto);
        System.out.println("Cena komputera i monitora brutto: " + computerPlusMonitor + " i netto: " +computerPlusMonitorNetto);



    }
}
