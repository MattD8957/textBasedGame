package TextBasedGame.Events.Bar;

import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;

public class Bar {
   
    Player player;
    Attack strong;
    Attack standard;
    Attack weak;
    boolean foughtOnce;

    Scanner input = new Scanner(System.in);
    int choice;

    public Bar(Player player, Attack strong, Attack standard, Attack weak, boolean foughtOnce){
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
        this.foughtOnce = foughtOnce;
    }

    public void bar() {
        do{
            BarText.getBarText();
            choice = input.nextInt();
            } while (!GeneralUtils.isAnOption(choice, 3));
            switch (choice) {
                case 1: // Start a brawl
                    Brawl brawl = new Brawl(player);
                    brawl.brawl();
                    break;
                case 2: // Buy a weapon
                    Blacksmith blacksmith = new Blacksmith(player, strong, standard, weak);
                    blacksmith.blacksmith();
                    break;
                case 3: // Get quest from guards
                    QuestOver quest = new QuestOver(player, strong, standard, weak);
                    quest.initial();
                    break;
            }
    }
}
