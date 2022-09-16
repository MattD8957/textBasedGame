package textBasedGame;
import java.util.*;
import java.util.Random;


public class Main {
    public static void main(String args[]) {

        String moveOn; //Player imputs when to continue
        String characterName; //gets the name the player wants for the player 
        int upperbound = 0;//sets the upperbound of Randoms 
        int event = 3;//chooses which event will happen
        int amountHealed = 0;//amount of HP added by the doctor
        int damageTaken = 0; //random amount of damage done to player for method
        int atk = 0; // This is the amount of damage added to attack damage
        int escapeChance = 0; //This is the chance out of 5 of events hapenning while escaping the dragon
        int dragonHP = 1; //This is for class creation
        int dragonAttack = 1; //This is for class creation
        int attackChoice = 0; // This is to choose your attack
        int bearHP = 0; //This is for class creation
        int bearAttack = 0; //This is for class creation
        int goblinLeaderDamage = 0; //This is for class creation
        int goblinLeaderHealth = 0; //This is for class creation
        int goblinFollowersCount = 0; //This is for if that creates goblins
        int goblinFollowerOneHealth = 0; //This is for class creation
        int goblinFollowerOneDamage = 0; //This is for class creation
        int goblinFollowerTwoHealth = 0; //This is for class creation
        int goblinFollowerTwoDamage = 0; //This is for class creation
        int goblinFollowerThreeHealth = 0; //This is for class creation
        int goblinFollowerThreeDamage = 0; //This is for class creation
        int goblinFollowerFourHealth = 0; //This is for class creation
        int goblinFollowerFourDamage = 0; //This is for class creation
        int attackTarget = 0; //decides who to attack
        int questChoice = 0; //Players choice of what quest to take
        int barChoice = 0; //Players choice of what to do at the bar
        int townChoice = 0; //Players choice when arrested in town
        int chosenClass = 0; //Players choice of Character 
        int fightStart = 0; //Random to decide if a fight starts in jail
        int courtSentancing = 0; //The random that gives a sentance for the players crimes
        int fine = 0; //Use to fine the player of artifacts 
        boolean startRandom = true;//starts the random number loops
        boolean goblinsAreDead = false; //Checks if goblin horde is dead for loop
        boolean guardsAreDead = false; //Checks if gaurds are dead
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        //Clears screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //entrance screen
        System.out.println(" ____      ____      __                                     ");
        System.out.println("|_  _|    |_  _|    [  |                                    ");
        System.out.println("  \\ \\  /\\  / /.---.  | |  .---.   .--.   _ .--..--.  .---.  ");
        System.out.println("   \\ \\/  \\/ // /__\\\\ | | / /'`\\]/ .'`\\ \\[ `.-. .-. |/ /__\\\\ ");
        System.out.println("    \\  /\\  / | \\__., | | | \\__. | \\__. | | | | | | || \\__., ");
        System.out.println("     \\/  \\/   '.__.'[___]'.___.' '.__.' [___||__||__]'.__.' ");
        System.out.println("Choose a class:");
        System.out.println("1 for Rogue");//Rogue
        System.out.println("2 for Palidin");//Paladin
        System.out.println("3 for Barbarian");//Barbarian
        chosenClass = scanner.nextInt();
        //Clears screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        if(chosenClass == 1)//Rogue
        {
            //Gets players name for charecter then clears screen
            System.out.println("What would you like to name your charecter?");
            characterName = scanner.next();
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            
            Character rogue = new Character (100, 100, characterName, 15, 40, 0); // Sets HP, Max HP, Name, and initial attack damage can be changed, Max damage, treasures, in order.
            // For all but change the names currently set up for Rogue
            //Set up the three attacks
            Attack strong = new Attack(25, 50, 10); // Damage, Max damage, weakness
            Attack standard = new Attack(15, 40, 0); // Damage, Max damage, weakness
            Attack weak = new Attack(5, 30, -10); // Damage, Max damage, weakness
            //Information for player at start of game
            System.out.println("The objective of the game is to collect 25 artifacts.");//Decide on amount of artifacts
            System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
            System.out.println("Strong attacks do more damage but leaves you vunerable.");
            System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
            System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
            System.out.println("You start with 100Hp and doing 15dmg for standard attacks.");
            System.out.println("Press any key to continue ");
            //Wait until player presses a button
            moveOn = scanner.next();
            //Clears screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            //Start game loop
            while(!rogue.isDead())
            { 
                //sleep command
                {try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                }
                startRandom = true;
                while(startRandom == true) //Random number to get Event
                {
                    Random rand = new Random();//creates random class
                    upperbound = 5; //sets upperbound = to 5, needs to be one greater than desired amount
                    event = rand.nextInt(upperbound);//generates number 0 to 5
                    startRandom = false;
                } 
                //Clears screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //EVENTS
                if(event == 0) //Fight dragon
                {
                    System.out.println("You meet a dragon.");
                    {//Dragon Art
System.out.println("              __");
System.out.println("          _.-'.-'-.__");
System.out.println("       .-'.       '-.'-._ __.--._");
System.out.println("-..'\\,-,/..-  _         .'   \\   '----._");
System.out.println(" ). /_ _\\' ( ' '.         '-  '/'-----._'-.__");
System.out.println(" '..'     '-r   _      .-.       '-._ \\");
System.out.println(" '.\\. Y .).'       ( .'  .      .\\          '\\'.");
System.out.println(" .-')'|'/'-.        \\)    )      '',_      _.c_.\\");
System.out.println("   .<, ,>.          |   _/\\        . ',   :   : \\\\");
System.out.println("  .' \\_/ '.        /  .'   |          '.     .'  \\)");
System.out.println("                  / .-'    '-.        : \\   _;   ||");
System.out.println("                 / /    _     \\_      '.'\\ ' /   ||");
System.out.println("                /.'   .'        \\_      .|   \\   \\|");
System.out.println("               / /   /      __.---'      '._  ;  ||");
System.out.println("              /.'  _:-.____< ,_           '.\\ \\  ||");
System.out.println("             // .-'     '-.__  '-'-\\_      '.\\/_ \\|");
System.out.println("            ( };====.===-==='        '.    .  \\\\: \\");
System.out.println("             \\\\ '._        /          :   ,'   )\\_ \\");
System.out.println("              \\\\   '------/            \\ .    /   )/");
System.out.println("              \\|        _|             )Y    |   /");
System.out.println("                \\\\      \\             .','   /  ,/");
System.out.println("                 \\\\    _/            /     _/");
System.out.println("                  \\\\   \\           .'    .'");
System.out.println("                   '| '1          /    .'");
System.out.println("                     '. \\        |:    /");
System.out.println("                       \\ |       /', .'");
System.out.println("                        \\(      ( ;z'");
System.out.println("                         \\:      \\ '(_");
System.out.println("                          \\_,     '._ '-.___");
System.out.println("                                      '-' -.\\");
                    }
                    System.out.println("You can either rob it or try to escape");
                    System.out.println("1 to escape");
                    System.out.println("2 to atempt to rob the dragon");
                    int dragonChoice = scanner.nextInt();
                    
                    if(dragonChoice == 1)//1 For escape
                    // 1 in 5 chance of freedom 
                    // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                    // 2 in 5 chance of waking the dragon and having to fight it - if you win you still get the treasure
                    {
                        startRandom = true;
                        while(startRandom == true)
                        { 
                            //generates percent chances
                            Random rand = new Random();//creates random class
                            upperbound = 5; //sets upperbound = to 4, needs to be one greater than desired amount
                            escapeChance = rand.nextInt(upperbound);//generates number 0 to 4
                            startRandom = false;
                        } 
                        if(escapeChance == 0)//escape succesfully
                        {
                            System.out.println("You succesfully escape and can continue your journey.");
                        }
                        else if((escapeChance == 1) || (escapeChance == 2))//trip and take some damage 1 to 10
                        {
                            startRandom = true;
                        while(startRandom == true)
                        { 
                            //generates percent chances
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                            startRandom = false;
                        }
                            rogue.takeDamage(damageTaken);
                            System.out.println("On your way out you fall and take some damage.");
                            System.out.println("You succesfully escape only taking " + damageTaken + " damge, you now have " + rogue.getHP() + "HP.");
                            System.out.println("You leave and continue your journey.");
                        }
                        else if((escapeChance == 3) || (escapeChance == 4))//You fail to escape and have to fight the dragon
                        {
                            //Message after failing to escape
                            System.out.println("You fail to ecapse and awake the dragon. You will have to fight him.");
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
                            //generate dragon Hp 10-75 
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragon HP
                                Random rand = new Random();//creates random class
                                upperbound = 66; //sets upperbound = to 66
                                dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                                startRandom = false;
                                dragonHP += 10;//Dragon health 10 - 75
                            }
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragons attack
                                Random rand = new Random();//creates random class
                                upperbound = 16; //sets upperbound = to 16, 
                                dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                                dragonAttack += 20;
                                startRandom = false;
                            }
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            //Explanation for player at start of battle
                            System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                            System.out.println("Strong attacks do more damage but leaves you vunerable.");
                            System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                            System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                            while(!rogue.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                if(!dragon.isDead())//If still alive dragons turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           rogue.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + rogue.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               rogue.increaseArtifacts(1); 
                               System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                            }
                        }
                    }
                    else if(dragonChoice == 2)//To rob the dragon
                    {
                        //Fight dragon same code as above
                        //generate dragon Hp 10-75 
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragon HP
                                Random rand = new Random();//creates random class
                                upperbound = 66; //sets upperbound = to 66
                                dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                                startRandom = false;
                                dragonHP += 10;//Dragon health 10 - 75
                            }
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragons attack
                                Random rand = new Random();//creates random class
                                upperbound = 16; //sets upperbound = to 16, 
                                dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                                dragonAttack += 20;
                                startRandom = false;
                            }
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            while(!rogue.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                if(!dragon.isDead())//If still alive dragons turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           rogue.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + rogue.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               rogue.increaseArtifacts(1); 
                               System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                            }
                        }
                    else //type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                    }
                }
                else if(event == 1)//Fight Bear
                {
                    System.out.println("You are travaling in the forest when you run into an agressive bear.");
                    //Create bear
                    startRandom = true;
                    while(startRandom == true)
                    { 
                        //generates bear's HP
                        Random rand = new Random();//creates random class
                        upperbound = 26; //sets upperbound = to 26
                        bearHP = rand.nextInt(upperbound);//generates number 0 to 25
                        startRandom = false;
                        bearHP += 20;//bear health 20 - 45
                    }
                    startRandom = true;
                    while(startRandom == true)
                    { 
                        //generates bear's attack
                        Random rand = new Random();//creates random class
                        upperbound = 11; //sets upperbound = to 11, 
                        bearAttack = rand.nextInt(upperbound);//generates number 0 to 10
                        bearAttack += 10;//bears do 10 to 20 dmg                            startRandom = false;
                    }
                    Enemy bear = new Enemy(bearHP, bearAttack); //HP then attack dmg
                    while(!rogue.isDead() && !bear.isDead())
                        {
                                System.out.println("The bear has " + bear.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = bear.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = bear.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                           rogue.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The bear attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + rogue.getHP() + " HP.");
                                }
                            }
                    if(bear.isDead())//After loop ends if Bear died
                    {
                        System.out.println("Congratulations you beat the bear! You get to keep its artifact.");
                        rogue.increaseArtifacts(.5); 
                        System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                    }
                }
                else if(event == 2)//Go into a bar
                {
                    System.out.println("You walk into a bar.");
                    System.out.println("You have three choices,");
                    System.out.println("Type 1 to start a brawl.");
                    System.out.println("Type 2 to buy a weapon from a local salesman."); 
                    System.out.println("Type 3 to talk to the guards and get a quest.");
                    barChoice = scanner.nextInt();
                    
                    if(barChoice == 1)//Start a brawl
                    {
                        System.out.println("You decide to start a brawl");
                        //Determine amount of damage taken.
                        startRandom = true;
                        while(startRandom == true) 
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 21; //sets upperbound = to 20
                            damageTaken = rand.nextInt(upperbound);//generates number 0 to 20
                            startRandom = false;
                        }
                        System .out.println("In the fight you take " + damageTaken + " damage.");
                        rogue.takeDamage(damageTaken);
                        System.out.println("You now have " + rogue.getHP() + " HP.");
                    }
                    else if(barChoice == 2)//Buy a weapon
                    {
                        System.out.println("You meet a local blacksmith, he offers a sword that will increase your damage by 1 to 15.");
                        //Determine the additional damage for the futre.
                        System.out.println("Attack before addition " + rogue.getAttack());
                        startRandom = true;
                        while(startRandom == true) 
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 15; //sets upperbound to 15
                            atk = rand.nextInt(upperbound);//generates number 0 to 14
                            atk ++;
                            //incerase attack damage
                            rogue.increaseAttack(atk);
                            strong.increaseAttackDamage(atk);
                            standard.increaseAttackDamage(atk);
                            weak.increaseAttackDamage(atk);
                            
                            startRandom = false;
                        }
                        if(rogue.getAttack() <= rogue.getMaxAttack())//If not over max attack damage state attack damage
                        {
                            System.out.println("New attack damage " + rogue.getAttack());
                        }
                        else if(rogue.getAttack() > rogue.getMaxAttack())//If over max attack damage set to max attack damage and then state attack damage 
                        {
                            rogue.setMaxAttack();
                            strong.setMaxAttackDamage();
                            standard.setMaxAttackDamage();
                            weak.setMaxAttackDamage();
                            System.out.println("New attack damage " + rogue.getAttack());
                            
                        }
                    }
                    else if(barChoice == 3)// Get quest from guards
                    {
                        //TODO Finish this
                        System.out.println("You talk to the guards to get a quest.");
                        System.out.println("He gives you three quests and tells you to choose one.");
                        System.out.println("The first quest is to take down a smugiling ring.");
                        System.out.println("The second quest is to defeat an evil queen.");
                        System.out.println("The third quest is");
                        System.out.println("Which quest do you choose. Type 1, 2, or 3");
                        questChoice = scanner.nextInt();
                        if(questChoice == 1)//Defeat smugiling group
                        {
                            
                        }
                        else if(questChoice == 2)//Defeat Evil king
                        {
                            
                        }
                        else if(questChoice == 3)
                        {
                            
                        }
                        else
                        {
                            System.out.println("You failed to make a selection.");
                            //Wait
                            try
                            {
                                Thread.sleep(750);
                            }
                            catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        rogue.kill();//set health to 0 to end loop
                        }
                    }
                    else // type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        rogue.kill();//set health to 0 to end loop
                    }
                }
                else if(event == 3)//Go to a doctor
                {
                    System.out.println(event + " Doctor");
                    System.out.println("You go to a doctor, he can heal you 10 to 50HP.");
                    //sleep command
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    //decide on amount healed 10-50
                    startRandom = true;
                    while(startRandom == true) 
                    {
                        Random rand = new Random();//creates random class
                        upperbound = 41; //sets upperbound = to 40
                        amountHealed = rand.nextInt(upperbound);//generates number 0 to 40
                        amountHealed += 10;
                        System.out.println("He heals you " + amountHealed + "HP");
                        startRandom = false;
                    }
                    if (rogue.heal(amountHealed) < rogue.getMaxHP())//If not over max health state new health.
                    {
                        System.out.println("Your new health is " + rogue.getHP());
                    }
                    else if (rogue.heal(amountHealed) > rogue.getMaxHP())//When over max health says so and set to max
                    {
                        rogue.setMaxHP();
                        System.out.println("Your new health is " + rogue.getHP());    
                    }
                }
                else if(event == 4)//Goblin horde
                {
                    System.out.println("You are travaling and a group of golblins is trying to rob you.");
                    //Create the golblins
                    //Create leader Goblin
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get Leader damage
                        Random rand = new Random();//creates random class
                        upperbound = 16; //sets upperbound to 16
                        goblinLeaderDamage = rand.nextInt(upperbound);//generates number 0 to 15
                        goblinLeaderDamage += 10;
                        startRandom = false;
                    } 
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get Leader health
                        Random rand = new Random();//creates random class
                        upperbound = 26; //sets upperbound = to 26, needs to be one greater than desired amount
                        goblinLeaderHealth = rand.nextInt(upperbound);//generates number 0 to 25
                        goblinLeaderHealth += 20;
                        startRandom = false;
                    }   
                    Enemy goblinLeader = new Enemy (goblinLeaderHealth, goblinLeaderDamage);//Hp, Attack dmg
                    
                    //Random number to get amount of follower goblins
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get amount of goblin followers
                        Random rand = new Random();//creates random class
                        upperbound = 4; //sets upperbound = to 3
                        goblinFollowersCount = rand.nextInt(upperbound);//generates number 0 to 3
                        goblinFollowersCount ++;//Makes range 1 - 4
                        startRandom = false;
                    } 
                    
                    if(goblinFollowersCount == 1)//If 1 follower
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1
                        
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                        System.out.println("Strong attacks do more damage but leaves you vunerable.");
                        System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                        System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His follower has " + goblinFollowerOne.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!rogue.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 2)//If 2 followers Copy but add one more loop
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                        System.out.println("Strong attacks do more damage but leaves you vunerable.");
                        System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                        System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + " and " + goblinFollowerTwo.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!rogue.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 3)//If 3 followers
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Creates follower goblin three
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerThree damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Three's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                    
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                        System.out.println("Strong attacks do more damage but leaves you vunerable.");
                        System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                        System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", and " + goblinFollowerThree.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!rogue.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            System.out.println("4 for henchman 3");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
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
                            else if(attackTarget == 3) //Follower 3
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
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 4)//If 4 followers
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Creates follower goblin three
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerThree damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Three's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                        
                        //Creates follower goblin four
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerFour damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerFourDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerFourDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Four's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerFourHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerFourHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerFour = new Enemy (goblinFollowerFourHealth, goblinFollowerFourDamage); // creates Goblin follower 4
                        
                        
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                        System.out.println("Strong attacks do more damage but leaves you vunerable.");
                        System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                        System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", " + goblinFollowerThree.getHP() + ", and " + goblinFollowerFour.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!rogue.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            System.out.println("4 for henchman 3");
                            System.out.println("5 for henchman 4");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
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
                            else if(attackTarget == 5) //Follower 4
                            {
                                System.out.println("You attack the fourth Henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerFour.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerFour.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerFour.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                            }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                rogue.takeDamage(rogue.getMaxHP());//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            if(!goblinFollowerFour.isDead())// Goblin Follower 4's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + strong.getAttackPenalty(); 
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + standard.getAttackPenalty();
                                    rogue.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                       rogue.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The fourth henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + rogue.getHP() + " HP.");
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead() || !goblinFollowerTwo.isDead() || !goblinFollowerThree.isDead() || !goblinFollowerFour.isDead())//If any goblin is alive
                            {
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead() && goblinFollowerTwo.isDead() && goblinFollowerThree.isDead() && goblinFollowerFour.isDead())//if all goblins are dead
                            {
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    if(goblinsAreDead)
                    {
                        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts.");
                        rogue.increaseArtifacts(10);
                        System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                    }
                }
                else if(event == 5)//Fight guards
                {
                    System.out.println("You enter a town to rest but the gaurds stop you.");
                    System.out.println("They belive you to be a criminal and arrest you.");
                    System.out.println("As they take you to jail you have 3 options.");
                    System.out.println("1 to go with them willingly.");
                    System.out.println("2 to beg for mercy.");
                    System.out.println("3 to fight back and try to escape.");
                    townChoice = scanner.nextInt();
                    if(townChoice == 1)//Go willingly
                    {
                        System.out.println("You go with the gaurds.");
                        System.out.println("They put you in a cell and tell you that the sentanceing will happen the next monday.");
                        //Random to decide if fight starts 1 in 6 it does
                        startRandom = true;
                        while(startRandom == true) //Random number to get Event
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound = to 6, needs to be one greater than desired amount
                            fightStart = rand.nextInt(upperbound);//generates number 0 to 5
                            startRandom = false;
                        }
                        if(fightStart == 0)//If var = 0 then start fight if not continue
                        {
                            System.out.println("During lunch the next day a fight breaks out.");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {  
                                Random rand = new Random();//creates random class
                                upperbound = 8; //sets upperbound = to 8, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 7
                                startRandom = false;
                            } 
                            System.out.println("In the brawl you lose " + damageTaken + " Hp.");
                            System.out.println("You now have " + rogue.getHP() + "Hp.");
                            System.out.println("The rest of your stay is uneventful");
                        }
                        else if((fightStart == 1) || (fightStart == 2) || (fightStart == 3) || (fightStart == 4) || (fightStart == 5))
                        {
                            System.out.println("Your stay was uneventful."); 
                        }
                        System.out.println("Monday arrives and you are taken to the court.");
                        //Random to get sentance 
                        startRandom = true;
                        while(startRandom == true) //Random number to get court Sentance
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 31; //sets upperbound to 31, needs to be one greater than desired amount
                            courtSentancing = rand.nextInt(upperbound);//generates number 0 to 30
                            startRandom = false;
                        }
                        System.out.println("The trial passes and at the end you are sentaced.");
                        //Chances out of 30
                        // Fine 15 in 31
                        // Jail 10 in 31
                        // Fine and Jail 5 in 31
                        // Execution 1 in 31

                        if((courtSentancing == 0) || (courtSentancing == 1) || (courtSentancing == 2) || (courtSentancing == 3) || (courtSentancing == 4) || (courtSentancing == 5) || (courtSentancing == 6) || (courtSentancing == 7) || (courtSentancing == 8) || (courtSentancing == 9) || (courtSentancing == 10) || (courtSentancing == 11) || (courtSentancing == 12) || (courtSentancing == 13) || (courtSentancing == 14))//Fine
                        {
                            startRandom = true;
                            while(startRandom == true) //Random number to get fine amount
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                                fine = rand.nextInt(upperbound);//generates number 0 to 5
                                startRandom = false;
                            }
                            System.out.println("You are sentanced to pay a fine of " + fine + " artifacts.");
                            fine *= -1;
                            rogue.increaseArtifacts(fine);
                            System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                        }
                        else if((courtSentancing == 15) || (courtSentancing == 16) || (courtSentancing == 17) || (courtSentancing == 18) || (courtSentancing == 19) || (courtSentancing == 20) || (courtSentancing == 21) || (courtSentancing == 22) || (courtSentancing == 23) || (courtSentancing == 24))//Jail
                        {
                            //Jail time take dmg 0 - 10
                            System.out.println("You are then sentanced to one year in jail");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                                startRandom = false;
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            rogue.takeDamage(damageTaken);
                            System.out.println("You now have " + rogue.getHP() + "Hp.");
                        }
                        else if((courtSentancing == 25) || (courtSentancing == 26) || (courtSentancing == 27) || (courtSentancing == 28) || (courtSentancing == 29) )//Fine and Jail
                        {
                            //Fine
                            {startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                                fine = rand.nextInt(upperbound);//generates number 0 to 5
                                startRandom = false;
                            }
                            System.out.println("You are first sentanced to pay a fine of " + fine + " artifacts.");
                            rogue.increaseArtifacts(fine);
                            System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
                            }
                            //Jail time take dmg 0 - 10
                            {System.out.println("You are then sentanced to one year in jail");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                                startRandom = false;
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            rogue.takeDamage(damageTaken);
                            System.out.println("You now have " + rogue.getHP() + "Hp.");
                            }
                        }
                        else if(courtSentancing == 30)//Execution
                        {
                            System.out.println("You are convicted of murder and sentanced to death.");
                            rogue.kill();
                        } 
                    }
                    else if(townChoice == 2)//Beg for mercy
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You beg for mercy.");
                        System.out.println("They decide to be leniant and give you a fine of 3 artifacts instead.");
                        rogue.increaseArtifacts(-3);
                        System.out.println("You now have " + rogue.getArtifact() + " artifacts.");
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
                        //sleep command
                        {try
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
                        System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
                        System.out.println("Strong attacks do more damage but leaves you vunerable.");
                        System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
                        System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
                        while(!rogue.isDead() && !guardsAreDead )  
                        {
                            System.out.println("1 for Strong attack");
                            System.out.println("2 for Standard attack");
                            System.out.println("3 for Weak attack");
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
                                if(!guardOne.isDead())//Guard ones turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardThree.isDead())//Gaurd three's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                                if(!guardTwo.isDead())//Guard ones turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFour.isDead())//Gaurd four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFive.isDead())//Gaurd five's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                                if(!guardTwo.isDead())//Guard four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFour.isDead())//Gaurd six's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardOne.isDead())//Gaurd one's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                }
                                if(!guardTwo.isDead())//Gaurd two's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        rogue.takeDamage(damageTaken);
                                        System.out.println("Gaurd two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + rogue.getHP() + "Hp.");
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
                            System.out.println("You defeat the guards!");
                            System.out.println("Do you want to loot the town?");
                            System.out.println("1 = Yes.");
                            System.out.println("2 = No.");
                            if(townChoice == 1)//Yes
                            {
                                System.out.println("You are a bad person.");
                                rogue.kill();
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
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        rogue.kill();//set health to 0 to end loop
                    }
                }
                //Win screen
                if(rogue.getArtifact() >= 50)//If you collect 50 treasures
                {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Congradulations " + characterName);
                    //sleep command
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("__      __    ____     __    __      ___       ___    _____      __      _  _______ ");
                    System.out.println(") \\    / (   / __ \\    ) )  ( (     (  (       )  )  (_   _)    /  \\    / ) \\     / ");
                    System.out.println(" \\ \\  / /   / /  \\ \\  ( (    ) )     \\  \\  _  /  /     | |     / /\\ \\  / /   \\   /  ");
                    System.out.println("  \\ \\/ /   ( ()  () )  ) )  ( (       \\  \\/ \\/  /      | |     ) ) ) ) ) )    ) (   ");
                    System.out.println("   \\  /    ( ()  () ) ( (    ) )       )   _   (       | |    ( ( ( ( ( (     \\_/   ");
                    System.out.println("    )(      \\ \\__/ /   ) \\__/ (        \\  ( )  /      _| |__  / /  \\ \\/ /      _    ");
                    System.out.println("   /__\\      \\____/    \\______/         \\_/ \\_/      /_____( (_/    \\__/      (_)   ");
                    System.out.println(moveOn);
                }
            }
            //Death screen
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("          _______             ______  _________ _______  ______   _  ");
                System.out.println("|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( ) ");
                System.out.println("( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| | ");
                System.out.println(" \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || | ");
                System.out.println("  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || | ");
                System.out.println("   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_) ");
                System.out.println("   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _  "); 
                System.out.println("   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_) ");
            }
        }
        else if(chosenClass == 2)//Paladin
        {
            //Gets players name for charecter then clears screen
            System.out.println("What would you like to name your charecter?");
            characterName = scanner.next();
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            
            Character paladin = new Character (100, 125, characterName, 20, 45, 0); // Sets HP, Max HP, Name, and initial attack damage can be changed, Max damage, artifacts, in order.
            // For all but change the names currently set up for Rogue
            //Set up the three attacks
            Attack strong = new Attack(30, 55, 15); // Damage, Max damage, weakness
            Attack standard = new Attack(20, 45, 5); // Damage, Max damage, weakness
            Attack weak = new Attack(10, 35, -5); // Damage, Max damage, weakness
            //Information for player at start of game
            System.out.println("The objective of the game is to collect 25 artifacts.");//Decide on amount of artifacts
            System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
            System.out.println("Strong attacks do more damage but leaves you vunerable.");
            System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
            System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
            System.out.println("You start with 100Hp and doing 20dmg for standard attacks.");
            System.out.println("Press any key to continue ");
            //Wait until player presses a button
            moveOn = scanner.next();
            //Clears screen
            System.out.print("\033[H\033[2J");
            System.out.flush();

            //Start game loop
            while(!paladin.isDead())
            { 
                //sleep command
                {try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                }
                startRandom = true;
                while(startRandom == true) //Random number to get Event
                {
                    Random rand = new Random();//creates random class
                    upperbound = 5; //sets upperbound = to 5, needs to be one greater than desired amount
                    event = rand.nextInt(upperbound);//generates number 0 to 5
                    startRandom = false;
                } 
                //Clears screen
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //EVENTS
                if(event == 0) //Fight dragon
                {
                    System.out.println("You meet a dragon.");
                    {//Dragon art 
System.out.println("              __");
System.out.println("          _.-'.-'-.__");
System.out.println("       .-'.       '-.'-._ __.--._");
System.out.println("-..'\\,-,/..-  _         .'   \\   '----._");
System.out.println(" ). /_ _\\' ( ' '.         '-  '/'-----._'-.__");
System.out.println(" '..'     '-r   _      .-.       '-._ \\");
System.out.println(" '.\\. Y .).'       ( .'  .      .\\          '\\'.");
System.out.println(" .-')'|'/'-.        \\)    )      '',_      _.c_.\\");
System.out.println("   .<, ,>.          |   _/\\        . ',   :   : \\\\");
System.out.println("  .' \\_/ '.        /  .'   |          '.     .'  \\)");
System.out.println("                  / .-'    '-.        : \\   _;   ||");
System.out.println("                 / /    _     \\_      '.'\\ ' /   ||");
System.out.println("                /.'   .'        \\_      .|   \\   \\|");
System.out.println("               / /   /      __.---'      '._  ;  ||");
System.out.println("              /.'  _:-.____< ,_           '.\\ \\  ||");
System.out.println("             // .-'     '-.__  '-'-\\_      '.\\/_ \\|");
System.out.println("            ( };====.===-==='        '.    .  \\\\: \\");
System.out.println("             \\\\ '._        /          :   ,'   )\\_ \\");
System.out.println("              \\\\   '------/            \\ .    /   )/");
System.out.println("              \\|        _|             )Y    |   /");
System.out.println("                \\\\      \\             .','   /  ,/");
System.out.println("                 \\\\    _/            /     _/");
System.out.println("                  \\\\   \\           .'    .'");
System.out.println("                   '| '1          /    .'");
System.out.println("                     '. \\        |:    /");
System.out.println("                       \\ |       /', .'");
System.out.println("                        \\(      ( ;z'");
System.out.println("                         \\:      \\ '(_");
System.out.println("                          \\_,     '._ '-.___");
System.out.println("                                      '-' -.\\");
                    }
                    System.out.println("You can either rob it or try to escape");
                    System.out.println("1 to escape");
                    System.out.println("2 to atempt to rob the dragon");
                    int dragonChoice = scanner.nextInt();
                    
                    if(dragonChoice == 1)//1 For escape
                    // 1 in 5 chance of freedom 
                    // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                    // 2 in 5 chance of waking the dragon and having to fight it - if you win you still get the treasure
                    {
                        startRandom = true;
                        while(startRandom == true)
                        { 
                            //generates percent chances
                            Random rand = new Random();//creates random class
                            upperbound = 5; //sets upperbound = to 4, needs to be one greater than desired amount
                            escapeChance = rand.nextInt(upperbound);//generates number 0 to 4
                            startRandom = false;
                        } 
                        if(escapeChance == 0)//escape succesfully
                        {
                            System.out.println("You succesfully escape and can continue your journey.");
                        }
                        else if((escapeChance == 1) || (escapeChance == 2))//trip and take some damage 1 to 10
                        {
                            startRandom = true;
                        while(startRandom == true)
                        { 
                            //generates percent chances
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                            startRandom = false;
                        }
                            paladin.takeDamage(damageTaken);
                            System.out.println("On your way out you fall and take some damage.");
                            System.out.println("You succesfully escape only taking " + damageTaken + " damge, you now have " + paladin.getHP() + "HP.");
                            System.out.println("You leave and continue your journey.");
                        }
                        else if((escapeChance == 3) || (escapeChance == 4))//You fail to escape and have to fight the dragon
                        {
                            //Message after failing to escape
                            System.out.println("You fail to ecapse and awake the dragon. You will have to fight him.");
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
                            //generate dragon Hp 10-75 
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragon HP
                                Random rand = new Random();//creates random class
                                upperbound = 66; //sets upperbound = to 66
                                dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                                startRandom = false;
                                dragonHP += 10;//Dragon health 10 - 75
                            }
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragons attack
                                Random rand = new Random();//creates random class
                                upperbound = 16; //sets upperbound = to 16, 
                                dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                                dragonAttack += 20;
                                startRandom = false;
                            }
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            while(!paladin.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                if(!dragon.isDead())//If still alive dragons turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                            paladin.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + paladin.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               paladin.increaseArtifacts(1); 
                               System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                            }
                        }
                    }
                    else if(dragonChoice == 2)//To rob the dragon
                    {
                        //Fight dragon same code as above
                        //generate dragon Hp 10-75 
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragon HP
                                Random rand = new Random();//creates random class
                                upperbound = 66; //sets upperbound = to 66
                                dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                                startRandom = false;
                                dragonHP += 10;//Dragon health 10 - 75
                            }
                            startRandom = true;
                            while(startRandom == true)
                            { 
                                //generates dragons attack
                                Random rand = new Random();//creates random class
                                upperbound = 16; //sets upperbound = to 16, 
                                dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                                dragonAttack += 20;
                                startRandom = false;
                            }
                            //Create Dragon 
                            Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                            while(!paladin.isDead() && !dragon.isDead())
                            {
                                System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                if(!dragon.isDead())//If still alive dragons turn
                                {
                                    //To determine which attack was used and so what buff
                                    if(attackChoice == 1)//Strong attack
                                    {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                            paladin.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + paladin.getHP() + " HP.");
                                }
                            }
                            if(dragon.isDead())//After loop ends if Dragon died
                            {
                               System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                               paladin.increaseArtifacts(1); 
                               System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                            }
                        }
                    else //type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        paladin.takeDamage(paladin.getMaxHP());//set health to 0 to end loop
                    }
                }
                else if(event == 1)//Fight Bear
                {
                    System.out.println("You are travaling in the forest when you run into an agressive bear.");
                    //Create bear
                    startRandom = true;
                    while(startRandom == true)
                    { 
                        //generates bear's HP
                        Random rand = new Random();//creates random class
                        upperbound = 26; //sets upperbound = to 26
                        bearHP = rand.nextInt(upperbound);//generates number 0 to 25
                        startRandom = false;
                        bearHP += 20;//bear health 20 - 45
                    }
                    startRandom = true;
                    while(startRandom == true)
                    { 
                        //generates bear's attack
                        Random rand = new Random();//creates random class
                        upperbound = 11; //sets upperbound = to 11, 
                        bearAttack = rand.nextInt(upperbound);//generates number 0 to 10
                        bearAttack += 10;//bears do 10 to 20 dmg                            startRandom = false;
                    }
                    Enemy bear = new Enemy(bearHP, bearAttack); //HP then attack dmg
                    while(!paladin.isDead() && !bear.isDead())
                        {
                                System.out.println("The bear has " + bear.getHP() + " HP.");
                                System.out.println("1 for Strong");
                                System.out.println("2 for Standard");
                                System.out.println("3 for Weak");
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
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 2)//Standard attack
                                    {
                                        damageTaken = bear.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                    }
                                    else if(attackChoice == 3)//Weak attack
                                    {
                                        damageTaken = bear.getAttack() + weak.getAttackPenalty();
                                        if(damageTaken >= 0)//Positive attack
                                        {
                                            paladin.takeDamage(damageTaken); 
                                        }
                                        else if(damageTaken < 0)//negative attack
                                        {
                                            damageTaken = 0;
                                        }
                                    }
                                    System.out.println("The bear attacks doing " + damageTaken + " damage.");
                                    System.out.println("You now have " + paladin.getHP() + " HP.");
                                }
                            }
                    if(bear.isDead())//After loop ends if Bear died
                    {
                        System.out.println("Congratulations you beat the bear! You get to keep its artifact.");
                        paladin.increaseArtifacts(.5); 
                        System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                    }
                }
                else if(event == 2)//Go into a bar
                {
                    System.out.println("You walk into a bar.");
                    System.out.println("You have three choices,");
                    System.out.println("Type 1 to start a brawl.");
                    System.out.println("Type 2 to buy a weapon from a local salesman."); 
                    System.out.println("Type 3 to talk to the guards and get a quest.");
                    barChoice = scanner.nextInt();
                    
                    if(barChoice == 1)//Start a brawl
                    {
                        System.out.println("You decide to start a brawl");
                        //Determine amount of damage taken.
                        startRandom = true;
                        while(startRandom == true) 
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 21; //sets upperbound = to 20
                            damageTaken = rand.nextInt(upperbound);//generates number 0 to 20
                            startRandom = false;
                        }
                        System .out.println("In the fight you take " + damageTaken + " damage.");
                        paladin.takeDamage(damageTaken);
                        System.out.println("You now have " + paladin.getHP() + " HP.");
                    }
                    else if(barChoice == 2)//Buy a weapon
                    {
                        System.out.println("You meet a local blacksmith, he offers a sword that will increase your damage by 1 to 15.");
                        //Determine the additional damage for the futre.
                        System.out.println("Attack before addition " + paladin.getAttack());
                        startRandom = true;
                        while(startRandom == true) 
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 15; //sets upperbound to 15
                            atk = rand.nextInt(upperbound);//generates number 0 to 14
                            atk ++;
                            //incerase attack damage
                            paladin.increaseAttack(atk);
                            strong.increaseAttackDamage(atk);
                            standard.increaseAttackDamage(atk);
                            weak.increaseAttackDamage(atk);
                            
                            startRandom = false;
                        }
                        if(paladin.getAttack() <= paladin.getMaxAttack())//If not over max attack damage state attack damage
                        {
                            System.out.println("New attack damage " + paladin.getAttack());
                        }
                        else if(paladin.getAttack() > paladin.getMaxAttack())//If over max attack damage set to max attack damage and then state attack damage 
                        {
                            paladin.setMaxAttack();
                            strong.setMaxAttackDamage();
                            standard.setMaxAttackDamage();
                            weak.setMaxAttackDamage();
                            System.out.println("New attack damage " + paladin.getAttack());
                            
                        }
                    }
                    else if(barChoice == 3)// Get quest from guards
                    {
                        //TODO Finish this
                        System.out.println("You talk to the guards to get a quest.");
                        System.out.println("He gives you three quests and tells you to choose one.");
                        System.out.println("The first quest is to take down a smugiling ring.");
                        System.out.println("The second quest is to defeat an evil queen.");
                        System.out.println("The third quest is");
                        System.out.println("Which quest do you choose. Type 1, 2, or 3");
                        questChoice = scanner.nextInt();
                        if(questChoice == 1)//Defeat smugiling group
                        {
                            
                        }
                        else if(questChoice == 2)//Defeat Evil king
                        {
                            
                        }
                        else if(questChoice == 3)
                        {
                            
                        }
                        else
                        {
                            System.out.println("You failed to make a selection.");
                            //Wait
                            try
                            {
                                Thread.sleep(750);
                            }
                            catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        paladin.kill();//set health to 0 to end loop
                        }
                    }
                    else // type a number or letter that is not an option 
                    {
                        System.out.println("You failed to make a selection.");
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        paladin.kill();//set health to 0 to end loop
                    }
                }
                else if(event == 3)//Go to a doctor
                {
                    System.out.println("You go to a doctor, he can heal you 10 to 50HP.");
                    //sleep command
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    //decide on amount healed 10-50
                    startRandom = true;
                    while(startRandom == true) 
                    {
                        Random rand = new Random();//creates random class
                        upperbound = 41; //sets upperbound = to 40
                        amountHealed = rand.nextInt(upperbound);//generates number 0 to 40
                        amountHealed += 10;
                        System.out.println("He heals you " + amountHealed + "HP");
                        startRandom = false;
                    }
                    if (paladin.heal(amountHealed) < paladin.getMaxHP())//If not over max health state new health.
                    {
                        System.out.println("Your new health is " + paladin.getHP());
                    }
                    else if (paladin.heal(amountHealed) > paladin.getMaxHP())//When over max health says so and set to max
                    {
                        paladin.setMaxHP();
                        System.out.println("Your new health is " + paladin.getHP());    
                    }
                }
                else if(event == 4)//Goblin horde
                {
                    System.out.println("You are travaling and a group of golblins is trying to rob you.");
                    //Create the golblins
                    //Create leader Goblin
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get Leader damage
                        Random rand = new Random();//creates random class
                        upperbound = 16; //sets upperbound to 16
                        goblinLeaderDamage = rand.nextInt(upperbound);//generates number 0 to 15
                        goblinLeaderDamage += 10;
                        startRandom = false;
                    } 
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get Leader health
                        Random rand = new Random();//creates random class
                        upperbound = 26; //sets upperbound = to 26, needs to be one greater than desired amount
                        goblinLeaderHealth = rand.nextInt(upperbound);//generates number 0 to 25
                        goblinLeaderHealth += 20;
                        startRandom = false;
                    }   
                    Enemy goblinLeader = new Enemy (goblinLeaderHealth, goblinLeaderDamage);//Hp, Attack dmg
                    
                    //Random number to get amount of follower goblins
                    startRandom = true;
                    while(startRandom == true)
                    {
                        //Random number to get amount of goblin followers
                        Random rand = new Random();//creates random class
                        upperbound = 4; //sets upperbound = to 3
                        goblinFollowersCount = rand.nextInt(upperbound);//generates number 0 to 3
                        goblinFollowersCount ++;//Makes range 1 - 4
                        startRandom = false;
                    } 
                    
                    if(goblinFollowersCount == 1)//If 1 follower
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1
                        
                        //Start fight Same in every if statment for amount of followers
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His follower has " + goblinFollowerOne.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!paladin.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                paladin.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 2)//If 2 followers Copy but add one more loop
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        //Start fight Same in every if statment for amount of followers
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + " and " + goblinFollowerTwo.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!paladin.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                paladin.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 3)//If 3 followers
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Creates follower goblin three
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerThree damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Three's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                        //Start fight Same in every if statment for amount of followers
                        //Initial statement
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", and " + goblinFollowerThree.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!paladin.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            System.out.println("4 for henchman 3");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
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
                            else if(attackTarget == 3) //Follower 3
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
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                paladin.takeDamage(paladin.getMaxHP());//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
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
                    else if(goblinFollowersCount == 4)//If 4 followers
                    {
                        //Creates follower goblin one
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerOne damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllowerOne health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                        
                        //Creates follower goblin two
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerTwo damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Two's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                        
                        //Creates follower goblin three
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerThree damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Three's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                        
                        //Creates follower goblin four
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get followerFour damage
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound to 5
                            goblinFollowerFourDamage = rand.nextInt(upperbound);//generates number 0 to 5
                            goblinFollowerFourDamage += 10; //Changes damage range to 10 - 15
                            startRandom = false;
                        } 
                        startRandom = true;
                        while(startRandom == true)
                        {
                            //Random number to get folllower Four's health
                            Random rand = new Random();//creates random class
                            upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                            goblinFollowerFourHealth = rand.nextInt(upperbound);//generates number 0 to 10
                            goblinFollowerFourHealth += 10; //Changes health range to 10 - 20
                            startRandom = false;
                        }
                        Enemy goblinFollowerFour = new Enemy (goblinFollowerFourHealth, goblinFollowerFourDamage); // creates Goblin follower 4
                        
                        
                        //Start fight Same in every if statment for amount of followers
                        //Fighting Explanation
                        System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                        System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                        System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", " + goblinFollowerThree.getHP() + ", and " + goblinFollowerFour.getHP() + " Hp.");//Add per the amount of hench henchmen
                        while(!paladin.isDead() && !goblinsAreDead)
                        {
                            System.out.println("Who will you attack?"); //Chooses who will be attacked
                            System.out.println("1 for leader");
                            System.out.println("2 for henchman");
                            System.out.println("3 for henchamn 2");
                            System.out.println("4 for henchman 3");
                            System.out.println("5 for henchman 4");
                            attackTarget = scanner.nextInt();
                            System.out.println("What type of attack would you like to use?");
                            System.out.println("1 for Strong");
                            System.out.println("2 for Standard");
                            System.out.println("3 for Weak");
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
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
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
                            else if(attackTarget == 5) //Follower 4
                            {
                                System.out.println("You attack the fourth Henchman.");
                                if(attackChoice == 1)//Strong attack
                                {
                                    System.out.println("You choose a strong attack");
                                    goblinFollowerFour.takeDamage(strong.getAttackDamage());
                                    System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                                else if(attackChoice == 2)//standard attack 
                                {
                                    System.out.println("You choose a standard attack");
                                    goblinFollowerFour.takeDamage(standard.getAttackDamage());
                                    System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    System.out.println("You choose a weak attack");
                                    goblinFollowerFour.takeDamage(weak.getAttackDamage());
                                    System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                    System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                                }
                            }
                                else//improper selection
                                {
                                    System.out.println("You failed to make a selection.");
                                    //Wait
                                    try
                                    {
                                        Thread.sleep(750);
                                    }
                                    catch(InterruptedException ex)
                                    {
                                        Thread.currentThread().interrupt();
                                    }
                                    paladin.kill();//set health to 0 to end loop
                                }
                            }
                            else//improper selection
                            {
                                System.out.println("You failed to make a selection.");
                                //Wait
                                try
                                {
                                    Thread.sleep(750);
                                }
                                catch(InterruptedException ex)
                                {
                                    Thread.currentThread().interrupt();
                                }
                                paladin.kill();//set health to 0 to end loop
                            }
                            //Goblins turn
                            if(!goblinLeader.isDead())
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The leader attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            if(!goblinFollowerFour.isDead())// Goblin Follower 4's turn
                            {
                                //To determine which attack was used and so what buff
                                if(attackChoice == 1)//Strong attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + strong.getAttackPenalty(); 
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 2)//Standard attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + standard.getAttackPenalty();
                                    paladin.takeDamage(damageTaken);
                                }
                                else if(attackChoice == 3)//Weak attack
                                {
                                    damageTaken = goblinFollowerFour.getAttack() + weak.getAttackPenalty();
                                    if(damageTaken >= 0)//Positive attack
                                    {
                                        paladin.takeDamage(damageTaken); 
                                    }
                                    else if(damageTaken < 0)//negative attack
                                    {
                                        damageTaken = 0;
                                    }
                                }
                                System.out.println("The fourth henchman attacks doing " + damageTaken + " damage.");
                                System.out.println("You now have " + paladin.getHP() + " HP.");
                            }
                            //add extras
                            if(!goblinLeader.isDead() || !goblinFollowerOne.isDead() || !goblinFollowerTwo.isDead() || !goblinFollowerThree.isDead() || !goblinFollowerFour.isDead())//If any goblin is alive
                            {
                                goblinsAreDead = false;
                            }
                            else if (goblinLeader.isDead() && goblinFollowerOne.isDead() && goblinFollowerTwo.isDead() && goblinFollowerThree.isDead() && goblinFollowerFour.isDead())//if all goblins are dead
                            {
                                goblinsAreDead = true;    
                            }
                        }
                    }
                    if(goblinsAreDead)
                    {
                        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts.");
                        paladin.increaseArtifacts(10);
                        System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                    }
                }
                else if(event == 5)//Fight guards
                {
                    System.out.println("You enter a town to rest but the gaurds stop you.");
                    System.out.println("They belive you to be a criminal and arrest you.");
                    System.out.println("As they take you to jail you have 3 options.");
                    System.out.println("1 to go with them willingly.");
                    System.out.println("2 to beg for mercy.");
                    System.out.println("3 to fight back and try to escape.");
                    townChoice = scanner.nextInt();
                    if(townChoice == 1)//Go willingly
                    {
                        System.out.println("You go with the gaurds.");
                        System.out.println("They put you in a cell and tell you that the sentanceing will happen the next monday.");
                        //Random to decide if fight starts 1 in 6 it does
                        startRandom = true;
                        while(startRandom == true) //Random number to get Event
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 6; //sets upperbound = to 6, needs to be one greater than desired amount
                            fightStart = rand.nextInt(upperbound);//generates number 0 to 5
                            startRandom = false;
                        }
                        if(fightStart == 0)//If var = 0 then start fight if not continue
                        {
                            System.out.println("During lunch the next day a fight breaks out.");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {  
                                Random rand = new Random();//creates random class
                                upperbound = 8; //sets upperbound = to 8, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 7
                                startRandom = false;
                            } 
                            paladin.takeDamage(damageTaken);
                            System.out.println("In the brawl you lose " + damageTaken + " Hp.");
                            System.out.println("You now have " + paladin.getHP() + "Hp.");
                            System.out.println("The rest of your stay is uneventful");
                        }
                        else if((fightStart == 1) || (fightStart == 2) || (fightStart == 3) || (fightStart == 4) || (fightStart == 5))
                        {
                            System.out.println("Your stay was uneventful."); 
                        }
                        System.out.println("Monday arrives and you are taken to the court.");
                        //Random to get sentance 
                        startRandom = true;
                        while(startRandom == true) //Random number to get court Sentance
                        {
                            Random rand = new Random();//creates random class
                            upperbound = 31; //sets upperbound to 31, needs to be one greater than desired amount
                            courtSentancing = rand.nextInt(upperbound);//generates number 0 to 30
                            startRandom = false;
                        }
                        System.out.println("The trial passes and at the end you are sentaced.");
                        //Chances out of 30
                        // Fine 15 in 31
                        // Jail 10 in 31
                        // Fine and Jail 5 in 31
                        // Execution 1 in 31

                        if((courtSentancing == 0) || (courtSentancing == 1) || (courtSentancing == 2) || (courtSentancing == 3) || (courtSentancing == 4) || (courtSentancing == 5) || (courtSentancing == 6) || (courtSentancing == 7) || (courtSentancing == 8) || (courtSentancing == 9) || (courtSentancing == 10) || (courtSentancing == 11) || (courtSentancing == 12) || (courtSentancing == 13) || (courtSentancing == 14))//Fine
                        {
                            startRandom = true;
                            while(startRandom == true) //Random number to get fine amount
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                                fine = rand.nextInt(upperbound);//generates number 0 to 5
                                startRandom = false;
                            }
                            System.out.println("You are sentanced to pay a fine of " + fine + " artifacts.");
                            fine *= -1;
                            paladin.increaseArtifacts(fine);
                            System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                        }
                        else if((courtSentancing == 15) || (courtSentancing == 16) || (courtSentancing == 17) || (courtSentancing == 18) || (courtSentancing == 19) || (courtSentancing == 20) || (courtSentancing == 21) || (courtSentancing == 22) || (courtSentancing == 23) || (courtSentancing == 24))//Jail
                        {
                            //Jail time take dmg 0 - 10
                            System.out.println("You are then sentanced to one year in jail");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                                startRandom = false;
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            paladin.takeDamage(damageTaken);
                            System.out.println("You now have " + paladin.getHP() + "Hp.");
                        }
                        else if((courtSentancing == 25) || (courtSentancing == 26) || (courtSentancing == 27) || (courtSentancing == 28) || (courtSentancing == 29) )//Fine and Jail
                        {
                            //Fine
                            {startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                                fine = rand.nextInt(upperbound);//generates number 0 to 5
                                startRandom = false;
                            }
                            System.out.println("You are first sentanced to pay a fine of " + fine + " artifacts.");
                            paladin.increaseArtifacts(fine);
                            System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
                            }
                            //Jail time take dmg 0 - 10
                            {System.out.println("You are then sentanced to one year in jail");
                            startRandom = true;
                            while(startRandom == true) //Random number to get Event
                            {
                                Random rand = new Random();//creates random class
                                upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                                damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                                startRandom = false;
                            }
                            System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                            paladin.takeDamage(damageTaken);
                            System.out.println("You now have " + paladin.getHP() + "Hp.");
                            }
                        }
                        else if(courtSentancing == 30)//Execution
                        {
                            System.out.println("You are convicted of murder and sentanced to death.");
                            paladin.kill();
                        } 
                    }
                    else if(townChoice == 2)//Beg for mercy
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You beg for mercy.");
                        System.out.println("They decide to be leniant and give you a fine of 3 artifacts instead.");
                        paladin.increaseArtifacts(-3);
                        System.out.println("You now have " + paladin.getArtifact() + " artifacts.");
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
                        //sleep command
                        {try
                        {
                            Thread.sleep(1000);
                        }
                            catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        }
                        //Clear screen
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        while(!paladin.isDead() && !guardsAreDead )  
                        {
                            System.out.println("1 for Strong attack");
                            System.out.println("2 for Standard attack");
                            System.out.println("3 for Weak attack");
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
                                if(!guardOne.isDead())//Guard ones turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardThree.isDead())//Gaurd three's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                                if(!guardTwo.isDead())//Guard ones turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFour.isDead())//Gaurd four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFive.isDead())//Gaurd five's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                                if(!guardTwo.isDead())//Guard four's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardFour.isDead())//Gaurd six's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardOne.isDead())//Gaurd one's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                }
                                if(!guardTwo.isDead())//Gaurd two's turn
                                {
                                    if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                    {
                                        damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 2)//Standard
                                    {
                                        damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
                                    }
                                    else if(attackChoice == 3)//Weak
                                    {
                                        damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                        paladin.takeDamage(damageTaken);
                                        System.out.println("Gaurd two attacks doing " + damageTaken + "dmg.");
                                        System.out.println("You now have " + paladin.getHP() + "Hp.");
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
                            System.out.println("You defeat the guards!");
                            System.out.println("Do you want to loot the town?");
                            System.out.println("1 = Yes.");
                            System.out.println("2 = No.");
                            if(townChoice == 1)//Yes
                            {
                                System.out.println("You are a bad person.");
                                paladin.kill();
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
                        //Wait
                        try
                        {
                            Thread.sleep(750);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }
                        paladin.kill();//set health to 0 to end loop
                    }
                }
                //Win screen
                if(paladin.getArtifact() >= 50)//If you collect 50 treasures
                {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Congradulations " + characterName);
                    //sleep command
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("__      __    ____     __    __      ___       ___    _____      __      _  _______ ");
                    System.out.println(") \\    / (   / __ \\    ) )  ( (     (  (       )  )  (_   _)    /  \\    / ) \\     / ");
                    System.out.println(" \\ \\  / /   / /  \\ \\  ( (    ) )     \\  \\  _  /  /     | |     / /\\ \\  / /   \\   /  ");
                    System.out.println("  \\ \\/ /   ( ()  () )  ) )  ( (       \\  \\/ \\/  /      | |     ) ) ) ) ) )    ) (   ");
                    System.out.println("   \\  /    ( ()  () ) ( (    ) )       )   _   (       | |    ( ( ( ( ( (     \\_/   ");
                    System.out.println("    )(      \\ \\__/ /   ) \\__/ (        \\  ( )  /      _| |__  / /  \\ \\/ /      _    ");
                    System.out.println("   /__\\      \\____/    \\______/         \\_/ \\_/      /_____( (_/    \\__/      (_)   ");
                    System.out.println(moveOn);
                }
            }
            //Death screen
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("          _______             ______  _________ _______  ______   _  ");
                System.out.println("|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( ) ");
                System.out.println("( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| | ");
                System.out.println(" \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || | ");
                System.out.println("  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || | ");
                System.out.println("   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_) ");
                System.out.println("   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _  "); 
                System.out.println("   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_) ");
            }
        }
        else if(chosenClass == 3)//Barbarian
        {
           //Gets players name for charecter then clears screen
           System.out.println("What would you like to name your charecter?");
           characterName = scanner.next();
           System.out.print("\033[H\033[2J");
           System.out.flush(); 
           
           Character barbarian = new Character (100, 150, characterName, 20, 45, 0); // Sets HP, Max HP, Name, and initial attack damage can be changed, Max damage, artifacts, in order.
           // For all but change the names currently set up for Rogue
           //Set up the three attacks
           Attack strong = new Attack(35, 60, 20); // Damage, Max damage, weakness
           Attack standard = new Attack(25, 50, 10); // Damage, Max damage, weakness
           Attack weak = new Attack(15, 40, 0); // Damage, Max damage, weakness
           //Information for player at start of game
           System.out.println("The objective of the game is to collect 25 artifacts.");//Decide on amount of artifacts
           System.out.println("Fighting will be turn based, and you have 3 types of attacks strong, standard, and weak.");
           System.out.println("Strong attacks do more damage but leaves you vunerable.");
           System.out.println("Standard attacks do a normal amount of damage and leaves you in a standard position of defense.");
           System.out.println("Weak attacks do less damage but leaves you in a defensive position and so you take less damage.");
           System.out.println("You start with 100Hp and doing 25dmg for standard attacks.");
           System.out.println("Press any key to continue ");
           //Wait until player presses a button
           moveOn = scanner.next();
           //Clears screen
           System.out.print("\033[H\033[2J");
           System.out.flush();

           //Start game loop
           while(!barbarian.isDead())
           { 
               //sleep command
               {try
               {
                   Thread.sleep(1500);
               }
               catch(InterruptedException ex)
               {
                   Thread.currentThread().interrupt();
               }
               }
               startRandom = true;
               while(startRandom == true) //Random number to get Event
               {
                   Random rand = new Random();//creates random class
                   upperbound = 5; //sets upperbound = to 5, needs to be one greater than desired amount
                   event = rand.nextInt(upperbound);//generates number 0 to 5
                   startRandom = false;
               } 
               //Clears screen
               System.out.print("\033[H\033[2J");
               System.out.flush();
               //EVENTS
               if(event == 0) //Fight dragon
               {
                   System.out.println("You meet a dragon.");
                   {//Dragon art 
System.out.println("              __");
System.out.println("          _.-'.-'-.__");
System.out.println("       .-'.       '-.'-._ __.--._");
System.out.println("-..'\\,-,/..-  _         .'   \\   '----._");
System.out.println(" ). /_ _\\' ( ' '.         '-  '/'-----._'-.__");
System.out.println(" '..'     '-r   _      .-.       '-._ \\");
System.out.println(" '.\\. Y .).'       ( .'  .      .\\          '\\'.");
System.out.println(" .-')'|'/'-.        \\)    )      '',_      _.c_.\\");
System.out.println("   .<, ,>.          |   _/\\        . ',   :   : \\\\");
System.out.println("  .' \\_/ '.        /  .'   |          '.     .'  \\)");
System.out.println("                  / .-'    '-.        : \\   _;   ||");
System.out.println("                 / /    _     \\_      '.'\\ ' /   ||");
System.out.println("                /.'   .'        \\_      .|   \\   \\|");
System.out.println("               / /   /      __.---'      '._  ;  ||");
System.out.println("              /.'  _:-.____< ,_           '.\\ \\  ||");
System.out.println("             // .-'     '-.__  '-'-\\_      '.\\/_ \\|");
System.out.println("            ( };====.===-==='        '.    .  \\\\: \\");
System.out.println("             \\\\ '._        /          :   ,'   )\\_ \\");
System.out.println("              \\\\   '------/            \\ .    /   )/");
System.out.println("              \\|        _|             )Y    |   /");
System.out.println("                \\\\      \\             .','   /  ,/");
System.out.println("                 \\\\    _/            /     _/");
System.out.println("                  \\\\   \\           .'    .'");
System.out.println("                   '| '1          /    .'");
System.out.println("                     '. \\        |:    /");
System.out.println("                       \\ |       /', .'");
System.out.println("                        \\(      ( ;z'");
System.out.println("                         \\:      \\ '(_");
System.out.println("                          \\_,     '._ '-.___");
System.out.println("                                      '-' -.\\");
                   }
                   System.out.println("You can either rob it or try to escape");
                   System.out.println("1 to escape");
                   System.out.println("2 to atempt to rob the dragon");
                   int dragonChoice = scanner.nextInt();
                   
                   if(dragonChoice == 1)//1 For escape
                   // 1 in 5 chance of freedom 
                   // 2 in 5 chance of falling and taking damage 1 to 10 dmg
                   // 2 in 5 chance of waking the dragon and having to fight it - if you win you still get the treasure
                   {
                       startRandom = true;
                       while(startRandom == true)
                       { 
                           //generates percent chances
                           Random rand = new Random();//creates random class
                           upperbound = 5; //sets upperbound = to 4, needs to be one greater than desired amount
                           escapeChance = rand.nextInt(upperbound);//generates number 0 to 4
                           startRandom = false;
                       } 
                       if(escapeChance == 0)//escape succesfully
                       {
                           System.out.println("You succesfully escape and can continue your journey.");
                       }
                       else if((escapeChance == 1) || (escapeChance == 2))//trip and take some damage 1 to 10
                       {
                           startRandom = true;
                       while(startRandom == true)
                       { 
                           //generates percent chances
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                           startRandom = false;
                       }
                            barbarian.takeDamage(damageTaken);
                            System.out.println("On your way out you fall and take some damage.");
                            System.out.println("You succesfully escape only taking " + damageTaken + " damge, you now have " + barbarian.getHP() + "HP.");
                            System.out.println("You leave and continue your journey.");
                       }
                       else if((escapeChance == 3) || (escapeChance == 4))//You fail to escape and have to fight the dragon
                       {
                           //Message after failing to escape
                           System.out.println("You fail to ecapse and awake the dragon. You will have to fight him.");
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
                           //generate dragon Hp 10-75 
                           startRandom = true;
                           while(startRandom == true)
                           { 
                               //generates dragon HP
                               Random rand = new Random();//creates random class
                               upperbound = 66; //sets upperbound = to 66
                               dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                               startRandom = false;
                               dragonHP += 10;//Dragon health 10 - 75
                           }
                           startRandom = true;
                           while(startRandom == true)
                           { 
                               //generates dragons attack
                               Random rand = new Random();//creates random class
                               upperbound = 16; //sets upperbound = to 16, 
                               dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                               dragonAttack += 20;
                               startRandom = false;
                           }
                           //Create Dragon 
                           Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                           while(!barbarian.isDead() && !dragon.isDead())
                           {
                               System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                               System.out.println("1 for Strong");
                               System.out.println("2 for Standard");
                               System.out.println("3 for Weak");
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
                               if(!dragon.isDead())//If still alive dragons turn
                               {
                                   //To determine which attack was used and so what buff
                                   if(attackChoice == 1)//Strong attack
                                   {
                                        damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                        barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 2)//Standard attack
                                   {
                                        damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                        barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 3)//Weak attack
                                   {
                                       damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                       if(damageTaken >= 0)//Positive attack
                                       {
                                            barbarian.takeDamage(damageTaken); 
                                       }
                                       else if(damageTaken < 0)//negative attack
                                       {
                                           damageTaken = 0;
                                       }
                                   }
                                   System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                   System.out.println("You now have " + barbarian.getHP() + " HP.");
                               }
                           }
                           if(dragon.isDead())//After loop ends if Dragon died
                           {
                              System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                              barbarian.increaseArtifacts(1); 
                              System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                           }
                       }
                   }
                   else if(dragonChoice == 2)//To rob the dragon
                   {
                       //Fight dragon same code as above
                       //generate dragon Hp 10-75 
                           startRandom = true;
                           while(startRandom == true)
                           { 
                               //generates dragon HP
                               Random rand = new Random();//creates random class
                               upperbound = 66; //sets upperbound = to 66
                               dragonHP = rand.nextInt(upperbound);//generates number 0 to 65
                               startRandom = false;
                               dragonHP += 10;//Dragon health 10 - 75
                           }
                           startRandom = true;
                           while(startRandom == true)
                           { 
                               //generates dragons attack
                               Random rand = new Random();//creates random class
                               upperbound = 16; //sets upperbound = to 16, 
                               dragonAttack = rand.nextInt(upperbound);//generates number 0 to 15
                               dragonAttack += 20;
                               startRandom = false;
                           }
                           //Create Dragon 
                           Enemy dragon = new Enemy (dragonHP, dragonAttack); // HP 10 - 75, Attack dmg 20 - 35
                           while(!barbarian.isDead() && !dragon.isDead())
                           {
                               System.out.println("The Dragon has " + dragon.getHP() + " HP.");
                               System.out.println("1 for Strong");
                               System.out.println("2 for Standard");
                               System.out.println("3 for Weak");
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
                               if(!dragon.isDead())//If still alive dragons turn
                               {
                                   //To determine which attack was used and so what buff
                                   if(attackChoice == 1)//Strong attack
                                   {
                                       damageTaken = dragon.getAttack() + strong.getAttackPenalty(); 
                                       barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 2)//Standard attack
                                   {
                                       damageTaken = dragon.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 3)//Weak attack
                                   {
                                       damageTaken = dragon.getAttack() + weak.getAttackPenalty();
                                       if(damageTaken >= 0)//Positive attack
                                       {
                                            barbarian.takeDamage(damageTaken); 
                                       }
                                       else if(damageTaken < 0)//negative attack
                                       {
                                           damageTaken = 0;
                                       }
                                   }
                                   System.out.println("The dragon attacks doing " + damageTaken + " damage.");
                                   System.out.println("You now have " + barbarian.getHP() + " HP.");
                               }
                           }
                           if(dragon.isDead())//After loop ends if Dragon died
                           {
                                System.out.println("Congratulations you beat the dragon! You get to keep its artifact.");
                                barbarian.increaseArtifacts(1); 
                                System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                           }
                       }
                   else //type a number or letter that is not an option 
                   {
                       System.out.println("You failed to make a selection.");
                       //Wait
                       try
                       {
                           Thread.sleep(750);
                       }
                       catch(InterruptedException ex)
                       {
                           Thread.currentThread().interrupt();
                       }
                       barbarian.kill();//set health to 0 to end loop
                   }
               }
               else if(event == 1)//Fight Bear
               {
                   System.out.println("You are travaling in the forest when you run into an agressive bear.");
                   //Create bear
                   startRandom = true;
                   while(startRandom == true)
                   { 
                       //generates bear's HP
                       Random rand = new Random();//creates random class
                       upperbound = 26; //sets upperbound = to 26
                       bearHP = rand.nextInt(upperbound);//generates number 0 to 25
                       startRandom = false;
                       bearHP += 20;//bear health 20 - 45
                   }
                   startRandom = true;
                   while(startRandom == true)
                   { 
                       //generates bear's attack
                       Random rand = new Random();//creates random class
                       upperbound = 11; //sets upperbound = to 11, 
                       bearAttack = rand.nextInt(upperbound);//generates number 0 to 10
                       bearAttack += 10;//bears do 10 to 20 dmg                            startRandom = false;
                   }
                   Enemy bear = new Enemy(bearHP, bearAttack); //HP then attack dmg
                   while(!barbarian.isDead() && !bear.isDead())
                       {
                               System.out.println("The bear has " + bear.getHP() + " HP.");
                               System.out.println("1 for Strong");
                               System.out.println("2 for Standard");
                               System.out.println("3 for Weak");
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
                                        barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 2)//Standard attack
                                   {
                                        damageTaken = bear.getAttack() + standard.getAttackPenalty();
                                        barbarian.takeDamage(damageTaken);
                                   }
                                   else if(attackChoice == 3)//Weak attack
                                   {
                                       damageTaken = bear.getAttack() + weak.getAttackPenalty();
                                       if(damageTaken >= 0)//Positive attack
                                       {
                                            barbarian.takeDamage(damageTaken); 
                                       }
                                       else if(damageTaken < 0)//negative attack
                                       {
                                            damageTaken = 0;
                                       }
                                   }
                                   System.out.println("The bear attacks doing " + damageTaken + " damage.");
                                   System.out.println("You now have " + barbarian.getHP() + " HP.");
                               }
                           }
                   if(bear.isDead())//After loop ends if Bear died
                   {
                       System.out.println("Congratulations you beat the bear! You get to keep its artifact.");
                       barbarian.increaseArtifacts(.5); 
                       System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                   }
               }
               else if(event == 2)//Go into a bar
               {
                   System.out.println("You walk into a bar.");
                   System.out.println("You have three choices,");
                   System.out.println("Type 1 to start a brawl.");
                   System.out.println("Type 2 to buy a weapon from a local salesman."); 
                   System.out.println("Type 3 to talk to the guards and get a quest.");
                   barChoice = scanner.nextInt();
                   
                   if(barChoice == 1)//Start a brawl
                   {
                       System.out.println("You decide to start a brawl");
                       //Determine amount of damage taken.
                       startRandom = true;
                       while(startRandom == true) 
                       {
                           Random rand = new Random();//creates random class
                           upperbound = 21; //sets upperbound = to 20
                           damageTaken = rand.nextInt(upperbound);//generates number 0 to 20
                           startRandom = false;
                       }
                       System .out.println("In the fight you take " + damageTaken + " damage.");
                       barbarian.takeDamage(damageTaken);
                       System.out.println("You now have " + barbarian.getHP() + " HP.");
                   }
                   else if(barChoice == 2)//Buy a weapon
                   {
                       System.out.println("You meet a local blacksmith, he offers a sword that will increase your damage by 1 to 15.");
                       //Determine the additional damage for the futre.
                       System.out.println("Attack before addition " + barbarian.getAttack());
                       startRandom = true;
                       while(startRandom == true) 
                       {
                           Random rand = new Random();//creates random class
                           upperbound = 15; //sets upperbound to 15
                           atk = rand.nextInt(upperbound);//generates number 0 to 14
                           atk ++;
                           //incerase attack damage
                           barbarian.increaseAttack(atk);
                           strong.increaseAttackDamage(atk);
                           standard.increaseAttackDamage(atk);
                           weak.increaseAttackDamage(atk);
                           
                           startRandom = false;
                       }
                       if(barbarian.getAttack() <= barbarian.getMaxAttack())//If not over max attack damage state attack damage
                       {
                           System.out.println("New attack damage " + barbarian.getAttack());
                       }
                       else if(barbarian.getAttack() > barbarian.getMaxAttack())//If over max attack damage set to max attack damage and then state attack damage 
                       {
                            barbarian.setMaxAttack();
                            strong.setMaxAttackDamage();
                            standard.setMaxAttackDamage();
                            weak.setMaxAttackDamage();
                            System.out.println("New attack damage " + barbarian.getAttack());
                           
                       }
                   }
                   else if(barChoice == 3)// Get quest from guards
                   {
                       //TODO Finish this
                       System.out.println("You talk to the guards to get a quest.");
                       System.out.println("He gives you three quests and tells you to choose one.");
                       System.out.println("The first quest is to take down a smugiling ring.");
                       System.out.println("The second quest is to defeat an evil queen.");
                       System.out.println("The third quest is");
                       System.out.println("Which quest do you choose. Type 1, 2, or 3");
                       questChoice = scanner.nextInt();
                       if(questChoice == 1)//Defeat smugiling group
                       {
                           
                       }
                       else if(questChoice == 2)//Defeat Evil king
                       {
                           
                       }
                       else if(questChoice == 3)
                       {
                           
                       }
                       else
                       {
                           System.out.println("You failed to make a selection.");
                           //Wait
                           try
                           {
                               Thread.sleep(750);
                           }
                           catch(InterruptedException ex)
                       {
                           Thread.currentThread().interrupt();
                       }
                       barbarian.kill();//set health to 0 to end loop
                       }
                   }
                   else // type a number or letter that is not an option 
                   {
                       System.out.println("You failed to make a selection.");
                       //Wait
                       try
                       {
                           Thread.sleep(750);
                       }
                       catch(InterruptedException ex)
                       {
                           Thread.currentThread().interrupt();
                       }
                       barbarian.kill();//set health to 0 to end loop
                   }
               }
               else if(event == 3)//Go to a doctor
               {
                   System.out.println("You go to a doctor, he can heal you 10 to 50HP.");
                   //sleep command
                   try
                   {
                       Thread.sleep(3000);
                   }
                   catch(InterruptedException ex)
                   {
                       Thread.currentThread().interrupt();
                   }
                   //decide on amount healed 10-50
                   startRandom = true;
                   while(startRandom == true) 
                   {
                       Random rand = new Random();//creates random class
                       upperbound = 41; //sets upperbound = to 40
                       amountHealed = rand.nextInt(upperbound);//generates number 0 to 40
                       amountHealed += 10;
                       System.out.println("He heals you " + amountHealed + "HP");
                       startRandom = false;
                   }
                   if (barbarian.heal(amountHealed) < barbarian.getMaxHP())//If not over max health state new health.
                   {
                       System.out.println("Your new health is " + barbarian.getHP());
                   }
                   else if (barbarian.heal(amountHealed) > barbarian.getMaxHP())//When over max health says so and set to max
                   {
                        barbarian.setMaxHP();
                        System.out.println("Your new health is " + barbarian.getHP());    
                   }
               }
               else if(event == 4)//Goblin horde
               {
                   System.out.println("You are travaling and a group of golblins is trying to rob you.");
                   //Create the golblins
                   //Create leader Goblin
                   startRandom = true;
                   while(startRandom == true)
                   {
                       //Random number to get Leader damage
                       Random rand = new Random();//creates random class
                       upperbound = 16; //sets upperbound to 16
                       goblinLeaderDamage = rand.nextInt(upperbound);//generates number 0 to 15
                       goblinLeaderDamage += 10;
                       startRandom = false;
                   } 
                   startRandom = true;
                   while(startRandom == true)
                   {
                       //Random number to get Leader health
                       Random rand = new Random();//creates random class
                       upperbound = 26; //sets upperbound = to 26, needs to be one greater than desired amount
                       goblinLeaderHealth = rand.nextInt(upperbound);//generates number 0 to 25
                       goblinLeaderHealth += 20;
                       startRandom = false;
                   }   
                   Enemy goblinLeader = new Enemy (goblinLeaderHealth, goblinLeaderDamage);//Hp, Attack dmg
                   
                   //Random number to get amount of follower goblins
                   startRandom = true;
                   while(startRandom == true)
                   {
                       //Random number to get amount of goblin followers
                       Random rand = new Random();//creates random class
                       upperbound = 4; //sets upperbound = to 3
                       goblinFollowersCount = rand.nextInt(upperbound);//generates number 0 to 3
                       goblinFollowersCount ++;//Makes range 1 - 4
                       startRandom = false;
                   } 
                   
                   if(goblinFollowersCount == 1)//If 1 follower
                   {
                       //Creates follower goblin one
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerOne damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllowerOne health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1
                       
                       //Start fight Same in every if statment for amount of followers
                       //Initial statement
                       System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                       System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                       System.out.println("His follower has " + goblinFollowerOne.getHP() + " Hp.");//Add per the amount of hench henchmen
                       while(!barbarian.isDead() && !goblinsAreDead)
                       {
                           System.out.println("Who will you attack?"); //Chooses who will be attacked
                           System.out.println("1 for leader");
                           System.out.println("2 for henchman");
                           attackTarget = scanner.nextInt();
                           System.out.println("What type of attack would you like to use?");
                           System.out.println("1 for Strong");
                           System.out.println("2 for Standard");
                           System.out.println("3 for Weak");
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
                               }
                           }
                           else//improper selection
                           {
                               System.out.println("You failed to make a selection.");
                               //Wait
                               try
                               {
                                   Thread.sleep(750);
                               }
                               catch(InterruptedException ex)
                               {
                                   Thread.currentThread().interrupt();
                               }
                               barbarian.kill();//set health to 0 to end loop
                           }
                           //Goblins turn
                           if(!goblinLeader.isDead())
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The leader attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                        damageTaken = 0;
                                   }
                               }
                               System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
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
                   else if(goblinFollowersCount == 2)//If 2 followers Copy but add one more loop
                   {
                       //Creates follower goblin one
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerOne damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllowerOne health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                       
                       //Creates follower goblin two
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerTwo damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Two's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                       //Start fight Same in every if statment for amount of followers
                       System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                       System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                       System.out.println("His followers have " + goblinFollowerOne.getHP() + " and " + goblinFollowerTwo.getHP() + " Hp.");//Add per the amount of hench henchmen
                       while(!barbarian.isDead() && !goblinsAreDead)
                       {
                           System.out.println("Who will you attack?"); //Chooses who will be attacked
                           System.out.println("1 for leader");
                           System.out.println("2 for henchman");
                           System.out.println("3 for henchamn 2");
                           attackTarget = scanner.nextInt();
                           System.out.println("What type of attack would you like to use?");
                           System.out.println("1 for Strong");
                           System.out.println("2 for Standard");
                           System.out.println("3 for Weak");
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
                               }
                           }
                           else//improper selection
                           {
                               System.out.println("You failed to make a selection.");
                               //Wait
                               try
                               {
                                   Thread.sleep(750);
                               }
                               catch(InterruptedException ex)
                               {
                                   Thread.currentThread().interrupt();
                               }
                               barbarian.kill();//set health to 0 to end loop
                           }
                           //Goblins turn
                           if(!goblinLeader.isDead())
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The leader attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                        damageTaken = 0;
                                   }
                               }
                               System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
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
                   else if(goblinFollowersCount == 3)//If 3 followers
                   {
                       //Creates follower goblin one
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerOne damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllowerOne health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                       
                       //Creates follower goblin two
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerTwo damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Two's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                       
                       //Creates follower goblin three
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerThree damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Three's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                       //Start fight Same in every if statment for amount of followers
                       //Initial statement
                       System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                       System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                       System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", and " + goblinFollowerThree.getHP() + " Hp.");//Add per the amount of hench henchmen
                       while(!barbarian.isDead() && !goblinsAreDead)
                       {
                           System.out.println("Who will you attack?"); //Chooses who will be attacked
                           System.out.println("1 for leader");
                           System.out.println("2 for henchman");
                           System.out.println("3 for henchamn 2");
                           System.out.println("4 for henchman 3");
                           attackTarget = scanner.nextInt();
                           System.out.println("What type of attack would you like to use?");
                           System.out.println("1 for Strong");
                           System.out.println("2 for Standard");
                           System.out.println("3 for Weak");
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
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
                           else if(attackTarget == 3) //Follower 3
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
                               else//improper selection
                               {
                                   System.out.println("You failed to make a selection.");
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
                               }
                           }
                           else//improper selection
                           {
                               System.out.println("You failed to make a selection.");
                               //Wait
                               try
                               {
                                   Thread.sleep(750);
                               }
                               catch(InterruptedException ex)
                               {
                                   Thread.currentThread().interrupt();
                               }
                               barbarian.takeDamage(barbarian.getMaxHP());//set health to 0 to end loop
                           }
                           //Goblins turn
                           if(!goblinLeader.isDead())
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The leader attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                        damageTaken = 0;
                                   }
                               }
                               System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerTwo.isDead())// Goblin Follower 3's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                        barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
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
                   else if(goblinFollowersCount == 4)//If 4 followers
                   {
                       //Creates follower goblin one
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerOne damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerOneDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerOneDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllowerOne health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerOneHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerOneHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerOne = new Enemy (goblinFollowerOneHealth, goblinFollowerOneDamage); // creates Goblin follower 1 
                       
                       //Creates follower goblin two
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerTwo damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerTwoDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerTwoDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Two's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerTwoHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerTwoHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerTwo = new Enemy (goblinFollowerTwoHealth, goblinFollowerTwoDamage); // creates Goblin follower 2
                       
                       //Creates follower goblin three
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerThree damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerThreeDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerThreeDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Three's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerThreeHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerThreeHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerThree = new Enemy (goblinFollowerThreeHealth, goblinFollowerThreeDamage); // creates Goblin follower 3
                       
                       //Creates follower goblin four
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get followerFour damage
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound to 5
                           goblinFollowerFourDamage = rand.nextInt(upperbound);//generates number 0 to 5
                           goblinFollowerFourDamage += 10; //Changes damage range to 10 - 15
                           startRandom = false;
                       } 
                       startRandom = true;
                       while(startRandom == true)
                       {
                           //Random number to get folllower Four's health
                           Random rand = new Random();//creates random class
                           upperbound = 11; //sets upperbound = to 10, needs to be one greater than desired amount
                           goblinFollowerFourHealth = rand.nextInt(upperbound);//generates number 0 to 10
                           goblinFollowerFourHealth += 10; //Changes health range to 10 - 20
                           startRandom = false;
                       }
                       Enemy goblinFollowerFour = new Enemy (goblinFollowerFourHealth, goblinFollowerFourDamage); // creates Goblin follower 4
                       
                       
                       //Start fight Same in every if statment for amount of followers
                       //Fighting Explanation
                       System.out.println("There is a leader and he has " + goblinFollowersCount + " henchmen.");
                       System.out.println("The leader has " + goblinLeader.getHP() + " Hp.");
                       System.out.println("His followers have " + goblinFollowerOne.getHP() + ", " + goblinFollowerTwo.getHP() + ", " + goblinFollowerThree.getHP() + ", and " + goblinFollowerFour.getHP() + " Hp.");//Add per the amount of hench henchmen
                       while(!barbarian.isDead() && !goblinsAreDead)
                       {
                           System.out.println("Who will you attack?"); //Chooses who will be attacked
                           System.out.println("1 for leader");
                           System.out.println("2 for henchman");
                           System.out.println("3 for henchamn 2");
                           System.out.println("4 for henchman 3");
                           System.out.println("5 for henchman 4");
                           attackTarget = scanner.nextInt();
                           System.out.println("What type of attack would you like to use?");
                           System.out.println("1 for Strong");
                           System.out.println("2 for Standard");
                           System.out.println("3 for Weak");
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
                                   //Wait
                                   try
                                   {
                                       Thread.sleep(750);
                                   }
                                   catch(InterruptedException ex)
                                   {
                                       Thread.currentThread().interrupt();
                                   }
                                   barbarian.kill();//set health to 0 to end loop
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
                           else if(attackTarget == 5) //Follower 4
                           {
                               System.out.println("You attack the fourth Henchman.");
                               if(attackChoice == 1)//Strong attack
                               {
                                   System.out.println("You choose a strong attack");
                                   goblinFollowerFour.takeDamage(strong.getAttackDamage());
                                   System.out.println("You do " + strong.getAttackDamage() + " damage.");
                                   System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                               }
                               else if(attackChoice == 2)//standard attack 
                               {
                                   System.out.println("You choose a standard attack");
                                   goblinFollowerFour.takeDamage(standard.getAttackDamage());
                                   System.out.println("You do " + standard.getAttackDamage() + " damage.");
                                   System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   System.out.println("You choose a weak attack");
                                   goblinFollowerFour.takeDamage(weak.getAttackDamage());
                                   System.out.println("You do " + weak.getAttackDamage() + " damage.");
                                   System.out.println("The fourth henchman now has " + goblinFollowerFour.getHP() + " HP.");
                               }
                           }                           
                           else//improper selection
                           {
                               System.out.println("You failed to make a selection.");
                               //Wait
                               try
                               {
                                   Thread.sleep(750);
                               }
                               catch(InterruptedException ex)
                               {
                                   Thread.currentThread().interrupt();
                               }
                               barbarian.kill();//set health to 0 to end loop
                           }
                           //Goblins turn
                           if(!goblinLeader.isDead())
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinLeader.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinLeader.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinLeader.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                       barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The leader attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerOne.isDead())// Goblin Follower 1's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerOne.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                       barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerTwo.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                       barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The second henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerTwo.isDead())// Goblin Follower 2's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerThree.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                       barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The third henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           if(!goblinFollowerFour.isDead())// Goblin Follower 4's turn
                           {
                               //To determine which attack was used and so what buff
                               if(attackChoice == 1)//Strong attack
                               {
                                   damageTaken = goblinFollowerFour.getAttack() + strong.getAttackPenalty(); 
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 2)//Standard attack
                               {
                                   damageTaken = goblinFollowerFour.getAttack() + standard.getAttackPenalty();
                                   barbarian.takeDamage(damageTaken);
                               }
                               else if(attackChoice == 3)//Weak attack
                               {
                                   damageTaken = goblinFollowerFour.getAttack() + weak.getAttackPenalty();
                                   if(damageTaken >= 0)//Positive attack
                                   {
                                       barbarian.takeDamage(damageTaken); 
                                   }
                                   else if(damageTaken < 0)//negative attack
                                   {
                                       damageTaken = 0;
                                   }
                               }
                               System.out.println("The fourth henchman attacks doing " + damageTaken + " damage.");
                               System.out.println("You now have " + barbarian.getHP() + " HP.");
                           }
                           //add extras
                           if(!goblinLeader.isDead() || !goblinFollowerOne.isDead() || !goblinFollowerTwo.isDead() || !goblinFollowerThree.isDead() || !goblinFollowerFour.isDead())//If any goblin is alive
                           {
                               goblinsAreDead = false;
                           }
                           else if (goblinLeader.isDead() && goblinFollowerOne.isDead() && goblinFollowerTwo.isDead() && goblinFollowerThree.isDead() && goblinFollowerFour.isDead())//if all goblins are dead
                           {
                               goblinsAreDead = true;    
                           }
                       }
                   }
                   if(goblinsAreDead)
                   {
                       System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts.");
                       barbarian.increaseArtifacts(10);
                       System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                   }
               }
               else if(event == 5)//Fight guards
               {
                   System.out.println("You enter a town to rest but the gaurds stop you.");
                   System.out.println("They belive you to be a criminal and arrest you.");
                   System.out.println("As they take you to jail you have 3 options.");
                   System.out.println("1 to go with them willingly.");
                   System.out.println("2 to beg for mercy.");
                   System.out.println("3 to fight back and try to escape.");
                   townChoice = scanner.nextInt();
                   if(townChoice == 1)//Go willingly
                   {
                       System.out.println("You go with the gaurds.");
                       System.out.println("They put you in a cell and tell you that the sentanceing will happen the next monday.");
                       //Random to decide if fight starts 1 in 6 it does
                       startRandom = true;
                       while(startRandom == true) //Random number to get Event
                       {
                           Random rand = new Random();//creates random class
                           upperbound = 6; //sets upperbound = to 6, needs to be one greater than desired amount
                           fightStart = rand.nextInt(upperbound);//generates number 0 to 5
                           startRandom = false;
                       }
                       if(fightStart == 0)//If var = 0 then start fight if not continue
                       {
                           System.out.println("During lunch the next day a fight breaks out.");
                           startRandom = true;
                           while(startRandom == true) //Random number to get Event
                           {  
                               Random rand = new Random();//creates random class
                               upperbound = 8; //sets upperbound = to 8, needs to be one greater than desired amount
                               damageTaken = rand.nextInt(upperbound);//generates number 0 to 7
                               startRandom = false;
                           } 
                           barbarian.takeDamage(damageTaken);
                           System.out.println("In the brawl you lose " + damageTaken + " Hp.");
                           System.out.println("You now have " + barbarian.getHP() + "Hp.");
                           System.out.println("The rest of your stay is uneventful");
                       }
                       else if((fightStart == 1) || (fightStart == 2) || (fightStart == 3) || (fightStart == 4) || (fightStart == 5))
                       {
                           System.out.println("Your stay was uneventful."); 
                       }
                       System.out.println("Monday arrives and you are taken to the court.");
                       //Random to get sentance 
                       startRandom = true;
                       while(startRandom == true) //Random number to get court Sentance
                       {
                           Random rand = new Random();//creates random class
                           upperbound = 31; //sets upperbound to 31, needs to be one greater than desired amount
                           courtSentancing = rand.nextInt(upperbound);//generates number 0 to 30
                           startRandom = false;
                       }
                       System.out.println("The trial passes and at the end you are sentaced.");
                       //Chances out of 30
                       // Fine 15 in 31
                       // Jail 10 in 31
                       // Fine and Jail 5 in 31
                       // Execution 1 in 31

                       if((courtSentancing == 0) || (courtSentancing == 1) || (courtSentancing == 2) || (courtSentancing == 3) || (courtSentancing == 4) || (courtSentancing == 5) || (courtSentancing == 6) || (courtSentancing == 7) || (courtSentancing == 8) || (courtSentancing == 9) || (courtSentancing == 10) || (courtSentancing == 11) || (courtSentancing == 12) || (courtSentancing == 13) || (courtSentancing == 14))//Fine
                       {
                           startRandom = true;
                           while(startRandom == true) //Random number to get fine amount
                           {
                               Random rand = new Random();//creates random class
                               upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                               fine = rand.nextInt(upperbound);//generates number 0 to 5
                               startRandom = false;
                           }
                           System.out.println("You are sentanced to pay a fine of " + fine + " artifacts.");
                           fine *= -1;
                           barbarian.increaseArtifacts(fine);
                           System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                       }
                       else if((courtSentancing == 15) || (courtSentancing == 16) || (courtSentancing == 17) || (courtSentancing == 18) || (courtSentancing == 19) || (courtSentancing == 20) || (courtSentancing == 21) || (courtSentancing == 22) || (courtSentancing == 23) || (courtSentancing == 24))//Jail
                       {
                           //Jail time take dmg 0 - 10
                           System.out.println("You are then sentanced to one year in jail");
                           startRandom = true;
                           while(startRandom == true) //Random number to get Event
                           {
                               Random rand = new Random();//creates random class
                               upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                               damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                               startRandom = false;
                           }
                           System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                           barbarian.takeDamage(damageTaken);
                           System.out.println("You now have " + barbarian.getHP() + "Hp.");
                       }
                       else if((courtSentancing == 25) || (courtSentancing == 26) || (courtSentancing == 27) || (courtSentancing == 28) || (courtSentancing == 29) )//Fine and Jail
                       {
                           //Fine
                           {startRandom = true;
                           while(startRandom == true) //Random number to get Event
                           {
                               Random rand = new Random();//creates random class
                               upperbound = 6; //sets upperbound = 6, needs to be one greater than desired amount
                               fine = rand.nextInt(upperbound);//generates number 0 to 5
                               startRandom = false;
                           }
                           System.out.println("You are first sentanced to pay a fine of " + fine + " artifacts.");
                           barbarian.increaseArtifacts(fine);
                           System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
                           }
                           //Jail time take dmg 0 - 10
                           {System.out.println("You are then sentanced to one year in jail");
                           startRandom = true;
                           while(startRandom == true) //Random number to get Event
                           {
                               Random rand = new Random();//creates random class
                               upperbound = 11; //sets upperbound = 11, needs to be one greater than desired amount
                               damageTaken = rand.nextInt(upperbound);//generates number 0 to 10
                               startRandom = false;
                           }
                           System.out.println("Near the end of your stay you get sick and take " + damageTaken + " dmg.");
                           barbarian.takeDamage(damageTaken);
                           System.out.println("You now have " + barbarian.getHP() + "Hp.");
                           }
                       }
                       else if(courtSentancing == 30)//Execution
                       {
                           System.out.println("You are convicted of murder and sentanced to death.");
                           barbarian.kill();
                       } 
                   }
                   else if(townChoice == 2)//Beg for mercy
                   {
                       System.out.print("\033[H\033[2J");
                       System.out.flush();
                       System.out.println("You beg for mercy.");
                       System.out.println("They decide to be leniant and give you a fine of 3 artifacts instead.");
                       barbarian.increaseArtifacts(-3);
                       System.out.println("You now have " + barbarian.getArtifact() + " artifacts.");
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
                       //sleep command
                       {try
                       {
                           Thread.sleep(1000);
                       }
                           catch(InterruptedException ex)
                       {
                           Thread.currentThread().interrupt();
                       }
                       }
                       //Clear screen
                       System.out.print("\033[H\033[2J");
                       System.out.flush();
                       while(!barbarian.isDead() && !guardsAreDead )  
                       {
                           System.out.println("1 for Strong attack");
                           System.out.println("2 for Standard attack");
                           System.out.println("3 for Weak attack");
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
                               if(!guardOne.isDead())//Guard ones turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardThree.isDead())//Gaurd three's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardThree.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                               if(!guardTwo.isDead())//Guard ones turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardFour.isDead())//Gaurd four's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardThree.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardThree.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard three attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardFive.isDead())//Gaurd five's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardFive.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                               if(!guardTwo.isDead())//Guard four's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardFour.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardFour.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardFour.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard four attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardFour.isDead())//Gaurd six's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardSix.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardFive.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardFive.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard five attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardOne.isDead())//Gaurd one's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardOne.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardOne.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardOne.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd one attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardSix.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardSix.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard six attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                               }
                               if(!guardTwo.isDead())//Gaurd two's turn
                               {
                                   if(attackChoice == 1)//Determines attack buff based on your attack Strong
                                   {
                                       damageTaken = guardTwo.getAttack() + strong.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 2)//Standard
                                   {
                                       damageTaken = guardTwo.getAttack() + standard.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Guard two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
                                   }
                                   else if(attackChoice == 3)//Weak
                                   {
                                       damageTaken = guardTwo.getAttack() + weak.getAttackPenalty();
                                       barbarian.takeDamage(damageTaken);
                                       System.out.println("Gaurd two attacks doing " + damageTaken + "dmg.");
                                       System.out.println("You now have " + barbarian.getHP() + "Hp.");
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
                           System.out.println("You defeat the guards!");
                           System.out.println("Do you want to loot the town?");
                           System.out.println("1 = Yes.");
                           System.out.println("2 = No.");
                           if(townChoice == 1)//Yes
                           {
                               System.out.println("You are a bad person.");
                               barbarian.kill();
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
                       //Wait
                       try
                       {
                           Thread.sleep(750);
                       }
                       catch(InterruptedException ex)
                       {
                           Thread.currentThread().interrupt();
                       }
                       barbarian.kill();//set health to 0 to end loop
                   }
               }
               //Win screen
               if(barbarian.getArtifact() >= 50)//If you collect 50 treasures
               {
                   System.out.print("\033[H\033[2J");
                   System.out.flush();
                   System.out.println("Congradulations " + characterName);
                   //sleep command
                   try
                   {
                       Thread.sleep(500);
                   }
                   catch(InterruptedException ex)
                   {
                       Thread.currentThread().interrupt();
                   }
                   System.out.println("__      __    ____     __    __      ___       ___    _____      __      _  _______ ");
                   System.out.println(") \\    / (   / __ \\    ) )  ( (     (  (       )  )  (_   _)    /  \\    / ) \\     / ");
                   System.out.println(" \\ \\  / /   / /  \\ \\  ( (    ) )     \\  \\  _  /  /     | |     / /\\ \\  / /   \\   /  ");
                   System.out.println("  \\ \\/ /   ( ()  () )  ) )  ( (       \\  \\/ \\/  /      | |     ) ) ) ) ) )    ) (   ");
                   System.out.println("   \\  /    ( ()  () ) ( (    ) )       )   _   (       | |    ( ( ( ( ( (     \\_/   ");
                   System.out.println("    )(      \\ \\__/ /   ) \\__/ (        \\  ( )  /      _| |__  / /  \\ \\/ /      _    ");
                   System.out.println("   /__\\      \\____/    \\______/         \\_/ \\_/      /_____( (_/    \\__/      (_)   ");
                   System.out.println(moveOn);
               }
           }
           //Death screen
           {
               System.out.print("\033[H\033[2J");
               System.out.flush();
               System.out.println("          _______             ______  _________ _______  ______   _  ");
               System.out.println("|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( ) ");
               System.out.println("( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| | ");
               System.out.println(" \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || | ");
               System.out.println("  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || | ");
               System.out.println("   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_) ");
               System.out.println("   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _  "); 
               System.out.println("   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_) ");
           }
        }
        else
        {
            System.out.println("You failed to make a selection try again.");  
            System.exit(0);
        }
        System.out.println("Hi");
        
        
        

        scanner.close();
    }
  }

