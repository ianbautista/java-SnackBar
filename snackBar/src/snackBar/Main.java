package snackBar;

/*
Snack
VendingMachine
Customer
*/ 

public class Main
{
	private static void workWithData()
	{
		System.out.println("Snack Bar!")

		//Instantiate 2 customers
		Customer jane = new Customer("Jane", 45.25);
      	Customer bob = new Customer("Bob", 33.14); 

      	//Instantiate 3 Vending Machines
      	VendingMachine food = new VendingMachine("Food");
      	VendingMachine drink = new VendingMachine("Drink");
      	VendingMachine office = new VendingMachine("Office");
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}