package TextBasedGame;
import java.util.*;

public class Main {
    public static void main(String args[]) {
      //Character creation
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
            int goblinFollowerHealth = 0; //This is for class creation
            int goblinFollowerDamage = 0; //This is for class creation
    //Rest of Game
        //Random
            String characterName; //gets the name the player wants for the player 
            String moveOn = "Hi!"; //Player imputs when to continue
            int attackChoice = 0; // This is to choose your attack
            int attackTarget = 0; //decides who to attack
            int atk = 0; // This is the amount of damage added to attack damage
            int chosenClass = 0; //Players choice of Character 
            int damageTaken = 0; //random amount of damage done to player for method
            int event;//chooses which event will happen
            boolean foughtOnce = false; //Checks if player has fought to give combat explanation
            boolean properAns = false; //Checks if user input works
        //Dragon
            int dragonChoice = 0; //Choice from user
            int escapeChance = 0; //This is the chance out of 5 of events hapenning while escaping the dragon
        //Bear

        //Bar
            int blackSmithChoice; //Choice for what type of weapon upgrade
            int barChoice = 0; //Players choice of what to do at the bar
            int questChoice = 0; //Players choice of what quest to take
            int questChoiceRandomStuff;
        //Doctor
            int doctorChoice; //Choice for what type of heal
            int amountHealed = 0;//amount of HP added by the doctor
            int amountHealedOld = 0;
        //Goblins
            boolean goblinsAreDead = false; //Checks if goblin horde is dead for loop
        //Town
            int townChoice = 0; //Players choice when arrested in town
            int fine = 0; //Use to fine the player of artifacts 
            int fightStart = 0; //Random to decide if a fight starts in jail
            int courtSentancing = 0; //The random that gives a sentance for the players crimes
            int artifactsFoundOnGuards = 0; //Use to award players for beating the guards
            boolean guardsAreDead = false; //Checks if gaurds are dead
        //Night
            int sleepPlaceChoice = 0; //Players choice of where to sleep
            int nightChance = 0;//FOr random Decisions

    //Create Classes
        //create Class Art
            ArtAndText art = new ArtAndText();
        //Scanner
            Scanner scanner = new Scanner(System.in);
        //Doctor
            Heal heal = new Heal(100);

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
        switch(chosenClass){
        case 1: //Rogue
            //Character Attributes
            CharacterHPCreation = 100;
            CharacterMaxHPCreation = 100;
            CharacterStandardAtackCreation = 15;
            CharacterMaxAttackCreation = 30;
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
            heal.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionRogue();
        break;
        case 2: //Paladin
            //Character Attributes
            CharacterHPCreation = 125;
            CharacterMaxHPCreation = 125;
            CharacterStandardAtackCreation = 20;
            CharacterMaxAttackCreation = 45;
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
            heal.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionPaladin();
        break;
        case 3: //Barbarian
            //Character Attributes
            CharacterHPCreation = 150;
            CharacterMaxHPCreation = 150;
            CharacterStandardAtackCreation = 25;
            CharacterMaxAttackCreation = 50;
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
            heal.setMaxHP(CharacterMaxHPCreation);
            art.getGameExplantionBarbarian();
        break;
        default:
            System.out.println("You failed to make a selection try again.");  
            System.exit(0);
        break;
        }
        //CREATE the Character
            Character character = new Character(CharacterHPCreation, CharacterMaxHPCreation, characterName, CharacterStandardAtackCreation, CharacterMaxAttackCreation);
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
                { /*sleep command*/
                try{
                    Thread.sleep(3000);}
                catch(InterruptedException ex){
                    Thread.currentThread().interrupt();}}
                event = random.randomNumber(Constants.eventUpperBound);
                if(character.getHP() <= 30){ //To make game more fun
                    event = 3;
                }
                //event = 6;
                //Clears screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //EVENTS
                switch(event){
                case 0: //Fight dragon
                    //Start text and picture
                    art.getDragonArt();
                    dragonChoice = scanner.nextInt();
                    if(dragonChoice == 1){//1 For escape
                    // 1 in 5 chance of freedom 
                    // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                    // 2 in 5 chance of waking the dragon and having to fight it - if you win you still get the treasure
                        escapeChance = random.randomNumber(Constants.dragonEscapeChanceUpperBound);
                        if(escapeChance == 0){//escape succesfully
                            DragonBattle.escaped();
                        }
                        else if((escapeChance == 1) || (escapeChance == 2)){//trip and take some damage 1 to 10
                            damageTaken = random.randomNumber(Constants.dragonEscapeDMGUpperBound);
                            DragonBattle.tripThenEscape(damageTaken, character.getHP());
                            character.takeDamage(damageTaken);
                        }
                        else if((escapeChance == 3) || (escapeChance == 4)){//You fail to escape and have to fight the dragon
                            art.getFailedToEscapeText();//Message after failing to escape
                            //Goes to the battle
                        }
                    }
                    if((dragonChoice == 2) || (escapeChance == 3) || (escapeChance == 4)){//To rob the dragon
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        {//Wait
                            try{ 
                            Thread.sleep(1000);}
                            catch(InterruptedException ex){
                            Thread.currentThread().interrupt();}}
                        dragonHP = random.randomNumber(Constants.dragonHPUpperBound) + 10;//Dragon health 10 - 75
                        dragonAttack = random.randomNumber(Constants.dragonAttackDMGUpperBound) + 20; //Geerates dragon attack dmg 20 - 35
                        Enemy dragon = new Enemy (dragonHP, dragonAttack); //Create Dragon HP 10 - 75, Attack dmg 20 - 35

                        while(!character.isDead() && !dragon.isDead()){
                            System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackChoice == 1){
                                DragonBattle.characterAttackChoiceOne(strong.getAttackDamage(), dragon.getHP());
                                dragon.takeDamage(strong.getAttackDamage());
                            }
                            else if(attackChoice == 2){
                                DragonBattle.characterAttackChoiceTwo(standard.getAttackDamage(), dragon.getHP());
                                dragon.takeDamage(standard.getAttackDamage());
                            }
                            else if(attackChoice == 3){
                                DragonBattle.characterAttackChoiceThree(weak.getAttackDamage(), dragon.getHP());
                                dragon.takeDamage(weak.getAttackDamage());
                            }
                            if(!dragon.isDead()){//If still alive dragon's turn
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1){//Strong attack
                                    damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2){//Standard attack
                                    damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3){//Weak attack
                                    damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0){//Positive attack
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0){//negative attack
                                        damageTaken = 0;
                                    }
                                }
                                DragonBattle.endRoundtext(damageTaken, character.getHP());
                            }
                        }
                        if(dragon.isDead()){//After loop ends if Dragon died
                           character.increaseArtifacts(1);
                           foughtOnce = true;
                           DragonBattle.finalText(character.getArtifact());
                        }
                    }
                    else if(!(dragonChoice == 1)){//type a number or letter that is not an option 
                        art.getFailedToMakeSelection();
                        character.kill();//set health to 0 to end loop
                    }
                break;
                case 1: //Fight Bear
                    art.getBearInitialText();
                    if(!foughtOnce){
                        art.getCombatExplanation();
                    }
                    //Create bear
                    bearHP = random.randomNumber(Constants.bearHPUpperBound);
                    bearHP += 20;//bear health 20 - 45
                    bearAttackDMG = random.randomNumber(Constants.bearAttackDMGUpperBound);
                    bearAttackDMG += 10;//bears do 10 to 20 dmg
                    Enemy bear = new Enemy(bearHP, bearAttackDMG); //HP then attack dmg

                    while(!character.isDead() && !bear.isDead()){
                        System.out.println("The bear has " + bear.getHP() + " HP.");
                        art.getAttackTypeChoiceText();
                        attackChoice = scanner.nextInt();
                        if(attackChoice == 1){
                            BearBattle.characterAttackChoiceOne(strong.getAttackDamage(), bear.getHP());
                            bear.takeDamage(strong.getAttackDamage());
                        }
                        else if(attackChoice == 2){
                            BearBattle.characterAttackChoiceTwo(standard.getAttackDamage(), bear.getHP());
                            bear.takeDamage(standard.getAttackDamage());
                        }
                        else if(attackChoice == 3){
                            BearBattle.characterAttackChoiceThree(weak.getAttackDamage(), bear.getHP());
                            bear.takeDamage(weak.getAttackDamage());
                        }
                        if(!bear.isDead()){//If still alive bear's turn
                            //To determine which attack was used and so what buff
                            if(attackChoice == 1){//Strong attack
                                damageTaken = bear.getAttack() + strong.getAttackPenalty(); 
                                character.takeDamage(damageTaken);
                            }
                            else if(attackChoice == 2){//Standard attack
                                damageTaken = bear.getAttack() + standard.getAttackPenalty();
                                character.takeDamage(damageTaken);
                            }
                            else if(attackChoice == 3){//Weak attack
                                damageTaken = bear.getAttack() + weak.getAttackPenalty();
                                if(damageTaken >= 0){//Positive attack
                                    character.takeDamage(damageTaken); 
                                }
                                else if(damageTaken < 0){//negative attack
                                    damageTaken = 0;
                                }
                            }   
                            BearBattle.bearTurnText(damageTaken, character.getHP());
                        }
                    }
                    if(bear.isDead()){//After loop ends if Bear died
                        character.increaseArtifacts(Constants.bearArtifactsCollectionAmount);
                        art.getBeatBearText(character.getArtifact());
                        foughtOnce = true;
                    }
                break;
                case 2: //Go into a bar
                    art.getBarText();
                    barChoice = scanner.nextInt();
                    switch(barChoice){
                    case 1: //Start a brawl
                        damageTaken = random.randomNumber(Constants.barFightDMGTakenUpperBound);
                        Bar.barBrawl(damageTaken, character.getHP());
                        character.takeDamage(damageTaken);
                    break;
                    case 2: //Buy a weapon
                        art.getBlackSmithText();
                        System.out.println("Your currently have: " + character.getArtifact() + " artifacts.");
                        blackSmithChoice = scanner.nextInt();
                        if(blackSmithChoice == 1){
                            System.out.println("Attack before addition: " + character.getAttack());
                            atk = random.randomNumber(Constants.barAttackDMGIncreaseUpperBound);
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
                            art.getFailedToMakeSelection();  
                            character.kill();
                        }
                    break;
                    case 3: // Get quest from guards
                        //TODO Finish this
                        art.getguardQuestText();
                        questChoice = scanner.nextInt();
                        if(questChoice == 1){//Defeat smugiling group
                            
                        }
                        else if(questChoice == 2){//Defeat Evil king
                            art.getBarQuestTwoText();
                            
                            questChoiceRandomStuff = scanner.nextInt();
                            if(questChoiceRandomStuff == 1){
                                
                            }
                            else if(questChoiceRandomStuff == 2){

                            }
                            else if(questChoiceRandomStuff == 3){

                            }
                            else{
                                art.getFailedToMakeSelection();
                                character.kill();//set health to 0 to end loop
                            }
                        }
                        else if(questChoice == 3){//TODO figure out what goes here
                            
                        }
                        else if(questChoice == 4){//Don't want any of the quests
                            art.getBarNoQuestText();
                        }
                        else{
                            art.getFailedToMakeSelection();
                            character.kill();//set health to 0 to end loop
                        }
                    break;
                    default: // type a number or letter that is not an option 
                        art.getFailedToMakeSelection();
                        character.kill();//set health to 0 to end loop
                    break;
                   }break;
                case 3: //Go to a doctor
                    art.getDoctorInitialText();
                    System.out.print(character.getHP() + " HP.\n");
                    doctorChoice = scanner.nextInt();
                    {//sleep command
                        try{
                        Thread.sleep(3000);}
                        catch(InterruptedException ex){
                        Thread.currentThread().interrupt();}}
                    if(doctorChoice == 1){
                        //decide on amount healed 10-40
                        amountHealed = random.randomNumber(Constants.doctorAmountHealedUpperBound);
                        amountHealed += 10;
                    }
                    else if(doctorChoice == 2){
                        amountHealed = Constants.doctorAmountHealedPayed;
                    }
                    amountHealedOld = amountHealed;
                    amountHealed = heal.heal(character.getHP(), amountHealed);
                    character.heal(amountHealed);
                    heal.doctorOutputText(character.getHP(), amountHealedOld);
                break;
                case 4: //Goblin horde
                    art.getGoblinInitialText();
                    //Create the goblins
                    //Create leader Goblin
                    goblinLeaderDamage = random.randomNumber(Constants.goblinLeaderDMGUpperBound) + 10;
                    goblinLeaderHealth = random.randomNumber(Constants.goblinLeaderHealthUpperBound) + 20; //20 - 45 HP
                    Enemy goblinLeader = new Enemy (goblinLeaderHealth, goblinLeaderDamage);//Hp, Attack dmg
                    
                    //Random number to get amount of follower goblins
                    goblinFollowerCount = random.randomNumber(Constants.goblinFollowerCountUpperBound);
                    goblinFollowerCount ++;//Makes range 1 - 3
                    if(goblinFollowerCount == 1){//If 1 follower
                        //Creates follower goblin one
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) +10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 1
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(), goblinFollowerOne.getHP());
                        while(!character.isDead() && !goblinsAreDead){
                            art.getGoblinFightTargetTextTwo(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1){// Leader
                                art.getGoblinLeaderTargetText();
                                if(attackChoice == 1){//Strong attack
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2){//standard attack 
                                    GoblinBattle.goblinLeaderAttackStrong(standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3){//Weak attack
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                }
                                else{//improper selection
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2){//Follower 1
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if(attackChoice == 1){//Strong attack
                                    GoblinBattle.goblinFollowerOneAttackStrong(strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2){//standard attack 
                                    GoblinBattle.goblinFollowerOneAttackStandard(standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3){//Weak attack
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                }
                                else{//improper selection
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else{//improper selection
                                art.getFailedToMakeSelection();
                                character.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead()){
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1){//Strong attack
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2){//Standard attack
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3){//Weak attack
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0){//Positive attack
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0){//negative attack
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, character.getHP());
                            }
                            if(!goblinFollowerOne.isDead()){// Goblin Follower 1's turn
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1){//Strong attack
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2){//Standard attack
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    character.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3){//Weak attack
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0){//Positive attack
                                       character.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0){//negative attack
                                        damageTaken = 0;
                                    }
                                }
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken, character.getHP());
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead()){//If any goblin is alive
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead()){//if all goblins are dead
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    else if(goblinFollowerCount == 2)//If 2 followers 
                    {
                        //Creates follower goblin one
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) + 10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 1 
                        //Creates follower goblin two
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) + 10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 2
                        
                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(), goblinFollowerOne.getHP(), goblinFollowerTwo.getHP());
                        while(!character.isDead() && !goblinsAreDead)
                        {
                            art.getGoblinFightTargetTextThree(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1)// Leader
                            {
                                System.out.println(ArtAndText.goblinLeaderTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                }
                                else//improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2) //Follower 1
                            {
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackStrong(strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinFollowerOneAttackStandard(standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                }
                                else//improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 3) //Follower 2
                            {
                                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStrong(strong.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStandard(standard.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackWeak(weak.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                }
                            }
                            else//improper selection
                            {
                                art.getFailedToMakeSelection();
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
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, character.getHP());
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
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken, character.getHP());
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
                                GoblinBattle.goblinFollowerTwoTurnOutPut(damageTaken, character.getHP());
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
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) + 10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 1 
                        //Creates follower goblin two
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) + 10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 10; //Changes health range to 10 - 20
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 2
                        //Creates follower goblin three
                        goblinFollowerDamage = random.randomNumber(Constants.goblinFollowerDMGUpperBound) + 10; //Changes damage range to 10 - 15
                        goblinFollowerHealth = random.randomNumber(Constants.goblinFollowerHealthUpperBound) + 7; //Changes health range to 7 - 17
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerHealth, goblinFollowerDamage); // creates Goblin follower 3

                        //Fighting Explanation
                        if(!foughtOnce){
                            art.getCombatExplanation();
                        }
                        //Initial statement
                        GoblinBattle.initialText(goblinFollowerCount, goblinLeader.getHP(), goblinFollowerOne.getHP(), goblinFollowerTwo.getHP(), goblinFollowerThree.getHP());
                        while(!character.isDead() && !goblinsAreDead)
                        {
                            art.getGoblinFightTargetTextFour(); //Chooses who will be attacked
                            attackTarget = scanner.nextInt();
                            art.getAttackTypeChoiceText();
                            attackChoice = scanner.nextInt();
                            if(attackTarget == 1)// Leader
                            {
                                System.out.println(ArtAndText.goblinLeaderTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(strong.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinLeaderAttackStrong(standard.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinLeaderAttackWeak(weak.getAttackDamage(), goblinLeader.getHP());
                                    goblinLeader.takeDamage(weak.getAttackDamage());
                                }
                                else//improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 2) //Follower 1
                            {
                                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackStrong(strong.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinFollowerOneAttackStandard(standard.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinFollowerOneAttackWeak(weak.getAttackDamage(), goblinFollowerOne.getHP());
                                    goblinFollowerOne.takeDamage(weak.getAttackDamage());
                                }
                                else//improper selection
                                {
                                    art.getFailedToMakeSelection();
                                    character.kill();//set health to 0 to end loop
                                }
                            }
                            else if(attackTarget == 3) //Follower 2
                            {
                                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStrong(strong.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinFollowerTwoAttackStandard(standard.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinFollowerTwoAttackWeak(weak.getAttackDamage(), goblinFollowerTwo.getHP());
                                    goblinFollowerTwo.takeDamage(weak.getAttackDamage());
                                }
                            }
                            else if(attackTarget == 4) //Follower 3
                            {
                                System.out.println(ArtAndText.goblinFollowerThreeTargetText);
                                if(attackChoice == 1)//Strong attack
                                {
                                    GoblinBattle.goblinFollowerThreeAttackStrong(strong.getAttackDamage(), goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(strong.getAttackDamage());
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    GoblinBattle.goblinFollowerThreeAttackStandard(standard.getAttackDamage(), goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(standard.getAttackDamage());
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    GoblinBattle.goblinFollowerThreeAttackWeak(weak.getAttackDamage(), goblinFollowerThree.getHP());
                                    goblinFollowerThree.takeDamage(weak.getAttackDamage());
                                }
                            }
                            else//improper selection
                            {
                                art.getFailedToMakeSelection();
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
                                GoblinBattle.goblinLeadersTurnOutPut(damageTaken, character.getHP());
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
                                GoblinBattle.goblinFollowerOneTurnOutPut(damageTaken, character.getHP());
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
                                GoblinBattle.goblinFollowerTwoTurnOutPut(damageTaken, character.getHP());
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
                                GoblinBattle.goblinFollowerThreeTurnOutPut(damageTaken, character.getHP());
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
                        character.increaseArtifacts(Constants.goblinWinArtifactReward);
                        GoblinBattle.winText(character.getArtifact());
                    }
                break;
                case 5: //Fight guards
                    GuardFight.initialFightText();
                    townChoice = scanner.nextInt();
                    switch(townChoice){
                    case 1: //Go willingly
                        GuardFight.goPeacefulText();
                        //Random to decide if fight starts 1 in 6 it does
                        fightStart = random.randomNumber(Constants.townJailChanceFightUpperBound);
                        if(fightStart == 0)//If var = 0 then start fight if not continue
                        {
                            damageTaken = random.randomNumber(Constants.townJailFightDMGTakenUpperBound);
                            character.takeDamage(damageTaken);
                            GuardFight.jailFight(damageTaken, character.getHP());
                        }
                        else if((fightStart >= 1) && (fightStart <= 5))
                        {
                            System.out.println("Your stay was uneventful."); 
                        }
                        //Random to get sentance 
                        courtSentancing = random.randomNumber(Constants.townCourtSentancingUpperBound);
                        GuardFight.afterJailText();

                        if((courtSentancing >= 0) && (courtSentancing <= 14))//Fine
                        {
                            fine = -1 * random.randomNumber(Constants.townFineUpperBound);
                            character.increaseArtifacts(fine);
                            GuardFight.fine(fine, character.getArtifact());
                        }
                        else if((courtSentancing >= 15) && (courtSentancing <= 24))//Jail 0 - 10
                        {
                            damageTaken = random.randomNumber(Constants.townDMGTakenFromJailUpperBound);
                            GuardFight.jail(damageTaken, character.getHP());
                            character.takeDamage(damageTaken);
                            { /*Wait*/ 
                            try
                            {
                                Thread.sleep(5000);
                            }
                            catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }}
                        }
                        else if((courtSentancing >= 25) && (courtSentancing <= 29) )//Fine and Jail
                        {
                            //Fine
                            fine = -1 * random.randomNumber(Constants.townFineUpperBound);
                            character.increaseArtifacts(fine);
                            GuardFight.fine(fine, character.getArtifact());
                            //Jail
                            damageTaken = random.randomNumber(Constants.townDMGTakenFromJailUpperBound);
                            GuardFight.jail(damageTaken, character.getHP());
                            character.takeDamage(damageTaken);
                            { /*Wait*/
                            try
                            {
                                Thread.sleep(5000);
                            }
                                catch(InterruptedException ex)
                            {
                                Thread.currentThread().interrupt();
                            }}
                        }
                        else if(courtSentancing == 30)//Execution
                        {
                            GuardFight.executionText();
                            character.kill();
                        } 
                        break;
                    case 2: //Beg for mercy
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
                        break;
                    case 3: //Fight back
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
                            GuardFight.fightWinText();
                            townChoice = scanner.nextInt();
                            if(townChoice == 1){//Take from guards
                                artifactsFoundOnGuards = random.randomNumber(Constants.townArtifactsOnGuardsUpperBound);
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
                        break; 
                    default:
                        art.getFailedToMakeSelection();
                        character.kill();//set health to 0 to end loop
                        break;
                    }break;
                case 6: //Night ADD variety
                    art.getNightInitialText(character.getArtifact());
                    sleepPlaceChoice = scanner.nextInt();//Town Extra damage
                    if(sleepPlaceChoice == 1){ //Town Extra damage
                        if((character.getArtifact() - 1) > 0){
                        character.increaseArtifacts(-1);
                        art.getNightChoiceOneNightText();
                        { /*sleep command*/
                            try{
                                Thread.sleep(3000);}
                            catch(InterruptedException ex){
                                Thread.currentThread().interrupt();}}
                        atk = random.randomNumber(Constants.nightCoiceOneAttackIncreaseUpperBound) + 1; //Increase attack by 1-5
                        art.getNightChoiceOneMorningText(atk);
                        character.increaseAttack(atk);
                        }
                        else{
                            System.out.println("You don't have enough artifacts for that.");
                            sleepPlaceChoice = 2;
                        }
                    }
                    if(sleepPlaceChoice == 2){//Tree Dangerous
                        art.getNightChoiceTwoNightText();
                        { /*sleep command*/
                            try{
                                Thread.sleep(3000);}
                            catch(InterruptedException ex){
                                Thread.currentThread().interrupt();}}
                        damageTaken = random.randomNumber(Constants.nightChoiceOneDamageTakenUpperBound) + 1;
                        switch(random.randomNumber(nightChance)){
                            case 0: //Cold
                            art.getNightChoiceTwoMorningColdText(damageTaken);
                            break;
                            case 1: //Animal
                            art.getNightChoiceTwoMorningAnimalText(damageTaken, characterName);
                            break;
                            case 2: //?
                            art.getNightChoiceTwoMorningFigureOutText(damageTaken);
                            break;
                        }
                        character.takeDamage(damageTaken);
                    }
                break;
                default:
                System.out.println("ERROR not a valid event");
                System.exit(3);
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
                    art.getEndingText();
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
                art.getEndingText();
                //End program
                System.exit(2);
            }
        System.out.println("Hi");
        System.out.println(moveOn);
        art.getEndingText();
        scanner.close();
    }
  }