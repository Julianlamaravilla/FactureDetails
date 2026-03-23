// libraries
import javax.swing.*;
import java.util.InputMismatchException;

public class Main {

    // main function
    public static void main(String[] args){

        // Initialized variables
        String factureName = "";
        double price1 = 0.0;
        double price2 = 0.0;

        try {
            // application flow
            factureName = JOptionPane.showInputDialog("Please, enter facture names : ");
            price1 = Double.parseDouble(JOptionPane.showInputDialog("Now, Enter first price \n"));
            price2 = Double.parseDouble(JOptionPane.showInputDialog("Please, second one"));
        } catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Please, select correct values");
            main(args);
            System.exit(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please, select correct values");
            main(args);
            System.exit(0);
        }

        // calculates doubles
        double totalPrice = price1 + price2;
        double tax = totalPrice * 0.19;
        double taxPrice = totalPrice + totalPrice;

        // print result
        JOptionPane.showMessageDialog(null, "The " + factureName + "facture  get a gross value of " + totalPrice + ", tax : " + tax + " after taxes : " + taxPrice);

    }
}
