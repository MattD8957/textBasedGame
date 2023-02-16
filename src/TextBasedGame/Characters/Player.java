package TextBasedGame.Characters;

//Manage Character
public class Player extends UnitSuper{
    
    //define private variables
    private int maxHP;
    private String name;
    private int maxAttack;
    private double artifacts; //Come from robing and deafing the dragon.
    
    //Create Character
    public Player(int health, int maxHP, String name, int attack, int maxattack){
        super(health, attack);
        this.maxHP = maxHP;
        this.name = name;
        this.maxAttack = maxattack;
        this.artifacts = 0;
    }
    //Get name
    public String getName(){
        return name;
    }
    
    //Get Max HP
    public int getMaxHP(){
        return maxHP;
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