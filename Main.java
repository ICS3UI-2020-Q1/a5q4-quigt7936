import java.util.Scanner;
/**
 * Gives the user the total amount of money in an investing account
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    // ask the user the balance, interest and years
    System.out.println("Please enter a starting balance");
    double balance = input.nextDouble();
    
    System.out.println("Please enter your interest rate");
    double interest = input.nextDouble();
    
    System.out.println("Please enter the number of years you will invest for");
    double years = input.nextDouble();

    // a for while loop that repeats as many years as given
    for (int i = 0; i < years; i++) {
      // finds the new balance 
      // the interest is / 100 because the interest was in percent form not double form
      balance = balance + balance * (interest / 100);
    }
    // tells the user their new balance
    System.out.println("Your final balance would be $" + balance);
  }
}
