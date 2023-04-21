package advancedjava;

class CricketScoreDetails {
    private String team1;
    private String team2;
    private int team1Score;
    private int team2Score;
    private int overs;

    
    public String getTeam1() {
        return team1;
    }
    
    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    
    public String getTeam2() {
        return team2;
    }
    
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    
    public int getTeam1Score() {
        return team1Score;
    }
    
    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }
    
    public int getTeam2Score() {
        return team2Score;
    }
    
    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }
    
    public int getOvers() {
        return overs;
    }
    
    public void setOvers(int overs) {
        this.overs = overs;
    }
    
    
    public void displayScoreDetails() {
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
        System.out.println("Team 1 Score: " + team1Score);
        System.out.println("Team 2 Score: " + team2Score);
        System.out.println("Overs: " + overs);
    }
}

public class que12 {
    public static void main(String[] args) {
        CricketScoreDetails scoreDetails = new CricketScoreDetails();
        scoreDetails.setTeam1("India");
        scoreDetails.setTeam2("Australia");
        scoreDetails.setTeam1Score(250);
        scoreDetails.setTeam2Score(200);
        scoreDetails.setOvers(40);
        scoreDetails.displayScoreDetails();
    }
}
