package TextBasedGame.Utilities;

import java.util.Random;
import TextBasedGame.Utilities.Constants.GeneralConstants;

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
         * @return random number between 0 and upperBound
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

        /**
         * Converts an Int to String 0 - 20
         * 
         * @param num INT to become num
         * @return String of INT
         */
        
        public static String numTOString(int num){
            if(num == 0){
                return "Zero";
            } else if (num == 1){
                return "One";
            } else if (num == 2){
                return "Two";
            } else if (num == 3){
                return "Three";
            } else if (num == 4){
                return "Four";
            } else if (num == 5){
                return "Five";
            } else if (num == 6){
                return "Six";
            } else if (num == 7){
                return "Seven";
            } else if (num == 8){
                return "Eight";
            } else if (num == 9){
                return "Nine";
            } else if (num == 10){
                return "Ten";
            } else if (num == 11){
                return "Eleven";
            } else if (num == 12){
                return "Twelve";
            } else if (num == 13){
                return "Thirten";
            } else if (num == 14){
                return "Four-Teen";
            } else if (num == 15){
                return "Fifteen";
            } else if (num == 16){
                return "Six-teen";
            } else if (num == 17){
                return "Seven-teen";
            } else if (num == 18){
                return "Eight-Teen";
            } else if (num == 19){
                return "Nine-teen";
            } else if (num == 20){
                return "Twenty";
            } else {
                return null;
            }
        }

        /**
         * Checks if the given int is an option
         * @param given value from user
         * @param max highest value option
         * @return if the given value is an option
         */
        public static boolean isAnOption(int given, int max){
            int[] options = null;
            switch(max){
                case 1: 
                    options = GeneralConstants.Options1;
                    break;
                case 2: 
                    options = GeneralConstants.Options2;
                    break;
                case 3:
                    options = GeneralConstants.Options3;
                    break;
                case 4:
                    options = GeneralConstants.Options4;
                    break;
            }
            for(int test : options){
                if(given == test){
                    return true;
                }
            }
            return false;
        }

        public static void winScreen(String characterName, ArtAndText art){
            GeneralUtils.clearScreen();
				System.out.println("Congratulations " + characterName);
				pause(3);
				// Win screen
				art.getYouWin();
				art.getEndingText();
				// End program
				System.exit(1);
        }

        public static void loseScreen(ArtAndText art){
            pause(3);
			// Clear screen
			clearScreen();
			// Death screen
			art.getYouDied();
			art.getEndingText();
			// End program
			System.exit(2);
        }

        public static void StartScreen(){
            // Clear screen
            
        }
}
