package TextBasedGame;

public class Doctor {
    private int maxHP;
    private int newHP;
    private int output;

    public Doctor(int charHealthMax){
        maxHP = charHealthMax;
    }
    public void setMaxHP(int newMaxHP){
        maxHP = newMaxHP;
    }
    public int heal(int HP, int amountHealed){
        newHP = HP + amountHealed;
        if(newHP < maxHP){
            output = newHP;
        }
        else if(newHP >= maxHP){
            output = maxHP;
        }
        return output;
    }
    
}

