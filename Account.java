public class Account {


private String name;
private double withdraw;

private String surname;
private String address;
private String email;
private  String id;
private int phoneNo;                      //username and password?

//so far i cant figure out the parameters. withdraw and deposit dont need settersby what i see. idk. nothing does
//ive decided to add name as an account field
Account(String name){  this.name = name; this.balance = 0;  }

Account(String name, double balance){ this.name = name; this.balance = balance;  }


//TRANSACTIONS ke deposit, withdrawal and transfer
	public boolean deposit(double deposit)
	{
		if (deposit > 0)
		           {
			        balance += deposit;   //cant believe i remeber that
									// i didnt. its +=
					return true;	  
		} else { balance = balance; return false;}
			
	}

	public boolean withdraw(double withdraw)
	{
		if (balance >= withdraw && withdraw > 0)
		{
					balance -= withdraw;   //logical errors be the worst.
					return true;
	   } else {   balance = balance; return false;}
	}

		
			public double getBalance(){return balance;}
			
			public String getName(){return name;}

public void acInfo(){  //
 
System.out.println(name + " account: P" + balance);

}


}






