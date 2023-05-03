package TextBasedGame.Characters;

public class UnitSuper {

    public int health;
    public int attack;

    public UnitSuper(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    //Get health points 
    public int getHP(){
        return health;
    }

    //Get attack damage
    public int getAttack(){
        return attack;
    }

    //Take damage
    public void takeDamage(int damage){
        health -= damage;
        setDead();
    }

    public boolean isDead(){
        return health <= 0;
    }

    //If health is less than 0 set it to 0
    public void setDead(){
        if (health < 0){
            health = 0;
        }
    }

    //Sets players health to 0 and to end loop
    public void kill(){
        health = 0;
    }

    //DEV MODE
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
}
