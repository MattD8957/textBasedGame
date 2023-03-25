package TextBasedGame;

import java.util.*;
import TextBasedGame.Characters.Player;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Events.Bar;
import TextBasedGame.Events.BearBattle;
import TextBasedGame.Events.DragonBattle;
import TextBasedGame.Events.GoblinBattle;
import TextBasedGame.Events.GuardFight;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Heal;
import TextBasedGame.Utilities.Constants.BarConstants;
import TextBasedGame.Utilities.Constants.BearConstants;
import TextBasedGame.Utilities.Constants.DoctorConstants;
import TextBasedGame.Utilities.Constants.DragonConstants;
import TextBasedGame.Utilities.Constants.GeneralConstants;
import TextBasedGame.Utilities.Constants.GoblinConstants;
import TextBasedGame.Utilities.Constants.NightConstants;
import TextBasedGame.Utilities.Constants.TownConstants;

public class Main {
    public static void main(String args[]) {
        // Character creation
        int CharacterHPCreation = 0;
        int CharacterMaxHPCreation = 0;
        int CharacterStandardAtackCreation = 0;
        int CharacterMaxAttackCreation = 0;
        int characterAttackStrongDMG = 0;
        int characterAttackStandardDMG = 0;
        int characterAttackWeakDMG = 0;
        int characterAttackStrongMaxDMG = 0;
        int characterAttackStandardMaxDMG = 0;
        int characterAttackWeakMaxDMG = 0;
        int characterAttackStrongPenalty = 10;
        int characterAttackStandardPenalty = 0;
        int characterAttackWeakPenalty = -10;
        // Enemy creation
        // Dragon
        int dragonHP = 1;
        int dragonAttack = 1;
        // Bear
        int bearHP = 0;
        int bearAttackDMG = 0;
        // Goblin
        int goblinLeaderDamage = 0;
        int goblinLeaderHealth = 0;
        int goblinFollowerCount = 0;
        int goblinFollowerHealth = 0;
        int goblinFollowerDamage = 0;
        // Rest of Game
        // Random
        String characterName; // gets the name the player wants for the player
        String moveOn = "Hi!"; // Player imputs when to continue
        int attackType = 0; // This is to choose your attack
        int attackTarget = 0; // decides who to attack
        int atk = 0; // This is the amount of damage added to attack damage
        int chosenClass = 0; // Players choice of Character
        int damageTaken = 0; // random amount of damage done to player for method
        int event = -1;// chooses which event will happen
        int lastEvent = -1; // This is to make sure the same event doesn't happen twice in a row
        boolean foughtOnce = false; // Checks if player has fought to give combat explanation
        boolean selectionFailed = false; // Checks if user input works
        int choice = 0; // Choice from user

        // Dragon
        int escapeChance = 0; // This is the chance out of 5 of events hapenning while escaping the
                              // dragon
        // Bear

        // Bar
        int blackSmithChoice; // Choice for what type of weapon upgrade
        int questChoice = 0; // Players choice of what quest to take
        int questChoiceRandomStuff;
        // Doctor
        int amountHealed = 0;// amount of HP added by the doctor
        int amountHealedOld = 0;
        // Goblins
        boolean goblinsAreDead = false; // Checks if goblin horde is dead for loop
        // Town
        int fine = 0; // Use to fine the player of artifacts
        int fightStart = 0; // Random to decide if a fight starts in jail
        int courtSentancing = 0; // The random that gives a sentance for the players crimes
        int artifactsFoundOnGuards = 0; // Use to award players for beating the guards
        boolean guardsAreDead = false; // Checks if gaurds are dead
        // Night
        int nightChance = 0;// FOr random Decisions

        // Create Classes
        // create Class Art
        ArtAndText art = new ArtAndText();
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Doctor
        Heal doc = new Heal(100);

        // Clears screen
        GeneralUtils.clearScreen();

        // entrance screen
        art.getWelcomeArt();
        chosenClass = scanner.nextInt();

        // Clears screen
        GeneralUtils.clearScreen();

        // Gets players name for Character then clears screen
        System.out.println("What would you like to name your Character?");
        characterName = scanner.next();
        GeneralUtils.clearScreen();
        switch (chosenClass) {
            case 1: // Rogue
                // Character Attributes
                CharacterHPCreation = 100;
                CharacterMaxHPCreation = 100;
                CharacterStandardAtackCreation = 15;
                CharacterMaxAttackCreation = 30;
                // Strong Attack Atributes
                characterAttackStrongDMG = 25;
                characterAttackStrongMaxDMG = 45;
                characterAttackStrongPenalty = 10;
                // Standard Attack Atributes
                characterAttackStandardDMG = 15;
                characterAttackStandardMaxDMG = 35;
                characterAttackStandardPenalty = 0;
                // Weak Attack Atributes
                characterAttackWeakDMG = 5;
                characterAttackWeakMaxDMG = 25;
                characterAttackWeakPenalty = -10;
                doc.setMaxHP(CharacterMaxHPCreation);
                art.getGameExplantionRogue();
                break;
            case 2: // Paladin
                // Character Attributes
                CharacterHPCreation = 125;
                CharacterMaxHPCreation = 125;
                CharacterStandardAtackCreation = 20;
                CharacterMaxAttackCreation = 45;
                // Strong Attack Atributes
                characterAttackStrongDMG = 30;
                characterAttackStrongMaxDMG = 50;
                characterAttackStrongPenalty = 15;
                // Standard Attack Atributes
                characterAttackStandardDMG = 20;
                characterAttackStandardMaxDMG = 40;
                characterAttackStandardPenalty = 5;
                // Weak Attack Atributes
                characterAttackWeakDMG = 10;
                characterAttackWeakMaxDMG = 30;
                characterAttackWeakPenalty = -5;
                doc.setMaxHP(CharacterMaxHPCreation);
                art.getGameExplantionPaladin();
                break;
            case 3: // Barbarian
                // Character Attributes
                CharacterHPCreation = 150;
                CharacterMaxHPCreation = 150;
                CharacterStandardAtackCreation = 25;
                CharacterMaxAttackCreation = 50;
                // Strong Attack Atributes
                characterAttackStrongDMG = 35;
                characterAttackStrongMaxDMG = 60;
                characterAttackStrongPenalty = 20;
                // Standard Attack Atributes
                characterAttackStandardDMG = 25;
                characterAttackStandardMaxDMG = 50;
                characterAttackStandardPenalty = 10;
                // Weak Attack Atributes
                characterAttackWeakDMG = 15;
                characterAttackWeakMaxDMG = 40;
                characterAttackWeakPenalty = 0;
                doc.setMaxHP(CharacterMaxHPCreation);
                art.getGameExplantionBarbarian();
                break;
            default:
                art.getFailedToMakeSelection();
                System.exit(0);
                break;
        }
        // CREATE the Character
        Player player = new Player(CharacterHPCreation, CharacterMaxHPCreation, characterName,
                CharacterStandardAtackCreation, CharacterMaxAttackCreation);
        Attack strong = new Attack(characterAttackStrongDMG, characterAttackStrongMaxDMG,
                characterAttackStrongPenalty); // Damage, Max damage, weakness
        Attack standard = new Attack(characterAttackStandardDMG, characterAttackStandardMaxDMG,
                characterAttackStandardPenalty); // Damage, Max damage, weakness
        Attack weak = new Attack(characterAttackWeakDMG, characterAttackWeakMaxDMG,
                characterAttackWeakPenalty); // Damage, Max damage, weakness
        doc.setMaxHP(player.getMaxHP());

        // Information for player at start of game TODO Decide on amount of artifacts Now in each
        // class if statement
        // Wait until player presses a button
        moveOn = scanner.next();
        // Clears screen
        GeneralUtils.clearScreen();

        // Start game loop
        while (!player.isDead()) {
            GeneralUtils.pause(3);

            do {
                event = GeneralUtils.randomNumber(GeneralConstants.EVENT_UPPER_BOUND);
            } while (event == lastEvent);
            lastEvent = event;

            if (player.getHP() <= 30) { // To make game more fun
                event = 3;
            }
            // GeneralUtils.clearScreen();
            // EVENTS
            switch (event) {
                case 0: // Fight dragon
                    // Start text and picture
                    art.getDragonArt();
                    choice = scanner.nextInt();
                    if (choice == 1) {// 1 For escape
                        // 1 in 5 chance of freedom
                        // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                        // 2 in 5 chance of waking the dragon and having to fight it - if you win
                        // you still get the treasure
                        escapeChance = GeneralUtils
                                .randomNumber(DragonConstants.ESCAPE_CHANCE_UPPER_BOUND);
                        if (escapeChance == 0) {// escape succesfully
                            DragonBattle.escaped();
                        } else if ((escapeChance == 1) || (escapeChance == 2)) {// trip and take
                                                                                // some damage 1 to
                                                                                // 10
                            damageTaken = GeneralUtils
                                    .randomNumber(DragonConstants.ESCAPE_DMG_UPPER_BOUND);
                            DragonBattle.tripThenEscape(damageTaken, player.getHP());
                            player.takeDamage(damageTaken);
                        } else if ((escapeChance == 3) || (escapeChance == 4)) {// You fail to
                                                                                // escape and have
                                                                                // to fight the
                                                                                // dragon
                            art.getFailedToEscapeText();// Message after failing to escape
                            // Goes to the battle
                        }
                    }
                    if ((choice == 2) || (escapeChance == 3) || (escapeChance == 4)) {// To rob the
                                                                                      // dragon
                        if (!foughtOnce) {
                            art.getCombatExplanation();
                        }
                        GeneralUtils.pause(1);
                        dragonHP = GeneralUtils.randomNumber(DragonConstants.HP_UPPER_BOUND) + 10;// Dragon
                                                                                                  // health
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 75
                        dragonAttack =
                                GeneralUtils.randomNumber(DragonConstants.ATTACK_DMG_UPPER_BOUND)
                                        + 20; // Generates dragon attack dmg 20 - 35
                        Enemy dragon = new Enemy(dragonHP, dragonAttack); // Create Dragon HP 10 -
                                                                          // 75, Attack dmg 20 - 35

                        while (!player.isDead() && !dragon.isDead()) {
                            System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                            art.getAttackTypeChoiceText();
                            attackType = scanner.nextInt();
                            if (attackType == 1) {
                                DragonBattle.characterAttackStrengthOne(strong.getAttackDamage(),
                                        dragon.getHP());
                                dragon.takeDamage(strong.getAttackDamage());
                            } else if (attackType == 2) {
                                DragonBattle.characterAttackStrengthTwo(standard.getAttackDamage(),
                                        dragon.getHP());
                                dragon.takeDamage(standard.getAttackDamage());
                            } else if (attackType == 3) {
                                DragonBattle.characterAttackStrengthThree(weak.getAttackDamage(),
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
                                DragonBattle.endRoundtext(damageTaken, player.getHP());
                            }
                        }
                        if (dragon.isDead()) {// After loop ends if Dragon died
                            player.increaseArtifacts(1);
                            foughtOnce = true;
                            DragonBattle.finalText(player.getArtifact());
                        }
                    } else if (!(choice == 1)) {// type a number or letter that is not an option
                        art.getFailedToMakeSelection();
                        player.kill();// set health to 0 to end loop
                    }
                    break;
                case 1: // Fight Bear
                    art.getBearInitialText();
                    if (!foughtOnce) {
                        art.getCombatExplanation();
                    }
                    // Create bear
                    bearHP = GeneralUtils.randomNumber(BearConstants.HP_UPPER_BOUND);
                    bearHP += 20;// bear health 20 - 45
                    bearAttackDMG = GeneralUtils.randomNumber(BearConstants.ATTACK_DMG_UPPER_BOUND);
                    bearAttackDMG += 10;// bears do 10 to 20 dmg
                    Enemy bear = new Enemy(bearHP, bearAttackDMG); // HP then attack dmg

                    while (!player.isDead() && !bear.isDead()) {
                        System.out.println("The bear has " + bear.getHP() + " HP.");
                        art.getAttackTypeChoiceText();
                        attackType = scanner.nextInt();
                        if (attackType == 1) {
                            BearBattle.characterAttackStrengthOne(strong.getAttackDamage(),
                                    bear.getHP());
                            bear.takeDamage(strong.getAttackDamage());
                        } else if (attackType == 2) {
                            BearBattle.characterAttackStrengthTwo(standard.getAttackDamage(),
                                    bear.getHP());
                            bear.takeDamage(standard.getAttackDamage());
                        } else if (attackType == 3) {
                            BearBattle.characterAttackStrengthThree(weak.getAttackDamage(),
                                    bear.getHP());
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
                            BearBattle.bearTurnText(damageTaken, player.getHP());
                        }
                    }
                    if (bear.isDead()) {// After loop ends if Bear died
                        player.increaseArtifacts(BearConstants.ARTIFACTS_COLLECTION_AMOUNT);
                        art.getBeatBearText(player.getArtifact());
                        foughtOnce = true;
                    }
                    break;
                case 2: // Go into a bar
                    art.getBarText();
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1: // Start a brawl
                            damageTaken = GeneralUtils
                                    .randomNumber(BarConstants.FIGHT_DMG_TAKEN_UPPER_BOUND);
                            Bar.barBrawl(damageTaken, player.getHP());
                            player.takeDamage(damageTaken);
                            break;
                        case 2: // Buy a weapon
                            art.getBlackSmithText();
                            System.out.println(
                                    "You currently have: " + player.getArtifact() + " artifacts.");
                            blackSmithChoice = scanner.nextInt();
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
                                if (player.getAttack() <= player.getMaxAttack()) { // If not over
                                                                                   // max attack
                                                                                   // damage state
                                                                                   // attack damage
                                    System.out.println("New attack damage: " + player.getAttack());
                                } else if (player.getAttack() > player.getMaxAttack()) { // If over
                                                                                         // max
                                                                                         // attack
                                                                                         // damage
                                                                                         // set to
                                                                                         // max
                                                                                         // attack
                                                                                         // damage
                                                                                         // and then
                                                                                         // state
                                                                                         // attack
                                                                                         // damage
                                    player.setMaxAttack();
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
                                if (player.getAttack() <= player.getMaxAttack()) { // If not over
                                                                                   // max attack
                                                                                   // damage state
                                                                                   // attack damage
                                    System.out.println("New attack damage: " + player.getAttack());
                                } else if (player.getAttack() > player.getMaxAttack()) { // If over
                                                                                         // max
                                                                                         // attack
                                                                                         // damage
                                                                                         // set to
                                                                                         // max
                                                                                         // attack
                                                                                         // damage
                                                                                         // and then
                                                                                         // state
                                                                                         // attack
                                                                                         // damage
                                    player.setMaxAttack();
                                    strong.setMaxAttackDamage();
                                    standard.setMaxAttackDamage();
                                    weak.setMaxAttackDamage();
                                    System.out.println("New attack damage " + player.getAttack());
                                }
                            } else {
                                art.getFailedToMakeSelection();
                                player.kill();
                            }
                            break;
                        case 3: // Get quest from guards
                            // TODO Finish this
                            art.getguardQuestText();
                            questChoice = scanner.nextInt();
                            if (questChoice == 1) {// Defeat smugiling group

                            } else if (questChoice == 2) {// Defeat Evil king
                                art.getBarQuestTwoText();
                                // Defeat the Evil king


                                questChoiceRandomStuff = scanner.nextInt();
                                if (questChoiceRandomStuff == 1) {

                                } else if (questChoiceRandomStuff == 2) {

                                } else if (questChoiceRandomStuff == 3) {

                                } else {
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (questChoice == 3) {// TODO figure out what goes here

                            } else if (questChoice == 4) {// Don't want any of the quests
                                art.getBarNoQuestText();
                            } else {
                                art.getFailedToMakeSelection();
                                player.kill();// set health to 0 to end loop
                            }
                            break;
                        default: // type a number or letter that is not an option
                            art.getFailedToMakeSelection();
                            player.kill();// set health to 0 to end loop
                            break;
                    }
                    break;
                case 3: // Go to a doctor
                    art.getDoctorInitialText(player.getHP());
                    choice = scanner.nextInt();
                    GeneralUtils.pause(3);
                    if (choice == 1) {
                        // decide on amount healed 10 - 40
                        amountHealed =
                                GeneralUtils.randomNumber(DoctorConstants.AMOUNT_HEALED_UPPER_BOUND)
                                        + 10;
                    } else if (choice == 2) {
                        amountHealed = DoctorConstants.AMOUNT_HEALED_PAYED;
                    }
                    amountHealed = doc.heal(player.getHP(), amountHealed);
                    player.heal(amountHealed);
                    doc.doctorOutputText(player.getHP(), amountHealed);
                    break;
                case 4: // Goblin horde
                    art.getGoblinInitialText();
                    // Create the goblins
                    // Create leader Goblin
                    goblinLeaderDamage =
                            GeneralUtils.randomNumber(GoblinConstants.LEADER_DMG_UPPER_BOUND) + 10;
                    goblinLeaderHealth =
                            GeneralUtils.randomNumber(GoblinConstants.LEADER_HEALTH_UPPER_BOUND)
                                    + 20; // 20 - 45 HP
                    Enemy goblinLeader = new Enemy(goblinLeaderHealth, goblinLeaderDamage);// Hp,
                                                                                           // Attack,
                                                                                           // dmg

                    // Random number to get amount of follower goblins
                    goblinFollowerCount =
                            GeneralUtils.randomNumber(GoblinConstants.FOLLWER_COUNT_UPPER_BOUND);
                    goblinFollowerCount++;// Makes range 1 - 3
                    if (goblinFollowerCount == 1) {// If 1 follower
                        // Creates follower goblin one
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                 // health
                                                                                                 // range
                                                                                                 // to
                                                                                                 // 10
                                                                                                 // -
                                                                                                 // 20
                        Enemy goblinFollowerOne =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 1
                        // Start fight Same in every if statment for amount of followers
                        // Fighting Explanation
                        if (!foughtOnce) {
                            art.getCombatExplanation();
                        }
                        // Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(),
                                goblinFollowerOne.getHP());
                        while (!player.isDead() && !goblinsAreDead) {
                            art.getGoblinFightTargetTextTwo(); // Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackType = scanner.nextInt();
                            if (attackTarget == 1) {// Leader
                                art.getGoblinLeaderTargetText();
                                if (attackType == 1) {// Strong attack
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2) {// standard attack
                                    GoblinBattle.goblinLeaderAttackStrong(
                                            standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3) {// Weak attack
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                } else {// improper selection
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (attackTarget == 2) {// Follower 1
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if (attackType == 1) {// Strong attack
                                    GoblinBattle.goblinFollowerOneAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2) {// standard attack
                                    GoblinBattle.goblinFollowerOneAttackStandard(
                                            standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3) {// Weak attack
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                                            goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                } else {// improper selection
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else {// improper selection
                                art.getFailedToMakeSelection();
                                player.kill();// set health to 0 to end loop
                            }
                            // Goblins turn
                            if (!goblinLeader.isDead()) {
                                // To determine which attack was used and so what buff
                                if (attackType == 1) {// Strong attack
                                    damageTaken =
                                            goblinLeader.getAttack() + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2) {// Standard attack
                                    damageTaken =
                                            goblinLeader.getAttack() + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3) {// Weak attack
                                    damageTaken =
                                            goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0) {// Positive attack
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0) {// negative attack
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, player.getHP());
                            }
                            if (!goblinFollowerOne.isDead()) {// Goblin Follower 1's turn
                                // To determine which attack was used and so what buff
                                if (attackType == 1) {// Strong attack
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2) {// Standard attack
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3) {// Weak attack
                                    damageTaken =
                                            goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0) {// Positive attack
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0) {// negative attack
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            // add extras
                            if (!goblinLeader.isDead() || !goblinFollowerOne.isDead()) {// If any
                                                                                        // goblin is
                                                                                        // alive
                                goblinsAreDead = false;
                            } else if (goblinLeader.isDead() && goblinFollowerOne.isDead()) {// if
                                                                                             // all
                                                                                             // goblins
                                                                                             // are
                                                                                             // dead
                                goblinsAreDead = true;
                            }
                        }
                    } else if (goblinFollowerCount == 2) {// If 2 followers
                        // Creates follower goblin one
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                 // health
                                                                                                 // range
                                                                                                 // to
                                                                                                 // 10
                                                                                                 // -
                                                                                                 // 20
                        Enemy goblinFollowerOne =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 1
                        // Creates follower goblin two
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                 // health
                                                                                                 // range
                                                                                                 // to
                                                                                                 // 10
                                                                                                 // -
                                                                                                 // 20
                        Enemy goblinFollowerTwo =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 2

                        // Fighting Explanation
                        if (!foughtOnce) {
                            art.getCombatExplanation();
                        }
                        // Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(),
                                goblinFollowerOne.getHP(), goblinFollowerTwo.getHP());
                        while (!player.isDead() && !goblinsAreDead) {
                            art.getGoblinFightTargetTextThree(); // Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackType = scanner.nextInt();
                            if (attackTarget == 1)// Leader
                            {
                                System.out.println(ArtAndText.goblinLeaderTargetText);
                                if (attackType == 1) {// Strong attack
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2) {// standard attack
                                    GoblinBattle.goblinLeaderAttackStrong(
                                            standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3) {// Weak attack
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                } else {// improper selection
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (attackTarget == 2) {// Follower 1
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if (attackType == 1) {// Strong attack
                                    GoblinBattle.goblinFollowerOneAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackStandard(
                                            standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                                            goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                } else// improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (attackTarget == 3) // Follower 2
                            {
                                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                                if (attackType == 1)// Strong attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStandard(
                                            standard.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackWeak(weak.getAttackDamage(),
                                            goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                }
                            } else// improper selection
                            {
                                art.getFailedToMakeSelection();
                                player.kill();// set health to 0 to end loop
                            }
                            // Goblins turn
                            if (!goblinLeader.isDead()) {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, player.getHP());
                            }
                            if (!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            if (!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerTwoTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            // add extras
                            if (!goblinLeader.isDead() || !goblinFollowerOne.isDead()
                                    || !goblinFollowerTwo.isDead())// If any goblin is alive
                            {
                                goblinsAreDead = false;
                            } else if (goblinLeader.isDead() && goblinFollowerOne.isDead()
                                    && goblinFollowerTwo.isDead())// if all goblins are dead
                            {
                                goblinsAreDead = true;
                            }
                        }
                    } else if (goblinFollowerCount == 3) {// If 3 followers
                        // Creates follower goblin one
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                 // health
                                                                                                 // range
                                                                                                 // to
                                                                                                 // 10
                                                                                                 // -
                                                                                                 // 20
                        Enemy goblinFollowerOne =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 1
                        // Creates follower goblin two
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                 // health
                                                                                                 // range
                                                                                                 // to
                                                                                                 // 10
                                                                                                 // -
                                                                                                 // 20
                        Enemy goblinFollowerTwo =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 2
                        // Creates follower goblin three
                        goblinFollowerDamage =
                                GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND)
                                        + 10; // Changes damage range to 10 - 15
                        goblinFollowerHealth = GeneralUtils
                                .randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 7; // Changes
                                                                                                // health
                                                                                                // range
                                                                                                // to
                                                                                                // 7
                                                                                                // -
                                                                                                // 17
                        Enemy goblinFollowerThree =
                                new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                       // Goblin
                                                                                       // follower 3

                        // Fighting Explanation
                        if (!foughtOnce) {
                            art.getCombatExplanation();
                        }
                        // Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(),
                                goblinFollowerOne.getHP(), goblinFollowerTwo.getHP(),
                                goblinFollowerThree.getHP());
                        while (!player.isDead() && !goblinsAreDead) {
                            art.getGoblinFightTargetTextFour(); // Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackType = scanner.nextInt();
                            if (attackTarget == 1)// Leader
                            {
                                System.out.println(ArtAndText.goblinLeaderTargetText);
                                if (attackType == 1)// Strong attack
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(
                                            standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(),
                                            goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                } else// improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (attackTarget == 2) // Follower 1
                            {
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if (attackType == 1)// Strong attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackStandard(
                                            standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                                            goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                } else// improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    player.kill();// set health to 0 to end loop
                                }
                            } else if (attackTarget == 3) // Follower 2
                            {
                                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                                if (attackType == 1)// Strong attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStandard(
                                            standard.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackWeak(weak.getAttackDamage(),
                                            goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                }
                            } else if (attackTarget == 4) // Follower 3
                            {
                                System.out.println(ArtAndText.goblinFollowerThreeTargetText);
                                if (attackType == 1)// Strong attack
                                {
                                    GoblinBattle.goblinFollowerThreeAttackStrong(
                                            strong.getAttackDamage(), goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(strong.getAttackDamage());
                                } else if (attackType == 2)// standard attack
                                {
                                    GoblinBattle.goblinFollowerThreeAttackStandard(
                                            standard.getAttackDamage(),
                                            goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(standard.getAttackDamage());
                                } else if (attackType == 3)// Weak attack
                                {
                                    GoblinBattle.goblinFollowerThreeAttackWeak(
                                            weak.getAttackDamage(), goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(weak.getAttackDamage());
                                }
                            } else// improper selection
                            {
                                art.getFailedToMakeSelection();
                                player.kill();// set health to 0 to end loop
                            }
                            // Goblins turn
                            if (!goblinLeader.isDead()) {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, player.getHP());
                            }
                            if (!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            if (!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken =
                                            goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerTwoTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            if (!goblinFollowerThree.isDead())// Goblin Follower 3's turn
                            {
                                // To determine which attack was used and so what buff
                                if (attackType == 1)// Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack()
                                            + strong.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 2)// Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack()
                                            + standard.getAttackPenalty();
                                    player.takeDamage(damageTaken);
                                } else if (attackType == 3)// Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack()
                                            + weak.getAttackPenalty();
                                    if (damageTaken >= 0)// Positive attack
                                    {
                                        player.takeDamage(damageTaken);
                                    } else if (damageTaken < 0)// negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerThreeTurnOutPut(damageTaken,
                                        player.getHP());
                            }
                            // add extras
                            if (!goblinLeader.isDead() || !goblinFollowerOne.isDead()
                                    || !goblinFollowerTwo.isDead() || !goblinFollowerThree.isDead())// If
                                                                                                    // any
                                                                                                    // goblin
                                                                                                    // is
                                                                                                    // alive
                            {
                                goblinsAreDead = false;
                            } else if (goblinLeader.isDead() && goblinFollowerOne.isDead()
                                    && goblinFollowerTwo.isDead() && goblinFollowerThree.isDead())// if
                                                                                                  // all
                                                                                                  // goblins
                                                                                                  // are
                                                                                                  // dead
                            {
                                goblinsAreDead = true;
                            }
                        }
                    }
                    if (goblinsAreDead) {// Reward
                        player.increaseArtifacts(GoblinConstants.WIN_ARTIFACTS_REWARD);
                        GoblinBattle.winText(player.getArtifact());
                    }
                    break;
                case 5: // Fight guards
                    GuardFight.initialEventText();
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1: // Go willingly
                            GuardFight.goPeacefulText();
                            // Random to decide if fight starts 1 in 6 it does
                            fightStart = GeneralUtils
                                    .randomNumber(TownConstants.JAIL_CHANCE_FIGHT_UPPER_BOUND);
                            if (fightStart == 0)// If var = 0 then start fight if not continue
                            {
                                damageTaken = GeneralUtils.randomNumber(
                                        TownConstants.JAIL_FIGHT_DMG_TAKEN_UPPER_BOUND);
                                player.takeDamage(damageTaken);
                                GuardFight.jailFight(damageTaken, player.getHP());
                            } else if ((fightStart >= 1) && (fightStart <= 5)) {
                                System.out.println("Your stay was uneventful.");
                            }
                            // Random to get sentance
                            courtSentancing = GeneralUtils
                                    .randomNumber(TownConstants.COURT_SENTANCING_UPPER_BOUND);
                            GuardFight.afterJailText();

                            if ((courtSentancing >= 0) && (courtSentancing <= 14))// Fine
                            {
                                fine = -1
                                        * GeneralUtils.randomNumber(TownConstants.FINE_UPPER_BOUND);
                                player.increaseArtifacts(fine);
                                GuardFight.fine(fine, player.getArtifact());
                            } else if ((courtSentancing >= 15) && (courtSentancing <= 24))// Jail 0
                                                                                          // - 10
                            {
                                damageTaken = GeneralUtils.randomNumber(
                                        TownConstants.DMG_TAKEN_FROM_JAIL_UPPER_BOUND);
                                GuardFight.jail(damageTaken, player.getHP());
                                player.takeDamage(damageTaken);
                                GeneralUtils.pause(5);
                            } else if ((courtSentancing >= 25) && (courtSentancing <= 29))// Fine
                                                                                          // and
                                                                                          // Jail
                            {
                                // Fine
                                fine = -1
                                        * GeneralUtils.randomNumber(TownConstants.FINE_UPPER_BOUND);
                                player.increaseArtifacts(fine);
                                GuardFight.fine(fine, player.getArtifact());
                                // Jail
                                damageTaken = GeneralUtils.randomNumber(
                                        TownConstants.DMG_TAKEN_FROM_JAIL_UPPER_BOUND);
                                GuardFight.jail(damageTaken, player.getHP());
                                player.takeDamage(damageTaken);
                                GeneralUtils.pause(3);
                            } else if (courtSentancing == 30)// Execution
                            {
                                GuardFight.executionText();
                                player.kill();
                            }
                            break;
                        case 2: // Beg for mercy
                            GeneralUtils.clearScreen();
                            System.out.println("You beg for mercy.");
                            System.out.println(
                                    "They decide to be leniant and give you a fine of 3 artifacts instead.");
                            if (player.getArtifact() > 3) { // Checks you have enough to pay
                                player.increaseArtifacts(-3);
                                System.out.println(
                                        "You now have " + player.getArtifact() + " artifacts.");
                            } else if (player.getArtifact() < 3) {
                                System.out.println("You could not pay the fine.");
                                player.kill();
                            }
                            break;
                        case 3: // Fight back
                            System.out.println("You decide to fight back.");
                            Enemy guardOne = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);// Hp, attack
                            Enemy guardTwo = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);
                            Enemy guardThree = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);
                            Enemy guardFour = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);
                            Enemy guardFive = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);
                            Enemy guardSix = new Enemy(TownConstants.GUARD_HEALTH,
                                    TownConstants.GUARD_ATTACK);
                            GeneralUtils.pause(1);
                            // Explanation for player at start of battle
                            // Clear screen
                            GeneralUtils.clearScreen();
                            if (!foughtOnce) {
                                art.getCombatExplanation();
                            }
                            while (!player.isDead() && !guardsAreDead) {
                                GuardFight.initialFightText();

                                attackTarget = scanner.nextInt();
                                art.getAttackTypeChoiceText();
                                attackType = scanner.nextInt();
                                if (attackTarget == 1)// Guard one
                                {
                                    System.out.println("You attack guard one.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardOne.takeDamage(strong.getAttackDamage());
                                        System.out.println(
                                                "Guard one now has " + guardOne.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardOne.takeDamage(standard.getAttackDamage());
                                        System.out.println(
                                                "Guard one now has " + guardOne.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardOne.takeDamage(weak.getAttackDamage());
                                        System.out.println(
                                                "Guard one now has " + guardOne.getHP() + "Hp.");
                                    }
                                    if (!guardOne.isDead())// Guard One's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardOne.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardOne.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardOne.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardThree.isDead())// Gaurd three's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                }
                                if (attackTarget == 2)// Guard Two
                                {
                                    System.out.println("You attack guard two.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardTwo.takeDamage(strong.getAttackDamage());
                                        System.out.println(
                                                "Guard two now has " + guardTwo.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardTwo.takeDamage(standard.getAttackDamage());
                                        System.out.println(
                                                "Guard two now has " + guardTwo.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardTwo.takeDamage(weak.getAttackDamage());
                                        System.out.println(
                                                "Guard two now has " + guardTwo.getHP() + "Hp.");
                                    }
                                    if (!guardTwo.isDead())// Guard Two's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardTwo.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardTwo.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardTwo.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardFour.isDead())// Gaurd four's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardFour.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardFour.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardFour.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                } else if (attackTarget == 3)// Guard Three
                                {
                                    System.out.println("You attack guard three.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardThree.takeDamage(strong.getAttackDamage());
                                        System.out.println("Guard three now has "
                                                + guardThree.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardThree.takeDamage(standard.getAttackDamage());
                                        System.out.println("Guard three now has "
                                                + guardThree.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardThree.takeDamage(weak.getAttackDamage());
                                        System.out.println("Guard three now has "
                                                + guardThree.getHP() + "Hp.");
                                    }
                                    if (!guardThree.isDead())// Guard Three's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard three attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard three attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken = guardThree.getAttack()
                                                    + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard three attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardFive.isDead())// Gaurd five's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardFive.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardFive.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardFive.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                } else if (attackTarget == 4)// Gaurd Four
                                {
                                    System.out.println("You attack guard four.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardFour.takeDamage(strong.getAttackDamage());
                                        System.out.println(
                                                "Guard four now has " + guardFour.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardFour.takeDamage(standard.getAttackDamage());
                                        System.out.println(
                                                "Guard four now has " + guardFour.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardFour.takeDamage(weak.getAttackDamage());
                                        System.out.println(
                                                "Guard four now has " + guardFour.getHP() + "Hp.");
                                    }
                                    if (!guardFour.isDead())// Guard four's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardFour.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardFour.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardFour.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard four attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardSix.isDead())// Gaurd six's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardSix.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardSix.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardSix.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                } else if (attackTarget == 5)// Gaurd Five
                                {
                                    System.out.println("You attack guard five.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardFive.takeDamage(strong.getAttackDamage());
                                        System.out.println(
                                                "Guard five now has " + guardFive.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardFive.takeDamage(standard.getAttackDamage());
                                        System.out.println(
                                                "Guard five now has " + guardFive.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardFive.takeDamage(weak.getAttackDamage());
                                        System.out.println(
                                                "Guard five now has " + guardFive.getHP() + "Hp.");
                                    }
                                    if (!guardFive.isDead())// Guard five's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardFive.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardFive.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardFive.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard five attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardOne.isDead())// Gaurd one's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardOne.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardOne.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardOne.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd one attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                } else if (attackTarget == 6)// Gaurd Six
                                {
                                    System.out.println("You attack guard six.");
                                    if (attackType == 1)// Strong attack
                                    {
                                        System.out.println(
                                                "You do " + strong.getAttackDamage() + "dmg.");
                                        guardSix.takeDamage(strong.getAttackDamage());
                                        System.out.println(
                                                "Guard six now has " + guardSix.getHP() + "Hp.");
                                    } else if (attackType == 2)// Standard attack
                                    {
                                        System.out.println(
                                                "You do " + standard.getAttackDamage() + "dmg.");
                                        guardSix.takeDamage(standard.getAttackDamage());
                                        System.out.println(
                                                "Guard six now has " + guardSix.getHP() + "Hp.");
                                    } else if (attackType == 3)// Weak attack
                                    {
                                        System.out.println(
                                                "You do " + weak.getAttackDamage() + "dmg.");
                                        guardSix.takeDamage(weak.getAttackDamage());
                                        System.out.println(
                                                "Guard six now has " + guardSix.getHP() + "Hp.");
                                    }
                                    if (!guardSix.isDead())// Guard sixs's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardSix.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardSix.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardSix.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard six attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                    if (!guardTwo.isDead())// Gaurd two's turn
                                    {
                                        if (attackType == 1)// Determines attack buff based on your
                                                            // attack Strong
                                        {
                                            damageTaken = guardTwo.getAttack()
                                                    + strong.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 2)// Standard
                                        {
                                            damageTaken = guardTwo.getAttack()
                                                    + standard.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Guard two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        } else if (attackType == 3)// Weak
                                        {
                                            damageTaken =
                                                    guardTwo.getAttack() + weak.getAttackPenalty();
                                            player.takeDamage(damageTaken);
                                            System.out.println("Gaurd two attacks doing "
                                                    + damageTaken + "dmg.");
                                            System.out.println(
                                                    "You now have " + player.getHP() + "Hp.");
                                        }
                                    }
                                }

                                // Checks if gaurds are dead
                                if (!guardOne.isDead() || !guardTwo.isDead() || !guardThree.isDead()
                                        || !guardFour.isDead() || !guardFive.isDead()
                                        || !guardSix.isDead())// If any gaurd is alive
                                {
                                    guardsAreDead = false;
                                } else if (guardOne.isDead() && guardTwo.isDead()
                                        && guardThree.isDead() && guardFour.isDead()
                                        && guardFive.isDead() && guardSix.isDead())// if all gaurds
                                                                                   // are dead
                                {
                                    guardsAreDead = true;
                                }
                            }
                            if (guardsAreDead) {
                                GuardFight.fightWinText();
                                choice = scanner.nextInt();
                                if (choice == 1) {// Take from guards
                                    artifactsFoundOnGuards = GeneralUtils.randomNumber(
                                            TownConstants.ARTIFACTS_ON_GUARDS_UPPER_BOUND);
                                    player.increaseArtifacts(artifactsFoundOnGuards);
                                    System.out.println("You found " + artifactsFoundOnGuards
                                            + " artifacts, you now have " + player.getArtifact()
                                            + " artifacts.");
                                } else if (choice == 2) {// Dont take from guards
                                    System.out.println("You leave the guards and contimplate, ");
                                }
                                System.out.print("Do I want to loot the town?");
                                System.out.println("1 = Yes.");
                                System.out.println("2 = No.");
                                choice = scanner.nextInt();
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
                            break;
                        default:
                            art.getFailedToMakeSelection();
                            player.kill();// set health to 0 to end loop
                            break;
                    }
                    break;
                case 6: // Night ADD variety
                    art.getNightInitialText(player.getArtifact());
                    choice = scanner.nextInt();// Town Extra damage
                    if (choice == 1) { // Town Extra damage
                        if ((player.getArtifact() - 1) > 0) {
                            player.increaseArtifacts(-1);
                            art.getNightChoiceOneNightText();
                            GeneralUtils.pause(3);
                            atk = GeneralUtils.randomNumber(
                                    NightConstants.CHOICE_ONE_ATTACK_INCREASE_UPPER_BOUND) + 1; // Increase
                            // attack
                            // by 1-5
                            art.getNightChoiceOneMorningText(atk);
                            player.increaseAttack(atk);
                        } else {
                            System.out.println("You don't have enough artifacts for that.");
                            choice = 2;
                        }
                    }
                    if (choice == 2) {// Tree Dangerous
                        art.getNightChoiceTwoNightText();
                        GeneralUtils.pause(3);
                        damageTaken = GeneralUtils
                                .randomNumber(NightConstants.CHOICE_ONE_DMG_TAKEN_UPPER_BOUND) + 1;
                        switch (GeneralUtils.randomNumber(NightConstants.CHOICE_TWO_EVENT_CHOICE)) {
                            case 0: // Cold
                                art.getNightChoiceTwoMorningColdText(damageTaken);
                                break;
                            case 1: // Animal
                                art.getNightChoiceTwoMorningAnimalText(damageTaken, characterName);
                                break;
                            case 2: // ?
                                art.getNightChoiceTwoMorningFigureOutText(damageTaken);
                                break;
                        }
                        player.takeDamage(damageTaken);
                    }
                    break;
                default:
                    System.out.println("ERROR not a valid event");
                    System.exit(3);
            }

            // Win screen
            if (player.getArtifact() >= GeneralConstants.TREASURE_TO_WIN) {// If you collect 50
                                                                           // treasures
                GeneralUtils.clearScreen();
                System.out.println("Congratulations " + characterName);
                GeneralUtils.pause(3);
                // Win screen
                art.getYouWin();
                art.getEndingText();
                // End program
                System.exit(1);
            }
        }
        // Death screen
        {
            GeneralUtils.pause(3);
            // Clear screen
            GeneralUtils.clearScreen();
            // Death screen
            art.getYouDied();
            art.getEndingText();
            // End program
            System.exit(2);
        }
        System.out.println("Hi");
        System.out.println(moveOn);
        art.getEndingText();
        scanner.close();
    }
}
