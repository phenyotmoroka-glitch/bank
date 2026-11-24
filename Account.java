public class Account {




//TRANSACTIONS deposit, withdrawal le transfer
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
			
		

public void acInfo(){  //
 
System.out.println(name + " account: P" + balance);

}


}






