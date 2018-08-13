package callofduty.constants;

public final class Constant {


    public static final String MASTER_AGENT_INITIAL ="Master Agent - %s%nPersonal Code: %s%nAssigned Missions: %d%nCompleted Missions: %d%nRating: %.2f%nBounty Earned: $%.2f" ;
    public static final String NOVICE_AGENT_INITIAL="Novice Agent - %s%nPersonal Code: %s%nAssigned Missions: %d%nCompleted Missions: %d%nRating: %.2f";
    public static final String FINAL_COMMAND = "Over";
   public static final String AGENT_COMMAND ="Agent";
   public static final String REQUEST_COMMAND = "Request";
   public static final String COMPLETE_COMMAND= "Complete";
   public static final String STATUS_COMMAND = "Status";
   public static final String OVER_COMMAND = "Over";
   public static final String NOT_VALID_COMMAND_PRINT = "Not valid command: ";
    public static final String COMMAND_PARAMETERS_SEPARATOR = "\\s+";
    public static final double BOUNTY_START_VALUES=Double.valueOf(0);
    public static final double NOVICE_AGENT_RATING_INITIALIZATION= Double.valueOf(0);
    public static final double ESCORT_MISSION_DECREASE_GIVEN_RATING= 0.75;
    public static final double ESCORT_MISSION_INCREASE_GIVEN_BOUNTY= 1.25;
    public static final double HUNT_MISSION_INCREASE_GIVEN_RATING=1.5;
    public static final double HUNT_MISSION_INCREASE_GIVEN_BONUS=2;
    public static final double SURVEILLANCE_MISSION_DECREASE_GIVEN_RATING=0.25;
    public static final double SURVEILLANCE_MISSION_INCREASE_GIVEN_BONUS=1.5;
    public static final String REGISTERED_AGENT_PRINTING="Registered Agent - %s:%s";
    public static final String FINAL_ASSIGNED_AGENT_PRINTING="Assigned %s - %s to Agent - %s";
    public static final String COMPLETE_FINAL_ASSIGNED_MISSION_PRINTING="Agent - %s:%s has completed all assigned missions.";
    public static final String STATUS_RATING_BOUNTY_PRINTING="%s - %s%nStatus: %s%nRating: %.2f%nBounty: %.2f";
    public static final String FINAL_NOVICE_AGENT_PRINTING="Novice Agents: %d%nMaster Agents: %d%nAssigned Missions: %d%nCompleted Missions: %d%nTotal Rating Given: %.2f%nTotal Bounty Given: $%.2f";
    private Constant() {
    }
}
