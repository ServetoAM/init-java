/*import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        // stores two numbers
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");

        // take the inputs
        num1 = sc.nextDouble();

        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/)");

        char op = sc.next().charAt(0);

        double o = 0;

        switch (op) {

            // case to add two numbers
            case '+':

                o = num1 + num2;

                break;

            // case to subtract two numbers
            case '-':

                o = num1 - num2;

                break;

            // case to multiply two numbers
            case '*':

                o = num1 * num2;

                break;

            // case to divide two numbers
            case '/':

                o = num1 / num2;

                break;

            default:

                System.out.println("You enter wrong input");

                break;
        }

        System.out.println("The final result:");

        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}* V1/

/*import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer choice = null;
        Integer continuer = null;
        Integer firstNumber = null;
        Integer secondNumber = null;

        while (continuer == null || continuer == 1) {
            while (choice == null) {
                try {
                    System.out.println("Quelle opération voulez-vous faire?" + System.lineSeparator() + "1 - addition" +
                            System.lineSeparator() + "2 - soustraction" + System.lineSeparator() + "3 - multiplication"
                            + System.lineSeparator() + "4 - division");

                    choice = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            while (firstNumber == null) {
                try {
                    System.out.println("Quel est le premier  entier?");
                    firstNumber = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            while (secondNumber == null) {
                try {
                    System.out.println("Quel est le second?");
                    secondNumber = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas sélection via les options proposées");
                    scan.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Le résultat est de :" + Calculator.addition(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Le résultat est de :" + Calculator.soustraction(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("Le résultat est de :" + Calculator.multiplication(firstNumber, secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Impossible de diviser par zéro");
                        break;
                    }
                    System.out.println("Le résultat est de :" + Calculator.division(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Ce n'est pas un choix disponible");
            }

            System.out.println("Voulez-vous continuer?" + System.lineSeparator() + "1 - Oui" + System.lineSeparator() +
                    "2 - Non");
            continuer = scan.nextInt();
            choice = null;
            firstNumber = null;
            secondNumber = null;
        }
        scan.close();


    }
} V3 */
package fr.m2i;

public class Main {

    public static void main(String[] args) throws Exception {
        Car titine = new Car();
        System.out.println("Current Gas = " + titine.currentGas);
        System.out.println("Gas Capacity = " + titine.gasCapacity);
        System.out.println("Gas Consumption = " + titine.gasConsumption);
        System.out.println("Passenger Capacity = " + titine.passengerCapacity);
        System.out.println("Speed = " + titine.speed);
        System.out.println("----- 4L Story -----");
        while (titine.currentGas > 0) {
            try {
                titine.drive();
            } catch (Exception e) {
               break;
            }
        }
        System.out.println("T'es à sec Jacky !");
        System.out.println("----- End of Story -----");
        System.out.println("Current Gas = " + titine.currentGas);
        System.out.println("Gas Capacity = " + titine.gasCapacity);
        System.out.println("Gas Consumption = " + titine.gasConsumption);
        System.out.println("Passenger Capacity = " + titine.passengerCapacity);
        System.out.println("Speed = " + titine.speed);
    }
}