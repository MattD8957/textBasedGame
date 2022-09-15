package textBasedGame;

//Manage all enimies
public class Enemy {
//set variables
    private int health;
    private int attack; 
    //create Enemy
    public Enemy(int hp, int atk){
        health = hp;
        attack = atk;
    }
    //Get health
    public int getHP(){
        return health;
    }
    //Get Enemy's attack
    public int getAttack(){
        return attack;
    }
    //Take damage
    public int takeDamage(int damage){
        health -= damage;
        return health;
    }
    //Check if the Enemy is alive
    public boolean isDead(){
        return health <= 0;
    }
}