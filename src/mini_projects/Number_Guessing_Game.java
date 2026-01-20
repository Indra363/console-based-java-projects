package mini_projects;
import java.util.*;
public class Number_Guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create scanner for user input and random number generator
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();//their is a random class into java.util package
        
        // Generate a random number between 1 and 100
        int SecretNum = r1.nextInt(100)+1;//random.nextInt(100) means 0-99
        int guess;
        int attempts = 0;
        
        
        System.out.println("Welcome to the number guessing game!!");
        System.out.println("I am thinking of a number between 1 and 100");
        
        //loop until you guess the right number
        do{
            System.out.println("Enter your guessed number");
            guess = sc.nextInt();
            attempts++;
            
            //check if it matches the secret number
            if(guess < SecretNum){
                System.out.println("Too low,try guessing a bigger number!!");
            }else if(guess > SecretNum){
                     System.out.println("Too high,try guessing a smaller number!!");
                }else{
                    System.out.println("Congratulation you guessed the number in "+attempts+" tries");
                }
            
        }while(guess != SecretNum);

	}

}
