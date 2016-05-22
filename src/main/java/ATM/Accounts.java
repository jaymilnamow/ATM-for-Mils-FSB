package ATM;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jaymilnamow on 5/19/16.
 */
public class Accounts {

    private double accountBalance;
    private String accountStatus = "open";
    private String name;
    private static int accountNumberGenerator = 1000000;
    private int accountNumber;
    private double interestRate;
    private String status;


    public Transactions transactions = new Transactions();

    public ArrayList<String> transactionHistory = new ArrayList<String>();

    Accounts(String accoutHolderName){
        accountNumberGenerator++;
        accountNumber = accountNumberGenerator;
        name = accoutHolderName;
        accountBalance = 50.00;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }









}


