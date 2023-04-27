package TextBasedGame.Events.Bar;

import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.Constants.BarConstants;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;

public class Blacksmith {
    

    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);
    int blackSmithChoice;
    int atk;

    public Blacksmith (Player player, Attack strong, Attack standard, Attack weak){
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public void blacksmith (){
        do{
            BarText.getBlackSmithText();
            System.out.println(
                    "You currently have: " + player.getArtifact() + " artifacts.");
            blackSmithChoice = input.nextInt();
            } while (!GeneralUtils.isAnOption(blackSmithChoice, 2));
            if (blackSmithChoice == 1) {
                System.out.println("Attack before addition: " + player.getAttack());
                atk = GeneralUtils
                        .randomNumber(BarConstants.ATTACK_DMG_INCREASE_UPPER_BOUND);
                atk++;
                // incerase attack damage
                player.increaseAttack(atk);
                strong.increaseAttackDamage(atk);
                standard.increaseAttackDamage(atk);
                weak.increaseAttackDamage(atk);
                if (standard.getAttackDamage() <= standard.getMaxAttackDamage()) { // If not over max attack damage state attack damage
                    System.out.println("New attack damage: " + player.getAttack());
                } else if (standard.getAttackDamage() > standard.getMaxAttackDamage()) { // If over max attack damage set to max attack damage and then state attack damage
                    strong.setMaxAttackDamage();
                    standard.setMaxAttackDamage();
                    weak.setMaxAttackDamage();
                    System.out.println("New attack damage " + player.getAttack());
                }
            } else if (blackSmithChoice == 2) {
                System.out.println("Attack before addition: " + player.getAttack());
                atk = BarConstants.ATTACK_DMG_INCREASE_PAYED;
                // incerase attack damage
                player.increaseAttack(atk);
                strong.increaseAttackDamage(atk);
                standard.increaseAttackDamage(atk);
                weak.increaseAttackDamage(atk);
                if (standard.getAttackDamage() <= standard.getMaxAttackDamage()) { // If not over max attack damage state attack damage
                    System.out.println("New attack damage: " + player.getAttack());
                } else if (standard.getAttackDamage() > standard.getMaxAttackDamage()) { // If over max attack damage set to max attack damage and then state attack damage
                    strong.setMaxAttackDamage();
                    standard.setMaxAttackDamage();
                    weak.setMaxAttackDamage();
                    System.out.println("New attack damage " + player.getAttack());
                }
            }
    }
}
