package gorm.dungeons;

import gorm.Location;
import gorm.Region;
import gorm.dungeons.events.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestRegion extends Region {

    public TestRegion(){
        Location room1 = new Location();
        room1.setLocationName("Central Room");
        room1.setShortDescription("A blue Room");
        room1.setLongDescription("Rough stone walls and blue tiled floor.");

        Location room2 = new Location();
        room2.setLocationName("West Room");
        room2.setShortDescription("A red Room");
        room2.setLongDescription("Rough stone walls and red tiled floor.");

        Location room3 = new Location();
        room3.setLocationName("East Room");
        room3.setShortDescription("A green Room");
        room3.setLongDescription("Rough stone walls and green tiled floor.");

        Map room1Map = new HashMap();
        room1Map.put("EAST", room3);
        room1Map.put("WEST", room2);
        room1.setDirections(room1Map);

        Map room2Map = new HashMap();
        room2Map.put("EAST", room1);
        room2.setDirections(room2Map);

        Map room3Map = new HashMap();
        room3Map.put("WEST", room1);
        room3.setDirections(room3Map);



        List<Location> roomList = new LinkedList();
        roomList.add(room1);
        roomList.add(room2);
        //wip
        room3.setOnExit(new TestEvent1());
        roomList.add(room3);

        this.setLocations(roomList);

        // add-ons (WIPS)
//        room2.setOnArrival(new TestEvent2());
//        room2.setOnArrival(new AutoFemEvent());
//        room2.setOnArrival(new TileTrapCougarSheep());
            room2.setOnArrival(new DartTrap());

    }
}
