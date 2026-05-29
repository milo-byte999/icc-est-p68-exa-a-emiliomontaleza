package models;

public class Player {

  private String name;
  private int goles;
  private boolean isActive;

  public Player(String name, int goles, boolean isActive) {
    this.name = name;
    this.goles = goles;
    this.isActive = isActive;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGoles() {
    return goles;
  }

  public void setGoles(int goles) {
    this.goles = goles;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean active(){
    if(isActive){
      return true;
    }else{
      return false;
    }
  }

}

