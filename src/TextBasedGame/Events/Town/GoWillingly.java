package TextBasedGame.Events.Town;

import TextBasedGame.Utilities.Constants.TownConstants;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.GeneralUtils;

public class GoWillingly {


    public static void willing(Player player) {
        int damageTaken;
        int fightStart;
        int courtSentancing;
        int fine = 0;

        TownText.goPeacefulText();
        // Random to decide if fight starts 1 in 6 it does
        fightStart = GeneralUtils.randomNumber(TownConstants.JAIL_CHANCE_FIGHT_UPPER_BOUND);
        if (fightStart == 0)// If var = 0 then start fight if not continue
        {
            damageTaken = GeneralUtils.randomNumber(TownConstants.JAIL_FIGHT_DMG_TAKEN_UPPER_BOUND);
            player.takeDamage(damageTaken);
            TownText.jailFight(damageTaken, player.getHP());
        } else if ((fightStart >= 1) && (fightStart <= 5)) {
            System.out.println("Your stay was uneventful.");
        }
        // Random to get sentance
        courtSentancing = GeneralUtils.randomNumber(TownConstants.COURT_SENTANCING_UPPER_BOUND);
        TownText.afterJailText();

        if ((courtSentancing >= 0) && (courtSentancing <= 14))// Fine
        {
            fine = -1 * GeneralUtils.randomNumber(TownConstants.FINE_UPPER_BOUND);
            player.ChangeArtifacts(fine);
            TownText.fine(fine, player.getArtifact());
        } else if ((courtSentancing >= 15) && (courtSentancing <= 24))// Jail 0 - 10
        {
            damageTaken = GeneralUtils.randomNumber(TownConstants.DMG_TAKEN_FROM_JAIL_UPPER_BOUND);
            TownText.jail(damageTaken, player.getHP());
            player.takeDamage(damageTaken);
            GeneralUtils.pause(5);
        } else if ((courtSentancing >= 25) && (courtSentancing <= 29))// Fine and Jail
        {
            // Fine
            fine = -1 * GeneralUtils.randomNumber(TownConstants.FINE_UPPER_BOUND);
            player.ChangeArtifacts(fine);
            TownText.fine(fine, player.getArtifact());
            // Jail
            damageTaken = GeneralUtils.randomNumber(TownConstants.DMG_TAKEN_FROM_JAIL_UPPER_BOUND);
            TownText.jail(damageTaken, player.getHP());
            player.takeDamage(damageTaken);
            GeneralUtils.pause(3);
        } else if (courtSentancing == 30)// Execution
        {
            TownText.executionText();
            player.kill();
        }
    }
}
