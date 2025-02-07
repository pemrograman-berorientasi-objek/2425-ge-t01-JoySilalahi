package fintech.model;

// Joy Silalahi - 12S23007
// Rachel Simorangkir - 12S23020

public class Transaction {
    private static int counter = 1; // ID transaksi otomatis
    private int id;
    private String accountname;
    private double amount;
    private String postedAt;
    private String note;
    private double balance;

    public Transaction(String _accountname, double _amount, String _postedAt, String _note, double balance) {
        this.id = counter++;
        this.accountname = _accountname;
        this.amount = _amount;
        this.postedAt = _postedAt;
        this.note = _note;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccountname() {
        return accountname;
    }

    public double getAmount() {
        return amount;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return id + "|" + accountname + "|" + amount + "|" + postedAt + "|" + note + "|" + this.balance;
    }
}