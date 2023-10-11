// Cole Dombrowski
// Assignment 2
// 10-4-2023

package dombrowski.cole;

public class Customer
{
    private String custId;
    private String name;
    private boolean clubMember;
    
    // Constructor
    public Customer(String custId, String name, boolean clubMember)
    {
        this.custId = custId;
        this.name = name;
        this.clubMember = clubMember;
    }
    
    // name Getter
    public String getName()
    {
        return name;
    }
    
    // name Setter
    public void setName(String name)
    {
        this.name = name;
    }
    
    // clubMember Getter
    public boolean getClubMember()
    {
        return clubMember;
    }
    
    // clubMember Setter
    public void setClubMember()
    {
        this.clubMember = clubMember;
    }  
}
