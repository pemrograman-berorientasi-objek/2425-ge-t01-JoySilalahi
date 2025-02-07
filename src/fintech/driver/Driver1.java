package fintech.driver;
// Joy Silalahi - 12S23007
// Rachel Simorangkir - 12S23020

import java.util.Scanner;

import fintech.model.Account;

public class Driver1 {

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        if (command.equals("create-account")) {
            Account account = new Account(owner, accountName);

            System.out.println(account.createaccount());
        } 

        scanner.close();
    }
}
    