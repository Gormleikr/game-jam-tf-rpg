package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class TestEvent2 extends LocationEvent {

    public TestEvent2(){
        super(true);
    }

    @Override
    public boolean activateEvent(Player player, Scanner sc){
        if(isActive()){
            System.out.println("TRAP HAS SPRUNG!");

            int i = 0;
            for (i=0;i<3;i++){
                System.out.println("What is three by four?");
                String input = sc.nextLine();
                if (input.equals("12")){
                    setActive(false);
                    System.out.println("You passed the test! You are allowed entry.");
                    return true; //allows entry
                }
            }
            System.out.println("You manage to escape back the way you came");
        }
        return false; //does not allow entry
    }

}
