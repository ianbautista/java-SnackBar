package snackBar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId);
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	//id getter
	public int getId()
	{
		return id;
	}

	// name getter and setter
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	// quantity getter and setter
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quality)
	{
		this.quantity = quantity;
	}

	// cost getter and setter
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost * ;
	}

	// vendingMachineId getter and setter
	public int getVendingMachineId()
	{
		return vendingMachineId;
	} 
	public void setVendingmachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}
}