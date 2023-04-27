package TextBasedGame.Events.Bar;

import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Constants.BarConstants;

public class Brawl {
    
    Player player;
    int damageTaken;
    
    public Brawl(Player player){
        this.player = player;
    }

    public void brawl(){
        damageTaken = GeneralUtils.randomNumber(BarConstants.FIGHT_DMG_TAKEN_UPPER_BOUND);
        BarText.barBrawl(damageTaken, player.getHP());
        player.takeDamage(damageTaken);
    }
}
