import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Match {
    private String homeTeam;
    private String visitorsTeam;
    private int homeGoal;
    private int visitorsGoal;

    @Override
    public String toString() {
        return
                homeTeam +" - "+
                 visitorsTeam + " ("+
                 homeGoal + " : " +
                 visitorsGoal +
                ')';
    }


    int getGoalDifference() {
        return homeGoal - visitorsGoal;
    }
    boolean containTeam(String team){
       return homeTeam.equals(team)||visitorsTeam.equals(team);
    }
    String[] getTeamsNames (){
        return new String[] {homeTeam,visitorsTeam};
    }


    public String getHomeTeam() {
        return homeTeam;
    }
    public String getTeams() {

        return homeTeam + visitorsTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitorsTeam() {
        return visitorsTeam;
    }

    public void setVisitorsTeam(String visitorsTeam) {
        this.visitorsTeam = visitorsTeam;
    }

    public int getHomeGoal() {
        return homeGoal;
    }

    public void setHomeGoal(int homeGoal) {
        this.homeGoal = homeGoal;
    }

    public int getVisitorsGoal() {
        return visitorsGoal;
    }
    public int getSummaryGoals()
    {
       return   homeGoal+visitorsGoal ;
    }

    public void setVisitorsGoal(int visitorsGoal) {
        this.visitorsGoal = visitorsGoal;
    }

    public Match(String homeTeam, String visitorsTeam, int homeGoal, int visitorsGoal) {
        this.homeTeam = homeTeam;
        this.visitorsTeam = visitorsTeam;
        this.homeGoal = homeGoal;
        this.visitorsGoal = visitorsGoal;
    }
}
