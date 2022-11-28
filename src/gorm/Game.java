package gorm;

import gorm.dungeons.ExampleTower;
import gorm.dungeons.TestRegion;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    Scanner scan;
    Region region;
    Player player;
    boolean isPlaying = false;
    // CONSTRUCTOR
    public Game(Scanner sc){
        this.scan = sc;
    }
    //SETTERS
    private void selectPlayer(Scanner scan){} //todo
    private void selectRegion(Scanner scan){} //todo
    private void setPlayer(Player player){
        this.player = player;
    }
    private void setRegion(Region region){
        this.region = region;
        this.region.setLocations(region.getLocations());
        this.region.setActiveLocation(region.getActiveLocation());
    }

    // startup top menu
    public void mainMenu() {
        // for starting game
        String option = "9"; //unnecesary initialization
        do {
            System.out.println("Main Menu:");
            System.out.println("wip... options will be ");
            System.out.println("1.New Game 2.load region 3. load player characters 8. test 0. exit");
            option = this.scan.nextLine().toLowerCase();
            //    Integer.parseInt(

            switch (option) {
                case "1": //new game
                    region= new Region();
                    player = new Player();
                    this.startGame();
                    //run game
                    break;
                case "2": // load region
                    System.out.println("Loading saved regions not yet implemented");                    // wip
                    break;
                case "3":// Load Party (player)
                    System.out.println("Loading characters is not yet implemented");
                    break;
                case "4":
                    break;
                case "8":
                    System.out.println("testing feature");
                    setPlayer(new Player());
                    setRegion(new TestRegion());
                this.startGame();
                    break;

                case "0":
                case "quit":
                    option = "0";
                    System.out.println("Exiting Game");
                    break;
                default:
                    option = "9";
                    break;
            }
            System.out.println("\n");
        } while (!option.equals("0"));


    }


    public void startGame(){
        if(this.player ==null){
            System.out.println("You must select your character(s)");
            return;
        }
        if (this.region == null){
            System.out.println("No region or dungeon selected.");
            return;
        }

        //sets first location to active
        region.setActiveLocation(region.locations.get(0));
        this.region.playIntro();
        System.out.println("\n\n\n\n\n");
        // play game here...
        this.isPlaying = true;
        while (this.isPlaying){
            // game here
            this.isPlaying = this.gameMenu();
        }

        return;
    }

    // main gameplay loop
    public boolean gameMenu(){
//        System.out.println("GAME MENU");
        // returns isPlaying
        String choice = "null";
        System.out.println("PLAYER: "+ player.name);
            // this should access inventory or etc
            // no... this is main gameplay loop, which includes option for inventory, etc

            // describe room
//            System.out.println("Current Location: "+ this.region.activeLocation.getLocationName()); //todo, turn into function
//            System.out.println(this.region.activeLocation.getShortDescription());
//        System.out.println("Main Menu:");
            this.region.activeLocation.displayLocation();
            // list exits
            // list items
            // player status
            //...exit and entrance events...
            System.out.println("enter \"options\" for more options");
            // input is not here!
            choice = this.scan.nextLine().toUpperCase();
            switch (choice) {
                case "N":
                case "NORTH":
                this.region.setActiveLocation(
                    this.attemptToExit("NORTH")
                );
                    break;
                case "SOUTH":
                case "S":
                    this.region.setActiveLocation(
                        this.attemptToExit("SOUTH")
                    );
                    break;
                case "WEST":
                case "W":
                    this.region.setActiveLocation(
                        this.attemptToExit("WEST")
                    );
                    break;
                case "EAST":
                case "E": //fixme, all directions go east in testtwr
                    this.region.setActiveLocation(
                        this.attemptToExit("EAST")
                    );
                    break;
                case "NORTHWEST":
                case "NW":
                    this.region.setActiveLocation(
                            this.attemptToExit("NORTHWEST")
                    );
                    break;
                case "NORTHEAST":
                case "NE":
                    this.region.setActiveLocation(
                        this.attemptToExit("NORTHEAST")
                    );
                    break;
                case "SOUTHWEST":
                case "SW":
                    this.region.setActiveLocation(
                        this.attemptToExit("SOUTHWEST")
                    );
                    break;
                case "SOUTHEAST":
                case "SE":
                    this.region.setActiveLocation(
                            this.attemptToExit("SOUTHEAST")
                    );
                    break;
                case "DOWN":
                case "D":
                    this.region.setActiveLocation(
                        this.attemptToExit("DOWN")
                    );
                    break;
                case "UP":
                case "U":
                    this.region.setActiveLocation(
                            this.attemptToExit("UP")
                    );
                    break;
                case "OPTION":
                case "OPTIONS":
                    System.out.println("QUIT to Quit Game");
                    System.out.println("INV for inventory details");
                    System.out.println("LOC for location details");
                    // this should include items on floor
                    break;
                case "EXITS":
                case "EXIT":
                case "DOORS":
                    //todo display exits
                    this.region.activeLocation.displayExits();
                    break;
                case "INV":
                case "INVENTORY":
                    // todo, call inventory menu
                    break;
                case "ITEM":
                case "ITEMS":
                    // todo, call item menu, form location...
                    break;
                case "OTHERS":
                case "PEOPLE":
                case "PPL":
                    // call npc menu, todo
                    break;
                case "LOCATION":
                case "LOC":
                    this.region.getActiveLocation().displayDescription();
                    break;
                case "QUIT":
                    return false;
                default:
                    choice = "meh";
            }
        System.out.println("press enter to continue");
            this.scan.nextLine();
            System.out.println("\n\n\n\n");
            return true; //todo,
    }

    private Location attemptToExit(String dir){
        if(this.region.activeLocation.getDirection(dir)!=null ){
            if(this.region.activeLocation.attemptExit(this.player, scan)){ //attempt to leave
                if(this.region.activeLocation.getDirection(dir).attemptEnter(this.player, scan)) {
                    //attempt to arrive
                    System.out.println("Moving...");
                    return this.region.activeLocation.getDirection(dir);
                }
            }
        }
        else{
            System.out.println("\nThat is not a valid exit\n");
        }
        return this.region.activeLocation;
        // todo, need to make this load location...
    }



// end of class
}
