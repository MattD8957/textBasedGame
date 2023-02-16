package TextBasedGame.Utilities;

public final class Constants {
    public static final class GeneralConstants {
        // General Constants
        public static final int EVENT_UPPER_BOUND = 5;
        public static final int TREASURE_TO_WIN = 50;
    }
    public static final class DragonConstants {
        public static final int ESCAPE_CHANCE_UPPER_BOUND = 5;
        public static final int ESCAPE_DMG_UPPER_BOUND = 11;
        public static final int HP_UPPER_BOUND = 65;
        public static final int ATTACK_DMG_UPPER_BOUND = 16;
    }
    public static final class BearConstants {
        public static final int HP_UPPER_BOUND = 26;
        public static final int ATTACK_DMG_UPPER_BOUND = 11;
        public static final double ARTIFACTS_COLLECTION_AMOUNT = 0.5;
    }
    public static final class BarConstants {
        public static final int FIGHT_DMG_TAKEN_UPPER_BOUND = 21;
        public static final int ATTACK_DMG_INCREASE_UPPER_BOUND = 15;
        public static final int ATTACK_DMG_INCREASE_PAYED = 15;
    }
    public static final class DoctorConstants {
        public static final int AMOUNT_HEALED_UPPER_BOUND = 31;
        public static final int AMOUNT_HEALED_PAYED = 70;
    }
    public static final class GoblinConstants {
        public static final int goblinLeaderDMGUpperBound = 16;
        public static final int goblinLeaderHealthUpperBound = 25;
        public static final int goblinFollowerCountUpperBound = 3;
        public static final int goblinFollowerDMGUpperBound = 5;
        public static final int goblinFollowerHealthUpperBound = 11;
        public static final int goblinWinArtifactReward = 7;
    }
    public static final class TownConstants {
        public static final int BegFine = 3; // Is a constant
        public static final int JailFightDMGTakenUpperBound = 8;
        public static final int JailChanceFightUpperBound = 6;
        public static final int CourtSentancingUpperBound = 31;
        public static final int FineUpperBound = 6;
        public static final int DMGTakenFromJailUpperBound = 11;
        public static final int ArtifactsOnGuardsUpperBound = 5;
    }
    public static final class NightConstants {
        public static final int CHOICE_ONE_ATTACK_INCREASE_UPPER_BOUND = 5;
        public static final int ChoiceOneDamageTakenUpperBound = 9;
        public static final int ChoiceTwoEventChoice = 2;
    }
}
