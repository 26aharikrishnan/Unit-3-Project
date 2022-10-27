import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        //declare variables
    
        Account acc1 = new Account(120.00,"Adhvik");
        Account acc2 = new Account(24.00,"Vivan");
        Account current;

        System.out.println("What is your name? ");
      //initialize scanner
        Scanner input = new Scanner(System.in);
      //set account name
         String accountName = input.nextLine();

         if(acc1.authenticate(accountName)){
             current = acc1;
         }
         else if(acc2.authenticate(accountName)){
             current = acc2;
         }
         else{
             System.out.println("You do not have an account with this bank.");
             return;
         }

            String choice = "";
      
          //while true to make sure the program runs until they don't want to use it.
            while (!choice.equals ("q")){
               System.out.println("Would you like to add, withdraw, check your balance, or quit the program. Please respond with either a, w, b, or q. ");
                choice = input.nextLine().toLowerCase();  
          //Adding balance  
          
                if (choice.equals("a"))
                {
                    System.out.println("How much money would you like to add? ");
                    double dollars = input.nextDouble();
                    current.addMoney(dollars);
                    System.out.println(current);
                }
            //Withdrawing balance
                else if (choice.equals("w"))
                {
                    System.out.println("How much money would you like to withdraw? ");
                    amountSubtracted = input.nextDouble();
                    roundedAmountSubtracted = Math.round((amountSubtracted*100.0)/100.0);
                    yourBankAccount.subtractMoney(roundedMoney, roundedAmountSubtracted);
                    System.out.println(yourBankAccount);
                }
            //Showing Account Details
                else if (choice.equals("b"))
                {
                    System.out.println(yourBankAccount.showAccountDetails());
                }
            //Quits The Program
                else if (choice.equals("q")){
                System.out.println("Please restart the program");
                return;
                }
          }
        }
          
      // if they want a random Account Balance
        else if (inputAccountBalance.contains ("n"))
        {

      //create a new, empty account so I can use my randomMoney method ;)
            Account nothing = new Account(0, "0");
            accountMoney = nothing.randomMoney();
            roundedMoney = (Math.round(accountMoney*100.0)/100.0);
            Account yourBankAccount = new Account(roundedMoney, AccountName);
      //Print out the random value with its account name
            System.out.println(yourBankAccount);
          // runs loop infinitely
            while (!choice.equals("q")){
      //Ask them to choose
                System.out.println("Would you like to add, withdraw, or check your balance. Please respond with either a, w, b, or q ");
                choice = input.nextLine();
        //Adding balance
                if (choice.equals("a"))
                {
                    System.out.println("How much money would you like to add? ");
                    amountAdded = input.nextDouble();
                    roundedAmountAdded = (Math.round(amountAdded*100.0)/100.0);
                    yourBankAccount.addMoney(roundedMoney, roundedAmountAdded);
                    System.out.println(yourBankAccount);
                }
        //Withdrawing balance
                else if (choice.equals("w"))
                {
                    System.out.println("How much money would you like to withdraw? ");
                    amountSubtracted = input.nextDouble();
                    roundedAmountSubtracted = (Math.round(amountSubtracted*100.0)/100.0);
                    yourBankAccount.subtractMoney(roundedMoney, roundedAmountSubtracted);
                    System.out.println(yourBankAccount);
                }
        // Printing Account Details
                else if (choice.equals("b"))
                {
                System.out.println(yourBankAccount.showAccountDetails());
                }

        //Quits the program
                else if (choice.equals("q"))
                {
                System.out.println("Thank you, goodbye!");
                return;
                }
            }

        }
      //if they decide to break the program
      else 
        {
         System.out.println("Logic error, please rerun the program and put y,yes, n or no.");
        }
    }

}

