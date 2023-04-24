package TextBasedGame.Utilities;

public class CheckIfValid {
    public static boolean isAnOption(int given, int[] options){
        for(int test : options){
            if(given == test){
                return true;
            }
        }
        return false;
    }
}
