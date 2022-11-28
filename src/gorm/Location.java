package gorm;
import gorm.dungeons.LocationEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Location {

    // VARIABLES
    String locationName; //must be unique
    String shortDescription;
    String longDescription;
    Map<String, Location> locationMap;
    public LocationEvent onArrival;
    public LocationEvent onExit;


//    List<Location> exits;

    // maybe exits should be more than just location...
    // -- need to figure out how to implement locked doors
    // Exit may need to be an object...

    // if succeed, returns new location, if fail returns current location

    public Location arrive(Location previousLocation) {
        // call this when player enters room
        // should be called only when entering a *new* room

        // if succeeds it returns this location
        // if fails it returns previous location
        //...how to prevent arrival functions on old location?
        return this; //todo
    }
    // CONSTRUCTORS
    public Location(){}
    // todo, constructor with full details... or file system wip

    // GETTERS
    public String getLocationName() {
        return this.locationName;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }
    public String getLongDescription() {
        return this.longDescription;
    }
    public Map<String, Location> getDirectionMap() {return locationMap;}
    public Location getDirection(String dir){

        for(Directions d:Directions.values()){
            if (d.direction.equalsIgnoreCase(dir)){
                return this.getDirectionMap().get(dir);
            }
        }
        return null;
    }
//                 System.out.println(this.getDirectionMap().keySet());
    //WILL NEED ABOVE...

    public void displayDescription(){
        System.out.println(getLongDescription());
        // todo, check if this should just be print instead of println
    }

    // SETTERS
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    public void setDirections(Map<String, Location> directions) {
        this.locationMap = directions;
    }

    // METHODS
    public void displayLocation(){

        System.out.println(this.getLocationName());
        // +"\n"+this.getShortDescription());
        // get rid of short decr
        // maybe implement options for short or long... later todo
        this.displayDescription();
        this.displayExits();
    }
    public void displayExits(){
//        System.out.println("\n");
        System.out.print("Exits: "); //todo
        this.locationMap.entrySet().forEach(dir->{
            System.out.print(dir.getKey()+" ");
        });
        System.out.println();
    }
    public boolean attemptExit(){
        return true; //todo
        // compare to existing exits...
    }
    public boolean attemptEnter(){
//        this.displayExits();
        return true; //todo
        // probably don't need this now...
        //...so keeping it true
    }

    @Override
    public String toString(){
        return (this.getLocationName()+"\n"+this.getShortDescription());
    }


}

