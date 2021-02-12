public class ModifierData {

    // Experience Multiplier (How much the damage is multiplied by to figure out how much experience is gained)
    double USER_EXPERIENCE_MULTIPLIER = .6;
    double MOVE_EXPERIENCE_MULTIPLIER = .25;
    double ENEMY_EXPERIENCE_MULTIPLIER = .3;
    double ENEMY_MOVE_EXPERIENCE_MULTIPLIER = .075;

    // Damage Multiplier (How much damage is multiplied in general based on Designation)
    // This will be adjusted based on difficulty (Lazy AI because yeah)
    double USER_DAMAGE_MULTIPLIER = 1;
    double ENEMY_DAMAGE_MULTIPLIER = 1;
    double BOSS_DAMAGE_MULTIPLIER = 2;
    double MINION_DAMAGE_MULTIPLIER = .75;

    // Level Damage Multiplier (How much the damage is multiplied by based on level)
    double PLAYER_LEVEL_MULTIPLIER = 1.05;
    double MOVE_LEVEL_MULTIPLIER = 1.2;


}
