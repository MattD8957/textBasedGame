package TextBasedGame;

public class ArtAndText {
  private static final String dragon = "You meet a dragon.\n              __\n          _.-'.-'-.__\n       .-'.       '-.'-._ __.--._\n-..'\\,-,/..-  _         .'   \\   '----._\n ). /_ _\\' ( ' '.         '-  '/'-----._'-.__\n '..'     '-r   _      .-.       '-._ \\/n '.\\. Y .).'       ( .'  .      .\\          '\\'.\n .-')'|'/'-.        \\)    )      '',_      _.c_.\\\n   .<, ,>.          |   _/\\        . ',   :   : \\\\\n  .' \\_/ '.        /  .'   |          '.     .'  \\)\n                  / .-'    '-.        : \\   _;   ||\n                 / /    _     \\_      '.'\\ ' /   ||\n                /.'   .'        \\_      .|   \\   \\|\n               / /   /      __.---'      '._  ;  ||\n              /.'  _:-.____< ,_           '.\\ \\  ||\n             // .-'     '-.__  '-'-\\_      '.\\/_ \\|\n            ( };====.===-==='        '.    .  \\\\: \\\n             \\\\ '._        /          :   ,'   )\\_ \\\n              \\\\   '------/            \\ .    /   )/\n              \\|        _|             )Y    |   /\n                \\\\      \\             .','   /  ,/\n                 \\\\    _/            /     _/\n                  \\\\   \\           .'    .'\n                   '| '1          /    .'\n                     '. \\        |:    /\n                       \\ |       /', .'\n                        \\(      ( ;z'\n                         \\:      \\ '(_\n                          \\_,     '._ '-.___\n                                      '-' -.\\\nYou can either rob it or try to escape\n1 to escape\n2 to atempt to rob the dragon\n";
  private static final String welcome = " ____      ____      __                                     \n|_  _|    |_  _|    [  |                                    \n  \\ \\  /\\  / /.---.  | |  .---.   .--.   _ .--..--.  .---.  \n   \\ \\/  \\/ // /__\\\\ | | / /'`\\]/ .'`\\ \\[ `.-. .-. |/ /__\\\\ \n    \\  /\\  / | \\__., | | | \\__. | \\__. | | | | | | || \\__., \n     \\/  \\/   '.__.'[___]'.___.' '.__.' [___||__||__]'.__.' \nChoose a class:\n1 for Rogue\n2 for Palidin\n3 for Barbarian\n";
  private static final String youDied = "          _______             ______  _________ _______  ______   _  \n|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( ) \n( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| | \n \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || | \n  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || | \n   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_) \n   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _  \n   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_) \n";
  private static final String youWin = "__      __    ____     __    __      ___       ___    _____      __      _  _______ \n) \\    / (   / __ \\    ) )  ( (     (  (       )  )  (_   _)    /  \\    / ) \\     / \n \\ \\  / /   / /  \\ \\  ( (    ) )     \\  \\  _  /  /     | |     / /\\ \\  / /   \\   /  \n  \\ \\/ /   ( ()  () )  ) )  ( (       \\  \\/ \\/  /      | |     ) ) ) ) ) )    ) (   \n   \\  /    ( ()  () ) ( (    ) )       )   _   (       | |    ( ( ( ( ( (     \\_/   \n    )(      \\ \\__/ /   ) \\__/ (        \\  ( )  /      _| |__  / /  \\ \\/ /      _    \n   /__\\      \\____/    \\______/         \\_/ \\_/      /_____( (_/    \\__/      (_)   \n";
  private static final String gameExplanation = "The objective of the game is to collect 50 artifacts.\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vunerable.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\nYou start with 100Hp and doing 15dmg for standard attacks.\nType anything to continue: \n";
  private static final String combatExplanation = "\nFighting will be turn based, and you have 3 types of attacks strong, standard, and weak.\nStrong attacks do more damage but leaves you vulnerable to damage.\nStandard attacks do a normal amount of damage and leaves you in a standard position of defense.\nWeak attacks do less damage but leaves you in a defensive position and so you take less damage.\n";
  private static final String barText = "\nYou walk into a bar.\nYou have three choices;\nType 1 to start a brawl.\nType 2 to buy a weapon from a local salesman.\nType 3 to talk to the guards and get a quest.\n";
  private static final String guardQuestText = "\nYou talk to the guards to get a quest.\nHe gives you three quests and tells you to choose one.\nThe first quest is to take down a smugiling ring.\nThe second quest is to defeat an evil queen.\nThe third quest is TODO\nWhich quest do you choose? Type 1, 2, or 3";
  private static final String attackTypeChoiceText = "\nWhat type of attack would you like to use?\n1 for Strong\n2 for Standard\n3 for Weak\n";
  private static final String guardFightText = "\nYou enter a town to rest but the gaurds stop you.\nThey belive you to be a criminal and arrest you.\nAs they take you to jail you have 3 options.\n1 to go with them willingly.\n2 to beg for mercy.\n3 to fight back and try to escape.\n";
  private static final String goblinBattleAttackTargetTwo = "Who will you attack? \n1 for leader\n2 for henchman";
  private static final String goblinBattleAttackTargetThree = "Who will you attack? \n1 for leader\n2 for henchman\n3 for henchamn 2";
  private static final String goblinBattleAttackTargetFour = "Who will you attack? \n1 for leader\n2 for henchman\n3 for henchamn 2\n4 for henchman 3";

  //Create Art
  public ArtAndText(){   

    }
  //Get Welcome art
  public String getWelcomeArt(){
    return welcome;
  }
  //Get dragon art
  public String getDragonArt(){
    return dragon;
  }
  public String getYouDied(){
    return youDied;
  }
  public String getYouWin(){
    return youWin;
  }
  public String getGameExplantion(){
    return gameExplanation;
  }
  public String getCombatExplanation(){
    return combatExplanation;
  }
  public String getBarText(){
    return barText;
  }
  public String getguardQuestText(){
    return guardQuestText;
  }
  public String getAttackTypeChoiceText(){
    return attackTypeChoiceText;
  }
  public String getGuardFightText(){
    return guardFightText;
  }
  public String getGoblinFightTargetTextTwo(){
    return goblinBattleAttackTargetTwo;
  }
  public String getGoblinFightTargetTextThree(){
    return goblinBattleAttackTargetThree;
  }
  public String getGoblinFightTargetTextFour(){
    return goblinBattleAttackTargetFour;
  }
}