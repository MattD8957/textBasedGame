package TextBasedGame.Utilities;
//Manage Attack types
public class Attack {
    private int damage;
    private int weakness;
    private int maxDMG;
    
    public Attack (int damage, int maxdmg, int weakness){ //Attack damage, weakness, Max attack damage
        this.damage = damage;
        this.maxDMG = maxdmg;
        this.weakness = weakness;
    }
    //Get attack damage
    public int getAttackDamage(){
        return damage;
    }
    public int getMaxAttackDamage(){
        return maxDMG;
    }
    //Get Penalty from attack
    public int getAttackPenalty(){
        return weakness;
    }
    //increase attack damage
    public void increaseAttackDamage(int additionalDamage){
        damage += additionalDamage;
    }
    //Sets attack damage to max
    public void setMaxAttackDamage(){
        damage = maxDMG; 
    }

    //FOR DEV MODE
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setMaxDamage(int maxDMG){
        this.maxDMG = maxDMG;
    }
}