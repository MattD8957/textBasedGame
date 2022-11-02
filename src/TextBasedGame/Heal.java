package TextBasedGame;
import java.math.*;
public class Heal {
    private int maxHP;
    private int output;

    public Heal(int charHealthMax){
        maxHP = charHealthMax;
    }
    public void setMaxHP(int newMaxHP){
        maxHP = newMaxHP;
    }
    public int heal(int HP, int amountHealed){
        HP += amountHealed;
        if(HP < maxHP){
            output = HP;
        }// 5 3 5
        else if(HP >= maxHP){
            amountHealed = HP - maxHP;
            output = (HP - amountHealed);
        }
        return output;
    }
    
}

