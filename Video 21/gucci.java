
/**
 * Write a description of class gucci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class gucci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total =0;
        int grade;
        int average;
        int counter = 0;
        
        while (counter <10){
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("your avg is "+ average);
    }
}
  