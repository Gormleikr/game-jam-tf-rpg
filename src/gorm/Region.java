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

    //PLAY INTRO
    public void playIntro(){
        // this should read a region specific text - overwrite this!
        System.out.println("You wake up in the wilds.");
    }
    /*
    The kingdom of Murn has fallen.
    Refugees flee towards the sanctum of their neighbor's lands.
    You are among these refugees.
    With only the clothes on your back, you find yourself traveling the mountain
    paths towards the eastern kingdom of Eostria.
    But the wilds hold many dangers.
    Bandits, demons, and monstrosities left over from the ancient conflicts
    prowl the wilds. Ancient magicks prey upon unknowing passerbys.
    And the recent conflict has only made things worse.
    Bandits attack a group of refugees camped along the road. Screams. Running.
    Darkness.
    You wake up, separated by your company, at the button of a rough clift
    */




}
