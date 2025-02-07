package fintech.driver;
// Joy Silalahi - 12S23007
// Rachel Simorangkir - 12S23020

import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;

public class Driver2 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 1;
            Account account = null;
            String command = scanner.nextLine();
            if (command.equals("create-account")) {
                String owner = scanner.nextLine();
                String accountName = scanner.nextLine();
                account = new Account(owner, accountName);
                System.out.println(account.createaccount());
            } 
            command = scanner.nextLine();
            if(command.equals("create-transaction")){
                String owner = scanner.nextLine();
                Double amount = Double.parseDouble(scanner.nextLine());
                String posted_at = scanner.nextLine();
                String note = scanner.nextLine();
                Double balance = account.getbalance() + amount;
                Transaction trs = new Transaction(owner, amount, posted_at, note, balance);
                System.out.println(trs.toString());
            }

        

        scanner.close();
    }
}
    