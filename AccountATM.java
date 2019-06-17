import java.util.Scanner;
class Account{
	String name ;
	double balance;
	int password;
	double Deposit;

Scanner scanner = new Scanner( System.in );





public void password(){
	System.out.println("Enter your password");
	int pass= scanner.nextInt();

}

public static void main ( String [] args){
			int pass= scanner.nextInt();
            int p=scanner.nextInt();
		password();
		name();
		
		int p =123456;
		
		
		if (pass==p){
			System.out.println("Welcome to your bank account");
		}

		double balance=50.00;
		System.out.println ( " your balance is :$ "+balance );
		System.out.println("press 1 to Withdraw,  2 to Deposit, 3 checkBalance");
		int trans = scanner.nextInt();
		if (trans == 1){
			Withdrawal myObj = new Withdrawal();
			myObj.Withdrawal();
		}
		else if(trans==2){
		
			Deposit myObj = new Deposit();
			
		}

		else{
			checkBalance myObj = new checkBalance();
			myObj.checkBalance();
		}


	




public void Withdrawal(){
	System.out.println("Please enter the amount to withdraw below");
	double withdrawnAmount=scanner.nextDouble();
	if(withdrawnAmount>balance){
	System.out.println("you do not have enough balance to withdraw this amount");
	}
	else {
	System.out.println("The amount you have withdrawn is :$" + withdrawnAmount);
	double newbalance=balance-withdrawnAmount;
    System.out.println("your new balance is:$"+ newbalance);
	}
}
}


	



public class Deposit{
		double depositAmount;

public void deposit(){
System.out.println ( " Please Enter amount deposited below : " ) ;
double depositedAmount = scanner.nextDouble() ;
System.out.println("the amount deposited is : $ "+depositedAmount);
double newbalance = balance + depositedAmount ;
System.out.println("your new balance is:$"+newbalance);
	}
}

public class checkBalance{
	double newbalance=0;
	double withdrawalAmount;
	public void checkBalance(){
		System.out.println("your balance is"+ newbalance);
		double dep;
				int trans = scanner.nextInt();

		if (trans==1){
				double withdrawnAmount=scanner.nextDouble();

			dep = newbalance - withdrawnAmount;
			System.out.println("your current balance is: "+ dep);
		}
		else {
			double depositedAmount = scanner.nextDouble() ;

			dep = newbalance + depositedAmount;
			System.out.println("your current balance is:"+ dep);
		}
	}
}
}
	
	
	
