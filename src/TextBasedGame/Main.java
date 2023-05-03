package TextBasedGame;

import java.util.*;
import TextBasedGame.Characters.Player;
import TextBasedGame.Events.Bar.Bar;
import TextBasedGame.Events.Bear.Bear;
import TextBasedGame.Events.Doctor.Doctor;
import TextBasedGame.Events.Doctor.Heal;
import TextBasedGame.Events.DragonBattle.DragonBattle;
import TextBasedGame.Events.GoblinBattle.GoblinBattleSuper;
import TextBasedGame.Events.Night.Night;
import TextBasedGame.Events.Town.Town;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.CreateCharacters;
import TextBasedGame.Utilities.DEVMode;
import TextBasedGame.Utilities.GeneralUtils; 
import TextBasedGame.Utilities.Constants.GeneralConstants;

public class Main {
	public static void main(String args[]) {
		// Variables
		String moveOn = "Hi!"; // Player imputs when to continue
		int event = -1;// chooses which event will happen
		int count = 0; // Counts how many times the player has looped
		boolean foughtOnce = false; // Checks if player has fought to give combat explanation
		// Create Classes
		Scanner scanner = new Scanner(System.in);
		Heal heal = new Heal(100);
		//Opening screen
		CreateCharacters create = GeneralUtils.StartScreen(scanner);
		
		// CREATE the Character
		Player player = create.createPlayer(heal);
		Attack strong = create.createStrongAttack();
		Attack standard = create.createStandardAttack();
		Attack weak = create.createWeakAttack();
		DEVMode DEV = new DEVMode(player, strong, standard, weak);
		
		// Information for player at start of game TODO Decide on amount of artifacts
		moveOn = scanner.next(); // Wait until player presses a button
		GeneralUtils.clearScreen();
		if(moveOn.equals("DEV")){
			System.out.println("DEV MODE ACTIVATED");
			DEV.DEVScreen();
			DEV.turnOnDEVMode();
		}

		// Start game loop
		while (!player.isDead()) {
			if(DEV.getDEVMODE() && count != 0){
				DEV.DEVScreen();
			}

			event = GeneralUtils.generateEvent(player, DEV);
			// EVENTS
			switch (event) {
				case 0: // Fight dragon
					DragonBattle dragon = new DragonBattle(player, foughtOnce, strong, standard, weak);
					dragon.dragon();
					break;
				case 1: // Fight Bear
					Bear bear = new Bear(player, foughtOnce, strong, standard, weak);
					bear.bear();
					break;
				case 2: // Go into a bar
					Bar bar = new Bar(player, strong, standard, weak, foughtOnce);
					bar.bar();
					break;
				case 3: // Go to a doctor
					Doctor doc = new Doctor(player);
					doc.doctor();
					break;
				case 4: // Goblin horde
					GoblinBattleSuper goblin = new GoblinBattleSuper(player, strong, standard, weak);
					goblin.battle(foughtOnce);
					break;
				case 5: // Fight guards
					Town town = new Town(player, strong, standard, weak, foughtOnce);
					town.town();
					break;
				case 6: // Night
					Night night = new Night(player);
					night.night();
					break;
				default:
					System.out.println("ERROR not a valid event");
					System.exit(3);
			}

			// Win screen
			if (player.getArtifact() >= GeneralConstants.TREASURE_TO_WIN) {// If you collect 50 treasures
				GeneralUtils.winScreen(player.getName());
			}

			count++;
		}
		// Death screen
		GeneralUtils.loseScreen();

		System.out.println("Hi\n" + moveOn);
		scanner.close();
	}
}