package TextBasedGame.Events.GoblinBattle;

import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import TextBasedGame.Utilities.Constants.GoblinConstants;

public class GoblinBattleSuper {

    Player player;
    Enemy Leader;
    Enemy Follower1;
    Enemy Follower2;
    Enemy Follower3;
    Attack strong;
    Attack standard;
    Attack weak;

    boolean goblinsAreDead;

    int goblinLeaderDamage;
    int goblinLeaderHealth;
    int goblinFollowerCount;

    int goblinFollowerDamage;
    int goblinFollowerHealth;


    public GoblinBattleSuper(Player player, Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;

    }

    public void battle(boolean foughtOnce) {
        GoblinBattleText.getGoblinInitialText();
        goblinLeaderDamage = GeneralUtils.randomNumber(GoblinConstants.LEADER_DMG_UPPER_BOUND) + 10;
        goblinLeaderHealth =
                GeneralUtils.randomNumber(GoblinConstants.LEADER_HEALTH_UPPER_BOUND) + 20; // 20 -
                                                                                           // 45 HP
        Enemy goblinLeader = new Enemy(goblinLeaderHealth, goblinLeaderDamage);// Hp, Attack, dmg

        if (!foughtOnce) {
            ArtAndText.getCombatExplanation();
        }

        // Random number to get amount of follower goblins
        goblinFollowerCount = GeneralUtils.randomNumber(GoblinConstants.FOLLWER_COUNT_UPPER_BOUND);
        goblinFollowerCount++;// Makes range 1 - 3
        switch (goblinFollowerCount) {
            case 1:
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollower = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                              // Goblin
                                                                                              // follower
                                                                                              // 1
                GoblinBattle gBattle1 = new GoblinBattle(player, goblinLeader, goblinFollower,
                        foughtOnce, strong, standard, weak);
                goblinsAreDead = gBattle1.One();
                break;
            case 2:
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollowerOne = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                                 // Goblin
                                                                                                 // follower
                                                                                                 // 1
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollowerTwo = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                                 // Goblin
                                                                                                 // follower
                                                                                                 // 1
                GoblinBattle gBattle2 = new GoblinBattle(player, goblinLeader, goblinFollowerOne,
                        goblinFollowerTwo, foughtOnce, strong, standard, weak);
                goblinsAreDead = gBattle2.Two();
                break;
            case 3:
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollower1 = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                               // Goblin
                                                                                               // follower
                                                                                               // 1
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollower2 = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                               // Goblin
                                                                                               // follower
                                                                                               // 1
                goblinFollowerDamage =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_DMG_UPPER_BOUND) + 10; // Changes
                                                                                                  // damage
                                                                                                  // range
                                                                                                  // to
                                                                                                  // 10
                                                                                                  // -
                                                                                                  // 15
                goblinFollowerHealth =
                        GeneralUtils.randomNumber(GoblinConstants.FOLLOWER_HEALTH_UPPER_BOUND) + 10; // Changes
                                                                                                     // health
                                                                                                     // range
                                                                                                     // to
                                                                                                     // 10
                                                                                                     // -
                                                                                                     // 20
                Enemy goblinFollower3 = new Enemy(goblinFollowerHealth, goblinFollowerDamage); // creates
                                                                                               // Goblin
                                                                                               // follower
                                                                                               // 1
                GoblinBattle gBattle3 = new GoblinBattle(player, goblinLeader, goblinFollower1,
                        goblinFollower2, goblinFollower3, foughtOnce, strong, standard, weak);
                goblinsAreDead = gBattle3.Three();
        }

        if (goblinsAreDead) {// Reward
            player.ChangeArtifacts(GoblinConstants.WIN_ARTIFACTS_REWARD);
            GoblinBattleText.winText(player.getArtifact());
        }
    }
}
