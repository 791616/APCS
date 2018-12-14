
/**
 * Write a description of class MagPie3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MagPie3


{

    /**

     * Get a default greeting

     *

     * @return a greeting

     */

    public String getGreeting()

    {

        return "Hello, let's talk.";

    }




    /**

     * Gives a response to a user statement

     *

     * @param statement

     *            the user statement

     * @return a response based on the rules given

     */

    public String getResponse(String statement)

    {

        String response = "";

        if (statement.length() == 0)

        {

            response = "Say something, please.";

        }

        else if (findKeyword(statement, "no") >= 0)

        {

            response = "Why so negative?";

        }

        else if (findKeyword(statement, "mother") >= 0

        || findKeyword(statement, "father") >= 0

        || findKeyword(statement, "sister") >= 0

        || findKeyword(statement, "brother") >= 0)

        {

            response = "Tell me more about your family.";

        }

        else if (statement.indexOf("cat") >= 0

        || statement.indexOf("dog") >= 0

        || statement.indexOf("fish") >= 0

        || statement.indexOf("bird") >= 0)

        {

            response = "Tell me more about your pets.";

        }

        else if (statement.indexOf("Ettlin") >= 0

        || statement.indexOf("Malloy") >=0)

        {

            response = "He must be a great teacher";

        }

        else if (statement.trim().length() == 0){

            response = "Please, say something";

        }

        else if (statement.indexOf("volleyball") >= 0

        || statement.indexOf("sport") >= 0

        || statement.indexOf("football") >= 0

        || statement.indexOf("basketball") >= 0

        || statement.indexOf("soccer") >= 0)

        {

            response = "I love sports!";

        }

        else if (statement.indexOf("hello") >= 0

        || statement.indexOf("what's up") >= 0

        || statement.indexOf("hi") >= 0

        || statement.indexOf("hey") >= 0

        || statement.indexOf("greetings") >= 0)

        {

            response = "Hello, how are you";

        }

        else if (statement.indexOf("food") >= 0

        || statement.indexOf("dinner") >= 0

        || statement.indexOf("breakfast") >= 0

        || statement.indexOf("lunch") >= 0

        || statement.indexOf("snack") >= 0)

        {

            response = "food is so good.";

        }

        else

        {

            response = getRandomResponse();

        }

        return response;

    }



    /**

     * Search for one word in phrase. The search is not case

     * sensitive. This method will check that the given goal

     * is not a substring of a longer string (so, for

     * example, "I know" does not contain "no").

     *

     * @param statement

     *            the string to search

     * @param goal

     *            the string to search for

     * @param startPos

     *            the character of the string to begin the

     *            search at

     * @return the index of the first occurrence of goal in

     *         statement or -1 if it's not found

     */

    private int findKeyword(String statement, String goal,

    int startPos)

    {

        String phrase = statement.trim().toLowerCase();

        goal = goal.toLowerCase();



        // The only change to incorporate the startPos is in

        // the line below

        int psn = phrase.indexOf(goal, startPos);



        // Refinement--make sure the goal isn't part of a

        // word

        while (psn >= 0)

        {

            // Find the string of length 1 before and after

            // the word

            String before = " ", after = " ";

            if (psn > 0)

            {

                before = phrase.substring(psn - 1, psn);

            }

            if (psn + goal.length() < phrase.length())

            {

                after = phrase.substring(

                    psn + goal.length(),

                    psn + goal.length() + 1);

            }



            // If before and after aren't letters, we've

            // found the word

            if (((before.compareTo("a") < 0) || (before

                    .compareTo("z") > 0)) // before is not a

                // letter

            && ((after.compareTo("a") < 0) || (after

                    .compareTo("z") > 0)))

            {

                return psn;

            }




            // The last position didn't work, so let's find

            // the next, if there is one.

            psn = phrase.indexOf(goal, psn + 1);




        }




        return -1;

    }



    /**

     * Search for one word in phrase. The search is not case

     * sensitive. This method will check that the given goal

     * is not a substring of a longer string (so, for

     * example, "I know" does not contain "no"). The search

     * begins at the beginning of the string.

     *

     * @param statement

     *            the string to search

     * @param goal

     *            the string to search for

     * @return the index of the first occurrence of goal in

     *         statement or -1 if it's not found

     */

    private int findKeyword(String statement, String goal)

    {

        int startPos = 0;

        String phrase = statement.trim();

        goal = goal.toLowerCase();

        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        while  (psn>= 0 ) {

            String before = "", after = "";

            if (psn>0) {

                before = phrase.substring (psn - 1, psn).toLowerCase();




            }

            if (psn +goal.length() < phrase.length()) {

                after = phrase.substring(psn + goal.length(),

                    psn + goal.length() + 1).toLowerCase();

            }

            /* determine the values of psn, before, and after at this point in the method. */

            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))

            &&

            ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))

            {

                return psn;

            }

            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;

    }   



          


    /**

     * Pick a default response to use if nothing else fits.

     *

     * @return a non-committal string

     */

    private String getRandomResponse()

    {

        final int NUMBER_OF_RESPONSES = 4;

        double r = Math.random();

        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";



        if (whichResponse == 0)

        {

            response = "Interesting, tell me more.";

        }

        else if (whichResponse == 1)

        {

            response = "Hmmm.";

        }

        else if (whichResponse == 2)

        {

            response = "Do you really think so?";

        }

        else if (whichResponse == 3)

        {

            response = "You don't say.";

        }




        return response;

    }
}
