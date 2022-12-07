package TextBasedGame;

public class GoblinBattle {
    
    //Initial text
    public static void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + " Hp.");
    }
    public static void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP, int goblinFollowerTwoHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + " and " + goblinFollowerTwoHP + " Hp.");
    }
    public static void initialText(int goblinFollowerCount, int goblinLeaderHP, int goblinFollowerOneHP, int goblinFollowerTwoHP, int goblinFollowerThreeHP){
        System.out.println("There is a leader and he has " + goblinFollowerCount + " henchmen.\nThe leader has " + goblinLeaderHP + " Hp. \nHis follower has " + goblinFollowerOneHP + ", " + goblinFollowerTwoHP+ ", and " + goblinFollowerThreeHP + " Hp.");
    }
    //Attacking Leader
    public static void goblinLeaderAttackStrong(int strongAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= strongAttackDamage;
        System.out.println("You choose a strong attack You do " + strongAttackDamage + " damage. \nThe Leader now has " + getHP(goblinLeaderHP, strongAttackDamage) + " HP.");
    }
    public static void goblinLeaderAttackStandard(int standardAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= standardAttackDamage;
        System.out.println("You choose a standard attack You do " + standardAttackDamage + " damage. \nThe Leader now has " + getHP(goblinLeaderHP, standardAttackDamage) + " HP.");
    }
    public static void goblinLeaderAttackWeak(int weakAttackDamage, int goblinLeaderHP){
        goblinLeaderHP -= weakAttackDamage;
        System.out.println("You choose a weak attack You do " + weakAttackDamage + " damage. \nThe Leader now has " + getHP(goblinLeaderHP, weakAttackDamage) + " HP.");
    }
    //Attacking Follower One
    public static void goblinFollowerOneAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= strongAttackDamage;
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, strongAttackDamage) + " HP.");
    }
    public static void goblinFollowerOneAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= standardAttackDamage;
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, standardAttackDamage) + " HP.");
    }
    public static void goblinFollowerOneAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= weakAttackDamage;
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, weakAttackDamage) + " HP.");
    }
    //Attacking Follower Two
    public static void goblinFollowerTwoAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= strongAttackDamage;
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, strongAttackDamage) + " HP.");
    }
    public static void goblinFollowerTwoAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= standardAttackDamage;
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, standardAttackDamage) + " HP.");
    }
    public static void goblinFollowerTwoAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        goblinFollowerOneHP -= weakAttackDamage;
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, weakAttackDamage) + " HP.");
    }
    //Attacking Follower Three
    public static void goblinFollowerThreeAttackStrong(int strongAttackDamage, int goblinFollowerOneHP){
        System.out.println("You choose a strong attack. \nYou do " + strongAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, strongAttackDamage) + " HP.");
    }
    public static void goblinFollowerThreeAttackStandard(int standardAttackDamage, int goblinFollowerOneHP){
        System.out.println("You choose a standard attack. \nYou do " + standardAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, standardAttackDamage) + " HP.");
    }
    public static void goblinFollowerThreeAttackWeak(int weakAttackDamage, int goblinFollowerOneHP){
        System.out.println("You choose a weak attack. \nYou do " + weakAttackDamage + " damage. \nThe Follower now has " + getHP(goblinFollowerOneHP, weakAttackDamage) + " HP.");
    }
    //Goblins Turn
    public static void goblinLeadersTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The leader attacks doing " + damageTaken + " damage. \nYou now have " + getHP(characterHP, damageTaken) + " HP.");
    }
    public static void goblinFollowerOneTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The henchman attacks doing " + damageTaken + " damage. \nYou now have " + getHP(characterHP, damageTaken) + " HP.");
    }
    public static void goblinFollowerTwoTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The second henchman attacks doing " + damageTaken + " damage. \nYou now have " + getHP(characterHP, damageTaken) + " HP.");
    }
    public static void goblinFollowerThreeTurnOutPut(int damageTaken, int characterHP){
        System.out.println("The third henchman attacks doing " + damageTaken + " damage. \nYou now have " + getHP(characterHP, damageTaken) + " HP.");
    }
    public static void winText(double artifacts){
        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts. \nYou now have " + artifacts + " artifacts.");
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