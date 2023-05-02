package TextBasedGame.Characters;

// Manage Character
public class Player extends UnitSuper {

    // define private variables
    private int maxHP;
    private String name;
    private double artifacts; // Come from robing and deafing the dragon.

    // Create Character
    public Player(int health, int maxHP, String name) {
        super(health, 0);
        this.maxHP = maxHP;
        this.name = name;
        this.artifacts = 0;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get Max HP
    public int getMaxHP() {
        return maxHP;
    }

    // Get artifact Count
    public double getArtifact() {
        return artifacts;
    }

    // Add to amount of artifacts
    public void ChangeArtifacts(double increase) {
        artifacts += increase;
    }

    /**
     * Takes amount to add to health and adds it to health
     * 
     * @param InHP
     */
    public void heal(int InHP) {
        health += InHP;
    }

    // Set character to Max hp
    public void setMaxHP() {
        health = maxHP;
    }

    // Add to players attack damage
    public void increaseAttack(int increase) {
        attack += increase;
    }
}
