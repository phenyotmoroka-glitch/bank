public class Cheque_Account extends Account{
	private String name = "Cheque"
private String id;
private static int counter = 0;


Cheque_Account(){


	counter++;
	this.id = "CHQ" + counter;
}


}