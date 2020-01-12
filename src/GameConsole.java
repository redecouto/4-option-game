/*
 * @author Rachel DeCouto
 * @version 01.10.2020
 * 
 */
import java.util.Scanner;
import java.util.Random;
public class GameConsole {
	/**this java program will work as a gaming console that has 4 games on it.
	**Game 1 will be a simple Rock Paper Scissors game
	*Game 2 will be a guessing game
	*Game 3 will be a Simple Shop Program
	*Game 4 will be a Fortune Teller game
	**/

	public static void main(String[] args) {
		//import scanner to read user input
		Scanner in = new Scanner(System.in);
		//import random number generator for games
		 Random rn = new Random();
		//first screen to display on the console
		System.out.println("Welcome!\n \t If you would like to play a game, please choose from the following options:");
		//call main menu method
		MainMenu();
		int usrChoice = in.nextInt();
	 switch (usrChoice) {	 
	 case 1 :
		 //Rock Paper Scissors game 1
		 RockPaperScissors();
		 MainMenu();
		int newChoice= in.nextInt();
		 usrChoice=newChoice;
		break;
	 case 2 :
		 //Guessing Game
		GuessingGame();
		 MainMenu();
		 usrChoice= in.nextInt();
		 break;
	 }
	 }
	
public static void MainMenu() {
	//print the main menu before each choice and after each game is played
	System.out.println(" Game options: \n \t Select 1 for Rock Paper Scissors\n\t Select 2 for a Guessing Game\n\t Select 3 to go Shopping\n\t Select 4 for your Fortune\n\t Select 0 to quit");
	
}
public static void RockPaperScissors() {
	Scanner in = new Scanner(System.in);
	Random rn = new Random();
	System.out.println("Rock, Paper, Scissors! Choose either Rock (1), Paper (2), or Scissors (3)");
	  int UsrRPS = in.nextInt();
	 int CompNum= rn.nextInt(3)+1;
	 System.out.println(CompNum);
	//ifelse block to play game
	 if  (UsrRPS == CompNum) {
		 System.out.println("You tied! Try again");
	 }
	 else {
			 if (CompNum==1) {
		 if (UsrRPS == 2) {
			 System.out.println("Computer Chose Rock, you win! ");}
		 else {
			 System.out.println("Computer Chose Rock, you lose!");}}
	 if (CompNum ==2)  {
		 if (UsrRPS == 3) {
			 System.out.println("Computer Chose Paper, you win! ");}
		 else {
			 System.out.println("Computer Chose Paper, you lose!");}}
	 if(CompNum==3){
		 if (UsrRPS == 1) {
			 System.out.println("Computer Chose Scissors, you win! ");}
		 else {
			 System.out.println("Computer Chose Scissors, you lose!");}}
	 if (0>CompNum || 3<CompNum) {
		 System.out.println("That is not an option");}
	
}}
public static void GuessingGame() {
	Scanner in = new Scanner(System.in);
	Random rn = new Random();
	 System.out.print("Guessing Game!\n"
		 		+ " The Computer will choose a number 1 - 10, and you have to guess what number it chose!\n If you guess right you win!"
		 		+ "\n The computer has chosen its number\n What number do you think it is? \n Guess: ");
			int usrGuess = in.nextInt();
			if (usrGuess>10||usrGuess<1) {
				System.out.println("This is not a valid guess");
			}
			else {
			int rdNum = rn.nextInt(10)+1;
			if (rdNum==usrGuess) {
				System.out.println("You Won! ");
			}
			else {
				System.out.println("The computer guessed "+rdNum+"\nYou Lose!\n");
				}	}
}
}
