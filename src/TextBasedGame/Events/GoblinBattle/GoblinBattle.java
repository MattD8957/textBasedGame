package TextBasedGame.Events.GoblinBattle;

import TextBasedGame.Characters.Enemy;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.Attack;
import TextBasedGame.Utilities.GeneralUtils;
import java.util.Scanner;

public class GoblinBattle {

    Player player;
    Enemy Leader;
    Enemy Follower1;
    Enemy Follower2;
    Enemy Follower3;
    boolean foughtOnce;
    boolean goblinsAreDead = false;
    int attackTarget;
    int attackType;
    int damageTaken;
    Attack strong;
    Attack standard;
    Attack weak;

    Scanner input = new Scanner(System.in);

    public GoblinBattle(Player player, Enemy Leader, Enemy Follower1, boolean foughtOnce,
            Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.Leader = Leader;
        this.Follower1 = Follower1;
        this.foughtOnce = foughtOnce;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public GoblinBattle(Player player, Enemy Leader, Enemy Follower1, Enemy Follower2,
            boolean foughtOnce, Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.Leader = Leader;
        this.Follower1 = Follower1;
        this.Follower2 = Follower2;
        this.foughtOnce = foughtOnce;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public GoblinBattle(Player player, Enemy Leader, Enemy Follower1, Enemy Follower2,
            Enemy Follower3, boolean foughtOnce, Attack strong, Attack standard, Attack weak) {
        this.player = player;
        this.Leader = Leader;
        this.Follower1 = Follower1;
        this.Follower2 = Follower2;
        this.Follower3 = Follower3;
        this.foughtOnce = foughtOnce;
        this.strong = strong;
        this.standard = standard;
        this.weak = weak;
    }

    public boolean One() {
        GoblinBattleText.initialText(1, Leader.getHP(), Follower1.getHP());
        goblinsAreDead = false;
        while (!player.isDead() && !goblinsAreDead) {
            do {
                GoblinBattleText.getGoblinFightTargetTextTwo(); // Chooses who will be attacked
                attackTarget = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackTarget, 2));
            
            do {
            ArtAndText.getAttackTypeChoiceText();
            attackType = input.nextInt();
            } while(!GeneralUtils.isAnOption(attackType, 3));
            if (attackTarget == 1) {// Leader
                GoblinBattleText.getGoblinLeaderTargetText();
                if (attackType == 1) {// Strong attack
                    GoblinBattleText.goblinLeaderAttackStrong(strong.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2) {// standard attack
                    GoblinBattleText.goblinLeaderAttackStrong(standard.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3) {// Weak attack
                    GoblinBattleText.goblinLeaderAttackWeak(weak.getAttackDamage(), Leader.getHP());
                    Leader.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 2) {// Follower 1
                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                if (attackType == 1) {// Strong attack
                    GoblinBattleText.goblinFollowerOneAttackStrong(strong.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2) {// standard attack
                    GoblinBattleText.goblinFollowerOneAttackStandard(standard.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3) {// Weak attack
                    GoblinBattleText.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(weak.getAttackDamage());
                }
            }
            // Goblins turn
            if (!Leader.isDead()) {
                // To determine which attack was used and so what buff
                if (attackType == 1) {// Strong attack
                    damageTaken = Leader.getAttack() + strong.getAttackPenalty();
                    System.out.println("DMG" + damageTaken);
                    System.out.println("HP" + player.getHP());
                    player.takeDamage(damageTaken);
                    System.out.println("HP" + player.getHP());

                } else if (attackType == 2) {// Standard attack
                    damageTaken = Leader.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3) {// Weak attack
                    damageTaken = Leader.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0) {// Positive attack
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0) {// negative attack
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinLeadersTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower1.isDead()) {// Goblin Follower 1's turn
                // To determine which attack was used and so what buff
                if (attackType == 1) {// Strong attack
                    damageTaken = Follower1.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2) {// Standard attack
                    damageTaken = Follower1.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3) {// Weak attack
                    damageTaken = Follower1.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0) {// Positive attack
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0) {// negative attack
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerOneTurnOutPut(damageTaken, player.getHP());
            }
            // add extras
            if (!Leader.isDead() || !Follower1.isDead()) {// If any goblin is alive
                goblinsAreDead = false;
            } else if (Leader.isDead() && Follower1.isDead()) {// if all goblins are dead
                goblinsAreDead = true;
            }
        }
        return goblinsAreDead;
    }

    public boolean Two() {
        // Initial statement
        GoblinBattleText.initialText(2, Leader.getHP(), Follower1.getHP(), Follower2.getHP());
        goblinsAreDead = false;
        while (!player.isDead() && !goblinsAreDead) {
            do {
                GoblinBattleText.getGoblinFightTargetTextThree(); // Chooses who will be attacked
                attackTarget = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackTarget, 3));

            do {
                ArtAndText.getAttackTypeChoiceText();
                attackType = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackType, 3));
            if (attackTarget == 1)// Leader
            {
                GoblinBattleText.getGoblinLeaderTargetText();
                if (attackType == 1) {// Strong attack
                    GoblinBattleText.goblinLeaderAttackStrong(strong.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2) {// standard attack
                    GoblinBattleText.goblinLeaderAttackStrong(standard.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3) {// Weak attack
                    GoblinBattleText.goblinLeaderAttackWeak(weak.getAttackDamage(), Leader.getHP());
                    Leader.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 2) {// Follower 1
                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                if (attackType == 1) {// Strong attack
                    GoblinBattleText.goblinFollowerOneAttackStrong(strong.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinFollowerOneAttackStandard(standard.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 3) // Follower 2
            {
                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                if (attackType == 1)// Strong attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackStrong(strong.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackStandard(standard.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackWeak(weak.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(weak.getAttackDamage());
                }
            }

            // Goblins turn
            if (!Leader.isDead()) {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Leader.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Leader.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Leader.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinLeadersTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower1.isDead())// Goblin Follower 1's turn
            {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Follower1.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Follower1.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Follower1.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerOneTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower2.isDead())// Goblin Follower 2's turn
            {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Follower2.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Follower2.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Follower2.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerTwoTurnOutPut(damageTaken, player.getHP());
            }
            // add extras
            if (!Leader.isDead() || !Follower1.isDead() || !Follower2.isDead())// If any goblin is
                                                                               // alive
            {
                goblinsAreDead = false;
            } else if (Leader.isDead() && Follower1.isDead() && Follower2.isDead())// if all goblins
                                                                                   // are dead
            {
                goblinsAreDead = true;
            }
        }
        return goblinsAreDead;
    }

    public boolean Three() {
        GoblinBattleText.initialText(3, Leader.getHP(), Follower1.getHP(), Follower2.getHP(),
                Follower3.getHP());
        goblinsAreDead = false;
        while (!player.isDead() && !goblinsAreDead) {
            do {
                GoblinBattleText.getGoblinFightTargetTextThree(); // Chooses who will be attacked
                attackTarget = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackTarget, 4));

            do {
                ArtAndText.getAttackTypeChoiceText();
                attackType = input.nextInt();
            } while (!GeneralUtils.isAnOption(attackType, 3));

            if (attackTarget == 1)// Leader
            {
                GoblinBattleText.getGoblinLeaderTargetText();
                if (attackType == 1)// Strong attack
                {
                    GoblinBattleText.goblinLeaderAttackStrong(strong.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinLeaderAttackStrong(standard.getAttackDamage(),
                            Leader.getHP());
                    Leader.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinLeaderAttackWeak(weak.getAttackDamage(), Leader.getHP());
                    Leader.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 2) // Follower 1
            {
                System.out.println(ArtAndText.goblinFollowerOneTargetText);
                if (attackType == 1)// Strong attack
                {
                    GoblinBattleText.goblinFollowerOneAttackStrong(strong.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinFollowerOneAttackStandard(standard.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinFollowerOneAttackWeak(weak.getAttackDamage(),
                            Follower1.getHP());
                    Follower1.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 3) // Follower 2
            {
                System.out.println(ArtAndText.goblinFollowerTwoTargetText);
                if (attackType == 1)// Strong attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackStrong(strong.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackStandard(standard.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinFollowerTwoAttackWeak(weak.getAttackDamage(),
                            Follower2.getHP());
                    Follower2.takeDamage(weak.getAttackDamage());
                }
            } else if (attackTarget == 4) // Follower 3
            {
                System.out.println(ArtAndText.goblinFollowerThreeTargetText);
                if (attackType == 1)// Strong attack
                {
                    GoblinBattleText.goblinFollowerThreeAttackStrong(strong.getAttackDamage(),
                            Follower3.getHP());
                    Follower3.takeDamage(strong.getAttackDamage());
                } else if (attackType == 2)// standard attack
                {
                    GoblinBattleText.goblinFollowerThreeAttackStandard(standard.getAttackDamage(),
                            Follower3.getHP());
                    Follower3.takeDamage(standard.getAttackDamage());
                } else if (attackType == 3)// Weak attack
                {
                    GoblinBattleText.goblinFollowerThreeAttackWeak(weak.getAttackDamage(),
                            Follower3.getHP());
                    Follower3.takeDamage(weak.getAttackDamage());
                }
            }
            // Goblins turn
            if (!Leader.isDead()) {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Leader.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Leader.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Leader.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinLeadersTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower1.isDead())// Goblin Follower 1's turn
            {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Follower1.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Follower1.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Follower1.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerOneTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower2.isDead())// Goblin Follower 2's turn
            {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Follower2.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Follower2.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Follower2.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerTwoTurnOutPut(damageTaken, player.getHP());
            }
            if (!Follower3.isDead())// Goblin Follower 3's turn
            {
                // To determine which attack was used and so what buff
                if (attackType == 1)// Strong attack
                {
                    damageTaken = Follower3.getAttack() + strong.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 2)// Standard attack
                {
                    damageTaken = Follower3.getAttack() + standard.getAttackPenalty();
                    player.takeDamage(damageTaken);
                } else if (attackType == 3)// Weak attack
                {
                    damageTaken = Follower3.getAttack() + weak.getAttackPenalty();
                    if (damageTaken >= 0)// Positive attack
                    {
                        player.takeDamage(damageTaken);
                    } else if (damageTaken < 0)// negative attack
                    {
                        damageTaken = 0;
                    }
                }
                GoblinBattleText.goblinFollowerThreeTurnOutPut(damageTaken, player.getHP());
            }
            // add extras
            if (!Leader.isDead() || !Follower1.isDead() || !Follower2.isDead()
                    || !Follower3.isDead())// If any goblin is alive
            {
                goblinsAreDead = false;
            } else if (Leader.isDead() && Follower1.isDead() && Follower2.isDead()
                    && Follower3.isDead())// if all goblins are dead
            {
                goblinsAreDead = true;
            }
        }
        return goblinsAreDead;
    }
}


