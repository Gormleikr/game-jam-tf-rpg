package gorm;
import java.util.List;
public class Location {
    String Description;
    List<Location> exits;
    // maybe exits should be more than just location...
    // -- need to figure out hwo to implement locked doors
    // Exit may need to be an object...
    public Location attemptExit(){

        return new Location(); //todo
    }
    // if succeed, returns new location, if fail returns current location

}
