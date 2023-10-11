/* 
    Fall 2023 BCIS 3680
    Assignment 2 Driver Class
    DO NOT CHANGE ANY OF THE CODE EXCEPT THE PACKAGE NAME
    AND THE DIALOG BOX TITLES!
    Your code in other classes should work with the Driver
    code and generate the correct output. If the program
    doesn't run, review and modify code in other classes.
 */

// Change the package name to fit yours
package dombrowski.cole;  

import javax.swing.JOptionPane;

public class Driver
{
    public static void main(String[] args)
    {
        Room r1 = new Room("300", 'K', 150.0f, true);
        Room r2 = new Room("608", 'D', 120.0f, false);

        Customer c1 = new Customer("17799", "Tony Stoke", true);
        Customer c2 = new Customer("27002", "Ethan Ho", false);

        Reservation rs1 = new Reservation(r1, c1, "10/5/23", 2);
        Reservation rs2 = new Reservation(r2, c2, "11/20/23", 5);

        // Change the titles of the dialog boxes from "Andy Wu" to your name
        JOptionPane.showMessageDialog(null, "Reservation 1" + rs1.toString() + "\n",
                "Cole Dombrowski", 1);
        JOptionPane.showMessageDialog(null, "Reservation 2" + rs2.toString() + "\n",
                "Cole Dombrowski", 1);
    }
}
