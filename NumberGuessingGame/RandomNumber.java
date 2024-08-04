package NumberGuessingGame;
import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    private static final int min_num=1;
    private static final int max_num=100;
    private static final int MAX_Attempts=5;
    private static final int MAX_Rounds=2;
    public static void main(String args[]){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int totalScore=0;

        System.out.println("\n** NUMBER GUESSING GAME **\n");
        System.out.println("You have to guess the number in 3 Rounds");
        System.out.println("Maximum nuber of attempts for each round are : 5");
        System.out.println("Let's start the Game !!");
        for(int i=1;i<=MAX_Rounds;i++)
        {
            int number=random.nextInt(max_num)+min_num;
            int attempts=0;
            System.out.printf("\nRound %d : Guess any number between %d and %d in %d attempts.\n",i,min_num,max_num,MAX_Attempts);

            while(attempts < MAX_Attempts){
                System.out.println("\nEnter ur Guess number :");
                int guess=sc.nextInt();
                attempts=attempts+1;
                if(guess == number){
                    int score=MAX_Attempts-attempts;
                    totalScore=totalScore+score;
                    System.out.printf("Congrats !! You guessed it right !!   Attempts = %d. Round Score = %d\n",attempts,score);
                    break;
                }
                else if(guess < number){
                    System.out.printf("The number is greater than %d. Attempts left = %d",guess,MAX_Attempts-attempts);
                }
                else{
                    System.out.printf("The number is lesser than %d. Attempts left = %d",guess,MAX_Attempts-attempts);
                }
            }
            if(attempts == MAX_Attempts){
                System.out.printf("\nRounds = %d \n",i);
                System.out.println("\nAttempts Left = 0\n");
                System.out.printf("The Random Number Generated is = %d\n",number);
            }
        }
        System.out.printf("\n\nGAME OVER. YOUR TOTAL SCORE IS = %d\n",totalScore);
        System.out.println("\nTHANK YOU FOR PLAYING\n");
        sc.close();
    }
}
