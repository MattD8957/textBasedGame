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

    //Attacking Follower One

    //Attacking Follower Two
    
    //Attacking Follower Three
    public void winText(double artifacts){
        System.out.println("Congratulations you beat the goblin horde! You get to keep their artifacts. \nYou now have " + artifacts + " artifacts.");
    }
}