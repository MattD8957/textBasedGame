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
      getNightInitialText(player.getArtifact());
      choice = input.nextInt();// Town Extra damage
    } while (!GeneralUtils.isAnOption(choice, 2));
    if (choice == 1) { // Town Extra damage
      if ((player.getArtifact() - 1) > 0) {
        player.ChangeArtifacts(-1);
        getNightChoiceOneNightText();
        GeneralUtils.pause(3);
        atk = GeneralUtils.randomNumber(NightConstants.CHOICE_ONE_ATTACK_INCREASE_UPPER_BOUND) + 1; // Increase
                                                                                                    // attack
                                                                                                    // by
                                                                                                    // 1-5
        getNightChoiceOneMorningText(atk);
        player.increaseAttack(atk);
      } else {
        System.out.println("You don't have enough artifacts for that.");
        choice = 2;
      }
    }
    if (choice == 2) {// Tree Dangerous
      getNightChoiceTwoNightText();
      GeneralUtils.pause(3);
      damageTaken = GeneralUtils.randomNumber(NightConstants.CHOICE_ONE_DMG_TAKEN_UPPER_BOUND) + 1;
      switch (GeneralUtils.randomNumber(NightConstants.CHOICE_TWO_EVENT_CHOICE)) {
        case 0: // Cold
          getNightChoiceTwoMorningColdText(damageTaken);
          break;
        case 1: // Animal
          getNightChoiceTwoMorningAnimalText(damageTaken, player.getName());
          break;
        case 2: // ?
          getNightChoiceTwoMorningFigureOutText(damageTaken); // TODO add this method
          break;
      }
      player.takeDamage(damageTaken);
    }
  }

  public void getNightInitialText(double artifacts) {
    System.out.println(
        "Night falls, you can pay for a room in the town nearby or you can try to sleep under a nearby tree. \nIt costs 1 artifact to sleep in town, it is free to sleep under the tree but there might be dangers. \n1 for the town. \n 2 for the tree. \nYou have "
            + artifacts + " artifacts.");
  }

  public void getNightChoiceOneNightText() {
    System.out.println("You pay for your room and head to bed.");
  }

  public void getNightChoiceOneMorningText(int atk) {
    System.out.println(
        "You wake up feeling well rested and ready to go. Your attack is boosted " + atk + "dmg");
  }

  public void getNightChoiceTwoNightText() {
    System.out.println(
        "You lay out a sleeping bag under the tree and hope nothing bothers you overnight.");
  }

  public void getNightChoiceTwoMorningColdText(int damageTaken) {
    System.out.println("It got extremly cold overnight and you lose " + damageTaken + "HP.");
  }

  public void getNightChoiceTwoMorningAnimalText(int damageTaken, String name) {
    System.out.println("During the night an animal attacked you! " + name
        + " fought it off but lost " + damageTaken + "HP.");
  }

  public void getNightChoiceTwoMorningFigureOutText(int damageTaken) {
    System.out.println("Figure Out!" + damageTaken + "HP.");
  }

}
