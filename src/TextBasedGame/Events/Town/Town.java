package TextBasedGame.Events.Town;

import java.util.Scanner;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.Constants.TownConstants;
import TextBasedGame.Utilities.GeneralUtils;

public class Town {

    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);

    int choice;
    int damageTaken;
    int attackType;
    int attackTarget;
    int fine = 0; // Use to fine the player of artifacts
    int fightStart = 0; // Random to decide if a fight starts in jail
    int courtSentancing = 0; // The random that gives a sentance for the players crimes
    int artifactsFoundOnGuards = 0; // Use to award players for beating the guards
    boolean guardsAreDead = false; // Checks if gaurds are dead
    boolean foughtOnce = false; // Checks if the player has fought in the town before

    public Town(Player player, Attack strong, Attack standard, Attack weak, Boolean foughtOnce) {
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
        this.foughtOnce = foughtOnce;
    }

    public void town() {
        do {
            TownText.initialEventText();
            choice = input.nextInt();
        } while (GeneralUtils.isAnOption(choice, 3));
        switch (choice) {
            case 1: // Go willingly
                GoWillingly.willing(player);
                break;
            case 2: // Beg for mercy
                beg();
                break;
            case 3: // Fight back
                
                break;
            default:
                ArtAndText.getFailedToMakeSelection();
                player.kill();// set health to 0 to end loop
                break;
        }
    }

    public void beg() {
        GeneralUtils.clearScreen();
        System.out.println("You beg for mercy.");
        System.out.println("They decide to be leniant and give you a fine of 3 artifacts instead.");
        if (player.getArtifact() > 3) { // Checks you have enough to pay
            player.ChangeArtifacts(-3);
            System.out.println("You now have " + player.getArtifact() + " artifacts.");
        } else if (player.getArtifact() < 3) {
            System.out.println("You could not pay the fine. So they execute you.");
            player.kill();
        }
    }
}
