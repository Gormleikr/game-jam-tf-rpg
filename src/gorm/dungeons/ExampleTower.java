package gorm.dungeons;

import gorm.Directions;
import gorm.Location;
import gorm.Region;

import java.util.*;

public class ExampleTower extends Region {
    public ExampleTower(){
        // create 9 room, 3x3 locations...
        Location loc2 = new Location();
        loc2.setLocationName("NW Room");
        loc2.setShortDescription("An Empty Room");
        loc2.setLongDescription("Rough stone walls and tiled floors.");

        // I want start room to be in the north.
        Location loc1 = new Location();
        loc1.setLocationName("North Room");
        loc1.setShortDescription("An Empty Room");
        loc1.setLongDescription("Rough stone walls and tiled floors.");

        Location loc3 = new Location();
        loc3.setLocationName("NE Room");
        loc3.setShortDescription("An Empty Room");
        loc3.setLongDescription("Rough stone walls and tiled floors.");

        Location loc4 = new Location();
        loc4.setLocationName("West Room");
        loc4.setShortDescription("An Empty Room");
        loc4.setLongDescription("Rough stone walls and tiled floors.");

        Location loc5 = new Location();
        loc5.setLocationName("Central Room");
        loc5.setShortDescription("An Empty Room");
        loc5.setLongDescription("Rough stone walls and tiled floors.");

        Location loc6 = new Location();
        loc6.setLocationName("East Room");
        loc6.setShortDescription("An Empty Room");
        loc6.setLongDescription("Rough stone walls and tiled floors.");

        Location loc7 = new Location();
        loc7.setLocationName("SW Room");
        loc7.setShortDescription("An Empty Room");
        loc7.setLongDescription("Rough stone walls and tiled floors.");

        Location loc8 = new Location();
        loc8.setLocationName("Southern Room");
        loc8.setShortDescription("An Empty Room");
        loc8.setLongDescription("Rough stone walls and tiled floors.");

        Location loc9 = new Location();
        loc9.setLocationName("SE Room");
        loc9.setShortDescription("An Empty Room");
        loc9.setLongDescription("Rough stone walls and tiled floors.");

        // SET DIRECTIONS FOR EACH ROOM

        Map map1 = new HashMap();
//        map1.put(Directions.E, loc1);
        map1.put("EAST", loc1);

        loc1.setDirections(map1);

        Map map2 = new HashMap();
        map2.put(Directions.E, loc2);
        map2.put("East", loc2);

        loc2.setDirections(map2);

        Map map3 = new HashMap();
        map3.put(Directions.E, loc3);
        loc3.setDirections(map3);


        Map map4 = new HashMap();
        map4.put(Directions.E, loc4);
        loc4.setDirections(map4);

        Map map5 = new HashMap();
        map5.put(Directions.E, loc5);
        loc5.setDirections(map5);

        Map map6 = new HashMap();
        map6.put(Directions.E, loc6);
        loc6.setDirections(map6);

        Map map7 = new HashMap();
        map7.put(Directions.E, loc7);
        loc7.setDirections(map7);

        Map map8 = new HashMap();
        map8.put(Directions.E, loc8);
        loc8.setDirections(map8);

        Map map9 = new HashMap();
        map9.put(Directions.E, loc9);
        loc9.setDirections(map9);

        // SET LOCATIONS TO REGION
        this.setActiveLocation(loc1);
        List locationList = new LinkedList<Location>();
        locationList.add(loc1);
        locationList.add(loc2);
        locationList.add(loc3);
        locationList.add(loc4);
        locationList.add(loc5);
        locationList.add(loc6);
        locationList.add(loc7);
        locationList.add(loc8);
        locationList.add(loc9);
        this.setLocations(locationList);


    }

    public static void main(String[] args) {
        Region test = new ExampleTower();
        System.out.println(test.getActiveLocation());
        System.out.println(test.getLocations());
        System.out.println(Directions.N.direction);
    } // debugging, todo, remove
}



/*

    String locationName; //must be unique
    String shortDescription;
    String longDescription;
    Map<String, Location> directions;

 */
