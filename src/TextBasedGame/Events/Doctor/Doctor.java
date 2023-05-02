package TextBasedGame.Events.Doctor;

import java.util.Scanner;
import TextBasedGame.Characters.Player;
import TextBasedGame.Utilities.Constants.DoctorConstants;
import TextBasedGame.Utilities.ArtAndText;
import TextBasedGame.Utilities.GeneralUtils;

public class Doctor {

    Scanner scanner = new Scanner(System.in);
    int choice;
    int amountHealed;
    Heal doc;
    Player player;

    public Doctor(Player player) {
        this.doc = new Heal(player.getMaxHP());
        this.player = player;
    }

    public void doctor() {
        do {
            ArtAndText.getDoctorInitialText(player.getHP());
            choice = scanner.nextInt();
        } while (!GeneralUtils.isAnOption(choice, 2));
        GeneralUtils.pause(3);
        if (choice == 1) {
            // decide on amount healed 10 - 40
            amountHealed =
                    GeneralUtils.randomNumber(DoctorConstants.AMOUNT_HEALED_UPPER_BOUND) + 10;
        } else if (choice == 2) {
            amountHealed = DoctorConstants.AMOUNT_HEALED_PAYED;
        }
        amountHealed = doc.heal(player.getHP(), amountHealed);
        player.heal(amountHealed);
        doc.doctorOutputText(player.getHP(), amountHealed);
    }
}
