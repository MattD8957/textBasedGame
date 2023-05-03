package TextBasedGame.Events.Night;

public class NightText {
    public static void getInitialText(double artifacts) {
        System.out.println(
                "Night falls, you can pay for a room in the town nearby or you can try to sleep under a nearby tree. \nIt costs 1 artifact to sleep in town, it is free to sleep under the tree but there might be dangers. \n1 for the town. \n 2 for the tree. \nYou have "
                        + artifacts + " artifacts.");
    }

    public static void getChoiceOneNightText() {
        System.out.println("You pay for your room and head to bed.");
    }

    public static void getChoiceOneMorningText(int atk) {
        System.out
                .println("You wake up feeling well rested and ready to go. Your attack is boosted "
                        + atk + "dmg");
    }

    public static void getChoiceTwoNightText() {
        System.out.println(
                "You lay out a sleeping bag under the tree and hope nothing bothers you overnight.");
    }

    public static void getChoiceTwoMorningColdText(int damageTaken) {
        System.out.println("It got extremly cold overnight and you lose " + damageTaken + "HP.");
    }

    public static void getChoiceTwoMorningAnimalText(int damageTaken, String name) {
        System.out.println("During the night an animal attacked you! " + name
                + " fought it off but lost " + damageTaken + "HP.");
    }

    public static void getChoiceTwoMorningFigureOutText(int damageTaken) {
        System.out.println("Figure Out!" + damageTaken + "HP.");
    }

    public static void getNotEnoughArtifactsText() {
        System.out.println("You don't have enough artifacts to sleep in the town.");
    }
}
