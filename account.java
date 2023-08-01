public class account {

        public static void printMenu () {                                     // creating method to print the menu
            String menu;
            menu = "=============================================\n";
            menu += "1. Account Status\n";
            menu += "2. Withdrawal\n";
            menu += "3. Deposit\n";
            menu += "99. Exit\n";
            menu += "==============================================\n";
            System.out.println(menu);
        }

        public static float getCurrentBalance ( float currentBalance){                      // method that returns balance
            return currentBalance;
        }

        public static String getName (String name){                                         // method that returns name
            return name;
        }

        public static float getDepositedBalance ( float currentBalance, float deposit) {    // method to deposit an amount from the balance
            return currentBalance + deposit;
        }

        public static float getWithdrawnBalance ( float currentBalance, float withdrawal) { // method to withdraw an amount from the balance
            return currentBalance - withdrawal;
        }


        public static void printName (String name){                                       // method to print the name
            System.out.printf("Dear, " + name +"\n");
        }

        public static void printCurrentBalance (float currentBalance) {                   // method to print the current balance
            System.out.printf("Your current balance: %.2f\n", currentBalance);
        }

    }

