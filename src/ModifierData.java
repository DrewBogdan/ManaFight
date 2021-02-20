import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ModifierData {

    // Experience Multiplier (How much the damage is multiplied by to figure out how much experience is gained)
    double USER_EXPERIENCE_MULTIPLIER;
    double MOVE_EXPERIENCE_MULTIPLIER;
    double ENEMY_EXPERIENCE_MULTIPLIER;
    double ENEMY_MOVE_EXPERIENCE_MULTIPLIER;

    // Damage Multiplier (How much damage is multiplied in general based on Designation)
    // This will be adjusted based on difficulty (Lazy AI because yeah)
    double USER_DAMAGE_MULTIPLIER;
    double ENEMY_DAMAGE_MULTIPLIER;
    double BOSS_DAMAGE_MULTIPLIER;
    double MINION_DAMAGE_MULTIPLIER;

    // Level Damage Multiplier (How much the damage is multiplied by based on level)
    double PLAYER_LEVEL_MULTIPLIER;
    double MOVE_LEVEL_MULTIPLIER;


    static ModifierData modifiers = null;

    // Private constructor to instantiate one single Data class that circulates
    private ModifierData() {
        loadSettings();
    }

    private void loadSettings() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("GameSettings.json"))
        {
            Object obj = jsonParser.parse(reader);

            setSettings((JSONObject) obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void setSettings(JSONObject settingsObject) {
        JSONObject pointObject = (JSONObject) settingsObject.get("Modifier Data");

        USER_EXPERIENCE_MULTIPLIER = (double) pointObject.get("PlayerE");
        MOVE_EXPERIENCE_MULTIPLIER = (double) pointObject.get("MoveE");
        ENEMY_EXPERIENCE_MULTIPLIER = (double) pointObject.get("EnemyE");
        ENEMY_MOVE_EXPERIENCE_MULTIPLIER = (double) pointObject.get("EnemyMoveE");

        USER_DAMAGE_MULTIPLIER = (double) pointObject.get("UserD");
        ENEMY_DAMAGE_MULTIPLIER = (double) pointObject.get("EnemyD");
        BOSS_DAMAGE_MULTIPLIER = (double) pointObject.get("BossD");
        MINION_DAMAGE_MULTIPLIER = (double) pointObject.get("MinionD");

        PLAYER_LEVEL_MULTIPLIER = (double) pointObject.get("PlayerM");
        MOVE_LEVEL_MULTIPLIER = (double) pointObject.get("MoveM");

    }

    public static ModifierData getSettings() {
        if(modifiers == null) {
            modifiers = new ModifierData();
        }
        return modifiers;
    }



}
