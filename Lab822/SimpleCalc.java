
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {
        // initialise instance variables
       
    }
    public double add(int x, int y){
        return x + y;
    }
    public double subtract(int x, int y){
        return x - y;
    }
     public double multiply(int x, int y){
        return x * y;
    }
     public double divide(int x, int y){
        return x / y;
    }
     public int modulo(int x, int y){
        return x % y;
    }


}