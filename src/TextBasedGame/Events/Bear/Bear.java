package TextBasedGame.Events.Bear;

import java.util.Scanner;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Constants.BearConstants;

public class Bear {

    Player player;
    boolean foughtOnce;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);
    int bearHP;
    int bearAttackDMG;
    int attackType;
    int damageTaken;

    public Bear(Player player, boolean foughtOnce, Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.foughtOnce = foughtOnce;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public void bear() {
        BearText.getBearInitialText();
        if (!foughtOnce) {
            ArtAndText.getCombatExplanation();
        }
        // Create bear
        bearHP = GeneralUtils.randomNumber(BearConstants.HP_UPPER_BOUND);
        bearHP += 20;// bear health 20 - 45
        bearAttackDMG = GeneralUtils.randomNumber(BearConstants.ATTACK_DMG_UPPER_BOUND);
        bearAttackDMG += 10;// bears do 10 to 20 dmg
        Enemy bear = new Enemy(bearHP, bearAttackDMG); // HP then attack dmg
        // Battle
        while (!player.isDead() && !bear.isDead()) {
            System.out.println("The bear has " + bear.getHP() + " HP.");
            do {
                ArtAndText.getAttackTypeChoiceText();
                attackType = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackType, 3));
            if (attackType == 1) {
                BearText.characterAttackStrengthOne(strong.getAttackDamage(), bear.getHP());
                bear.takeDamage(strong.getAttackDamage());
            } else if (attackType == 2) {
                BearText.characterAttackStrengthTwo(standard.getAttackDamage(), bear.getHP());
                bear.takeDamage(standard.getAttackDamage());
            } else if (attackType == 3) {
                BearText.characterAttackStrengthThree(weak.getAttackDamage(), bear.getHP());
                bear.takeDamage(weak.getAttackDamage());
            }
            if (!bear.isDead()) {// If still alive bear's turn
                // To determine which attack was used and so what buff
                if (attackType == 1) {// Strong attack
                    damageTaken = bear.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2) {// Standard attack
                    damageTaken = bear.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3) {// Weak attack
                    damageTaken = bear.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0) {// Positive attack
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0) {// negative attack
                        damageTaken = 0;
                    }
                }
                BearText.bearTurnText(damageTaken, player.getHP());
            }
        }
        if (bear.isDead()) {// After loop ends if Bear died
            player.ChangeArtifacts(BearConstants.ARTIFACTS_COLLECTION_AMOUNT);
            BearText.getBeatBearText(player.getArtifact());
            foughtOnce = true;
        }
    }
}
