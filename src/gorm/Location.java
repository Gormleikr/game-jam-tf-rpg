package gorm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Location {

    // VARIABLES
    String locationName; //must be unique
    String shortDescription;
    String longDescription;
    Map<String, Location> locationMap;
    List<Location> exits;

    // maybe exits should be more than just location...
    // -- need to figure out hwo to implement locked doors
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
                // fixme here!! next!!
                //test keys
                // containsKey may be useful method....
                // need to fix the keyset- i nexampletower?

                return this.getDirectionMap().get(dir);
            }
        }
        return null;
    }
//                 System.out.println(this.getDirectionMap().keySet());
    //WILLL NEED ABOVE...

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
    public String displayLocation(){
        return (this.getLocationName()+"\n"+this.getShortDescription());
    }
    public void displayExits(){
        // lists names of the exits (directions)
        System.out.println("\n");
        System.out.println("Exits: temporarily disabled"); //todo
        //error here...
        // need iterator?
        // where is the Directions class???
//        this.locationMap.entrySet().
//                forEach(
//                        (dir, loc)->
//                        {
//            System.out.println(
//                    dir.toString() + ": " + loc.locationName
//            );
//        });

//        this.locationMap.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " Value : " + entry.getValue());
//        });
    }
    public boolean attemptExit(){
        return true; //todo
        // compare to existing exits...
    }
    public boolean attemptEnter(){
        this.displayExits();
        return true; //todo
        // probably don't need this now...
        //...so keeping it true
    }

    @Override
    public String toString(){
        return (this.getLocationName()+"\n"+this.getShortDescription());
    }


}

