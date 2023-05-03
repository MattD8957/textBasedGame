package TextBasedGame.Events.Town;

import java.util.Scanner;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.Constants.TownConstants;
import TextBasedGame.Utilities.GeneralUtils;

public class TownFight {
    
    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);

    int attackTarget;
    int attackType;
    int damageTaken;
    int artifactsFoundOnGuards;
    int choice;
    boolean foughtOnce;
    boolean guardsAreDead = false; // Checks if gaurds are dead

    public TownFight(Player player, Attack strong, Attack standard, Attack weak, boolean foughtOnce){
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
        this.foughtOnce = foughtOnce;
    }

    public void fight() {
    System.out.println("You decide to fight back.");
                Enemy guardOne = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);// Hp, attack
                Enemy guardTwo = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);
                Enemy guardThree = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);
                Enemy guardFour = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);
                Enemy guardFive = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);
                Enemy guardSix = new Enemy(TownConstants.GUARD_HEALTH, TownConstants.GUARD_ATTACK);
                GeneralUtils.pause(1);
                // Explanation for player at start of battle
                // Clear screen
                GeneralUtils.clearScreen();
                if (!foughtOnce) {
                    ArtAndText.getCombatExplanation();
                }
                while (!player.isDead() && !guardsAreDead) {
                    do {
                        TownText.initialEventText();
                        attackTarget = input.nextInt();
                    } while (GeneralUtils.isAnOption(attackTarget, 6));
                    do {
                        ArtAndText.getAttackTypeChoiceText();
                        attackType = input.nextInt();
                    } while (GeneralUtils.isAnOption(attackType, 3));
                    if (attackTarget == 1)// Guard one
                    {
                        System.out.println("You attack guard one.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardOne.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardOne.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardOne.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                        }
                        if (!guardOne.isDead())// Guard One's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your attack Strong
                            {
                                damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardThree.isDead())// Gaurd three's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your attack Strong
                            {
                                damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    }
                    if (attackTarget == 2)// Guard Two
                    {
                        System.out.println("You attack guard two.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardTwo.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardTwo.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardTwo.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                        }
                        if (!guardTwo.isDead())// Guard Two's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardFour.isDead())// Gaurd four's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Gaurd four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    } else if (attackTarget == 3)// Guard Three
                    {
                        System.out.println("You attack guard three.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardThree.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardThree.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardThree.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                        }
                        if (!guardThree.isDead())// Guard Three's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard three attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard three attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard three attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardFive.isDead())// Gaurd five's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Gaurd five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    } else if (attackTarget == 4)// Gaurd Four
                    {
                        System.out.println("You attack guard four.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardFour.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardFour.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardFour.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                        }
                        if (!guardFour.isDead())// Guard four's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard four attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardSix.isDead())// Gaurd six's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Gaurd six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    } else if (attackTarget == 5)// Gaurd Five
                    {
                        System.out.println("You attack guard five.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardFive.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardFive.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardFive.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                        }
                        if (!guardFive.isDead())// Guard five's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your a2ttack Strong
                            {
                                damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out.println(
                                        "Guard five attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardOne.isDead())// Gaurd one's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your attack Strong
                            {
                                damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    } else if (attackTarget == 6)// Gaurd Six
                    {
                        System.out.println("You attack guard six.");
                        if (attackType == 1)// Strong attack
                        {
                            System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                            guardSix.takeDamage(strong.getAttackDamage());
                            System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                        } else if (attackType == 2)// Standard attack
                        {
                            System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                            guardSix.takeDamage(standard.getAttackDamage());
                            System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                        } else if (attackType == 3)// Weak attack
                        {
                            System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                            guardSix.takeDamage(weak.getAttackDamage());
                            System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                        }
                        if (!guardSix.isDead())// Guard sixs's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your attack Strong
                            {
                                damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard six attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                        if (!guardTwo.isDead())// Gaurd two's turn
                        {
                            if (attackType == 1)// Determines attack buff based on your
                                                // attack Strong
                            {
                                damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 2)// Standard
                            {
                                damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Guard two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            } else if (attackType == 3)// Weak
                            {
                                damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                player.takeDamage(damageTaken);
                                System.out
                                        .println("Gaurd two attacks doing " + damageTaken + "dmg.");
                                System.out.println("You now have " + player.getHP() + "Hp.");
                            }
                        }
                    }

                    // Checks if gaurds are dead
                    if (!guardOne.isDead() || !guardTwo.isDead() || !guardThree.isDead()
                            || !guardFour.isDead() || !guardFive.isDead() || !guardSix.isDead())// If any gaurd is alive
                    {
                        guardsAreDead = false;
                    } else if (guardOne.isDead() && guardTwo.isDead() && guardThree.isDead()
                            && guardFour.isDead() && guardFive.isDead() && guardSix.isDead())// if all gaurds are dead
                    {
                        guardsAreDead = true;
                    }
                }
                if (guardsAreDead) {
                    do {
                        TownText.fightWinText();
                        choice = input.nextInt();
                    } while (choice != 1 || choice != 2);
                    if (choice == 1) {// Take from guards
                        artifactsFoundOnGuards = GeneralUtils
                                .randomNumber(TownConstants.ARTIFACTS_ON_GUARDS_UPPER_BOUND);
                        player.ChangeArtifacts(artifactsFoundOnGuards);
                        System.out.println(
                                "You found " + artifactsFoundOnGuards + " artifacts, you now have "
                                        + player.getArtifact() + " artifacts.");
                    } else if (choice == 2) {// Dont take from guards
                        System.out.println("You leave the guards and contimplate, ");
                    }
                    do {
                        System.out.print("Do I want to loot the town?");
                        System.out.println("1 = Yes.");
                        System.out.println("2 = No.");
                        choice = input.nextInt();
                    } while (!GeneralUtils.isAnOption(choice, 2));
                    if (choice == 1)// Yes
                    {
                        System.out.println("You are a bad person.");
                        player.kill();
                    } else if (choice == 2)// No
                    {
                        System.out.println(
                                "You resist temptation and leave the town and move on to your next adventure.");
                    }
                }
    }
}
