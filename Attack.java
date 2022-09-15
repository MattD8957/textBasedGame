package textBasedGame;
//Manage Attack types
public class Attack {
    private int damage;
    private int weakness;
    private int maxDamage;
    
    public Attack (int dmg, int maxdmg, int weak){ //Attack damage, weakness, Max attack damage
        damage = dmg;
        maxDamage = maxdmg;
        weakness = weak;
    }
    //Get attack damage
    public int getAttackDamage(){
        return damage;
    }
    //Get Penalty from attack
    public int getAttackPenalty(){
        return weakness;
    }
    //increase attack damage
    public int increaseAttackDamage(int additionalDamage){
        damage += additionalDamage;
        return damage;
    }
    //Sets attack damage to max
    public int setMaxAttackDamage(){
        damage = maxDamage; 
        return damage;
    }
}