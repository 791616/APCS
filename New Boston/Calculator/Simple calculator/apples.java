
/**
 * Write a description of class apples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class apples{
public static void main (String args[]) {
    Scanner jet = new Scanner (System.in);
    double fnum, snum, answer;
    System.out.println("Enter first num: ");
    fnum=jet.nextDouble();
    System.out.println("Enter second num: ");
    snum=jet.nextDouble();
    answer = fnum + snum;
    System.out.println(answer);
    
}
}