package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Maya", 1500.76, 173148932);
        BankAccount account2 = new BankAccount("Kaylum", 100000000, 2341234);
        /* State of account1:
           account holder: "maya"
           accountbalance: 1500,76
           accountnumber: 173148932
         */

         account1.deposit(2);
        /* State of account1:
           account holder: "maya"
           accountbalance: 1502,76
           accountnumber: 173148932
         */

    }
}
