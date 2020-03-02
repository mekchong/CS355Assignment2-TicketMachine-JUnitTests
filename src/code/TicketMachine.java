/*
 * TicketMachine - class to simulate a simple transportation ticket machine
 */
package code;

public class TicketMachine {
	// data
	private int cost;
	private int total;
	private int currentTicketAmount;
	private int ticketCount;				// cost of one regular ticket
	private int leftToPay;

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
	public int currentCollected(int received){
		if(received <= 0){
			System.out.println("Please insert real amounts of money");
			return currentTicketAmount;
		}
		else{
			return currentTicketAmount += received;
		}
	}

	// getter for amount of money collected for a ticket
	public int getCurrentCollected(){
		return currentTicketAmount;
	}

	public int totalMoney(){
		total += currentTicketAmount;
		System.out.println("Total money collected: $" + total);
		return total;
	}

	public int getTicketCount(){
		return ticketCount;
	}

	public void sufficientFundsCheck(){
		if(currentTicketAmount < cost){
			leftToPay = cost - currentTicketAmount;
			System.out.println("Insufficient funds. $" + leftToPay+ "more required");
		}
		else{
			printTicket();
		}
	}

	public String printTicket(){
		/*
		ticketCount++;
		total += currentTicketAmount;
		currentTicketAmount = 0;
		*/
		String ticket = "This is your ticket";
		return ticket;
	}


}	// end - class TicketMachine
