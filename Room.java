// Cole Dombrowski
// Assignment 2
// 10-4-2023
package dombrowski.cole;

public class Room
{
    private String roomNum;
    private char roomType;
    private double stdRate;
    private boolean petFriendly;
    
    // Constructor
    public Room(String roomNum, char roomType, double stdRate, boolean petFriendly)
    {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.stdRate = stdRate;
        this.petFriendly = petFriendly;
    }  
    
    // Getter
    public double getStdRate()
    {
        return stdRate;
    }
    
    // Setter
    public void setStdRate(double stdRate)
    {
        this.stdRate = stdRate;
    }
}
