package TextBasedGame;

public class GoblinBattle {
    

    public GoblinBattle(){

    }
    //Initial text
    public void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + " Hp.");
    }
    public void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP, int goblinFollowerTwoHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + " and " + goblinFollowerTwoHP + " Hp.");
    }
    public void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP, int goblinFollowerTwoHP, int goblinFollowerThreeHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + ", " + goblinFollowerTwoHP+ ", and " + goblinFollowerThreeHP + " Hp.");
    }
    //Attacking Leader
    public void goblinLeaderAttackStrong(int strongAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= strongAttackDamage;
        System.out.println("You choose a strong attack You do " + strongAttackDamage + " damage. \nThe Leader now has " + goblinLeaderHP + " HP.");
    }
    public void goblinLeaderAttackStandard(int standardAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= standardAttackDamage;
        System.out.println("You choose a standard attack You do " + standardAttackDamage + " damage. \nThe Leader now has " + goblinLeaderHP + " HP.");
    }
    public void goblinLeaderAttackWeak(int weakAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= weakAttackDamage;
        System.out.println("You choose a weak attack You do " + weakAttackDamage + " damage. \nThe Leader now has " + goblinLeaderHP + " HP.");
    }
    //Attacking Follower One
    public void goblinFollowerOneAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= strongAttackDamage;
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerOneAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= standardAttackDamage;
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerOneAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= weakAttackDamage;
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    //Attacking Follower Two
    public void goblinFollowerTwoAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= strongAttackDamage;
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerTwoAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= standardAttackDamage;
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerTwoAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= weakAttackDamage;
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    //Attacking Follower Three
    public void goblinFollowerThreeAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= strongAttackDamage;
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerThreeAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= standardAttackDamage;
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    public void goblinFollowerThreeAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= weakAttackDamage;
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + goblinFollowerOneHP + " HP.");
    }
    //Goblins Turn
    public void goblinLeadersTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The leader attacks doing " + damageTaken + " damage. \nYou now have " + characterHP + " HP.");
    }
    public void goblinFollowerOneTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The henchman attacks doing " + damageTaken + " damage. \nYou now have " + characterHP + " HP.");
    }
    public void goblinFollowerTwoTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The second henchman attacks doing " + damageTaken + " damage. \nYou now have " + characterHP + " HP.");
    }
    public void goblinFollowerThreeTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The third henchman attacks doing " + damageTaken + " damage. \nYou now have " + characterHP + " HP.");
    }
    public void winText(double artifacts){
        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts. \nYou now have " + artifacts + " artifacts.");
    }
}