package TextBasedGame.Events.Doctor;

import TextBasedGame.Characters.Player;

public class Heal {
    private int maxHP;
    private int amountTOHeal;

    public Heal(int charHealthMax) {
        maxHP = charHealthMax;
    }

    public void setMaxHP(int newMaxHP) {
        maxHP = newMaxHP;
    }

    public void heal(int HP, int amountHealed, Player player) {
        HP += amountHealed;
        if (HP < maxHP) {
            player.heal(amountHealed);
        } else if (HP >= maxHP) {
            player.setHealthToMaxHP();
        }
    }

    public void doctorOutputText(int characterHP, int amountHealed) {
        System.out.println("You were healed: " + amountHealed + "Hp. Your new health is "
                + characterHP + "HP.");
    }
}

