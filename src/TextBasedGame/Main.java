package TextBasedGame;

import java.util.*;
import org.junit.platform.reporting.shadow.org.opentest4j.reporting.events.root.Events;
import TextBasedGame.Characters.Player;
import TextBasedGame.Characters.Enemy;
import TextBasedGame.Events.Bar;
import TextBasedGame.Events.GuardFight;
import TextBasedGame.Events.Bear.Bear;
import TextBasedGame.Events.Bear.BearText;
import TextBasedGame.Events.DragonBattle.DragonBattle;
import TextBasedGame.Events.DragonBattle.DragonBattleText;
import TextBasedGame.Events.GoblinBattle.GoblinBattleSuper;
import TextBasedGame.Events.Night.Night;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Heal;
import TextBasedGame.Utilities.Constants.BarConstants;
import TextBasedGame.Utilities.Constants.BearConstants;
import TextBasedGame.Utilities.Constants.DoctorConstants;
import TextBasedGame.Utilities.Constants.DragonConstants;
import TextBasedGame.Utilities.Constants.GeneralConstants;
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
        int escapeChance = 0; // This is the chance out of 5 of events hapenning while escaping the dragon
        // Bear

        // Bar
        int blackSmithChoice; // Choice for what type of weapon upgrade
        int questChoice = 0; // Players choice of what quest to take
        int questChoiceRandomStuff;
        // Doctor
        int amountHealed = 0;// amount of HP added by the doctor
        int amountHealedOld = 0;
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
        Player player = new Player(CharacterHPCreation, CharacterMaxHPCreation, characterName);
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
        GeneralUtils.clearScreen();

        // Start game loop
        while (!player.isDead()) {
            GeneralUtils.pause(3);
            do {
                event = GeneralUtils.randomNumber(GeneralConstants.EVENT_UPPER_BOUND);
            } while (event == lastEvent);
            lastEvent = event;

            if (player.getHP() <= 20) { // To make game more fun
                event = 3;
            }
            GeneralUtils.clearScreen();
            // EVENTS
            switch (event) {
                case 0: // Fight dragon
                    DragonBattle dragon = new DragonBattle(player, foughtOnce, strong, standard, weak);
                    dragon.dragon();
                    break;
                case 1: // Fight Bear
                        Bear bear = new Bear(player, foughtOnce, strong, standard, weak);
                        bear.bear();
                    break;
                case 2: // Go into a bar
                    do{
                    art.getBarText();
                    choice = scanner.nextInt();
                    } while (!GeneralUtils.isAnOption(choice, 3));
                    switch (choice) {
                        case 1: // Start a brawl
                            damageTaken = GeneralUtils
                                    .randomNumber(BarConstants.FIGHT_DMG_TAKEN_UPPER_BOUND);
                            Bar.barBrawl(damageTaken, player.getHP());
                            player.takeDamage(damageTaken);
                            break;
                        case 2: // Buy a weapon
                            do{
                            art.getBlackSmithText();
                            System.out.println(
                                    "You currently have: " + player.getArtifact() + " artifacts.");
                            blackSmithChoice = scanner.nextInt();
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
                            break;
                        case 3: // Get quest from guards
                            // TODO Finish this
                            do{
                            art.getguardQuestText();
                            questChoice = scanner.nextInt();
                            } while (!GeneralUtils.isAnOption(questChoice, 4));
                            if (questChoice == 1) {// Defeat smugiling group

                            } else if (questChoice == 2) {// Defeat Evil king
                                do{
                                art.getBarQuestTwoText();
                                // Defeat the Evil king
                                questChoiceRandomStuff = scanner.nextInt();
                                } while (!GeneralUtils.isAnOption(questChoiceRandomStuff, 3));
                                if (questChoiceRandomStuff == 1) {

                                } else if (questChoiceRandomStuff == 2) {

                                } else if (questChoiceRandomStuff == 3) {

                                }
                            } else if (questChoice == 3) {// TODO figure out what goes here

                            } else if (questChoice == 4) {// Don't want any of the quests
                                art.getBarNoQuestText();
                            }
                            break;
                    }
                    break;
                case 3: // Go to a doctor
                    do {
                    art.getDoctorInitialText(player.getHP());
                    choice = scanner.nextInt();
                    } while (!GeneralUtils.isAnOption(choice, 2));
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
                    GoblinBattleSuper goblin = new GoblinBattleSuper(player, strong, standard, weak);
                    goblin.battle(foughtOnce);
                    break;
                case 5: // Fight guards
                    do{
                    GuardFight.initialEventText();
                    choice = scanner.nextInt();
                    } while (GeneralUtils.isAnOption(choice, 3));
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
                            } else if ((courtSentancing >= 15) && (courtSentancing <= 24))// Jail 0 - 10
                            {
                                damageTaken = GeneralUtils.randomNumber(
                                        TownConstants.DMG_TAKEN_FROM_JAIL_UPPER_BOUND);
                                GuardFight.jail(damageTaken, player.getHP());
                                player.takeDamage(damageTaken);
                                GeneralUtils.pause(5);
                            } else if ((courtSentancing >= 25) && (courtSentancing <= 29))// Fine and Jail
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
                                do{
                                GuardFight.initialEventText();
                                attackTarget = scanner.nextInt();
                                } while (GeneralUtils.isAnOption(attackTarget, 6));
                                do{
                                ArtAndText.getAttackTypeChoiceText();
                                attackType = scanner.nextInt();
                                } while (GeneralUtils.isAnOption(attackType, 3));
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
                                do{
                                GuardFight.fightWinText();
                                choice = scanner.nextInt();
                                } while (choice != 1 || choice != 2);
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
                                do{
                                System.out.print("Do I want to loot the town?");
                                System.out.println("1 = Yes.");
                                System.out.println("2 = No.");
                                choice = scanner.nextInt();
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
                            break;
                        default:
                            art.getFailedToMakeSelection();
                            player.kill();// set health to 0 to end loop
                            break;
                    }
                    break;
                case 6: // Night
                    Night night = new Night(player);
                    night.night();
                    break;
                default:
                    System.out.println("ERROR not a valid event");
                    System.exit(3);
            }

            // Win screen
            if (player.getArtifact() >= GeneralConstants.TREASURE_TO_WIN) {// If you collect 50 treasures
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
            // art.getEndingText();
            // End program
            System.exit(2);
        }
        System.out.println("Hi");
        System.out.println(moveOn);
        art.getEndingText();
        scanner.close();
    }
}
