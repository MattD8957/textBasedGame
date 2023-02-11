package TextBasedGame.Utilities;

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

      

}
