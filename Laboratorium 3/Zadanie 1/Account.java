/*
Wykonawcy:  Wojciech Lilla
            Aleksander Ostasz

Tytul: konstruktory UML -Account
 */
    public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name){
        this.id=id;
        this.id=id;
    }

    public Account(String id, String name, int balance){
        this.id=id;
        this.id=id;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance=amount+balance;
        return balance;
    }

    public int debit(int amount){
        if (amount<=balance) balance=balance-amount;
        else System.out.println("Amount exceeded balance");
        return balance;
    }


    public int transfer(int Account, int amount){
        if (amount<=balance) balance=amount;
        else System.out.println("Amount exceeded balance");
        return balance;
    }

    public String toString() {
        return "Account [id="+id+", name="+name+", balance="+balance;
    }
}
