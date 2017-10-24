//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {

        /**
         * Checkings enum variable.
         */
        CHECKINGS,

        /**
         * Savings enum variable.
         */
        SAVINGS,

        /**
         * Student enum variable.
         */
        STUDENT,

        /**
         * Workplace enum variable.
         */
        WORKPLACE
    }

    /**
     * AccountNumber variable holding the account number of each bank account.
     */
    private int accountNumber;

    /**
     * AccountType variable holding the account type of each bank account.
     */
    private BankAccountType accountType;

    /**
     * AccountBalance variable holding the account balance of each bank account.
     */
    private double accountBalance;

    /**
     * ownerName variable holding the owner's name of each bank account.
     */
    private String ownerName;

    /**
     * interestRate variable holding the interest Rate of each bank account.
     */
    private double interestRate;

    /**
     * interestEarend variable holding the interest Earned of each bank account.
     */
    private double interestEarned;

    /**
     * val1 variable.
     */
    private final int val1 = 40000;

    /**
     * val2 variable.
     */
    private final double val2 = 40.4;

    /**
     * val3 variable.
     */
    private final double val3 = 100.54;

    /**
     * AccountNumber variable holding the account number of each bank account.
     *
     * @param name - Holds the name of the bank account.
     * @param accountCategory - Holding category of each account Category.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        interestRate = val1;
        interestEarned = val2;
        accountBalance = val3;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * accountNumber getter.
     * @return integer accountNumber.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * AccountNumber setter.
     * @param aN - Passed in parameter.
     */
    public void setAccountNumber(final int aN) {
        this.accountNumber = aN;
    }

    /**
     * accountType getter.
     * @return BankAccountType variable.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * accountType setter.
     * @param aT - Passed in parameter.
     */
    public void setAccountType(final BankAccountType aT) {
        this.accountType = aT;
    }

    /**
     * accountBalance getter.
     * @return double variable.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * accountBalance setter.
     * @param aB - Passed in parameter.
     */
    public void setAccountBalance(final double aB) {
        this.accountBalance = aB;
    }

    /**
     * ownerName getter.
     * @return String variable.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * ownerName setter.
     * @param oN - Passed in parameter.
     */
    public void setOwnerName(final String oN) {
        this.ownerName = oN;
    }

    /**
     * interestRate getter.
     * @return double variable.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * interestRate setter.
     * @param iR - Passed in parameter.
     */
    public void setInterestRate(final double iR) {
        this.interestRate = iR;
    }

    /**
     * interestEarned getter.
     * @return double variable.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * interestEarned setter.
     * @param iE - Passed in parameter.
     */
    public void setInterestEarned(final double iE) {
        this.interestEarned = iE;
    }
}
