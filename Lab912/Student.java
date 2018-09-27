
/**
 * Write a description of class Studentnumber here.
 * 
 * @author (Tristan and Jason) 
 * @version (820)
 */
public class Student
{
    // instance variables
    private int studNumber;
    private boolean studActive;
    private double studGPA;
    private String studName;
    /**
     * Constructor for objects of class Studentnumber
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
        String StudName= "name";
    }

    /**
     *Sudent Methods
   
     */
    public void setStudNumber(int sn)    {
        studNumber = sn;
    }

    public int getStudNumber()    {
        return studNumber;
    }
       public void setStudName(String sn)    {
        studName = sn;
    }

    public String getStudName()    {
        return studName;
    }
    
     
    }

