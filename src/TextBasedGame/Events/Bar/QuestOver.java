package TextBasedGame.Events.Bar;

import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;

public class QuestOver {
    
    Player player;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);

    int questChoice;
    int questChoiceRandomStuff;

    public QuestOver(Player player, Attack strong, Attack standard, Attack weak){
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public void initial(){
        // TODO Finish this
        do{
            BarText.getguardQuestText();
            questChoice = input.nextInt();
            } while (!GeneralUtils.isAnOption(questChoice, 4));
            if (questChoice == 1) {// Defeat smugiling group

            } else if (questChoice == 2) {// Defeat Evil king
                do{
                BarText.getBarQuestTwoText(); // Defeat the Evil king
                questChoiceRandomStuff = input.nextInt();
                } while (!GeneralUtils.isAnOption(questChoiceRandomStuff, 3));
                if (questChoiceRandomStuff == 1) {

                } else if (questChoiceRandomStuff == 2) {

                } else if (questChoiceRandomStuff == 3) {

                }
            } else if (questChoice == 3) {// TODO figure out what goes here

            } else if (questChoice == 4) {// Don't want any of the quests
                BarText.getBarNoQuestText();
            }
    }
}
