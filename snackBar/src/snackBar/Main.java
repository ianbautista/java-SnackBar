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

		// Instantiate 2 customers
		Customer jane = new Customer("Jane", 45.25);
      	Customer bob = new Customer("Bob", 33.14); 

      	// Instantiate 3 Vending Machines
      	VendingMachine food = new VendingMachine("Food");
      	VendingMachine drink = new VendingMachine("Drink");
      	VendingMachine office = new VendingMachine("Office");

      	// Instantiate 5 snacks
      	// (String name, int quantity, double cost, int vendingMachineId)
      	// In Vending Machine Food
      	Snack chips = new Snack("Chips", 36, 1.75, food.getId());
      	Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
      	Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

      	// In Vending Machine Drink
      	Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}