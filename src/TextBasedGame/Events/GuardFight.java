package TextBasedGame.Events;

public class GuardFight  {

    //Text Returns
    public static void initialFightText(){
        System.out.println("\nYou enter a town to rest but the gaurds stop you.\nThey belive you to be a criminal and arrest you.\nAs they take you to jail you have 3 options.\n1 to go with them willingly.\n2 to beg for mercy.\n3 to fight back and try to escape.\n");
    }
    public static void goPeacefulText(){
        System.out.println("You go with the gaurds. \nThey put you in a cell and tell you that the sentanceing will happen the next Monday.");
    }
    public static void afterJailText(){
        System.out.println("Monday arrives and you are taken to the court. \nThe trial passes and at the end you are sentenced.");
    }
    public static void fightWinText(){
        System.out.println("You defeat the guards! \n You decided to walk over and search the guards and \n on the guards you find some artifacts, would you like to take them? \n 1 for Yes. \n 2 for No.");
    }
    public static void executionText(){
        System.out.println("You are convicted of murder and sentanced to death.");
    }

    //Every Thing else
    public static void jailFight(int damageTaken, int characterHP){
        System.out.println("During lunch the next day a fight breaks out. \nIn the brawl you lose " + damageTaken + " Hp. \nYou now have " + getHP(characterHP, damageTaken) + "Hp. \nThe rest of your stay is uneventful");
    }
    //Chances out of 31 (0-30)
    // Fine 15 in 31
    // Jail 10 in 31
    // Fine and Jail 5 in 31
    // Execution 1 in 31
    public static void fine(int fine, double characterArtifact){
        System.out.println("You are sentenced to pay a fine of " + fine + "  artifacts. \nYou now have " + characterArtifact + " artifacts.");
    }
    public static void jail(int damageTaken, int characterHP){
        System.out.println("You are then sentenced to one year in jail \nNear the end of your stay you get sick and take " + damageTaken + " dmg. \nYou now have " + getHP(characterHP, damageTaken) + "Hp.");
    }
    public static void execution(){

    }
    private static int getHP(int HP, int AtkDMG){
        if((HP - AtkDMG) >= 0){
            return (HP - AtkDMG);
        }
        else{
            return 0;
        }
    }
}
