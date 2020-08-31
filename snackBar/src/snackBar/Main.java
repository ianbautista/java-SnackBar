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
      	Snack water = new Snack("water", 20, 2.75, drink.getId());

      	// Processing
      	// Customer 1 (Jane) buys 3 of snack 4 (Soda).
      	jane.buySnacks(soda.getCost(), 3);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());
      	soda.snacksBought(3);
      	System.out.println("Quantity of snack 4" + soda.getQuantity());

      	// Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
      	jane.buySnacks(pretzel.getCost(), 3);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());
      	pretzel.snacksBought(3);
      	System.out.println("Quantity of snack 3" + pretzel.getQuantity());

      	// Customer 2 (Bob) buys 2 of snack 4 (Soda).
      	bob.buySnacks(soda.getCost(), 3);
      	System.out.println("Customer 1 cash on hand" + bob.getCashOnHand());
      	soda.snacksBought(3);
      	System.out.println("Quantity of snack 4" + soda.getQuantity());

      	// Customer 1 (Jane) finds $10.
      	jane.findCash(10.00);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());


	}

	public static void main(String[] args)
	{
		workWithData();
	}
}