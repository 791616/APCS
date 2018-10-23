
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    // instance variables - replace the example below with your own
    public static void run(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint start= new TGPoint (0,0);
       BallBot ballBot = new BallBot (ballWorld,start,80.5, 80);
       int q=1;
       while(q==1){
           if(ballBot.canMoveForward(ballWorld) ==true) {
               ballBot.moveForward();
            }
            else{
                ballBot.setHeading(ballBot.getHeading() + (Math.random()*360)%90);
                
            }
        }
    }
    
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        for(int r=0;r<ballBotArray.length;r++){
            if(ballBotArray[r]==null){
                return r;
            }
            return ballBotArray.length;
        }
    }
}

       