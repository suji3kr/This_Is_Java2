package ch11.sec06;

public class Account {

    private long balance;

    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;

    }

    public void withdraw (int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("Atm 잔고가 부족: " + (money-balance)+ "모자랍니다. ");
        }
        balance -= money;
    }
}
