package TextBasedGame;

public class DragonBattle {

    public static void escaped(){
        System.out.println("You succesfully escape and can continue your journey.");
    }
    public static void tripThenEscape(int damageTaken, int characterHP){
        System.out.println("On your way out you fall and take some damage. \nYou succesfully escape only taking " + damageTaken + " damge, you now have " + getHealth(characterHP, damageTaken) + "HP. \nYou leave and continue your journey.");
    }
    public static void characterAttackChoiceOne(int strongAttackDMG, int dragonHP){ 
        System.out.println("You choose a strong attack \nYou do " + strongAttackDMG + " damage. \nThe Dragon now has " + getHealth(dragonHP, strongAttackDMG) + " HP.");
    }
    public static void characterAttackChoiceTwo(int standardAttackDMG, int dragonHP){ 
        System.out.println("You choose a standard attack \nYou do " + standardAttackDMG + " damage. \nThe Dragon now has " + getHealth(dragonHP, standardAttackDMG) + " HP.");
    }
    public static void characterAttackChoiceThree(int weakAttackDMG, int dragonHP){ 
        System.out.println("You choose a weak attack \nYou do " + weakAttackDMG + " damage. \nThe Dragon now has " + getHealth(dragonHP, weakAttackDMG) + " HP.");
    }
    public static void endRoundtext(int damageTaken, int characterHP){
        System.out.println("The dragon attacks doing " + damageTaken + " damage. \nYou now have " + getHealth(characterHP, damageTaken) + " HP.");
    }
    public static void finalText(double artifacts){
        System.out.println("Congratulations you beat the dragon! You get to keep its artifact. \nYou now have " + artifacts + " artifacts.");
    }
    public static int getHealth(int HP, int AtkDMG){
        if((HP - AtkDMG) >= 0){
            return (HP - AtkDMG);
        }
        else{
            return 0;
        }
    }
}

