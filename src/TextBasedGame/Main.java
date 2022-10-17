package TextBasedGame;
import java.util.*;

public class Main {
    public static void main(String args[]) {
      //Character creation
        int CharacterHPCreation = 0;
        int CharacterMaxHPCreation = 0;
        int CharacterStandardAtackCreation = 0;
        int CharacterMaxAttackCreation = 0;
        int CharacterStartingTreasureCreation = 0;
        int characterAttackStrongDMG = 0;
        int characterAttackStandardDMG = 0;
        int characterAttackWeakDMG = 0;
        int characterAttackStrongMaxDMG = 0;
        int characterAttackStandardMaxDMG = 0;
        int characterAttackWeakMaxDMG = 0;
        int characterAttackStrongWeakness = 10;
        int characterAttackStandardWeakness = 0;
        int characterAttackWeakWeakness = -10;
    //Enemy creation
        //Dragon
            int dragonHP = 1; //This is for class creation
            int dragonAttack = 1; //This is for class creation
        //Bear
            int bearHP = 0; //This is for class creation
            int bearAttackDMG = 0; //This is for class creation
        //Goblin
            int goblinLeaderDamage = 0; //This is for class creation
            int goblinLeaderHealth = 0; //This is for class creation
            int goblinFollowerCount = 0; //This is for if that creates goblins
            int goblinFollowerOneHealth = 0; //This is for class creation
            int goblinFollowerOneDamage = 0; //This is for class creation
            int goblinFollowerTwoHealth = 0; //This is for class creation
            int goblinFollowerTwoDamage = 0; //This is for class creation
            int goblinFollowerThreeHealth = 0; //This is for class creation
            int goblinFollowerThreeDamage = 0; //This is for class creation
    //Rest of Game
        String moveOn = "Hi!"; //Player imputs when to continue
        String characterName; //gets the name the player wants for the player 
        int event;//chooses which event will happen
        int amountHealed = 0;//amount of HP added by the doctor
        int damageTaken = 0; //random amount of damage done to player for method
        int atk = 0; // This is the amount of damage added to attack damage
        int escapeChance = 0; //This is the chance out of 5 of events hapenning while escaping the dragon
        int attackChoice = 0; // This is to choose your attack
        int attackTarget = 0; //decides who to attack
        int questChoice = 0; //Players choice of what quest to take
        int barChoice = 0; //Players choice of what to do at the bar
        int townChoice = 0; //Players choice when arrested in town
        int chosenClass = 0; //Players choice of Character 
        int fightStart = 0; //Random to decide if a fight starts in jail
        int courtSentancing = 0; //The random that gives a sentance for the players crimes
        int fine = 0; //Use to fine the player of artifacts 
        int artifactsFoundOnGuards = 0; //Use to award players for beating the guards
        int doctorChoice; //Choice for what type of heal
        int blackSmithChoice; //Choice for what type of weapon upgrade
        boolean goblinsAreDead = false; //Checks if goblin horde is dead for loop
        boolean guardsAreDead = false; //Checks if gaurds are dead
        boolean foughtOnce = false; //Checks if player has fought to give combat explanation      
    //Create Classes
        //create Class Art
            ArtAndText art = new ArtAndText();
        //Create class Random number
            random randomNum = new random();
        //Scanner
            Scanner scanner = new Scanner(System.in);
        //Doctor
            Doctor doctor = new Doctor(100);

        //Clears screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //entrance screen
        art.getWelcomeArt();
        chosenClass = scanner.nextInt();
        //Clears screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //Gets players name for Character then clears screen
        System.out.println("What would you like to name your Character?");
        characterName = scanner.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(chosenClass == 1) //Rogue
        {
            //Character Attributes
            CharacterHPCreation = 100;
            CharacterMaxHPCreation = 100;
            CharacterStandardAtackCreation = 15;
            CharacterMaxAttackCreation = 30;
            CharacterStartingTreasureCreation = 0;
            //Strong Attack Atributes
            characterAttackStrongDMG = 25;
            characterAttackStrongMaxDMG = 45;
            characterAttackStrongWeakness = 10;
            //Standard Attack Atributes
            characterAttackStandardDMG = 15;
            characterAttackStandardMaxDMG = 35;
            characterAttackStandardWeakness = 0;
            //Weak Attack Atributes
            characterAttackWeakDMG = 5;
            characterAttackWeakMaxDMG = 25;
            characterAttackWeakWeakness = -10;
            doctor.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionRogue();
        }
        else if(chosenClass == 2) //Paladin
        {
            //Character Attributes
            CharacterHPCreation = 125;
            CharacterMaxHPCreation = 125;
            CharacterStandardAtackCreation = 20;
            CharacterMaxAttackCreation = 45;
            CharacterStartingTreasureCreation = 0;
            //Strong Attack Atributes
            characterAttackStrongDMG = 30;
            characterAttackStrongMaxDMG = 50;
            characterAttackStrongWeakness = 15;
            //Standard Attack Atributes
            characterAttackStandardDMG = 20;
            characterAttackStandardMaxDMG = 40;
            characterAttackStandardWeakness = 5;
            //Weak Attack Atributes
            characterAttackWeakDMG = 10;
            characterAttackWeakMaxDMG = 30;
            characterAttackWeakWeakness = -5;
            doctor.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionPaladin();
        }
        else if(chosenClass == 3) //Barbarian
        {
            //Character Attributes
            CharacterHPCreation = 150;
            CharacterMaxHPCreation = 150;
            CharacterStandardAtackCreation = 25;
            CharacterMaxAttackCreation = 50;
            CharacterStartingTreasureCreation = 0;
            //Strong Attack Atributes
            characterAttackStrongDMG = 35;
            characterAttackStrongMaxDMG = 60;
            characterAttackStrongWeakness = 20;
            //Standard Attack Atributes
            characterAttackStandardDMG = 25;
            characterAttackStandardMaxDMG = 50;
            characterAttackStandardWeakness = 10;
            //Weak Attack Atributes
            characterAttackWeakDMG = 15;
            characterAttackWeakMaxDMG = 40;
            characterAttackWeakWeakness = 0;
            doctor.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionBarbarian();
        }
        else
        {
            System.out.println("You failed to make a selection try again.");  
            System.exit(0);
        }
        //CREATE the Character
            Character character = new Character(CharacterHPCreation, CharacterMaxHPCreation, characterName, CharacterStandardAtackCreation, CharacterMaxAttackCreation, CharacterStartingTreasureCreation);
            Attack strong = new Attack(characterAttackStrongDMG, characterAttackStrongMaxDMG, characterAttackStrongWeakness); // Damage, Max damage, weakness
            Attack standard = new Attack(characterAttackStandardDMG, characterAttackStandardMaxDMG, characterAttackStandardWeakness); // Damage, Max damage, weakness
            Attack weak = new Attack(characterAttackWeakDMG, characterAttackWeakMaxDMG, characterAttackWeakWeakness); // Damage, Max damage, weakness
        //Information for player at start of game TODO Decide on amount of artifacts Now in each class if statement
        //Wait until player presses a button
        moveOn = scanner.next();
        //Clears screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

            //Start game loop
            while(!character.isDead())
            {
                {//sleep command
                try
                {
                    Thread.sleep(5000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                }
                event = randomNum.randomNumber(Constants.eventUpperBound);
                //Clears screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //EVENTS
                if(event == 0){ //Fight dragon
                    //Start text and picture
                    art.getDragonArt();
                    int dragonChoice = scanner.nextInt();
                    
                    if(dragonChoice == 1)//1 For escape
                    // 1 in 5 chance of freedom 
                    // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                    // 2 in 5 chance of waking the dragon and having to fight it - if you win you still get the treasure
                    {
                        escapeChance = randomNum.randomNumber(Constants.dragonEscapeChanceUpperBound);
                        if(escapeChance == 0)//escape succesfully
                        {
                            System.out.println("You succesfully escape and can continue your journey.");
                        }
                        else if((escapeChance == 1) || (escapeChance == 2))//trip and take some damage 1 to 10
                        {
                            damageTaken = randomNum.randomNumber(Constants.dragonEscapeDMGUpperBound);
                            character.takeDamage(damageTaken);
                            System.out.println("On your way out you fall and take some damage.");
                            System.out.println("You succesfully escape only taking " + damageTaken + " damge, you now have " + character.getHP() + "HP.");
                            System.out.println("You leave and continue your journey.");
                        }
                        else if((escapeChance == 3) || (escapeChance == 4))//You fail to escape and have to fight the dragon
                        {
                            //Message after failing to escape
                            System.out.println("You fail to ecapse and awake the dragon. You will have to fight him.");
                            if(!foughtOnce){
                                art.getCombatExplanation();
                            }
                            //Wait
                            {try
                            {
                                Thread.sleep(1000);
                            }
                                catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            }
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            //Fight dragon same code as below
                            dragonHP = randomNum.randomNumber(Constants.dragonHPUpperBound);
                            dragonHP += 10;//Dragon health 10 - 75
                            dragonAttack = randomNum.randomNumber(Constants.dragonAttackDMGUpperBound);
                            dragonAttack += 20; //Geerates dragon attack dmg 20 - 35
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            //Explanation for player at start of battle
                            art.getCombatExplanation();
                            while(!character.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                art.getAttackTypeChoiceText();
                                attackChoice = scanner.nextInt();
                                if(attackChoice == 1)
                                {
                                    System.out.println("You choose a strong attack");
                                    dragon.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)
                                {
                                    System.out.println("You choose a standard attack");
                                    dragon.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)
                                {
                                    System.out.println("You choose a weak attack!");
                                    dragon.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                if(!dragon.isDead())//If still alive dragon's turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           character.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + character.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               character.increaseArtifacts(1); 
                               System.out.println("You now have " + character.getArtifact() + " artifacts.");
                               foughtOnce = true;
                            }
                        }
                    }
                    else if(dragonChoice == 2)//To rob the dragon
                    {
                        //Fight dragon same code as above
                        dragonHP = randomNum.randomNumber(Constants.dragonHPUpperBound);
                        dragonHP += 10;//Dragon health 10 - 75
                        dragonAttack = randomNum.randomNumber(Constants.dragonAttackDMGUpperBound);
                        dragonAttack += 20; //Geerates dragon attack dmg 20 - 35
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            if(!foughtOnce){
                                art.getCombatExplanation();
                            }
                            while(!character.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                art.getAttackTypeChoiceText();
                                attackChoice = scanner.nextInt();
                                if(attackChoice == 1)
                                {
                                    System.out.println("You choose a strong attack");
                                    dragon.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)
                                {
                                    System.out.println("You choose a standard attack");
                                    dragon.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)
                                {
                                    System.out.println("You choose a weak attack!");
                                    dragon.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Dragon now has " + dragon.getHP() + " HP.");
                                }
                                if(!dragon.isDead())//If still alive dragon's turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           character.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + character.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               character.increaseArtifacts(1); 
                               System.out.println("You now have " + character.getArtifact() + " artifacts.");
                               foughtOnce = true;
                            }
                        }
                    else //type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        character.kill();//set health to 0 to end loop
                    }
                }
                else if(event == 1){//Fight Bear
                    System.out.println("You are travaling in the forest when you run into an agressive bear.");
                    if(!foughtOnce){
                        art.getCombatExplanation();
                    }
                    //Create bear
                    bearHP = randomNum.randomNumber(Constants.bearHPUpperBound);
                    bearHP += 20;//bear health 20 - 45
                    bearAttackDMG = randomNum.randomNumber(Constants.bearAttackDMGUpperBound);
                    bearAttackDMG += 10;//bears do 10 to 20 dmg
                    Enemy bear = new Enemy(bearHP, bearAttackDMG); //HP then attack dmg

                    while(!character.isDead() && !bear.isDead())
                        {
                                System.out.println("The bear has " + bear.getHP() + " HP.");
                                art.getAttackTypeChoiceText();
                                attackChoice = scanner.nextInt();
                                if(attackChoice == 1)
                                {
                                    System.out.println("You choose a strong attack");
                                    bear.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The bear now has " + bear.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)
                                {
                                    System.out.println("You choose a standard attack");
                                    bear.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The bear now has " + bear.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)
                                {
                                    System.out.println("You choose a weak attack!");
                                    bear.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The bear now has " + bear.getHP() + " HP.");
                                }
                                if(!bear.isDead())//If still alive bear's turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = bear.getAttack() + strong.getAttackPenalty(); 
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = bear.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = bear.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           character.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The bear attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + character.getHP() + " HP.");
                                }
                            }
                    if(bear.isDead())//After loop ends if Bear died
                    {
                        System.out.println("Congratulations you beat the bear! You get to keep its artifact.");
                        character.increaseArtifacts(.5); 
                        System.out.println("You now have " + character.getArtifact() + " artifacts.");
                        foughtOnce = true;
                    }
                }
                else if(event == 2){//Go into a bar
                    art.getBarText();
                    barChoice = scanner.nextInt();
                    if(barChoice == 1)//Start a brawl
                    {
                        System.out.println("You decide to start a brawl");
                        //Determine amount of damage taken.
                        damageTaken = randomNum.randomNumber(Constants.barFightDMGTakenUpperBound);
                        System.out.println("In the fight you take " + damageTaken + " damage.");
                        character.takeDamage(damageTaken);
                        System.out.println("You now have " + character.getHP() + " HP.");
                    }
                    else if(barChoice == 2)//Buy a weapon
                    {
                        art.getBlackSmithText();
                        System.out.println("Your currently have: " + character.getArtifact() + " artifacts.");
                        blackSmithChoice = scanner.nextInt();
                        if(blackSmithChoice == 1){
                            System.out.println("Attack before addition: " + character.getAttack()); 
                            atk = randomNum.randomNumber(Constants.barAttackDMGIncreaseUpperBound);
                            atk ++;
                            //incerase attack damage
                            character.increaseAttack(atk);
                            strong.increaseAttackDamage(atk);
                            standard.increaseAttackDamage(atk);
                            weak.increaseAttackDamage(atk);
                            if(character.getAttack() <= character.getMaxAttack()){ //If not over max attack damage state attack damage
                                System.out.println("New attack damage: " + character.getAttack());
                            }
                            else if(character.getAttack() > character.getMaxAttack()){ //If over max attack damage set to max attack damage and then state attack damage 
                                character.setMaxAttack();
                                strong.setMaxAttackDamage();
                                standard.setMaxAttackDamage();
                                weak.setMaxAttackDamage();
                                System.out.println("New attack damage " + character.getAttack());
                            }
                        }
                        else if(blackSmithChoice == 2){
                            System.out.println("Attack before addition: " + character.getAttack()); 
                            atk = Constants.barAttackDMGIncreasePayed;
                            //incerase attack damage
                            character.increaseAttack(atk);
                            strong.increaseAttackDamage(atk);
                            standard.increaseAttackDamage(atk);
                            weak.increaseAttackDamage(atk);
                            if(character.getAttack() <= character.getMaxAttack()){ //If not over max attack damage state attack damage
                                System.out.println("New attack damage: " + character.getAttack());
                            }
                            else if(character.getAttack() > character.getMaxAttack()){ //If over max attack damage set to max attack damage and then state attack damage 
                                character.setMaxAttack();
                                strong.setMaxAttackDamage();
                                standard.setMaxAttackDamage();
                                weak.setMaxAttackDamage();
                                System.out.println("New attack damage " + character.getAttack());
                            }
                        }
                        else{
                            System.out.println("You failed to make a selection try again.");  
                            System.exit(5);
                        }
                    }
                    else if(barChoice == 3)// Get quest from guards
                    {
                        //TODO Finish this
                        art.getguardQuestText();
                        questChoice = scanner.nextInt();
                        if(questChoice == 1)//Defeat smugiling group
                        {
                            
                        }
                        else if(questChoice == 2)//Defeat Evil king
                        {
                            
                        }
                        else if(questChoice == 3) //TODO figure out what goes here
                        {
                            
                        }
                        else if(questChoice == 4)//Don't want any of the quests
                        {
                            
                        }
                        else
                        {
                            System.out.println("You failed to make a selection.");
                            character.kill();//set health to 0 to end loop
                        }
                    }
                    else // type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        character.kill();//set health to 0 to end loop
                    }
                }
                else if(event == 3){//Go to a doctor
                    art.getDoctorInitialText();
                    System.out.print(character.getHP() + "HP.");
                    doctorChoice = scanner.nextInt();
                    {//sleep command
                        try
                        {
                            Thread.sleep(3000);
                        }
                            catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if(doctorChoice == 1){
                        //decide on amount healed 10-40
                        amountHealed = randomNum.randomNumber(Constants.doctorAmountHealedUpperBound);
                        amountHealed += 10;
                    }
                    else if(doctorChoice == 2){
                        amountHealed = Constants.doctorAmountHealedPayed;
                    }
                    character.heal(doctor.heal(character.getHP(), amountHealed));
                    System.out.println("Your new health is " + character.getHP());
                }
                else if(event == 4){ //Goblin horde
                    System.out.println("You are travaling and a group of goblins is trying to rob you.");
                    //Create the goblins
                    //Create leader Goblin
                    goblinLeaderDamage = randomNum.randomNumber(Constants.goblinLeaderDMGUpperBound);
                    goblinLeaderDamage += 10;
                    goblinLeaderHealth = randomNum.randomNumber(Constants.goblinLeaderHealthUpperBound);
                    goblinLeaderHealth += 20; //20 - 45 HP
                    Enemy goblinLeader = new Enemy (goblinLeaderHealth, goblinLeaderDamage);//Hp, Attack dmg
                    
                    //Random number to get amount of follower goblins
                    goblinFollowerCount = randomNum.randomNumber(Constants.goblinFollowerCountUpperBound);
                    goblinFollowerCount ++;//Makes range 1 - 3
                    if(goblinFollowerCount == 1)//If 1 follower
                    {
                        //Creates follower goblin one
                        goblinFollowerOneDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerOneHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His follower has " + goblinFollowerOne.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!character.isDead() && !goblinsAreDead)
                        {
                            art.getGoblinFightTargetTextTwo(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1)// Leader
                            {
                                System.out.println("You attack the Leader.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2) //Follower 1
                            {
                                System.out.println("You attack the Henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Follower now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Follower now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Follower now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                character.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead())//If any goblin is alive
                            {
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead())//if all goblins are dead
                            {
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    else if(goblinFollowerCount == 2)//If 2 followers Copy but add one more loop
                    {
                        //Creates follower goblin one
                        goblinFollowerOneDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerOneHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        //Creates follower goblin two
                        goblinFollowerTwoDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerTwoHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + " and " + goblinFollowerTwo.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!character.isDead() && !goblinsAreDead)
                        {
                            art.getGoblinFightTargetTextThree(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1)// Leader
                            {
                                System.out.println("You attack the Leader.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2) //Follower 1
                            {
                                System.out.println("You attack the Henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                            }
                            else if(attackTarget == 3) //Follower 2
                            {
                                System.out.println("You attack the second henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The second henchman now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The second henchan now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The second henchman now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                character.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead() || !goblinFollowerTwo.isDead())//If any goblin is alive
                            {
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead() && goblinFollowerTwo.isDead())//if all goblins are dead
                            {
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    else if(goblinFollowerCount == 3)//If 3 followers
                    {
                        //Creates follower goblin one
                        goblinFollowerOneDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerOneHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        //Creates follower goblin two
                        goblinFollowerTwoDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerTwoHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        //Creates follower goblin three
                        goblinFollowerThreeDamage = randomNum.randomNumber(Constants.goblinFollowerDMGUpperBound);
                        goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                        goblinFollowerThreeHealth = randomNum.randomNumber(Constants.goblinFollowerHealthUpperBound);
                        goblinFollowerThreeHealth += 7; //Changes health range to 7 - 17
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3

                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", and " + goblinFollowerThree.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!character.isDead() && !goblinsAreDead)
                        {
                            art.getGoblinFightTargetTextFour(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1)// Leader
                            {
                                System.out.println("You attack the Leader.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The Leader now has " + goblinLeader.getHP() + " HP.");
                                }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2) //Follower 1
                            {
                                System.out.println("You attack the Henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The henchman now has " + goblinFollowerOne.getHP() + " HP.");
                                }
                            }
                            else if(attackTarget == 3) //Follower 2
                            {
                                System.out.println("You attack the second henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The second henchman now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The second henchan now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The second henchman now has " + goblinFollowerTwo.getHP() + " HP.");
                                }
                            }
                            else if(attackTarget == 4) //Follower 3
                            {
                                System.out.println("You attack the third henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerThree.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The third henchman now has " + goblinFollowerThree.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerThree.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The third henchan now has " + goblinFollowerThree.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerThree.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The third henchman now has " + goblinFollowerThree.getHP() + " HP.");
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                character.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            if(!goblinFollowerThree.isDead())// Goblin Follower 3's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + character.getHP() + " HP.");
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead() || !goblinFollowerTwo.isDead() || !goblinFollowerThree.isDead())//If any goblin is alive
                            {
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead() && goblinFollowerTwo.isDead() && goblinFollowerThree.isDead())//if all goblins are dead
                            {
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    if(goblinsAreDead) //Reward
                    {
                        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts.");
                        character.increaseArtifacts(7);
                        System.out.println("You now have " + character.getArtifact() + " artifacts.");
                    }
                }
                else if(event == 5){//Fight guards
                    art.getGuardFightText();
                    townChoice = scanner.nextInt();
                    if(townChoice == 1)//Go willingly
                    {
                        System.out.println("You go with the gaurds.");
                        System.out.println("They put you in a cell and tell you that the sentanceing will happen the next Monday.");
                        //Random to decide if fight starts 1 in 6 it does
                        fightStart = randomNum.randomNumber(Constants.townJailChanceFightUpperBound);
                        if(fightStart == 0)//If var = 0 then start fight if not continue
                        {
                            System.out.println("During lunch the next day a fight breaks out.");
                            damageTaken = randomNum.randomNumber(Constants.townJailFightDMGTakenUpperBound);
                            System.out.println("In the brawl you lose " + damageTaken + " Hp.");
                            System.out.println("You now have " + character.getHP() + "Hp.");
                            System.out.println("The rest of your stay is uneventful");
                        }
                        else if((fightStart >= 1) && (fightStart <= 5))
                        {
                            System.out.println("Your stay was uneventful."); 
                        }
                        System.out.println("Monday arrives and you are taken to the court.");
                        //Random to get sentance 
                        courtSentancing = randomNum.randomNumber(Constants.townCourtSentancingUpperBound);
                        System.out.println("The trial passes and at the end you are sentenced.");
                        //Chances out of 31 (0-30)
                        // Fine 15 in 31
                        // Jail 10 in 31
                        // Fine and Jail 5 in 31
                        // Execution 1 in 31

                        if((courtSentancing >= 0) && (courtSentancing <= 14))//Fine
                        {
                            fine = randomNum.randomNumber(Constants.townFineUpperBound);
                            System.out.println("You are sentenced to pay a fine of " + fine + " artifacts.");
                            fine *= -1;
                            character.increaseArtifacts(fine);
                            System.out.println("You now have " + character.getArtifact() + " artifacts.");
                        }
                        else if((courtSentancing >= 15) && (courtSentancing <= 24))//Jail
                        {
                            //Jail time take dmg 0 - 10
                            System.out.println("You are then sentenced to one year in jail");
                            damageTaken = randomNum.randomNumber(Constants.townDMGTakenFromJailUpperBound);
                            //Wait
                            try
                            {
                                Thread.sleep(5000);
                            }
                                catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            character.takeDamage(damageTaken);
                            System.out.println("You now have " + character.getHP() + "Hp.");
                        }
                        else if((courtSentancing >= 25) && (courtSentancing <= 29) )//Fine and Jail
                        {
                            //Fine
                            fine = randomNum.randomNumber(Constants.townFineUpperBound);
                            System.out.println("You are first sentanced to pay a fine of " + fine + " artifacts.");
                            character.increaseArtifacts(fine);
                            System.out.println("You now have " + character.getArtifact() + " artifacts.");
                            //Jail time take dmg 0 - 10
                            System.out.println("You are then sentanced to one year in jail");
                            damageTaken = randomNum.randomNumber(Constants.townDMGTakenFromJailUpperBound);
                            //Wait
                            try
                            {
                                Thread.sleep(5000);
                            }
                                catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            character.takeDamage(damageTaken);
                            System.out.println("You now have " + character.getHP() + "Hp.");
                        }
                        else if(courtSentancing == 30)//Execution
                        {
                            System.out.println("You are convicted of murder and sentanced to death.");
                            character.kill();
                        } 
                    }
                    else if(townChoice == 2)//Beg for mercy
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You beg for mercy.");
                        System.out.println("They decide to be leniant and give you a fine of 3 artifacts instead.");
                        if(character.getArtifact() > 3){ //Checks you have enough to pay
                            character.increaseArtifacts(-3);
                            System.out.println("You now have " + character.getArtifact() + " artifacts.");
                        }
                        else if(character.getArtifact() < 3){
                            System.out.println("You could not pay the fine.");
                            character.kill();
                        }
                    }
                    else if(townChoice == 3)//Fight back
                    {
                        System.out.println("You decide to fight back.");
                        Enemy guardOne = new Enemy (25, 15);//Hp, attack
                        Enemy guardTwo = new Enemy (25, 15);
                        Enemy guardThree = new Enemy (25, 15);
                        Enemy guardFour = new Enemy (25, 15);
                        Enemy guardFive = new Enemy (25, 15);
                        Enemy guardSix = new Enemy (25, 15);
                        {//sleep command
                        try
                        {
                            Thread.sleep(1000);
                        }
                            catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        }
                        //Explanation for player at start of battle
                        //Clear screen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        while(!character.isDead() && !guardsAreDead )  
                        {
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            System.out.println("Which gaurd will you attack?");
                            System.out.println("Gaurd one " + guardOne.getHP() + "Hp.");
                            System.out.println("Gaurd two " + guardTwo.getHP() + "Hp.");
                            System.out.println("Gaurd three " + guardThree.getHP() + "Hp.");
                            System.out.println("Gaurd four " + guardFour.getHP() + "Hp.");
                            System.out.println("Gaurd five " + guardFive.getHP() + "Hp.");
                            System.out.println("Gaurd six " + guardSix.getHP() + "Hp.");
                            attackTarget = scanner.nextInt();
                            if(attackTarget == 1)//Guard one
                            {
                                System.out.println("You attack guard one.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardOne.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardOne.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardOne.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard one now has " + guardOne.getHP() + "Hp.");
                                }
                                if(!guardOne.isDead())//Guard One's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardThree.isDead())//Gaurd three's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                            }
                            if(attackTarget == 2)//Guard Two
                            {
                                System.out.println("You attack guard two.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardTwo.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardTwo.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardTwo.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard two now has " + guardTwo.getHP() + "Hp.");
                                }
                                if(!guardTwo.isDead())//Guard Two's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFour.isDead())//Gaurd four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                            }
                            else if(attackTarget == 3)//Guard Three
                            {
                                System.out.println("You attack guard three.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardThree.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardThree.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardThree.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard three now has " + guardThree.getHP() + "Hp.");
                                }
                                if(!guardThree.isDead())//Guard Three's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFive.isDead())//Gaurd five's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                } 
                            }
                            else if(attackTarget== 4)//Gaurd Four 
                            {
                                System.out.println("You attack guard four.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardFour.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardFour.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardFour.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard four now has " + guardFour.getHP() + "Hp.");
                                }
                                if(!guardFour.isDead())//Guard four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardSix.isDead())//Gaurd six's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }                                
                            }
                            else if(attackTarget == 5)//Gaurd Five
                            {
                                System.out.println("You attack guard five.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardFive.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardFive.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardFive.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard five now has " + guardFive.getHP() + "Hp.");
                                }
                                if(!guardFive.isDead())//Guard five's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardOne.isDead())//Gaurd one's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                            }
                            else if(attackTarget== 6)//Gaurd Six
                            {
                                System.out.println("You attack guard six.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You do " + strong.getAttackDamage() + "dmg.");
                                    guardSix.takeDamage(strong.getAttackDamage());
                                    System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    System.out.println("You do " + standard.getAttackDamage() + "dmg.");
                                    guardSix.takeDamage(standard.getAttackDamage());
                                    System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You do " + weak.getAttackDamage() + "dmg.");
                                    guardSix.takeDamage(weak.getAttackDamage());
                                    System.out.println("Guard six now has " + guardSix.getHP() + "Hp.");
                                }
                                if(!guardSix.isDead())//Guard sixs's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                                if(!guardTwo.isDead())//Gaurd two's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        character.takeDamage(damageTaken);
                                        System.out.println("Gaurd two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + character.getHP() + "Hp.");
                                    }
                                }
                            }
                            
                            //Checks if gaurds are dead
                            if(!guardOne.isDead() || !guardTwo.isDead() || !guardThree.isDead() || !guardFour.isDead() || !guardFive.isDead() || !guardSix.isDead())//If any gaurd is alive
                            {
                                guardsAreDead = false;
                            }
                            else if (guardOne.isDead() && guardTwo.isDead() && guardThree.isDead() && guardFour.isDead() && guardFive.isDead() && guardSix.isDead())//if all gaurds are dead
                            {
                                guardsAreDead = true;    
                            }
                        }
                        if(guardsAreDead)
                        {
                            art.getTownGuardFightWinText();
                            townChoice = scanner.nextInt();
                            if(townChoice == 1){//Take from guards
                                artifactsFoundOnGuards = randomNum.randomNumber(Constants.townArtifactsOnGuardsUpperBound);
                                character.increaseArtifacts(artifactsFoundOnGuards);
                                System.out.println("You found " + artifactsFoundOnGuards + " artifacts, you now have " + character.getArtifact() + " artifacts.");
                            }
                            else if(townChoice == 2){//Dont take from guards
                                System.out.println("You leave the guards and contimplate, ");
                            }
                            System.out.print("Do I want to loot the town?");
                            System.out.println("1 = Yes.");
                            System.out.println("2 = No.");
                            townChoice = scanner.nextInt();
                            if(townChoice == 1)//Yes
                            {
                                System.out.println("You are a bad person.");
                                character.kill();
                            }
                            else if(townChoice == 2)//No
                            {
                                System.out.println("You resist temptation and leave the town and move on to your next adventure.");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("You failed to make a selection.");
                        character.kill();//set health to 0 to end loop
                    }
                }
                else if(event == 6){//Rest
                    
                }
                //Win screen
                if(character.getArtifact() >= 50)//If you collect 50 treasures
                {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Congratulations " + characterName);
                    //sleep command
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    //Win screen
                    art.getYouWin();
                    //End program
                    System.exit(1);
                }
            }
            //Death screen
            {
                try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                //Clear screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //Death screen
                art.getYouDied();
                //End program
                System.exit(2);
            }
        System.out.println("Hi");
        System.out.println(moveOn);
        art.getEndingText();
        scanner.close();
    }
  }