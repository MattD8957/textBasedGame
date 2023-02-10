package TextBasedGame.Utilities;

//Manage Character
public class Character {
    
    //define private variables
    private int health;
    private int maxHP;
    private String name;
    private int attack; 
    private int maxAttack;
    private double artifacts; //Come from robing and deafing the dragon.
    
    //Create Character
    public Character(int hp, int maxhp, String nm, int atk, int maxatk){
        health = hp;
        maxHP = maxhp;
        name = nm;
        attack = atk;
        maxAttack = maxatk;
        artifacts = 0;
    }
    //Get name
    public String getName(){
        return name;
    }
    //Get health points 
    public int getHP(){
        return health;
    }
    //Get Max HP
    public int getMaxHP(){
        return maxHP;
    }
    //Get attack damage
    public int getAttack(){
        return attack;
    }
    //Get Max attack damage
    public int getMaxAttack(){
        return maxAttack;
    }
    //Get artifact Count
    public double getArtifact(){
        return artifacts;
    }    
    //Add to amount of artifacts
    public void increaseArtifacts(double increase){
        artifacts += increase;
    }
    //Take damage
    public void takeDamage(int damageTaken) {
        health -= damageTaken;
    }
    //Check if character is dead
    public boolean isDead(){
        return health <= 0;
    }
    //Heal the player when they go to the doctor
    public void heal(int newHP){
        health = newHP;
    }
    //Set character to Max hp
    public void setMaxHP() {
        health = maxHP;
    }
    //Add to players attack damage
    public void increaseAttack(int increase){
        attack += increase;
    }
    //Set players attack damage to max
    public void setMaxAttack() {
        attack = maxAttack; 
    }
    //Sets players health to 0 and to end loop
    public void kill(){
        health = 0;
    }
}