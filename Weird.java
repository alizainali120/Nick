import java.util.Scanner;

public class Weird 
{
  public static void main(String[] args) 
  {
    System.out.println("I've chosen a number bewteen 0 & 100, can you guess what it is? Enter your guess now!");
    Scanner keys = new Scanner(System.in);
    int guess = keys.nextInt();  
    int randomNumber = (int) (Math.random() * 101);
    while (guess != randomNumber)
    {
      if (guess > randomNumber)
      {
        System.out.println("too high! Guess Again!");
        System.out.println("Please try again");

      }
      else
      {
        System.out.println("Too Low! Try Again!");
      }
      guess = keys.nextInt();
    }                   
    if (guess == randomNumber)
    {
      System.out.println("You guessed it! Nice game!");
    }
    keys.close();
  }
}
