/* Author: Harry Pinkerton
   File: MyGuess.java
   Project 1
   
   This program plays a guessing game with the user - where the computer generates a
   number between 1 and 100 for the user to guess within 7 attempts
   (This is due to binary search). When the user correctly guesses the number,
   the program displays the correct guess. However, if the user exceeds
   7 attempts the program will quit.
*/

import java.util.Scanner;
import java.util.Random;

public class MyGuess {                         
   public static void main (String [] args) {
   Scanner scnr = new Scanner(System.in); // initialize scanner
   Random randGen = new Random();         // random number generator
   int compguess;                         //the computer's generated number  
   int userguess;                         // User's guess
   int counter = 0;                       // Keeps track of number of guesses
   
   
   //Computer randomly generates a number between 1 and 100
   compguess = randGen.nextInt(100) + 1;
   
   // Computer determines if the guess is too large, too small, or correct
   while(counter < 7){
   
   //User guesses a number
   counter ++; // Computer increments counter
   System.out.print("Enter a guess between 1-100: ");
   userguess = scnr.nextInt();
   
   //tells the user the guess was too large
   if (userguess > compguess){
      System.out.println("Too Large");
      
    // if the user makes 7 attempts, the computer prints a "you lose" statement  
      if (counter >= 7){
    System.out.println("Too many attempts. You Lose!");
    break;
   }
   }
   
   //tells the user the guess was too small
   else if (userguess < compguess){
      System.out.println("Too small");
     
     // if the user makes 7 attempts, the computer prints a "you lose" statement  
      if (counter >= 7){
    System.out.println("Too many attempts. You Lose!");
    break;
   }
   }

   //tells the user the guess was correct
   else if (userguess == compguess) {
      System.out.println("Correct!");
      break;
   }
   }
   }
   }

   