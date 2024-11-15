/* 
 task 1
 author: Toot Egozy
 id: 313384612
  
 a program which allows the user to play rock-paper-scissors.
 the user picks their roles and the program calculates and prints out who won.
*/


import java.util.Scanner;

public class Game {
    public static void main (String [] args) {
        // scan twice to get players 1 and player 2 choices.
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first player's object:");
        char player1 = scan.next().charAt(0);
        System.out.println("Enter second player's object:");
        char player2 = scan.next().charAt(0);
        
        /* assign the ASCII characters to integers.
         the key is:
         R: 82
         P: 80
         S: 83
        */        
        int player1num = player1;
        int player2num = player2;
        
        /* compare the integers to determinate which player wins.
         firstly check for a tie. 
         if it's not a tie, check case by case using a switch statment on player 1 choice.
         */
               
        if (player1num == player2num) { 
            System.out.println("Game ends with a tie.");
        } else { 
            switch (player1num) {
                case 82: // player 1 got rock
                    if (player2num == 83) { // if player 2 got scissors
                        System.out.println("Player 1 wins.");
                    } else { // player 2 got paper
                        System.out.println("Player 2 wins.");
                    }
                    break;
                case 80: // player 1 got paper
                    if (player2num == 82) { // if player 2 got rock
                        System.out.println("Player 1 wins.");
                    } else { // player 2 got scissors
                        System.out.println("Player 2 wins.");
                    }
                    break;
                case 83: // player 1 got scissors
                    if (player2num == 80) { // if player 2 got paper
                        System.out.println("Player 1 wins.");
                    } else { // player 2 got rock
                        System.out.println("Player 2 wins.");
                    }
                    break;
            }
        }
    }
}