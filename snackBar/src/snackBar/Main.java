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
		System.out.println(" ");
		System.out.println("Christian's Snack Bar!");
		System.out.println(" ");

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
      	String dollarAmount1 = String.format("%.2f", jane.getCashOnHand());
		System.out.println("Customer 1 cash on hand $" + dollarAmount1);
      	soda.snacksBought(3);
      	System.out.println("Quantity of snack 4 is " + soda.getQuantity());
      	System.out.println(" ");

      	// Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
      	jane.buySnacks(pretzel.getCost(), 1);
      	String dollarAmount2 = String.format("%.2f", jane.getCashOnHand());
		System.out.println("Customer 1 cash on hand $" + dollarAmount2);
      	pretzel.snacksBought(1);
      	System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());
      	System.out.println(" ");

      	// Customer 2 (Bob) buys 2 of snack 4 (Soda).
      	bob.buySnacks(soda.getCost(), 2);
      	String dollarAmount3 = String.format("%.2f", bob.getCashOnHand());
		System.out.println("Customer 2 cash on hand $" + dollarAmount3);
      	soda.snacksBought(2);
      	System.out.println("Quantity of snack 4 is " + soda.getQuantity());
      	System.out.println(" ");

      	// Customer 1 (Jane) finds $10.
      	jane.findCash(10.00);
      	String dollarAmount4 = String.format("%.2f", jane.getCashOnHand());
		System.out.println("Customer 1 cash on hand $" + dollarAmount4);
      	System.out.println(" ");

      	// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
      	jane.buySnacks(chocolateBar.getCost(), 1);
      	String dollarAmount5 = String.format("%.2f", jane.getCashOnHand());
		System.out.println("Customer 1 cash on hand $" + dollarAmount5);
      	chocolateBar.snacksBought(1);
      	System.out.println("Quantity of snack 2 is " + chocolateBar.getQuantity());
      	System.out.println(" ");

      	// Add 12 more items to snack 3 (Pretzel).
      	pretzel.addSnacks(12);
      	System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());
      	System.out.println(" ");

      	// Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
      	bob.buySnacks(pretzel.getCost(), 3);
      	String dollarAmount6 = String.format("%.2f", bob.getCashOnHand());
		System.out.println("Customer 2 cash on hand $" + dollarAmount6);
      	pretzel.snacksBought(3);
      	System.out.println("Quantity of snack 3 is " + pretzel.getQuantity());
      	System.out.println(" ");

      	// STRETCH
      	System.out.println("Stretch Goals");
      	System.out.println(" ");
      	// Display each snack

      	// Chips
      	System.out.println("Snack: " + chips.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + chips.getQuantity());
       	String dollarAmount7 = String.format("%.2f", chips.totalCost(chips.getQuantity()));
		System.out.println("Total Cost: $" + dollarAmount7);
     	System.out.println(" ");

       	//Choolate Bar
       	System.out.println("Snack: " + chocolateBar.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + chocolateBar.getQuantity());
       	String dollarAmount8 = String.format("%.2f", chocolateBar.totalCost(chocolateBar.getQuantity()));
		System.out.println("Total Cost: $" + dollarAmount8);
       	System.out.println(" ");

       	//Pretzel
       	System.out.println("Snack: " + pretzel.getName());
      	System.out.println("Vending Machine: " + food.getName() );
       	System.out.println("Quantity: " + pretzel.getQuantity());
       	String dollarAmount9 = String.format("%.2f", pretzel.totalCost(pretzel.getQuantity()));
		System.out.println("Total Cost: $" + dollarAmount9);
       	System.out.println(" ");

       	//Soda
       	System.out.println("Snack: " + soda.getName());
      	System.out.println("Vending Machine: " + drink.getName() );
       	System.out.println("Quantity: " + soda.getQuantity());
       	String dollarAmount10 = String.format("%.2f", soda.totalCost(soda.getQuantity()));
		System.out.println("Total Cost: $" + dollarAmount10);
       	System.out.println(" ");

       	//Water
       	System.out.println("Snack: " + water.getName());
      	System.out.println("Vending Machine: " + drink.getName() );
       	System.out.println("Quantity: " + water.getQuantity());
		String dollarAmount11 = String.format("%.2f", water.totalCost(water.getQuantity()));
		System.out.println("Total Cost: $" + dollarAmount11);
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}