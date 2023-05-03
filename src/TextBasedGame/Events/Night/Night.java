package TextBasedGame.Events.Night;

import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Constants.NightConstants;

public class Night {

  Player player;
  Scanner input = new Scanner(System.in);
  int choice;
  int atk;
  int damageTaken;

  public Night(Player player) {
    this.player = player;
  }

  public void night() {

    do {
      NightText.getInitialText(player.getArtifact());
      choice = input.nextInt();// Town Extra damage
    } while (!GeneralUtils.isAnOption(choice, 2));
    if (choice == 1) { // Town Extra damage
      if ((player.getArtifact() - 1) > 0) {
        player.ChangeArtifacts(-1);
        NightText.getChoiceOneNightText();
        GeneralUtils.pause(3);
        atk = GeneralUtils.randomNumber(NightConstants.CHOICE_ONE_ATTACK_INCREASE_UPPER_BOUND) + 1; // Increase attack by 1-5
        NightText.getChoiceOneMorningText(atk);
        player.increaseAttack(atk);
      } else {
        NightText.getNotEnoughArtifactsText();
        choice = 2;
      }
    }
    if (choice == 2) {// Tree Dangerous
      NightText.getChoiceTwoNightText();
      GeneralUtils.pause(3);
      damageTaken = GeneralUtils.randomNumber(NightConstants.CHOICE_ONE_DMG_TAKEN_UPPER_BOUND) + 1;
      switch (GeneralUtils.randomNumber(NightConstants.CHOICE_TWO_EVENT_CHOICE)) {
        case 0: // Cold
          NightText.getChoiceTwoMorningColdText(damageTaken);
          break;
        case 1: // Animal
          NightText.getChoiceTwoMorningAnimalText(damageTaken, player.getName());
          break;
        case 2: // ?
          NightText.getChoiceTwoMorningFigureOutText(damageTaken); // TODO add this method
          break;
      }
      player.takeDamage(damageTaken);
    }
  }



}
