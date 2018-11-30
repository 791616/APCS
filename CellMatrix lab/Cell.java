
/**
 * @author (Tristan Barry Schnur) 
 * @version (1126)
 */
public class Cell{
   private int x;
   private Cell[] neighbors;
   public Cell(int a)    {
       x = a;
       neighbors = new Cell[4]; // North, East, South, and West only
   }
   public int getInt(){
       return x;
   }    
   public void setNeighbors(int index, int num) { // setter for neighbors
       neighbors[index] = new Cell(num);
   }
   public Cell[] getNeighbors() { // getter for neighbors
       return neighbors;
   }
}