public class BankAccount {
    protected int balance;
    public int deposit(int amount){
        this.balance=balance + amount;
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    private int minBalance;
   public SavingsAccount(){
    this.balance=25000;
    this.minBalance=5000;
   }
    public int withdraw(int amount){
        if(balance-minBalance<=amount){
            balance-=amount;
        }
        return balance;
    }
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        System.out.print( obj.deposit(100000)+" ");
        SavingsAccount obj1=new SavingsAccount();
        System.out.println(obj1.deposit(100000)+" "+ obj1.withdraw(50000));
    }
}

