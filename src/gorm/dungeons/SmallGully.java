package gorm.dungeons;

import gorm.Location;
import gorm.Region;
import gorm.dungeons.events.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SmallGully extends Region {


    public SmallGully(){
        //CREATE ROOMS
        Location startingLocation = new Location();
        startingLocation.setLocationName("At the cliff bottom");
        startingLocation.setShortDescription("The bottom of a scree covered hill");
        startingLocation.setLongDescription(
                "You lie at the bottom of a canyon. \nTo the WEST lies a steep slope covered in loose Scree. \nSteep canyon walls rise above you to the NORTH and SOUTH. The only way forward is EAST."
        );


        Location outside = new Location();
        outside.setLocationName("Canyon Bottom");
        outside.setShortDescription("At the bottom of the deep canyon");
        outside.setLongDescription(
            "You are in the bottom of a deep canyon. Rugged cliffs rise to sharply to your NORTH and SOUTH. \nThe canyon allows passage to your WEST. To the EAST lies a dark cave entrance"
        );


        Location entry = new Location();
        entry.setLocationName("Cavern Entrance");
        entry.setShortDescription("A large circular entryway");
        entry.setLongDescription("You find yourself inside a large circular room. \nTo the WEST is a worn passage to the outside. \nTo the NORTHEAST is another passageway, the entrance winding between the legs of a statue \ncarved in the likeness of a WOLF with a RAVEN head. \nA Similar passageway lies to the SOUTHEAST between the legs of a large statue \ncarved like a COUGAR clad in a SHEEP's coat");

        Location paintedForest = new Location();
        paintedForest.setLocationName("Painted Forest Path- West");
        paintedForest.setShortDescription("A passageway painted in the likeness of a forest");
        paintedForest.setLongDescription(
            "You find yourself in a wide passageway. The walls are carved and painted in the likeness of a pine forest. \nGlints of reflecting light shine between the stone trees, disappearing when you move towards them to get a better look, \ngiving the feel of watching eyes in the darkness. A dim light permeates the room, with no obvious source. \nThe passage runs SOUTHWEST to NORTHEAST."
        );

        Location paintedMountain= new Location();
        paintedMountain.setLocationName("Painted Mountain Path - West");
        paintedMountain.setShortDescription("A passageway painted in the likeness of a Mountain Path");
        paintedMountain.setLongDescription(
            "You find yourself in a wide passageway. The walls are carved and painted in the likeness of distant mountains. \nRough rocky outcroppings arise periodically from the floor and flickering spots on the ceiling provides a dim light reminiscent of a starlit night. \nThe passageway gives off the air of a mountain path which travels NORTHWEST to SOUTHEAST."
        );

        Location paintedForestClearing = new Location();
        paintedForestClearing.setLocationName("Painted Forest Clearing");
        paintedForestClearing.setShortDescription("Painted forest clearing set with large floor tiles.");
        paintedForestClearing.setLongDescription("The Painted forest opens into a wide room. \nThe walls remain painted like forest but suspiciously large floor tiles sit between the entrances and the main floor of the chamber. \nThe painted forest extends through passageways to the SOUTHWEST and SOUTHEAST.");
        paintedForestClearing.setOnArrival(new TileTrapCougarSheep());


        Location paintedMountainClearing= new Location();
        paintedMountainClearing.setLocationName("Painted Mountain Clearing");
        paintedMountainClearing.setShortDescription("Painted Alpine clearing");
        paintedMountainClearing.setLongDescription("The Painted Mountain Path leads into a large circular room carved as if ringed by distance mountains. \nA sliver of glittering light comes from a waning moon carved from crystal set into the NORTH wall. \nSuspiciously large floor tiles sit between the entrances and the main floor of the chamber. \nPainted Mountain Paths continue to the NORTHEAST and NORTHWEST.");
        paintedMountainClearing.setOnArrival(new TileTrapCougarSheep());



        Location paintedForest2 = new Location();
        paintedForest2.setLocationName("Painted Forest Path- East");
        paintedForest2.setShortDescription("A passageway painted in the likeness of a forest");
        paintedForest2.setLongDescription(
                "You find yourself in a wide passageway. The walls are carved and painted in the likeness of a pine forest. \nGlints of reflecting light shine between the stone trees, disappearing when you move towards them to get a better look, \ngiving the feel of watching eyes in the darkness. A dim light permeates the room, with no obvious source. \nThe passage runs NORTHWEST to SOUTHEAST."
        );

        Location paintedMountain2= new Location();
        paintedMountain2.setLocationName("Painted Mountain Path - East");
        paintedMountain2.setShortDescription("A passageway painted in the likeness of a Mountain Path");
        paintedMountain2.setLongDescription(
                "You find yourself in a wide passageway. The walls are carved and painted in the likeness of distant mountains. \nRough rocky outcroppings arise periodically from the floor and flickering spots on the ceiling provides a dim light reminiscent of a starlit night. \nThe passageway gives off the air of a mountain path which travels SOUTHWEST to NORTHEAST."
        );

        Location softMeadow = new Location();
        softMeadow.setLocationName("Soft Meadow");
        softMeadow.setShortDescription("Soft meadow like clearing filled with moss and mysterious light");
        softMeadow.setLongDescription(
            "The passageway opens up to a round room full of soft green moss. \nThe walls are carved and painted to look like wooden fences. \nA series of tiles surround the center of the room, in a simple repeating pattern. \nThere are five passageways leading out of this room; \nA painted forest to the NORTHWEST, \na painted mountain path to the SOUTHWEST and \nsimple cave entrances to the NORTHEAST, EAST, and SOUTHEAST."
        );
        softMeadow.setOnArrival(new TileTrapHorseCow());


        Location NWPassage = new Location();
        NWPassage.setLocationName("NorthWestern Passage");
        NWPassage.setShortDescription("A rough carved cavern passage");
        NWPassage.setLongDescription("A drab stony passage with small slits carved into the walls. \nThe passage leads SOUTHWEST towards the soft clearing and NORTHEAST towards the deep caves.");

        Location WPassage = new Location();
        WPassage.setLocationName("Western Passage");
        WPassage.setShortDescription("A rough carved cavern passage");
        WPassage.setLongDescription("A drab stony passage with small slits carved into the walls. \nThe passage leads EAST towards the soft clearing and WEST towards the deep caves.");
        WPassage.setOnArrival(new DartTrap());

        Location SWPassage = new Location();
        SWPassage.setLocationName("SouthWestern Passage");
        SWPassage.setShortDescription("A rough carved cavern passage");
        SWPassage.setLongDescription("A drab stony passage with small slits carved into the walls. \nThe passage leads NORTHWEST towards the soft clearing and SOUTHEAST towards the deep caves.");
        SWPassage.setOnArrival(new DartTrap());


        Location caveN1 = new Location();
        caveN1.setLocationName("North Cave Chamber");
        caveN1.setShortDescription("A rough carved cavern room.");
        caveN1.setLongDescription("A rough carved cavern room. A mystical Light permeates the air but reveals nothing of interest. \nThere are exits in the SOUTHWEST and the SOUTHEAST.");

        Location caveC1 = new Location();
        caveC1.setLocationName("Central Cave Chamber");
        caveC1.setShortDescription("A rough carved cavern room.");
        caveC1.setLongDescription("A rough carved cavern room. \nA mystical Light permeates the air revealing a series of small slits in the walls. \nThere are exits in the WEST and the EAST.");


        Location caveS1 = new Location();
        caveS1.setLocationName("South Cave Chamber");
        caveS1.setShortDescription("A rough carved cavern room.");
        caveS1.setLongDescription("A rough carved cavern room. A mystical Light permeates the air but reveals nothing of interest. \nThere are exits in the NORTHWEST and the NORTHEAST.");
        caveS1.setOnArrival(new DartTrap());


        Location greatHall = new Location();
        greatHall.setLocationName("Great Hall");
        greatHall.setShortDescription("A great dining hall, long abandoned");
        greatHall.setLongDescription(
            "A Great Hall, elaborately carved and long looted. Old wooden tables sit dusty and abandoned throughout the room. \nCavern exits lie to the NORTHWEST, SOUTHWEST and WEST. \nA Mysterious tunnel lies to the NORTH. \nThe exit to the EAST gives off an air of finality to it and in your heart you know the way out lies in that direction."
        );

        Location caveNShortcut = new Location();
        caveNShortcut.setLocationName("Mysterious Shortcut");
        caveNShortcut.setShortDescription("A thin passage off the great hall");
        caveNShortcut.setLongDescription(
                "This thin passage leads from the Great Hall in the SOUTH towards the mysterious chamber in the NORTH."
        );

        Location ladiesRoom = new Location();
        ladiesRoom.setLocationName("Mysterious Chamber");
        ladiesRoom.setShortDescription("A mysterious hexagonal room");
        ladiesRoom.setLongDescription(
            "This mysterious chamber is shaped like a hexagon. \nStrange carvings cut across the floor and an air of magick lingers on the air. \nYou get a feeling that it might not be wise to linger here. The SOUTH exit appears to be missing a door."
        );
        ladiesRoom.setOnExit(new AutoFemEvent());


        Location freedom = new Location(); // free hills? wip
        freedom.setLocationName("Exit to Freedom");
        freedom.setShortDescription("The end of your trial... for now");
        freedom.setLongDescription("Above you to the West rises a great cliff face with the dungeon exit carved into it. \nTo the East lies freedom and prosperity. Green fields and fruit trees, and beyond, a friendly village happy to take in tired refugees and wandering beasts. \nYou made it! \nGAME OVER, type 'QUIT' to exit");
        freedom.setOnArrival(new EndExitHumanTest());



        // MAP EXITS
        // fun fact, starting point needs to be added last so it is in index 0
        // ...or I need to fix my implementation
        Map startingLocationMap = new HashMap();
        startingLocationMap.put("EAST", outside);
        startingLocation.setDirections(startingLocationMap);

        Map outsideMap = new HashMap();
        outsideMap.put("EAST", entry);
        outsideMap.put("WEST", outside);
        outside.setDirections(outsideMap);

        Map entryMap = new HashMap();
        entryMap.put("EAST", outside);
        entryMap.put("NORTHEAST", paintedForest );
        entryMap.put("SOUTHEAST", paintedMountain);
        entry.setDirections(entryMap);

        Map paintedMountainMap = new HashMap();
        paintedMountainMap.put("NORTHWEST", entry );
        paintedMountainMap.put("SOUTHEAST", paintedMountainClearing);
        paintedMountain.setDirections(paintedMountainMap);

        Map paintedMountainClearingMap = new HashMap();
        paintedMountainClearingMap.put("NORTHWEST", paintedMountain );
        paintedMountainClearingMap.put("NORTHEAST", paintedMountain2);
        paintedMountainClearing.setDirections(paintedMountainClearingMap);

        Map paintedMountain2Map = new HashMap();
        paintedMountain2Map.put("SOUTHWEST", paintedMountainClearing );
        paintedMountain2Map.put("SOUTHEAST", softMeadow);
        paintedMountain2.setDirections(paintedMountain2Map);

        Map paintedForestMap = new HashMap();
        paintedForestMap.put("SOUTHWEST", entry );
        paintedForestMap.put("NORTHEAST", paintedForestClearing);
        paintedForest.setDirections(paintedForestMap);

        Map paintedForestClearingMap = new HashMap();
        paintedForestClearingMap.put("SOUTHWEST", entry );
        paintedForestClearingMap.put("SOUTHEAST", paintedForest2);
        paintedForestClearing.setDirections(paintedForestClearingMap);

        Map paintedForest2Map = new HashMap();
        paintedForest2Map.put("NORTHWEST", paintedForestClearing );
        paintedForest2Map.put("SOUTHEAST", softMeadow);
        paintedForest2.setDirections(paintedForest2Map);

        Map softMeadowMap = new HashMap();
        softMeadowMap.put("NORTHWEST", paintedForest2 );
        softMeadowMap.put("SOUTHEAST", SWPassage);
        softMeadowMap.put("SOUTHWEST", paintedMountain2);
        softMeadowMap.put("NORTHEAST", NWPassage);
        softMeadowMap.put("EAST", WPassage);
        softMeadow.setDirections(softMeadowMap);

        Map NWPassageMap = new HashMap();
        NWPassageMap.put("NORTHEAST", caveN1 );
        NWPassageMap.put("SOUTHWEST", softMeadow);
        NWPassage.setDirections(NWPassageMap);

        Map WPassageMap = new HashMap();
        WPassageMap.put("EAST", caveC1 );
        WPassageMap.put("WEST", softMeadow);
        WPassage.setDirections(WPassageMap);

        Map SWPassageMap = new HashMap();
        SWPassageMap.put("SOUTHEAST", caveS1 );
        SWPassageMap.put("NORTHWEST", softMeadow);
        SWPassage.setDirections(SWPassageMap);

        Map caveN1Map = new HashMap();
        caveN1Map.put("SOUTHEAST", greatHall );
        caveN1Map.put("SOUTHWEST", NWPassage);
        caveN1.setDirections(caveN1Map);
        //

        Map caveC1Map = new HashMap();
        caveC1Map.put("EAST", greatHall );
        caveC1Map.put("WEST", WPassage);
        caveC1.setDirections(caveC1Map);

        Map caveS1Map = new HashMap();
        caveS1Map.put("NORTHEAST", greatHall );
        caveS1Map.put("NORTHWEST", SWPassage);
        caveS1.setDirections(caveS1Map);

        Map greatHallMap = new HashMap();
        greatHallMap.put("NORTHEAST", greatHall );
        greatHallMap.put("NORTHWEST", NWPassage);
        greatHallMap.put("NORTH", caveNShortcut);
        greatHallMap.put("EAST", freedom);
        greatHallMap.put("SOUTHWEST", NWPassage);
        greatHall.setDirections(greatHallMap);

        Map caveNShortcutMap = new HashMap();
        caveNShortcutMap.put("SOUTH", greatHall );
        caveNShortcutMap.put("NORTH", ladiesRoom);
        caveNShortcut.setDirections(caveNShortcutMap);

        Map ladiesRoomMap = new HashMap();
        ladiesRoomMap.put("SOUTH", caveNShortcut );
        ladiesRoom.setDirections(ladiesRoomMap);

        Map freedomMap = new HashMap();
        freedomMap.put("WEST", greatHall );
        freedom.setDirections(freedomMap);


//        startingLocation.setDirections(greatHallMap);

       // final countdown
        List<Location> roomList = new LinkedList();
        roomList.add(startingLocation);
        roomList.add(outside);
        roomList.add(entry);
        roomList.add(paintedMountain);
        roomList.add(paintedMountainClearing);
        roomList.add(paintedMountain2);
        roomList.add(paintedForest);
        roomList.add(paintedForestClearing);
        roomList.add(paintedForest2);
        roomList.add(softMeadow);
        roomList.add(NWPassage);
        roomList.add(WPassage);
        roomList.add(SWPassage);
        roomList.add(caveN1);
        roomList.add(caveC1);
        roomList.add(caveS1);
        roomList.add(greatHall);
        roomList.add(caveNShortcut);
        roomList.add(ladiesRoom);
        roomList.add(freedom);

        //final step
        this.setLocations(roomList);


    }



}

/*
startingLocation //e
outside // w, e
entry // w, ne, se
paintedMountain // SE, NW
paintedMountainClearing // NE, NW
paintedMountain2 // SW, SE
paintedForest // NE, SW
paintedForestClearing // SW, SE
paintedForest2 //NW, SE
softMeadow // NW, SW, NE, E, SE
NWPassage // SW, NE
WPassage // E, W
SWPassage //NW, SE
caveN1 // SW, SE
caveC1 // W, E
caveS1 // NW, NE
greatHall // NW, W, SW, N, E
caveNShortcut // S, N
ladiesRoom // S
freedom // W

 */
