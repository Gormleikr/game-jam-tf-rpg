package gorm;

public class Exit {
    public Location attemptExit(){
        return new Location();
    }
    // if succeed, returns new location, if fail returns current location
    // should also determine if monster or trap is sprung
    boolean islocked;
    boolean isTrapped;
    //still determining if exit should be separate from Location...

}
