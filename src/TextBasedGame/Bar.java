package TextBasedGame;

public class Bar {
    int damageTaken;
    int CharacterHP;
	public Bar() {

	}
	public void barBrawl(int DMGTaken, int CharHP) {
        damageTaken = DMGTaken;
        CharacterHP = CharHP;
        System.out.println();
        System.out.println("You decide to start a brawl. \nIn the fight you take " + damageTaken + " damage. You now have " + CharacterHP + " HP.");
	}
    public void barNewWeapon(){

    }
    //public void 
}