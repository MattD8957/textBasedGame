package TextBasedGame.Utilities;

import java.util.Scanner;
import TextBasedGame.Characters.Player;

public class DEVMode {

    int event = -1;
    boolean DEVMode = false;
    Scanner input = new Scanner(System.in);

    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    public DEVMode(Player player, Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public boolean getDEVMODE() {
        return DEVMode;
    }

    public int getOverridenEvent() {
        return event;
    }

    public void DEVScreen() {
        int choice;
        boolean happy = false;
        while (!happy) {
            GeneralUtils.clearScreen();
            System.out.println("Welcome to the DEV screen");
            System.out.println("This is where you can test things");
            System.out.println("DO You want to test stats(1) or events?(2) Move on(3)");
            choice = input.nextInt();
            if (choice == 1) {// Stats
                System.out.println("Stats are:\n0 - Health\n1 - Max Health\n2 - Strong Attack\n3 - Strong Attack Max\n4 - Standard Attack\n5 - Standard Attack Max\n6 - Weak Attack\n7 - Weak Attack Max");
                choice = input.nextInt();
                System.out.println("What do you want to set it to?");
                switch (choice) {
                    case 0:
                        player.setHealth(input.nextInt());
                        break;
                    case 1:
                        player.setMaxHP(input.nextInt());
                        break;
                    case 2:
                        strong.setDamage(input.nextInt());
                        break;
                    case 3:
                        strong.setMaxDamage(input.nextInt());
                        break;
                    case 4:
                        standard.setDamage(input.nextInt());
                        break;
                    case 5:
                        standard.setMaxDamage(input.nextInt());
                        break;
                    case 6:
                        weak.setDamage(input.nextInt());
                        break;
                    case 7:
                        weak.setMaxDamage(input.nextInt());
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            } else if (choice == 2) {// Events
                System.out.println("Events are:\n0 - Dragon\n1 - Bear\n2 - bar\n3 - doctor\n4 - goblin\n5 - guards\n6 - Night");
                event = input.nextInt();
            } else if(choice == 3){
                break;
            } else {
                System.out.println("Invalid input");
            }

            System.out.println("Done? (y/n)");
            if (input.next().equalsIgnoreCase("y")) {
                happy = true;
            } else {
                happy = false;
            }
        }
    }

    public void turnOnDEVMode() {
        DEVMode = true;
    }
}
