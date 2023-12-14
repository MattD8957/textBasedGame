package TextBasedGame.Utilities;

import java.util.Random;
import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.Constants.GeneralConstants;

public class GeneralUtils {

    /**
     * Clears the screen
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Pauses the program for a specified amount of time
     * 
     * @param time in seconds
     */
    public static void pause(int time) {
        time *= 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Generates a random number between 0 and the upperbound
     * 
     * @param upperBound one heigher than the highest number you want
     * @return random number between 0 and upperBound
     */
    public static int randomNumber(int upperBound) {
        int randomOutPutInt = -100;
        boolean startRandom = true;

        while (startRandom == true) {
            Random rand = new Random();// creates random class
            randomOutPutInt = rand.nextInt(upperBound);// generates number 0 to upperBound
            startRandom = false;
        }
        return randomOutPutInt;
    }

    /**
     * 
     * @return random event between 0 and 6
     */
    public static int generateEvent(double playerHP, DEVMode DEV) {
        int event = -1;
        int lastEvent = 0;
        GeneralUtils.pause(4);
        if (DEV.getDEVMODE()  && DEV.getOverridenEvent() != -1) {
            event = DEV.getOverridenEvent();
        } else {
            do {
                event = GeneralUtils.randomNumber(GeneralConstants.EVENT_UPPER_BOUND);
            } while (event == lastEvent);
            lastEvent = event;

            if (playerHP <= 20) { // To make game more fun
                event = 3;
            }
        }
        GeneralUtils.clearScreen();
        return event;
    }


    /**
     * Converts an Int to String 0 - 20
     * 
     * @param num INT to become num
     * @return String of INT
     */

    public static String numTOString(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num == 1) {
            return "One";
        } else if (num == 2) {
            return "Two";
        } else if (num == 3) {
            return "Three";
        } else if (num == 4) {
            return "Four";
        } else if (num == 5) {
            return "Five";
        } else if (num == 6) {
            return "Six";
        } else if (num == 7) {
            return "Seven";
        } else if (num == 8) {
            return "Eight";
        } else if (num == 9) {
            return "Nine";
        } else if (num == 10) {
            return "Ten";
        } else if (num == 11) {
            return "Eleven";
        } else if (num == 12) {
            return "Twelve";
        } else if (num == 13) {
            return "Thirten";
        } else if (num == 14) {
            return "Four-Teen";
        } else if (num == 15) {
            return "Fifteen";
        } else if (num == 16) {
            return "Six-teen";
        } else if (num == 17) {
            return "Seven-teen";
        } else if (num == 18) {
            return "Eight-Teen";
        } else if (num == 19) {
            return "Nine-teen";
        } else if (num == 20) {
            return "Twenty";
        } else {
            return null;
        }
    }

    /**
     * Checks if the given int is an option
     * 
     * @param given value from user
     * @param max highest value option
     * @return if the given value is an option
     */
    public static boolean isAnOption(int given, int max) {
        int[] options = null;
        switch (max) {
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
        for (int test : options) {
            if (given == test) {
                return true;
            }
        }
        return false;
    }

    public static void winScreen(String characterName, int count, double artifact) {
        GeneralUtils.clearScreen();
        System.out.println("Congratulations " + characterName);
        pause(3);
        // Win screen
        ArtAndText.getYouWin();
        ArtAndText.getEndingText(count, artifact);
        // End program
        System.exit(1);
    }

    public static void loseScreen(int count, double artifact) {
        pause(3);
        // Clear screen
        clearScreen();
        // Death screen
        ArtAndText.getYouDied();
        ArtAndText.getEndingText(count, artifact);
        // End program
        System.exit(2);
    }

    public static CreateCharacters StartScreen(Scanner scanner) {
        int chosenClass;
        String characterName;

        // Clears screen
        GeneralUtils.clearScreen();
        // entrance screen
        ArtAndText.getWelcomeArt();
        chosenClass = scanner.nextInt();

        // Clears screen
        GeneralUtils.clearScreen();
        // Gets players name for Character then clears screen
        System.out.println("What would you like to name your Character?");
        characterName = scanner.next();
        CreateCharacters create = new CreateCharacters(chosenClass, characterName);
        GeneralUtils.clearScreen();
        return create;
    }
}
