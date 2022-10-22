package TextBasedGame;

public class BearBattle {
    
    public BearBattle(){
    }
    public void characterAttackChoiceOne(int strongAttackDMG, int bearHP){
        bearHP -= strongAttackDMG;
        System.out.println("You choose a strong attack! \nYou do " + strongAttackDMG + " damage. \nThe bear now has " + bearHP + " HP.");
    }
    public void characterAttackChoiceTwo(int standardAttackDMG, int bearHP){
        bearHP -= standardAttackDMG;
        System.out.println("You choose a standard attack! \nYou do " + standardAttackDMG + " damage. \nThe bear now has " + bearHP + " HP.");
    }
    public void characterAttackChoiceThree(int weakAttackDMG, int bearHP){
        bearHP -= weakAttackDMG;
        System.out.println("You choose a weak attack! \nYou do " + weakAttackDMG + " damage. \nThe bear now has " + bearHP + " HP.");
    }
    public void bearTurnText(int damageTaken, int characterHP){
        System.out.println("The bear attacks doing " + damageTaken + " damage. \nYou now have " + characterHP + " HP.");
    }
}
