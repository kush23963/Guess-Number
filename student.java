import java.util.*;
class student
{
Scanner o = new Scanner(System.in);
System.out.println("Enter the withdraw amount");
int balance = 5000;
int withdraw = o.nextInt();
try
{
if(balance<withdraw)
throw new ArthimeticException("Insufficient Balance"); 
balance = balance-withdraw;
System.out.println(balance);
}
catch(ArthimeticException e)
{
System.out.println("Error: "+e.getMessage());
}
System.out.println("Transaction Completed");