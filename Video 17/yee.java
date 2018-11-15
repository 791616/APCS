
/**
 * Write a description of class yee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class yee{
    private String girlName;
    
    public yee(String name) {
        girlName=name;
    }
    public void setName(String name) {
        girlName=name;
    }

    public String getName(){
        return girlName;
    }

    public void saying(){
        System.out.printf("Your first gf was %s/n", getName());
    }

 }
