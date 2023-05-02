package TextBasedGame.Events.DragonBattle;

import java.util.Scanner;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Constants.DragonConstants;

public class DragonBattle {

    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);

    boolean foughtOnce;
    int choice;
    int escapeChance;
    int damageTaken;
    int dragonHP;
    int dragonAttack;
    int attackType;

    public DragonBattle(Player player, boolean foughtOnce, Attack strong, Attack standard,
            Attack weak) {
        this.player = player;
        this.foughtOnce = foughtOnce;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public void dragon() {
        do {
            ArtAndText.getDragonArt();
            choice = input.nextInt();
        } while (!GeneralUtils.isAnOption(choice, 2));

        if (choice == 1) {// 1 For escape
            // 1 in 5 chance of freedom
            // 2 in 5 chance of falling and taking damage 1 to 10 dmg
            // 2 in 5 chance of waking the dragon and having to fight it - if you win
            // you still get the treasure
            escapeChance = GeneralUtils.randomNumber(DragonConstants.ESCAPE_CHANCE_UPPER_BOUND);
            if (escapeChance == 0) {// escape succesfully
                DragonBattleText.escaped();
            } else if ((escapeChance == 1) || (escapeChance == 2)) {// trip and take some damage 1
                                                                    // to 10
                damageTaken = GeneralUtils.randomNumber(DragonConstants.ESCAPE_DMG_UPPER_BOUND);
                DragonBattleText.tripThenEscape(damageTaken, player.getHP());
                player.takeDamage(damageTaken);
            } else if ((escapeChance == 3) || (escapeChance == 4)) {// You fail to escape and have
                                                                    // to fight the dragon
                DragonBattleText.getFailedToEscapeText();// Message after failing to escape
                // Goes to the battle
            }
        }
        if ((choice == 2) || (escapeChance == 3) || (escapeChance == 4)) {// To rob the dragon
            if (!foughtOnce) {
                ArtAndText.getCombatExplanation();
            }
            GeneralUtils.pause(1);
            dragonHP = GeneralUtils.randomNumber(DragonConstants.HP_UPPER_BOUND) + 10;// Dragon
                                                                                      // health 10 -
                                                                                      // 75
            dragonAttack = GeneralUtils.randomNumber(DragonConstants.ATTACK_DMG_UPPER_BOUND) + 20; // Generates
                                                                                                   // dragon
                                                                                                   // attack
                                                                                                   // dmg
                                                                                                   // 20
                                                                                                   // -
                                                                                                   // 35
            Enemy dragon = new Enemy(dragonHP, dragonAttack); // Create Dragon HP 10 - 75, Attack
                                                              // dmg 20 - 35

            while (!player.isDead() && !dragon.isDead()) {
                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                do {
                    ArtAndText.getAttackTypeChoiceText();
                    attackType = input.nextInt();
                } while (!GeneralUtils.isAnOption(attackType, 3));
                if (attackType == 1) {
                    DragonBattleText.characterAttackStrengthOne(strong.getAttackDamage(),
                            dragon.getHP());
                    dragon.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2) {
                    DragonBattleText.characterAttackStrengthTwo(standard.getAttackDamage(),
                            dragon.getHP());
                    dragon.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3) {
                    DragonBattleText.characterAttackStrengthThree(weak.getAttackDamage(),
                            dragon.getHP());
                    dragon.takeDamage(weak.getAttackDamage());
                }
                if (!dragon.isDead()) {// If still alive dragon's turn
                    // To determine which attack was used and so what buff
                    if (attackType == 1) {// Strong attack
                        damageTaken = dragon.getAttack() + strong.getAttackPenalty();
                        player.takeDamage(damageTaken);
                    } else if (attackType == 2) {// Standard attack
                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                        player.takeDamage(damageTaken);
                    } else if (attackType == 3) {// Weak attack
                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                        if (damageTaken >= 0) {// Positive attack
                            player.takeDamage(damageTaken);
                        } else if (damageTaken < 0) {// negative attack
                            damageTaken = 0;
                        }
                    }
                    DragonBattleText.endRoundtext(damageTaken, player.getHP());
                }
            }
            if (dragon.isDead()) {// After loop ends if Dragon died
                player.ChangeArtifacts(1);
                foughtOnce = true;
                DragonBattleText.finalText(player.getArtifact());
            }
        }
    }
}
