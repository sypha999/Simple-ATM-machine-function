

public class Atm {

private String name;

private int accountNumber;

private double balance;



public Atm(String name, double balance)

//a constructor to set default values for the instant variables

{

this.name=name;

this.balance=balance;
}



public void setName (String name) {
    
    this.name=name;}

public void setBalance(double balance)
{
  this.balance=balance  ;
}
public void setaccountNumber(int accountNumber) {  

    this.accountNumber=accountNumber;
}

public String getname(){
    return name; // returns name

}

public double getbalance()
{
    return balance; //returns balance
}

public int getaccountNumber(){

 return accountNumber; // returns accountNumber  
}

}