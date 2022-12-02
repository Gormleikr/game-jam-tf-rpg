package gorm.dungeons.events;

import gorm.Player;
import gorm.dungeons.LocationEvent;

import java.util.Scanner;

public class EndExitHumanTest extends LocationEvent {

    public EndExitHumanTest(){
        super(true);
    }


    public boolean activateEvent(Player player, Scanner sc) {
        System.out.println("Up ahead you see an exit.");
        System.out.println("As you get closer you realize it is not 'an exit', but 'the exit");
        System.out.println("Hope fills your breast as you come to your final challenge.");
        int dex = player.getBody().dexCheck();
        if (dex<5){
            System.out.println("But then your heart sinks. Its a door. A simple, sturdy, round handled door.");
            System.out.println("There is no way your animal self is going to be able to turn that doorknob");
            System.out.println("But you are no quitter. You give certainly give it your best shot. But its no good");
            System.out.println("Eventually you resort to banging on the wood, desperate, escape a mere pace away.");
            System.out.println("but its no good. You collapse on the ground in despair.");
            System.out.println("But then, a noise. Is it?");
            System.out.println("It is! The knob turns, and an elderly man stares at your bestial features.");
            System.out.println("Silently, he places a stick under the door and turns away.");
            System.out.println("The way is open!");
            System.out.println("Excited, you race through the door, and find:");
            this.setActive(false);
        }
        else if (dex<12){
            System.out.println("You wonder what it will be. A trap? A monster? A puzzle?");
            System.out.println("As you get closer you find none of those things. Instead, there is only a simple door.");
            System.out.println("A simple, sturdy, round handled door.");
            System.out.println("'No problem', you think as you approach the exit. But then you look at your hands.");
            System.out.println("Well, what used to be your hands. This is going to be harder than you thought.");
            System.out.println("After an hour, you finally give up. You can't grasp the doorknob. Theres no way.");
            System.out.println("Hope gives in to despair");
            System.out.println("But then, a noise. Is it?");
            System.out.println("It is! The knob turns, and an elderly man stares at your bestial features.");
            System.out.println("Silently, he places a stick under the door and turns away.");
            System.out.println("The way is open!");
            System.out.println("Excited, you race through the door, and find:");
            this.setActive(false);
        }
        else if (dex<15){
            System.out.println("You wonder what it will be. A trap? A monster? A puzzle?");
            System.out.println("As you get closer you find none of those things. Instead, there is only a simple door.");
            System.out.println("A simple, sturdy, round handled door.");
            System.out.println("Cautiously, you look around for a trap but cannot find one.");
            System.out.println("Then you realize. Your hands. This will be harder than you thought.");
            System.out.println("But not impossible! After a few minutes of struggle, you manage to get the smooth, brass knob to turn.");
            System.out.println("You enter, and behind the door you see:");

        }

        else{
            System.out.println("You wonder what it will be. A trap? A monster? A puzzle?");
            System.out.println("As you get closer you find none of those things. Instead, there is only a simple door.");
            System.out.println("A simple, sturdy, round handled door.");
            System.out.println("Strangely enough, its even unlocked.");
            System.out.println("You open the door and leave the dungeon behind");
        }
        // the actual exit room is the last thing seen
    return true;
    }



}
