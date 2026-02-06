
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {
    // Fields
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    // Constructor
    public Mission(){
        Random random = new Random();
        String[] missionTargets = 
            {"Retrieve stolen data", 
            "Infiltrate enemy base", 
            "Rescue hostage", 
            "Sabotage communications", 
            "Escort VIP"};

        int randomMissionIndex = random.nextInt(missionTargets.length);
        this.missionTarget = missionTargets[randomMissionIndex];

        this.difficulty = random.nextInt(10) + 1;
        int days = random.nextInt(24) + 7;
        this.missionDeadline = LocalDate.now().plusDays(days);
    }

    //Getters
        public String getMissionTarget(){
            return missionTarget;
        }

        public LocalDate getMissionDeadline(){
            return missionDeadline;
        }

        public int getDifficulty(){
            return difficulty;
        }

        public void displayMissionBriefing(){
            DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
            System.out.printf("""
                    \n*** MISSION BRIEFING ***
                    Target: %s
                    Difficulty: %d
                    Deadline: %s
                    """, getMissionTarget(), getDifficulty(), getMissionDeadline().format(date));
        }
}
