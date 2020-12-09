/* Author: Harry Pinkerton
   File: YourGuess.java
   Project 1
   
   The user thinks of a number between 1 and 100, the computer displays the guesses,
   and the user respond with the clues. The computer should be able to guess the
   correct number in no more than 7 attempts. If the user cheats,
   the computer quits with an error message.

*/

import java.util.Scanner;

public class YourGuess {                         
   public static void main (String [] args){
   Scanner scnr = new Scanner(System.in);  // initialize scanner
   int compnumber; 
   int lowerbound = 0;                     // Lower bound for the comp guess
   int upperbound = 100;                   // Upper bound for the comp guess
   int counter = 0;                        // Keeps track of the number of guesses
   String userhint;                        // stores the string for the hint
   boolean loop;                           // Will always remain true until break
   
   while (loop = true){
   counter ++;  // Increments counter
   compnumber = (lowerbound + upperbound)/ 2; // binary search guessing
   System.out.println("Is this your number " + compnumber);
   System.out.println("Enter your hint, smaller, larger, or correct: ");
   userhint = scnr.next();
   
   // If the Guess is too small, the next guess needs to be larger
   if (userhint.equals("larger")){
    counter ++;
    lowerbound = compnumber;
   }
   // If the Guess is too large, the next guess needs to be smaller
   else if (userhint.equals("smaller")){
    counter ++;
    upperbound = compnumber; 
   }
   
   // Displays a congratulations message if the guess is correct
   else if (userhint.equals("correct")){
    System.out.println("Yay I got it in " + counter + " tries!");
    break;
   }
   
   // If the computer runs out of guesses issue an error message.
   else if (counter >= 7){
    System.out.println("You Cheated!");
    break; 
   }
   }
   }
   }

