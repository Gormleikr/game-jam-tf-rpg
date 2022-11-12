package gorm;

import java.util.List;

public class Region {
    List<Location> locations;
    public Region(){
        //sets up the basic dungeon
        // lets have this set up a small 3 room tower or somethign as a test

    }
    // todo, figure out what is needed to load a region...
    //may need a second constructor...
    public static Region loadRegion(){
        //create region from file
        return new Region();
        //todo
    }
    public void saveRegion(){
        //save region to file
        //wip!!! todo
    }

}
