
/**
 * Write a description of class neck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class neck{
    public static void main(String[] args) {
        Random doice = new Random();
        int number;
        
        for(int counter=1; counter<=10;counter++){
            number = 1+doice.nextInt(6);
            System.out.println(number + "  " );
        }
    }
}
            
        
  