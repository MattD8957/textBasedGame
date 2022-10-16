package TextBasedGame;
import java.util.Random;

public class random {
    private static int upperBound;
    private static int randomOutPutInt;
    private static boolean startRandom = false;
    //Create Random
    public random(){

    }
    public int randomNumber(int upperbound){
        startRandom = true;
        while(startRandom == true) {
        Random rand = new Random();//creates random class
        upperBound = upperbound; //sets upperbound = to 5, needs to be one greater than desired amount
        randomOutPutInt = rand.nextInt(upperBound);//generates number 0 to upperBound
        startRandom = false;
        }
        return randomOutPutInt;
    }
}
