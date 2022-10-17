package TextBasedGame;

public class DragonBattle {
    private int damageTaken;
    private int characterHP;

    public DragonBattle(){
    }
    public void escaped(){
        System.out.println("You succesfully escape and can continue your journey.");
    }
    public void tripThenEscape(int DMGTaken, int charHP){
        damageTaken = DMGTaken;
        characterHP = charHP;
        System.out.println("On your way out you fall and take some damage. \nYou succesfully escape only taking " + damageTaken + " damge, you now have " + characterHP + "HP. \nYou leave and continue your journey.");
    }
    public void characterAttackChoiceOne(int strongAttackDMG, int dragonHP){ 
        dragonHP -= strongAttackDMG;
        System.out.println("You choose a strong attack \nYou do " + strongAttackDMG + " damage. \nThe Dragon now has " + dragonHP + " HP.");
    }
    public void characterAttackChoiceTwo(int standardAttackDMG, int dragonHP){ 
        dragonHP -= standardAttackDMG;
        System.out.println("You choose a standard attack \nYou do " + standardAttackDMG + " damage. \nThe Dragon now has " + dragonHP + " HP.");
    }
    public void characterAttackChoiceThree(int weakAttackDMG, int dragonHP){ 
        dragonHP -= weakAttackDMG;
        System.out.println("You choose a weak attack \nYou do " + weakAttackDMG + " damage. \nThe Dragon now has " + dragonHP + " HP.");
    }
}
