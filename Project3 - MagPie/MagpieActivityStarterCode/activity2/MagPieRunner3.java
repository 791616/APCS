
/**
 * Write a description of class MagpieRunner3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class MagPieRunner3
{


    /**

     * Create a Magpie, give it user input, and print its replies.

     */

    public static void main(String[] args)

    {

        MagPie3 maggie = new MagPie3();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))

        {

            System.out.println (maggie.getResponse(statement));

            statement = in.nextLine();

        }

    }


}
