import java.util.InputMismatchException;
import java.util.Scanner;


public class exercice2 {
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
    }}

