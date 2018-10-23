
/**
 * Write a description of class Forhomework here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner; 
public class Homework {
    public static void main(){
        // Problem 1 (print a triangle of *)
        System.out.println();
        System.out.println("Problem 1:");
        for(int line = 1; line <= 5; line ++){
            for(int star = 1; star <= line; star ++){
              System.out.print("*");
            }
            System.out.println();
        }
      
        // Problem 2 (print numbers from 0 to 99; label as even or odd)
        System.out.println();
        System.out.println("Problem 2:");
        for (int i = 0; i <= 99; i ++) {
            if (i % 2 == 0){
                System.out.println("i:" + i + " Even");
            } else {
                System.out.println("i:" + i + " Odd");
            }
        }
        
        // Problem 3 (print the sum of even integers from 2 to n)
        System.out.println();
        System.out.println("Problem 3:");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an even number!");
        int n = reader.nextInt();
        reader.close();
        int total = 0;
        for (int num = 2; num <= n; num +=2){
            total += num;
            if (num >= n){
                System.out.println("The sum of the even integers from 2 to " + n + " is " + total + ".");
            }
        }
    }
}
