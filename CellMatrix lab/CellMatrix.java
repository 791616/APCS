
/**
 * 
 * 
 * @author (Tristan Barry Schnur) 
 * @version (1126)
 */
import java.util.Random;
public class CellMatrix{
   private Cell[][] cells;
   public CellMatrix(int a, int b){
       cells = new Cell[a][b];
   }
   public void printMatrix(){
       for (int row = 0; row < cells.length; row++) {
           for (int col = 0; col < cells[0].length; col++) {
               System.out.print(cells[row][col].getInt() + " " );
           }
           System.out.println();
       }
       System.out.println();
   }
   public void loadMatrix(){
       for (int row = 0; row < cells.length; row++) {
           for (int col = 0; col < cells[0].length; col++) {
           cells[row][col] = new Cell((int)(Math.random() * 10 + 1));
           }
       }
   }
   public int getGreatestNeighbors(){
       int greatest = 0;
       int neighborSum;
       for (int row = 0; row < cells.length; row++) {
           for (int col = 0; col < cells[0].length; col++) {
               loadNeighbors(cells[row][col], row, col);
               neighborSum = 0;
               Cell[] current = cells[row][col].getNeighbors();
               for (int i = 0; i < current.length; i++) {
                   neighborSum = neighborSum + current[i].getInt();
               }
               if(neighborSum >= greatest) {
                   greatest = neighborSum;
               }
           }
       }
       return greatest;
   }
   public void loadNeighbors(Cell c, int row, int col){
       int north;
       int east;
       int south;
       int west;
       if(row == 0) { // initializes north
           north = 0;
       } else {
           north = cells[row - 1][col].getInt();
       }
       if(row == cells.length - 1) { // initializes south
           south = 0;
       } else {
           south = cells[row + 1][col].getInt();
       }      
       if(col == 0) { // initializes west   
           west = 0;
       } else {
           west = cells[row][col - 1].getInt();
           
       }
       if(col == cells[0].length - 1) { // initializes east
           east = 0;    
       } else { 
           east = cells[row][col + 1].getInt(); 
       }
   }
}