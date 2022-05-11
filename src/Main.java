import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    /*public static int division(int a, int b) throws Exception {

        if (b == 0) {
            throw new Exception("Tu ne peux pas diviser un nombre par zero");
        }

        int result = a / b;

        return result;
    }
    public static int division(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Tu ne peux pas diviser un nombre par zero");
        }

        int result = a / b;

        return result;
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbOne;
        int nbTwo;
        int nbThree;

        try {
            System.out.print("Entrez le premier nombre : ");
            nbOne = scanner.nextInt();

            System.out.print("Entrez le deuxieme nombre : ");
            nbTwo = scanner.nextInt();
            scanner.close();

            nbThree = nbOne * nbTwo;
            String resultToFormat = "Résultat : %d * %d = %d";
            String result = String.format(resultToFormat, nbOne, nbTwo, nbThree);

            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es sencé mettre un nombre entier");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }}