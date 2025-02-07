package fintech.model;

// Joy Silalahi - 12S23007
// Rachel Simorangkir - 12S23020

public class Account {
    private String owner;
    private String accountName;
    private double balance;

public Account (String owner, String accountName){
    this.owner = owner;
    this.accountName = accountName;
    this.balance = 0.0;
}

public String getOwner(){
    return owner;
}
public String getAccountName(){
    return accountName;
}
public double balance(){
    return balance;
}
public String createaccount(){
    return accountName + "|" + owner + "|" + balance;
}
}