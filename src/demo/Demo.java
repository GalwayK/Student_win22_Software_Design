package demo;

public class Demo 
{
    private String address = "";
    private String ID = "";
    private String name = "";
    /*
    Date: Jan 25th 2022
    Author: Kyle Galway
    Comment: This is just a comment.
    */
    
    public Demo(String address, String ID, String name)
    {
        this.address = address;
        this.ID = ID;
        this.name = name;
    }

    public String getAddress() 
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Demo One.");
        System.out.println("New changes.");
        System.out.println("Even more numbers.");
        
    }
    
}
