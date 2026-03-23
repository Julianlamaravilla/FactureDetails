// libraries
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // main function
    public static void main(String[] args){

        // use of Scanner
        Scanner scanner = new Scanner(System.in);

        // Initialized variables
        String factureName = "";
        double price1 = 0.0;
        double price2 = 0.0;

        try {
            // application flow
            String message = "Please, enter facture names : ";
            System.out.println(message + "\n");
            factureName = scanner.nextLine();

            System.out.println("Now, Enter first price \n");
            price1 = scanner.nextDouble();

            System.out.println("Please, second one");
            price2 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Please, select correct values");
            main(args);
            System.exit(0);
        }

        // calculates doubles
        double totalPrice = price1 + price2;
        double tax = totalPrice * 0.19;
        double taxPrice = totalPrice + totalPrice;

        // print result
        System.out.println("The " + factureName + "facture  get a gross value of " + totalPrice + ", tax : " + tax + " after taxes : " + taxPrice );

    }
}
