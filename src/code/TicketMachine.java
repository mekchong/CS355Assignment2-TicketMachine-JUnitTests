/*
 * TicketMachine - class to simulate a simple transportation ticket machine
 */
package code;

public class TicketMachine {
	// data
	private int cost, totalMoney;				// cost of one regular ticket
	
	// constructors
	// -- default constructor
	public TicketMachine () {
		this(0);
	}

	// -- one-arg ticket cost constructor
	public TicketMachine (int cost) {
		this.cost = cost;
	}
	
	// other methods besides constructors
	// -- getter for cost
	public int getCost () {
		return cost;
	}

	public int totalAmountInserted(int inserted){
		totalMoney += inserted;
		System.out.println("Current amount inserted: $" + totalMoney);
		return totalMoney;
	}

	public String printTicket(){
		String ticket = "This is your ticket";
		return ticket;
	}
	
}	// end - class TicketMachine
