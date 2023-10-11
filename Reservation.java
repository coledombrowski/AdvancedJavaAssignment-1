// Cole Dombrowski
// Assignment 2
// 10-4-2023

package dombrowski.cole;

public class Reservation
{
    private Room guestRoom;
    private Customer guest;
    private int numOfNights;
    private String arrival;
    private float rate;
    
    // Constructor
    public Reservation( Room guestRoom, Customer guest, String arrival, int numOfNights)
    {
        this.guestRoom = guestRoom;
        this.guest = guest;
        this.arrival = arrival; 
        this.numOfNights =numOfNights;
    
        // Rate calculation
        if (guest.getClubMember())
        {
            this.rate = (float) (guestRoom.getStdRate() * 0.9);
        }
        else
        {
            this.rate = (float) guestRoom .getStdRate();
        }
    }

    // (d). toString() method
    // It's asking if I want to add an override annotation..?
    // I don't know what that means...
    public String toString()
    {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("$#,##0.00");
        String rateV2 = decimalFormat.format(rate);
        
        String memberRegistration = guest.getClubMember() ? "Yes" : "No";
        return "Customer Name: " + guest.getName() + "\nRewards Club Member: " +
                memberRegistration + "\nRate: " + rateV2 + " per night for " +
                numOfNights + "\nCheck-in Date: " + arrival;
    }
}
