package models;

import java.util.Arrays;

public class League {

  private Team[] team;
  private String leagueName;

  public League(String leagueName, Team[] team) {
    this.team = team;
    this.leagueName = leagueName;
  }

  public Team[] getTeam() {
    return team;
  }

  public void setTeam(Team[] team) {
    this.team = team;
  }

  public String getLeagueName() {
    return leagueName;
  }

  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }

  public int getTotalActiveGoals() {
    int total = 0;
    for (Team team : team) {
      for (Player player : team.getPlayer()) {
        if (player.active()) {
          total++;
        }
      }
    }
    return total;
  }

  @Override
  public String toString() {
    return "League [team=" + Arrays.toString(team) + ", leagueName=" + leagueName + "]";
  }

}
