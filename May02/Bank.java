package May02;

public class Bank {
    String custumerName;
    int bankBalance;
    public Bank(String custumerName, int bankBalance){
        this.bankBalance = bankBalance;
        this.custumerName = custumerName;}
public void print(){
    System.out.println(bankBalance + " is the balance in " + custumerName + " account");
    }

    }

