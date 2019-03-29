package lesson3_4.inheritance.inheritance_tasks;

public class ToolShop {
    public static void main(String[] args) {

         Tool tool1= new Tool ("hammer1", 24);
         Tool tool2= new Tool ("hammer12", 44);

        Hammer hammer1 = new Hammer ("hammerA ", 87, 98);
        Hammer hammer2 = new Hammer ("hammerB ", 87, 98);
        Hammer hammer3 = new Hammer ("hammerC ", 87, 98);

        System.out.println("Cena wynosi: " + hammer1.getPrice());
       // System.out.println(hammer1);  // w klasie hammer musimy zrobić toString i dopisać super.getPrice itp
                                       // (najpierw zrobić gettery)
        //Inny pomysł z tablicą Toolsów:

        Tool [] tools ={hammer1, hammer2, hammer3};

        for (int i=0; i < tools.length; i++) { // zamiast tworzyć sout dla każdego narzędzia
            Tool tool = tools [i];
        // System.out.println(tool.getDetails()); <- coś nie gra
        }

    }
}
