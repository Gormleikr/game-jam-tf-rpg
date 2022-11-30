package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class DartTrap extends LocationEvent {

    public DartTrap(){
        super(true);
    }

    @Override
    public boolean activateEvent(Player player, Scanner sc) {
        if (isActive()) {
            System.out.println("You come to a hallway set with large tiles");

            boolean repeat = false;
            do {
                System.out.println("You come to an area with small holes on either wall. A dart Trap!");
                System.out.println("Do you go:");
                System.out.println("1. 'forward'. Hope that your reflexes will let you avoid the trap.");
                System.out.println("2. 'return'. Retreat back the way you came.");
                String input = sc.nextLine();
                if (input.equals("1") || input.equalsIgnoreCase("forward")) {
                    System.out.println("You step forward and try to dodge the darts.");
                    if (player.getBody().aglCheck()<110) {
                        System.out.println("Ouch. Those darts really sting!");
                        player.getBody().takeRandomHit();
                        System.out.println("The area where the darts hits begins to tingle. 'Wait...'");
                        player.getBody().takeRandomTF();
                    }
                }
                else if (input.equals("2") || input.equalsIgnoreCase("return")) {
                    System.out.println("You retreat from the tunnel and go back to the room you were in.");
                    return false; //should go back to previous room
                } else {
                    repeat = true;
                }
            } while (repeat);

        }
        System.out.println("You make it to the other side but the dart traps remain.");
        return true;
    }
}
