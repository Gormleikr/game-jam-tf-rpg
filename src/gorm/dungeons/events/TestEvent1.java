package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class TestEvent1 extends LocationEvent {

    public TestEvent1(){
        super(true);
    }

    @Override
    public boolean activateEvent(Player player, Scanner sc){
        if(isActive()){
            System.out.println("Exciting one time event engaged!");
            setActive(false);
        }
        return true;
    }

}
