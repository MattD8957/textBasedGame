package TextBasedGame.Events.Bar;

public class BarText {
	

	public static void barBrawl(int DMGTaken, int CharHP) {
        System.out.println();
        System.out.println("You decide to start a brawl. \nIn the fight you take " + DMGTaken + " damage. You now have " + CharHP + " HP.");
	}
    public static void barNewWeapon(){

    }
    public static void getBarText(){
        System.out.println("\nYou walk into a bar.\nYou have three choices;\nType 1 to start a brawl.\nType 2 to buy a weapon from a local salesman.\nType 3 to talk to the guard and get a quest.\n");
    }
        //Blacksmith
        public static void getBlackSmithText(){
          System.out.println("You meet a local blacksmith, he offers a sword that will increase your damage by 1 to 15. You could also pay for a gaurenteed incrase of 15, for 2 artifacts.\n1 for random \n2 to pay");
        }
        //Quests
        public static void getguardQuestText(){
          System.out.println("\nYou talk to the guard to get a quest.\nHe gives you three quests and tells you to choose one.\nThe first quest is to take down a smugiling ring.\nThe second quest is to defeat an evil queen.\nThe third quest is TODO. \nOr you can take no quest. \nWhich quest do you choose? Type 1, 2, 3, or 4");
        }
        public static void getBarQuestOneText(){
          System.out.println(" ");
        }
        public static void getBarQuestTwoText(){
          System.out.println("He lays out the story, an evil king takes over a foreign kingdom and subjugates the people. \nThey are living in poverty suppersed by the cruel lord and his servants. This riles you up and you ask were you can find this place. He responds, \"Head due north until you reach Leictinstein, then head to the east for 6 miles. You will come to a set of cross roads with 3 options, go to the right, because right is always right.\" You say thank you and head off.");
        }
        public static void getBarQuestThreeText(){
          System.out.println(" ");
        }
        public static void getBarNoQuestText(){
          System.out.println("He says, \"I understand they are not easy tasks, it will be a challenge for the millitary.\" You say goodbye and head out of the tavern looking for a place to sleep.");
        }
}