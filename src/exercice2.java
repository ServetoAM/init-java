import java.util.InputMismatchException;
import java.util.Scanner;


/*public class exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        String result = "%d * %d = %d";

        while (true){
            try{
                System.out.print( "Entrer nombre à multiplier : " );
                num = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.print( "Vous devez rentrer un entier" );
            }
        }
        scanner.close();

        for (int i=0; i <= 10; i++){
            int calcResult = num * i;
            System.out.println(String.format(result, num, i, calcResult ));
        }
    }}*/
public class exercice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer number = null;

        while (number == null) {
            try {
                System.out.print("Entrez un nombre : ");
                number = scanner.nextInt(); // Exception potentiellement levée, donc la variable number reste à null
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Attention ! Vous devez entrez un nombre");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
            }
        }

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }


    }
}
