package TextBasedGame.Utilities;

import TextBasedGame.Characters.Player;

public class CreateCharacters {
    int CharacterHPCreation;
    int CharacterMaxHPCreation;
    int CharacterStandardAtackCreation;
    int CharacterMaxAttackCreation;
    int characterAttackStrongDMG;
    int characterAttackStrongMaxDMG;
    int characterAttackStrongPenalty;
    int characterAttackStandardDMG;
    int characterAttackStandardMaxDMG;
    int characterAttackStandardPenalty;
    int characterAttackWeakDMG;
    int characterAttackWeakMaxDMG;
    int characterAttackWeakPenalty;

    int choice;
    String name;

    public CreateCharacters(int choice, String name) {
        this.choice = choice;
        this.name = name;
        switch (choice) {
            case 1: // Rogue
                caseOne();
                break;
            case 2: // Paladin
                caseTwo();
                break;
            case 3: // Barbarian
                caseThree();
                break;
            default:
                ArtAndText.getFailedToMakeSelection();
                System.exit(0);
                break;
        }
    }

    public void caseOne() {
        // Character Attributes
        CharacterHPCreation = 100;
        CharacterMaxHPCreation = 100;
        CharacterStandardAtackCreation = 15;
        CharacterMaxAttackCreation = 30;
        // Strong Attack Atributes
        characterAttackStrongDMG = 25;
        characterAttackStrongMaxDMG = 45;
        characterAttackStrongPenalty = 10;
        // Standard Attack Atributes
        characterAttackStandardDMG = 15;
        characterAttackStandardMaxDMG = 35;
        characterAttackStandardPenalty = 0;
        // Weak Attack Atributes
        characterAttackWeakDMG = 5;
        characterAttackWeakMaxDMG = 25;
        characterAttackWeakPenalty = -10;
    }

    public void caseTwo() {
        // Character Attributes
        CharacterHPCreation = 125;
        CharacterMaxHPCreation = 125;
        CharacterStandardAtackCreation = 20;
        CharacterMaxAttackCreation = 45;
        // Strong Attack Atributes
        characterAttackStrongDMG = 30;
        characterAttackStrongMaxDMG = 50;
        characterAttackStrongPenalty = 15;
        // Standard Attack Atributes
        characterAttackStandardDMG = 20;
        characterAttackStandardMaxDMG = 40;
        characterAttackStandardPenalty = 5;
        // Weak Attack Atributes
        characterAttackWeakDMG = 10;
        characterAttackWeakMaxDMG = 30;
        characterAttackWeakPenalty = -5;
    }

    public void caseThree() {
        // Character Attributes
        CharacterHPCreation = 150;
        CharacterMaxHPCreation = 150;
        CharacterStandardAtackCreation = 25;
        CharacterMaxAttackCreation = 50;
        // Strong Attack Atributes
        characterAttackStrongDMG = 35;
        characterAttackStrongMaxDMG = 60;
        characterAttackStrongPenalty = 20;
        // Standard Attack Atributes
        characterAttackStandardDMG = 25;
        characterAttackStandardMaxDMG = 50;
        characterAttackStandardPenalty = 10;
        // Weak Attack Atributes
        characterAttackWeakDMG = 15;
        characterAttackWeakMaxDMG = 40;
        characterAttackWeakPenalty = 0;
    }

    public void getGameExplantion() {
        switch (choice) {
            case 1:
                ArtAndText.getGameExplantionRogue();
                break;
            case 2:
                ArtAndText.getGameExplantionPaladin();
                break;
            case 3:
                ArtAndText.getGameExplantionBarbarian();
                break;
        }
    }

    public Player createPlayer() {
        Player player = new Player(CharacterHPCreation, CharacterMaxHPCreation, name);
        getGameExplantion();
        return player;
    }

    public Attack createStrongAttack() {
        Attack attack = new Attack(characterAttackStrongDMG, characterAttackStrongMaxDMG, characterAttackStrongPenalty);
        return attack;
    }

    public Attack createStandardAttack() {
        Attack attack = new Attack(characterAttackStandardDMG, characterAttackStandardMaxDMG, characterAttackStandardPenalty);
        return attack;
    }

    public Attack createWeakAttack() {
        Attack attack = new Attack(characterAttackWeakDMG, characterAttackWeakMaxDMG, characterAttackWeakPenalty);
        return attack;
    }
}
