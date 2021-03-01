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
            System.out.println("You are dumb, you will die now.");
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
        System.out.println("The Sun Cleric has a powerful connection with the god's who have bestowed him with powers unimaginable by mortals");
        System.out.println("They have access to multiple powers that funnel the power of the sun through his fingertips");
        System.out.println("Super Attack: Spear of light - Deals Damage equivalent to Mana spent multiplied by 5");
        System.out.println("Basic Attack: Sun stare - Deals 8 damage, costs 2 mana");
        System.out.println("Quick Attack: Burning Iris - Deals 3 Damage, unblockable attack, costs 0 mana");
        System.out.println("Basic Defense: Rays of sunshine - Blocks 35% of all incoming damage, costs 1 mana");
        System.out.println("Strong Defense: Blinding Wall - Blocks 70% of all incoming damage, costs 2 mana");
        System.out.println("Mana Gain: Sundrain - Gain a random amount of mana between 1 and 4");
    }

    private static void tank() {
        System.out.println("The Tank is a strong knight of God with the courage to take up any fight and the power to win them all");
        System.out.println("His skills allow him to hit very hard, but not super fast, but with his armor, he is not easy to kill");
        System.out.println("Super Attack: Hammer of God - Deals 70 Damage, unless enemy is blocking. Costs 6 mana");
        System.out.println("Basic Attack: Shattering Swing - Deals 15 Damage, costs 3 mana");
        System.out.println("Quick Attack: Skewer - Deals 8 Damage, costs 1 mana");
        System.out.println("Basic Defense: Shield - Blocks 60% of all incoming damage, costs 2 mana");
        System.out.println("Strong Defense: Phalanx - Blocks all incoming damage, costs 4 mana");
        System.out.println("Mana Gain: Pray - Gains 2 mana, all attacks deal double damage to him in this state");
    }

    private static void stormWizard() {
        System.out.println("The Storm Wizard spent the first 400 years of his life studying storms from his ocean observatory");
        System.out.println("He has figured out a way to harness their power and manipulate them to work with him instead of against him");
        System.out.println("Super Attack: Blessing of Zeus - The storm mage takes half damage, but deals triple damage for the next 3 turns, costs 5 mana");
        System.out.println("Basic Attack: Lighting Strike - Deals 9 Damage, costs 3 mana");
        System.out.println("Quick Attack: Thunderous roar - Deals 3 Damage, costs 1 mana");
        System.out.println("Basic Defense: Tidal Wave - blocks 55% of all incoming damage, attackers next move costs 1 more mana");
        System.out.println("Strong Defense: Hurricane - Blocks 80% of all incoming damage, attacker loses 3 health");
        System.out.println("Mana Gain: Rain - Gain mana equal to 20% of damage dealt to storm wizard last turn");
    }

    private static void thief() {
        System.out.println("The Thief is a very skilled and silent fighter. He does not often try to kill, only tries to steal");
        System.out.println("But if he gets angry enough, he is capable of very scary things, you wont see him come, and you wont know your dead");
        System.out.println("Super Attack: The Wind - All opponents mana is stolen, Mana stolen this way is dealt back in damage but doubled. costs 10 mana");
        System.out.println("Basic Attack: Shadow Strike - Deals Damage equal to thiefs mana, costs 3 mana");
        System.out.println("Quick Attack: Stab - Deals 2 damage, unblockable, costs 0 mana");
        System.out.println("Basic Defense: Smoke Screen - blocks 15% of all incoming damage, costs 1 mana");
        System.out.println("Strong Defense: Disappear - blocks all incoming damage, costs 3 mana");
        System.out.println("Mana Gain: Steal - if opponent does not use a defensive or mana gain ability, thief steals 2 mana");
    }

    private static void dragonSlayer() {
        System.out.println("The Dragon Slayer is a cunning warrior who not only has killed multiple dragons, but also tamed one for his own use");
        System.out.println("He is a force to be rekoned with, being on the end of his anger is not something people should take lightly");
        System.out.println("Super Attack: Summon the Dragon - Deals 50 Damage, costs 8 mana and 10 health");
        System.out.println("Basic Attack: Fire Staff - Deals 10 Damage, costs 3 mana");
        System.out.println("Quick Attack: Whiplash - Deals 2 damage, enemy can only block the next turn, costs 1 mana");
        System.out.println("Basic Defense: Absorb - Blocks 40% of all incoming damage, costs 2 mana");
        System.out.println("Strong Defense: Dragon Scales - Blocks 75% of all incoming damage from Basic and quick attacks, 95% of super attacks, costs 4 mana");
        System.out.println("Mana Gain: Meditate - Gain 2 mana");
    }
}
