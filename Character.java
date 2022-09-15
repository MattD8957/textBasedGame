package textBasedGame;

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
    public Character(int hp, int maxhp, String nm, int atk, int maxatk, int treasure){
        health = hp;
        maxHP = maxhp;
        name = nm;
        attack = atk;
        maxAttack = maxatk;
        artifacts = treasure;
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
    public double increaseArtifacts(double increase){
        artifacts += increase;
        return artifacts;
    }
    //Take damage
    public int takeDamage(int damageTaken) {
        health -= damageTaken;
        return health;
    }
    //Check if character is dead
    public boolean isDead(){
        return health <= 0;
    }
    //Heal the player when they go to the doctor
    public int heal(int amountHealed){
        health = health + amountHealed;
        return health;
    }
    //Set character to Max hp
    public int setMaxHP() {
        health = maxHP;
        return health;
    }
    //Add to players attack damage
    public int increaseAttack(int increase){
        attack += increase;
        return attack;
    }
    //Set players attack damage to max
    public int setMaxAttack() {
        attack = maxAttack; 
        return attack;
    }
    //Sets players health to 0 and to end loop
    public int kill(){
        health = 0;
        return health;
    }

}