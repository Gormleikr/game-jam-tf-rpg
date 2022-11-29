package gorm.dungeons;

import gorm.Player;

import java.util.Scanner;

public class  LocationEvent {
    boolean isActive = false;
    public boolean activateEvent(Player player, Scanner sc) {
        // overwrite this for specific events!!!
        // return for success?
        System.out.println("no event triggered");
        return true; //return true means non-overwritten allows entry
    }

    // CONSTRUCTORS
    public LocationEvent(){
        setActive(false);
    }
    public LocationEvent(boolean act){
        setActive(act);
    }

    // SETTERS_GETTERS
    public boolean isActive() {
        return this.isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
}
