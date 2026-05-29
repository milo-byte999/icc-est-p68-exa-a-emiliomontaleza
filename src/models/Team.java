package models;

import java.util.Arrays;

public class Team {

  private String nameTeam;
  private Player[] player;

  public Team(String nameTeam, Player[] player) {
    this.nameTeam = nameTeam;
    this.player = player;
  }

  public String getNameTeam() {
    return nameTeam;
  }

  public void setNameTeam(String nameTeam) {
    this.nameTeam = nameTeam;
  }

  public Player[] getPlayer() {
    return player;
  }

  public void setPlayer(Player[] player) {
    this.player = player;
  }


  @Override
  public String toString() {
    return "Team [nameTeam=" + nameTeam + ", player=" + Arrays.toString(player) + "]";
  }

}
