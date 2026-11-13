public class Account {




                   //username and password?


Account(String name){  this.name = name; this.balance = 0;  }

Account(String name, double balance){ this.name = name; this.balance = balance;  }


//TRANSACTIONS ke deposit, withdrawal le transfer
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






