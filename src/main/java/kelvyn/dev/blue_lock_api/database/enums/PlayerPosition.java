package kelvyn.dev.blue_lock_api.database.enums;

import lombok.Getter;

@Getter
public enum PlayerPosition {
    //ATTACKERS
    CENTER_FORWARD("Center Forward", "ATTACK", 0.28, 0.14, 0.15, 0.12, 0.05, 0.11, 0.15),
    SECOND_STRIKER("Second Striker", "ATTACK", 0.25, 0.14, 0.15, 0.15, 0.04, 0.11, 0.16),
    FALSE_9("False 9", "ATTACK", 0.20, 0.12, 0.11, 0.18, 0.05, 0.18, 0.12),
    LEFT_WINGER("Left Winger", "ATTACK", 0.10, 0.18, 0.18, 0.18, 0.01, 0.10, 0.25),
    RIGHT_WINGER("Right Winger", "ATTACK", 0.10, 0.18, 0.18, 0.18, 0.01, 0.10, 0.25),

    //MILDFIELD
    ATTACKING_MIDFIELDER("Attacking Midfielder", "MIDFIELD", 0.20, 0.14, 0.14, 0.15, 0.05, 0.20, 0.12),
    CENTRAL_MIDFIELDER("Central Midfielder", "MIDFIELD", 0.10, 0.10, 0.12, 0.14, 0.15, 0.22, 0.17),
    LEFT_MIDFIELDER("Left Midfielder", "MIDFIELD", 0.08, 0.17, 0.17, 0.16, 0.11, 0.17, 0.14),
    RIGHT_MIDFIELDER("Right Midfielder", "MIDFIELD", 0.08, 0.17, 0.17, 0.16, 0.11, 0.17, 0.14),
    DEFENSIVE_MIDFIELDER("Defensive Midfielder", "MIDFIELD", 0.05, 0.10, 0.10, 0.10, 0.22, 0.24, 0.19),

    //DEFENCE
    RIGHT_WING_BACK("Right Wing-Back", "DEFENSE", 0.10, 0.19, 0.20, 0.16, 0.14, 0.11, 0.10),
    LEFT_WING_BACK("Left Wing-Back", "DEFENSE", 0.10, 0.19, 0.20, 0.16, 0.14, 0.11, 0.10),
    SWEEPER("Sweeper", "DEFENSE", 0.03, 0.13, 0.14, 0.13, 0.26, 0.25, 0.06),
    RIGHT_BACK("Right Back", "DEFENSE", 0.03, 0.21, 0.21, 0.18, 0.19, 0.13, 0.05),
    LEFT_BACK("Left Back", "DEFENSE", 0.03, 0.21, 0.21, 0.18, 0.19, 0.13, 0.05),
    CENTER_BACK("Center Back", "DEFENSE", 0.02, 0.14, 0.15, 0.13, 0.30, 0.21, 0.05),
    GOALKEEPER("Goalkeeper", "DEFENSE", 0.04, 0.10, 0.10, 0.26, 0.35, 0.10, 0.05);

    private final String label;
    private final String sector;
    private final double shoot;
    private final double acceleration;
    private final double velocity;
    private final double agility;
    private final double defence;
    private final double pass;
    private final double dribble;

    PlayerPosition(
        String label,
        String sector,
        double shoot,
        double acceleration,
        double velocity,
        double agility,
        double defence,
        double pass,
        double dribble
    ) {
        this.label = label;
        this.sector = sector;
        this.shoot = shoot;
        this.acceleration = acceleration;
        this.velocity = velocity;
        this.agility = agility;
        this.defence = defence;
        this.pass = pass;
        this.dribble = dribble;
    }
}