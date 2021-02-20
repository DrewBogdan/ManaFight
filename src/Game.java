import java.sql.Time;
import java.util.*;

public class Game {

    ModifierData settings = ModifierData.getSettings();

    public static void main(String[] args) {
        System.out.println("Loading Game Settings...");
        game();
    }

    public static void game() {
        intro();
    }

    // ********************* WRITING ********************************

    private static void intro() {
        System.out.println("Welcome to the Mana Fight Arena. ");
        System.out.println("Here you will fight the best fighters from the region.");
        System.out.println("There are 5 types of fighters, all with different abilities");
        userChoose();

    }
    private static void userChoose() {
        System.out.println("To see Fighters, Type Fighters, to Choose fighter, type the name of the fighter: ");
        Scanner user = new Scanner(System.in);
        String userInput = user.nextLine().toLowerCase();
        if(userInput.equals("fighters")) {
            fighters();
        }
        else if(userInput.equals("sun cleric")) {
            System.out.println("Sun cleric");
        }
        else if(userInput.equals("tank")) {
            System.out.println("Tank");
        }
        else if(userInput.equals("storm wizard")) {
            System.out.println("Storm wizard");
        }
        else if(userInput.equals("thief")) {
            System.out.println("Thief");
        }
        else if(userInput.equals("dragon slayer")) {
            System.out.println("Dragon slayer");
        }
        else if(userInput.equals("drew")) {
            System.out.println("You have activated the special fighter Drew");
            System.out.println("Fucking retard, you will die now.");
        }
        else {
            System.out.println("Please enter a valid command");
            userChoose();

        }
    }
    private static void fighters() {
        sunCleric();
        tank();
        stormWizard();
        thief();
        dragonSlayer();
    }

    // ********************* FIGHTERS ********************************

    private static void sunCleric() {

    }

    private static void tank() {

    }

    private static void stormWizard() {

    }

    private static void thief() {

    }

    private static void dragonSlayer() {

    }
}
