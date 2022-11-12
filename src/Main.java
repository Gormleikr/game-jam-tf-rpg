import gorm.Game;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Copyright Gormleikr 2022");
            System.out.println("Loading...");
            Scanner scan = new Scanner(System.in);
            Game game = new Game(scan);
            game.mainMenu();
            scan.close();


    }
}