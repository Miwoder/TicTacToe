import Game.TicTacToeMultiplayer;
import Game.TicTacToeSingleplayer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! \n Choose game mode: \n 1) Singleplayer (with computer) \n 2) Multiplayer");
        int variant = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                variant = scanner.nextInt();
                if(variant==1 || variant ==2){
                    break;
                }
                else{
                    System.out.println("Please enter 1 or 2");
                }
            } catch (Exception e) {
                System.out.println("Please enter the number");
                scanner.nextLine();
            }
        }


        switch (variant) {
            case 1:
                System.out.println("Game mode - singleplayer");
                TicTacToeSingleplayer singleplayer = new TicTacToeSingleplayer();
                break;
            case 2:
                System.out.println("Game mode - multiplayer");
                TicTacToeMultiplayer multiplayer = new TicTacToeMultiplayer();
                multiplayer.drawField(multiplayer.getField());

                break;
            default:
                System.out.println("Please, select 1 or 2");
                break;
            }

    }
}
