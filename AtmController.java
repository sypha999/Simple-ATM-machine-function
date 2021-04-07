import java.util.*;
import java.security.*;

public class AtmController {

    public static void main (String args[])
    {

int max=999999999;
//assigning max value for a random selection

Scanner take = new Scanner(System.in);
//assigns take to class Scanner

SecureRandom rand = new SecureRandom();
//assigns rand to class Random

Atm def = new Atm ("Good Nigerian Citezen", 10000.000);
// assigning default values to previously constructed instant variables in Atm.java

int rando=rand.nextInt(max);
//getting a random account number

def.setaccountNumber(rando);
//assigning the random account number to method setaccountNumber

System.out.print("**************************\n**************************\n**************************\n**************************\n**************************\n");

System.out.println("Welcome to Sypha Bank");

System.out.println("Please tell me your name");

String realname=take.nextLine();// getting name of user

def.setName(realname);
//setting realname to method setName

System.out.printf(
    
"Dear %s your account number is %d and it has been credited with $1000",

 def.getname(),def.getaccountNumber());

System.out.print("\n**************************\n**************************\n**************************\n**************************\n**************************\n");

System.out.println("How much would you want to withdraw?");

def.setBalance(1000);

int withdraw=take.nextInt();

if (withdraw<=1000 && withdraw>0)
{
double remBal=def.getbalance()-withdraw;

System.out.printf("Dear %s your balance is %f", def.getname(),remBal);

System.out.print("\nThank you for banking with us");
}
else {System.out.println("It's either you have an Insufficient balance or you entered an invalid number ");}


}
    
}
