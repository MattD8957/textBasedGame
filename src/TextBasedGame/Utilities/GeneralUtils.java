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
       * @param time
       */
      public static void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      }

      

}
