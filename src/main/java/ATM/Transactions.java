package ATM;

import java.util.Date;

/**
 * Created by jaymilnamow on 5/22/16.
 */
public class Transactions {

    public static int financialTransactionNumber;
    public String activityDate;

    public String recordDeposit(double amount){

        financialTransactionNumber++;
        String transactionType = "deposit";
        activityDate = (new Date().toString());
        return "Transaction#: " + financialTransactionNumber +", Date: " + activityDate +  ", " + transactionType + " , Amount: " + amount;
    }

    public String recordWithdrawal(double amount){

        financialTransactionNumber++;
        String transactionType = "withdrawal";
        activityDate = (new Date().toString());
        return "Transaction#: " + financialTransactionNumber +", Date: " + activityDate +  ", " + transactionType + " , Amount: " + amount;
    }

    public String recordTransfer(double amount){

        financialTransactionNumber++;
        String transactionType = "transfer";
        activityDate = (new Date().toString());
        return "Transaction#: " + financialTransactionNumber +", Date: " + activityDate +  ", " + transactionType + " , Amount: " + amount;
    }
}
