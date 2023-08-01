import java.util.Scanner;
    public class account_system extends account {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);     // input scanner to the class
    
            // declare and initialize variable
            String name;
            float currentBalance;
            float deposit;
            float withdrawal;
            int option;
    
            System.out.println("Please enter your account name: ");         // prompt name of the user
            name = userInput.nextLine();                                    // taking input in
    
            System.out.println("Please enter your account balance: ");      // prompt current balance of the user
            currentBalance = userInput.nextFloat();                         // taking input in
    
            while (currentBalance < 0) {                                    // checks if the user entered a valid balance
                System.out.println("Please enter your a valid account balance: ");
                currentBalance = userInput.nextFloat();                     // if the entered balance is valid, then it will exit the loop
            }
    
            printMenu();                              // calls method that will print the menu
            option = userInput.nextInt();             // taking input in
    
            while (option != 99) {                    // condition of the loop
                if (option == 1){                     // if user entered option 1
                    printName(name);                  // method to print user's name
                    printCurrentBalance(currentBalance);       // method to print the current balance
    
                }
                else if (option == 2) {                                                  // if user entered option 2
                    System.out.println("Please enter amount you wish to withdraw: ");
                    withdrawal = userInput.nextFloat();                                  // user will have to input amount of withdrawn money
                    currentBalance = getWithdrawnBalance(currentBalance, withdrawal);    // method to calculate current balance after withdrawal
                    printCurrentBalance(currentBalance);                                 // method to print the current balance
                }
    
                else if (option == 3) {                                             // if user entered option 3
                    System.out.println("Please enter amount you wish to deposit: ");
                    deposit = userInput.nextFloat();                                // the user have to input amount of deposited money
                    currentBalance = getDepositedBalance(currentBalance, deposit);  // calculate user’s current balance after deposit
                    printCurrentBalance(currentBalance);                            // method to print the current balance
    
                }
                else {                                                              // if user enters an invalid option
                    System.out.println("Invalid option! Please choose a valid option");
                }
                printMenu();                                                        // loop back to update user's option
                option = userInput.nextInt();                                       // taking in input
            }
    
            System.out.println("Name: " + getName(name));                           // returns user's name and final balance
            System.out.printf("Final balance: %.2f\n", getCurrentBalance(currentBalance));
    
            System.out.println("Thank you for banking with us!");                   // printed at the end of the program
            
            userInput.close();
        }
    }
    

