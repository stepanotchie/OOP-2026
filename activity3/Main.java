
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        SecretAgent agent = new SecretAgent("007", "James Bond", 5);
        System.out.printf("""
                *** SECRET AGENT STATUS ***
                Agent ID: %s
                Agent Name: %s
                Clearance Level: %d
                On Mission: %b
                """, agent.getAgentId(), agent.getCodename(), agent.getClearanceLevel(), agent.isOnMission());

        Mission mission = new Mission();
        mission.displayMissionBriefing();

        if (agent.getClearanceLevel() >= mission.getDifficulty()) {
            System.out.println("\nAgent " + agent.getAgentId() + " is cleared for mission");
            agent.startMission();
            System.out.println("On Mission: " + agent.isOnMission());
            System.out.println("Mission executing...\nMission Completed");
            agent.completeMission();

            System.out.printf("""
                    \n*** SECRET AGENT FINAL STATUS ***
                    Agent ID: %s
                    Agent Name: %s
                    Clearance Level: %d
                    On Mission: %b
                    """, agent.getAgentId(), agent.getCodename(), agent.getClearanceLevel(), agent.isOnMission());

            DateTimeFormatter finalTimeFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm a");
            System.out.println(
                    "Mission Completion Time: " + agent.getLastMissionCompletionTime().format(finalTimeFormat));
        } else {
            System.out.println("\nAgent " + agent.getAgentId() + "'s clearance is too low for this mission");
        }

    }
}
