package gorm;

public enum Directions {

    N("NORTH"),
    S("SOUTH"),
    W("WEST"),
    E("EAST"),
    NW("NORTHWEST"),
    NE("NORTHEAST"),
    SW("SOUTHWEST"),
    SE("SOUTHEAST"),
    D("DOWN"),
    U("UP");

    public final String direction;
    Directions(String s){
        this.direction = s.toUpperCase();
    }
}
