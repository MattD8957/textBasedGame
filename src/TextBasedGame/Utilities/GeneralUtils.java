package TextBasedGame.Utilities;

import java.util.Random;

public class GeneralUtils {
    
    /**
     * Clears the screen
     */
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }

      /**
       * Pauses the program for a specified amount of time 
       * @param time in seconds
       */
      public static void pause(int time){
        time *= 1000;
        try {
            Thread.sleep(time);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();}
        }
        
        /**
         * Generates a random number between 0 and the upperbound
         * @param upperBound one heigher than the highest number you want
         * @return random number
         */
        public static int randomNumber(int upperBound){
            int randomOutPutInt = -100;
            boolean startRandom = true;

            while(startRandom == true) {
            Random rand = new Random();//creates random class
            randomOutPutInt = rand.nextInt(upperBound);//generates number 0 to upperBound
            startRandom = false;
            }
            return randomOutPutInt;
        }

      

}
