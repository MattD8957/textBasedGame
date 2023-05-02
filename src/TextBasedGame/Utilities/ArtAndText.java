package TextBasedGame.Utilities;

public class ArtAndText {
  //Beginning and Explanation Text
  public static final String welcome = " ____      ____      __                                     \n|_  _|    |_  _|    [  |                                    \n  \\ \\  /\\  / /.---.  | |  .---.   .--.   _ .--..--.  .---.  \n   \\ \\/  \\/ // /__\\\\ | | / /'`\\]/ .'`\\ \\[ `.-. .-. |/ /__\\\\ \n    \\  /\\  / | \\__., | | | \\__. | \\__. | | | | | | || \\__., \n     \\/  \\/   '.__.'[___]'.___.' '.__.' [___||__||__]'.__.' \nChoose a class:\n1 for Rogue\n2 for Palidin\n3 for Barbarian";
  public static final String gameExplanationRogueText = "The objective of the game is to collect 50 artifacts.\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vunerable.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\nYou start with 100Hp and doing 15dmg for standard attacks.\nType anything to continue: ";
  public static final String gameExplanationPaladinText = "The objective of the game is to collect 50 artifacts.\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vunerable.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\nYou start with 125Hp and doing 20dmg for standard attacks.\nType anything to continue: ";
  public static final String gameExplanationBarbarianText = "The objective of the game is to collect 50 artifacts.\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vunerable.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\nYou start with 150Hp and doing 25dmg for standard attacks.\nType anything to continue: ";
  public static final String combatExplanation = "\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vulnerable to damage.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\n";
  public static final String attackTypeChoiceText = "\nWhat type of attack would you like to use?\n1 for Strong\n2 for Standard\n3 for Weak";
  public static final String failedToMakeSelection = "You failed to make a selection.";
  //Events Text
  public static final String dragon = "You meet a dragon.\n              __\n          _.-'.-'-.__\n       .-'.       '-.'-._ __.--._\n-..'\\,-,/..-  _         .'   \\   '----._\n ). /_ _\\' ( ' '.         '-  '/'-----._'-.__\n '..'     '-r   _      .-.       '-._ \\\n '.\\. Y .).'       ( .'  .      .\\          '\\'.\n .-')'|'/'-.        \\)    )      '',_      _.c_.\\\n   .<, ,>.          |   _/\\        . ',   :   : \\\\\n  .' \\_/ '.        /  .'   |          '.     .'  \\)\n                  / .-'    '-.        : \\   _;   ||\n                 / /    _     \\_      '.'\\ ' /   ||\n                /.'   .'        \\_      .|   \\   \\|\n               / /   /      __.---'      '._  ;  ||\n              /.'  _:-.____< ,_           '.\\ \\  ||\n             // .-'     '-.__  '-'-\\_      '.\\/_ \\|\n            ( };====.===-==='        '.    .  \\\\: \\\n             \\\\ '._        /          :   ,'   )\\_ \\\n              \\\\   '------/            \\ .    /   )/\n              \\|        _|             )Y    |   /\n                \\\\      \\             .','   /  ,/\n                 \\\\    _/            /     _/\n                  \\\\   \\           .'    .'\n                   '| '1          /    .'\n                     '. \\        |:    /\n                       \\ |       /', .'\n                        \\(      ( ;z'\n                         \\:      \\ '(_\n                          \\_,     '._ '-.___\n                                      '-' -.\\\nYou can either rob it or try to escape\n1 to escape.\n2 to atempt to rob the dragon.";

  public static final String doctorInitialText = "\nYou go to a doctor, he can heal you 10 to 40HP for free \n Or you can pay 2 artifacts to be healed a gaurenteed 70HP. \n 1 for Random \n 2 for 70HP \n You currently have: ";

  public static final String goblinFollowerOneTargetText = "You attack the first Henchman.";
  public static final String goblinFollowerTwoTargetText = "You attack the second Henchman.";
  public static final String goblinFollowerThreeTargetText = "You attack the third Henchman.";

  //Ending Text
  public static final String youDied = "          _______             ______  _________ _______  ______   _  \n|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( ) \n( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| | \n \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || | \n  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || | \n   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_) \n   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _  \n   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_) \n";
  public static final String youWin = "__      __    ____     __    __      ___       ___    _____      __      _  _______ \n) \\    / (   / __ \\    ) )  ( (     (  (       )  )  (_   _)    /  \\    / ) \\     / \n \\ \\  / /   / /  \\ \\  ( (    ) )     \\  \\  _  /  /     | |     / /\\ \\  / /   \\   /  \n  \\ \\/ /   ( ()  () )  ) )  ( (       \\  \\/ \\/  /      | |     ) ) ) ) ) )    ) (   \n   \\  /    ( ()  () ) ( (    ) )       )   _   (       | |    ( ( ( ( ( (     \\_/   \n    )(      \\ \\__/ /   ) \\__/ (        \\  ( )  /      _| |__  / /  \\ \\/ /      _    \n   /__\\      \\____/    \\______/         \\_/ \\_/      /_____( (_/    \\__/      (_)   \n";
  public static final String endingText = "Created by Matthew Dowling. \n Special thanks to: \n Allie \n Jack Nelson \n Mrs. Kovacic \n Nick DaSilva \n ";

  //Create Art
  public ArtAndText(){
    }

  //General
  public static void getWelcomeArt(){//Get Welcome art
    System.out.println(welcome);
  }
  public static void getCombatExplanation(){
    System.out.println(combatExplanation);
  }
  public void getYouDied(){
    System.out.println(youDied);
  }
  public void getYouWin(){
    System.out.println(youWin);
  }
  public void getEndingText(){
    System.out.println(endingText);
  }
  public static void getFailedToMakeSelection(){
    System.out.println(failedToMakeSelection);
  }

  //Game explanations
  public static void getGameExplantionRogue(){
    System.out.println(gameExplanationRogueText);
  }
  public static void getGameExplantionPaladin(){
    System.out.println(gameExplanationPaladinText);
  }
  public static void getGameExplantionBarbarian(){
    System.out.println(gameExplanationBarbarianText);
  }

  //Dragon
  public static void getDragonArt(){//Get dragon art
    System.out.println(dragon);
  }
  public void getDragonHPText(int dragonHP){
    System.out.println("The Dragon has " + dragonHP + " HP.");
  }
  
  //Doctor
  public static void getDoctorInitialText(int hp){
		System.out.println(doctorInitialText + hp + " HP.");
  }
  
  //All Combat
  public static void getAttackTypeChoiceText(){
    System.out.println(attackTypeChoiceText);
  }
}