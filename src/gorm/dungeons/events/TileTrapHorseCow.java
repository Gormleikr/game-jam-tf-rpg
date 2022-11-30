package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class TileTrapHorseCow extends LocationEvent {

    public TileTrapHorseCow(){
        super(true);
    }


    @Override
    public boolean activateEvent(Player player, Scanner sc) {
        if (isActive()) {
            System.out.println("You come to a hallway set with large tiles");
            boolean repeat = false;
            boolean on = true;
            int choice1 = 0;
            do {
                System.out.println("You must choose on which tile to step. Your first choice is:");
                System.out.println("1. 'horse'. This is a brown tile marked with a white horse");
                System.out.println("2. 'cow'. This is a green tile marked with a black and white cow");
                System.out.println("3. 'return'. Retreat back the way you came.");
                String input = sc.nextLine();
                if (input.equals("1") || input.equalsIgnoreCase("horse")) {
                    choice1 = 1;
                    System.out.println("You step gingerly onto the red tile marked with a black raven.");
                } else if (input.equals("2") || input.equalsIgnoreCase("cow")) {
                    choice1 = 2;
                    System.out.println("You step gingerly onto the white tile marked with a brown bunny.");
                } else if (input.equals("3") || input.equalsIgnoreCase("return")) {
                    System.out.println("You retreat from the tunnel and go back to the room you were in.");
                    return false; //should go back to previous room
                } else {
                    repeat = true;
                }
            } while (repeat);
            if (on) {
                System.out.println("You must choose on which tile to step. Your first choice is:");
                System.out.println("1. 'bell'. This is a grey tile painted with a bright golden bell");
                System.out.println("2. 'plow'. This green tile is painted with a type of plow designed to be pulled by a large creature.");
                String input2 = sc.nextLine();
                if (input2.equals("2") || input2.equalsIgnoreCase("plow")) {
                    if (choice1==1) {
                        System.out.println("The tile holds and you make it across safely");
                    }
                    else if (choice1==2) {
                        System.out.println("The tile crumbles away and you fall!");
                        System.out.println("Luckily, you only fall a few feet before some sort of soft liquid breaks your fall");
                        System.out.println("Your flesh begins to tingle, and you realize there is more to this trap than a small drop.");
                        player.getBody().takeWholeSpeciesTF("horse");
                        if (player.getBody().strCheck()<160) {
                            System.out.println("You struggle to get out on your first try.");
                            player.getBody().takeWholeSpeciesTF("horse");
                        }
                        System.out.println("With a leap of your new more powerful limbs, you land on the far side of the hallway.");
                    }

                } else if (input2.equals("1") || input2.equalsIgnoreCase("bell")) {
                    if (choice1==2) {
                        System.out.println("The tile holds and you make it across safely");
                    }
                    else if (choice1==1) {
                        System.out.println("The tile crumbles away and you fall!");
                        System.out.println("Luckily, you only fall a few feet before some sort of soft liquid breaks your fall");
                        System.out.println("Your flesh begins to tingle, and you realize there is more to this trap than a small drop.");
                        player.getBody().takeWholeSpeciesTF("cow");
                        if (player.getBody().strCheck()<160) {
                            System.out.println("You struggle to get out on your first try.");
                            player.getBody().takeWholeSpeciesTF("cow");
                        }
                        System.out.println("With a leap of your new more powerful limbs, you land on the far side of the hallway.");
                    }
                }

            }
        }
//        System.out.println(You should have no trouble returning this way);
        setActive(false);
        return true;
    }
}
