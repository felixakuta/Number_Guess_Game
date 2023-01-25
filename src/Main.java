import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //I set a truthy condition to repeat the game using while loop
        boolean playAgain = true;
        while (playAgain == true) {
            System.out.println("What number do you choose?");
            //I created a variable and assigned a value where the computer picks a random number between 0 and 100 to it
            int computerNumber = (int) (Math.random() * 101);
            //Here I created a variable to collect input from the user
            Scanner user = new Scanner(System.in);
            int userInput = user.nextInt();
            System.out.println("Computer picked " + computerNumber + " while you picked " + userInput);
//Below, I set a condition for the computer and user, and gave response based on the matching
// or not matching numbers by both the user and the computer

            if (computerNumber == userInput) {
                System.out.println("Hurray you guessed right as the computer guessed " + computerNumber);
            } else if (computerNumber > userInput) {
                System.out.println("Too low");
            } else if (computerNumber < userInput) {
                System.out.println("Too high");
            } else {
                System.out.println("Try again");
            }
            //I created another input variable to enable the user have the option to play again
            System.out.println("Do you wish to play again? if yes select 1 if no select 2");
        int userInput1 = user.nextInt();
        if (userInput1 == 1){
            playAgain = true;
        }
        else if (userInput1 == 2){
            playAgain = false;
        }

        }

    }
}