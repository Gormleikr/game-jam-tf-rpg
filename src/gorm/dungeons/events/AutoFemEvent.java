package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class AutoFemEvent extends LocationEvent {

    public AutoFemEvent() {
        super(true);
    }

    @Override
    public boolean activateEvent(Player player, Scanner sc) {
        System.out.println("Magick tingles against yor skin and you begin to change");
        player.getBody().takeWholeFeminize();
        return true; //does allow entry
    }
}