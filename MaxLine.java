/*
 task 1
 author: Toot Egozy
 id: 313384612
  
 a program to find the longest line between 3 points on the plane.
 the program calculates the distances between the 3 points, 
 and prints the 2 points which make the longest line.
*/

import java.util.Scanner;
public class MaxLine {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        // scan user input 3 times to get the x, y values of each point.
        System.out.println("Enter first point coordinates:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println ("Enter second point coordinates:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println ("Enter third point coordinates:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        
        // calculate the distancnces between the 3 points and assign it to variables.
        double distAtoB = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 
        double distBtoC = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double distCtoA = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        
        /* compare two of the distances, 
         then compare the longer or equal one to the third distance 
         then print the longest (or equal) of the three. */
          
        // compare dist AB to BC
        if (distAtoB >= distBtoC) {  // if AB is longer or equal 
            // compare dist AB to CA
            if (distAtoB >= distCtoA) { // if AB is longer or equal
                System.out.println("Max line created by the following points: " +
                "(" + x1 +","+ y1 +"), ("+ x2 +","+ y2 +").");
            } else { // if CA is longer
                System.out.println("Max line created by the following points: " +
                "("+ x3 +","+ y3 +"), ("+ x1 +","+ y1 +").");
            }
        } else { // if dist BC is longer
            // compare dist BC and CA
            if (distBtoC >= distCtoA) { // if BC is longer or equal
                System.out.println("Max line created by the following points: " +
                "("+ x2 +","+ y2 +"), ("+ x3 +","+ y3 +").");
           } else { // if CA is longer
                System.out.println("Max line created by the following points: " +
                "("+ x3 +","+ y3 +"), ("+ x1 +","+ y1 +").");
           }
        }
    } // end of method main
} //end of class MaxLine 