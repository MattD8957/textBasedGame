package TextBasedGame.Utilities;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Heal {
    private int maxHP;
    private int amountTOHeal;

    public Heal(int charHealthMax){
        maxHP = charHealthMax;
    }
    public void setMaxHP(int newMaxHP){
        maxHP = newMaxHP;
    }
    public int heal(int HP, int amountHealed){
        HP += amountHealed;
        if(HP < maxHP){
            amountTOHeal = amountHealed;
        }
        else if(HP >= maxHP){
            amountTOHeal = HP - maxHP;
        }
        return amountTOHeal;
    }
    public void doctorOutputText(int characterHP, int amountHealed){
        System.out.println("You were healed: " + amountHealed + "Hp. Your new health is " + characterHP + "HP.");
    }
}

