public class Main {
    public static void main(String args[]){
        PersonalAccount Account = new PersonalAccount(12345, "Feruz");
        Account.deposit(4200);
        Account.withdraw(250.50);
        System.out.println(Account.getBalance());
        Account.printTransactionHistory();
    }
}
