/*
 * TicketMachine - class to simulate a simple transportation ticket machine
 */
package code;

public class TicketMachine {
	// data
	private int cost;
	private int total = 0;
	private int currentTicketAmount = 0;
	private int ticketCount = 0;				// cost of one regular ticket
	
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

	// updates the amount of money collected for a ticket
	public void currentCollected(int received){
		currentTicketAmount += received;
	}

	// getter for amount of money collected for a ticket
	public int getCurrentTicketAmount(){
		return currentTicketAmount;
	}

	public int totalMoney(){
		total += currentTicketAmount;
		System.out.println("Total money collected: $" + total);
		return total;
	}

	public String printTicket(){
		ticketCount++;
		total += currentTicketAmount;
		currentTicketAmount = 0;
		String ticket = "This is your ticket";
		return ticket;
	}
	
}	// end - class TicketMachine
