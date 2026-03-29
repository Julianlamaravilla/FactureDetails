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

        // String with the user of system
        String[] userNames = new String[3];
        String[] password = new String[3];


        // enter manually the users and theirs passwords
        userNames[0] = "julián";
        password[0] = "12345";

        userNames[1] = "carlos";
        password[1] = "12345";

        userNames[2] = "andrés";
        password[2] = "12345";


        // get the userName and password from the user
        String u = JOptionPane.showInputDialog(null, "Please, enter the user : ");
        String p = JOptionPane.showInputDialog(null, "Please, enter the password : ");


        // the key variable for the application flow
        boolean enter = false;

        // check if the user and password is in the array
        for (int i = 0; i < userNames.length; i ++){

            // if there is a coincidences assign true for enter variable
            if(userNames[i].equals(u) && password[i].equals(p)){
                enter = true;
                break;
            }
        }


        try {


            // if the variable is true, enter to FactureDetails flow
            if (enter){

                // application flow
                factureName = JOptionPane.showInputDialog("Please, enter facture names : ");
                price1 = Double.parseDouble(JOptionPane.showInputDialog("Now, Enter first price \n"));
                price2 = Double.parseDouble(JOptionPane.showInputDialog("Please, second one"));
            } else {
                JOptionPane.showMessageDialog(null, "UserName or password is incorrect");
            }
        } catch (InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Please, select correct values");
            main(args);
            System.exit(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please, select correct values");
            main(args);
            System.exit(0);
        }

        if (enter) {

        // calculates doubles
        double totalPrice = price1 + price2;
        double tax = totalPrice * 0.19;
        double taxPrice = totalPrice + totalPrice;

        // print result
        JOptionPane.showMessageDialog(null, "The " + factureName + "facture  get a gross value of " + totalPrice + ", tax : " + tax + " after taxes : " + taxPrice);
        }


    }
}
