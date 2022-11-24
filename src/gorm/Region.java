package gorm;

import gorm.dungeons.ExampleTower;

import java.util.ArrayList;
import java.util.List;

public class Region {
    List<Location> locations;
    Location activeLocation;

    // CONSTRUCTORS
    public Region(){
        this.locations = new ArrayList<Location>();
    } //exists for dependency reasons
//    public Region(int seed){
//
//        if (seed==0) {
//            // currently a test dungeon
//            ExampleTower region = new ExampleTower();
//            this.setLocations = region.getLocations();
//            this.activeLocation = region.getActiveLocation();
//        }
//        //sets up the basic dungeon
//        // can have multiple dungeons without filesys this way...
//    }
    // todo, figure out what is needed to load a region...
    //may need a second constructor...

    public void saveRegion(){
        //save region to file
        //wip!!! todo
    }

    // GETTERS
    public Location getActiveLocation() {
        return activeLocation;
    }
    // from file, todo
    public static Region loadRegion(){
        //create region from file
        return new Region();
        //todo
    }

    public List<Location> getLocations() {
        return this.locations;
    }

    //SETTERS
    public void setActiveLocation(Location activeLocation) {
        this.activeLocation = activeLocation;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
