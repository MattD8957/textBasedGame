package TextBasedGame.Events.Bear;

public class BearText {
    
    public static void characterAttackStrengthOne(int strongAttackDMG, int bearHP){
        System.out.println("You choose a strong attack! \nYou do " + strongAttackDMG + " damage. \nThe bear now has " + getHP(bearHP, strongAttackDMG) + " HP.");
    }
    public static void characterAttackStrengthTwo(int standardAttackDMG, int bearHP){
        System.out.println("You choose a standard attack! \nYou do " + standardAttackDMG + " damage. \nThe bear now has " + getHP(bearHP, standardAttackDMG) + " HP.");
    }
    public static void characterAttackStrengthThree(int weakAttackDMG, int bearHP){
        System.out.println("You choose a weak attack! \nYou do " + weakAttackDMG + " damage. \nThe bear now has " + getHP(bearHP, weakAttackDMG) + " HP.");
    }
    public static void bearTurnText(int damageTaken, int characterHP){
        System.out.println("The bear attacks doing " + damageTaken + " damage. \nYou now have " + getHP(characterHP, damageTaken) + " HP.");
    }
    public static void getBearInitialText(){
        System.out.println("You are travaling in the forest when you run into an agressive bear.");
    }
    public static void getBeatBearText(double artifacts){
        System.out.println("Congratulations you beat the bear! You get to keep its artifact. \nYou now have " + artifacts + " artifacts.");
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
