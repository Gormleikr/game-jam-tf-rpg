package gorm.dungeons;

import gorm.Player;

public class  LocationEvent {
    boolean isActive = false;
    public void activateEvent(Player player) {
        // overwrite this for specific events!!!
        // do not need to return
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
