import java.util.logging.Logger;
import java.util.Scanner;

public class Main {

    Figura[] arrayfiguras = new Figura[]{};
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );
    public static void main(String[] args) {

        //Per solucionar el problema dels double, paso a int els doubles de les àrees de les figures
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriu la figura (Quadrat, Rectangle, Cercle, Triangle)");
            String figura = scanner.nextLine();
          if (figura=="Quadrat"){
              LOGGER.info("Escriu la longitud de l"); //Falta acabar tot això
              String l = scanner.nextLine();
          }
          if (figura=="Rectangle"){
              LOGGER.info("Escriu la longitud de l1");
              String l1 = scanner.nextLine();
          }
          if (figura=="Cercle"){
              LOGGER.info("Escriu la longitud de radi");
              String radi = scanner.nextLine();
          }
          if (figura=="Triangle"){
              LOGGER.info("Escriu la longitud de base");
              String base = scanner.nextLine();
          }
          else
              LOGGER.info("Figura no acceptada.");

        }


    }
    }

