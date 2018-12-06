
/**
 * Write a description of class Timbs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Timbs{
    public static void main (String[] args) {
        int buck[]={3,4,5,6,7};
        change(buck);
        
        for(int y:buck)
        System.out.println(y);
    }
    public static void change (int x[]) {
        for(int counter=0; counter<x.length;counter++)
        x[counter]+=5;
    }
}
   