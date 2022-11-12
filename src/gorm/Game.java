package gorm;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    Scanner scan;
    Region region;
    Player player;
    boolean isPlaying;
    public void mainMenu() {
        // for starting game
        String option = "9"; //unnecesary initialization

        do {
            System.out.println("Main Menu:");
            System.out.println("wip... options will be ");
            System.out.println("1.New Game 2.load region 3. load player characters 8. test 0. exit");
            option = this.scan.nextLine();
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
                this.startGame();
                    break;

                case "0":
                    option = "0";
                    break;
                default:
                    option = "9";
                    break;
            }
            System.out.println("options is " + option + "len=" + option.length());
        } while (option != "0");


    }
    public Game(Scanner sc){
        this.scan = sc;
    }
    public void gameMenu(){
        // this should access intentory or etc
        // no... this is main gameplay loop, which includes option for inventory, etc

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

        System.out.println("game started");

        // play game here...
        this.isPlaying = true;
        while (this.isPlaying){

            // game here
            // SELECT OPTIONS; game menu, room menu, item menu?
            this.isPlaying = false;
        }

        return;
    }

}
