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
      	jane.buySnacks(pretzel.getCost(), 1);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());
      	pretzel.snacksBought(1);
      	System.out.println("Quantity of snack 3" + pretzel.getQuantity());

      	// Customer 2 (Bob) buys 2 of snack 4 (Soda).
      	bob.buySnacks(soda.getCost(), 2);
      	System.out.println("Customer 2 cash on hand" + bob.getCashOnHand());
      	soda.snacksBought(2);
      	System.out.println("Quantity of snack 4" + soda.getQuantity());

      	// Customer 1 (Jane) finds $10.
      	jane.findCash(10.00);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());

      	// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
      	jane.buySnacks(chocolateBar.getCost(), 1);
      	System.out.println("Customer 1 cash on hand" + jane.getCashOnHand());
      	chocolateBar.snacksBought(1);
      	System.out.println("Quantity of snack 2" + chocolateBar.getQuantity());

      	// Add 12 more items to snack 3 (Pretzel).
      	pretzel.addSnacks(12);
      	System.out.println("Quantity of snack 3" + pretzel.getQuantity());

      	// Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
      	bob.buySnacks(pretzel.getCost(), 3);
      	System.out.println("Customer 2 cash on hand" + bob.getCashOnHand());
      	pretzel.snacksBought(3);
      	System.out.println("Quantity of snack 3" + pretzel.getQuantity());


      	// STRETCH
      	// Display each snack

      	// Chips
      	System.out.println("Snack: " + chips.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + chips.getQuantity());
       	System.out.println("Total Cost: $" + chips.totalCost(chips.getQuantity()));
     
       	//Choolate Bar
       	System.out.println("Snack: " + chocolateBar.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + chocolateBar.getQuantity());
       	System.out.println("Total Cost: $" + chocolateBar.totalCost(chocolateBar.getQuantity()));

       	//Pretzel
       	System.out.println("Snack: " + pretzel.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + pretzel.getQuantity());
       	System.out.println("Total Cost: $" + pretzel.totalCost(pretzel.getQuantity()));

       	//Soda
       	System.out.println("Snack: " + soda.getName());
      	System.out.println("Vending Machine: " + drink.getName() );
       	System.out.println("Quantity: " + soda.getQuantity());
       	System.out.println("Total Cost: $" + soda.totalCost(soda.getQuantity()));

       	//Water
       	System.out.println("Snack: " + water.getName());
      	System.out.println("Vending Machine: " + drink.getName() );
       	System.out.println("Quantity: " + water.getQuantity());
       	System.out.println("Total Cost: $" + water.totalCost(water.getQuantity()));
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}