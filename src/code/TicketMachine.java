/*
 * TicketMachine - class to simulate a simple transportation ticket machine
 */
package code;

public class TicketMachine {
	// data
	private int cost;
	private int total;
	private int currentTicketAmount;
	private int ticketCount;
	private int FCTicketCount;
	private int FCtotal;
	private int amountRequired;
	private int refundAmount;

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
			total+=received;
			return currentTicketAmount += received;
		}
	}

	//printing a regular ticket
	public String printTicket(){
		//checking for sufficient funds
		if(cost > currentTicketAmount){
			String err = "Insufficient funds";
			amountRequired = balanceAmount(currentTicketAmount, cost);
			return err;
		}
		else{
			if(currentTicketAmount > cost){
				//returning balance after printing ticket
				refundAmount = balanceAmount(cost, currentTicketAmount);
			}
			ticketCount++;
			String ticket = "This is your regular ticket";
			return ticket;
		}

	}

	//buying a first class ticket
	public void firstClass(){
		if(currentTicketAmount>=cost*2){
			currentTicketAmount-=cost*2;
			FCtotal += cost*2;
			FCTicketCount++;
			System.out.println("This is your first class ticket");
		} else {
			System.out.println("Insufficient funds for first class ticket. $" + balanceAmount(cost*2, currentTicketAmount) + " required");
		}
	}

	//calculating amount to refund/left to pay
	public int balanceAmount(int val1, int val2){
		return val2 - val1;
	}

	//getter methods
	public int getTotalMoney(){
		System.out.println("Total money collected: $" + total);
		return total;
	}

	// getter for amount of money collected for a ticket
	public int getCurrentCollected(){
		return currentTicketAmount;
	}
	//gets total number of tickets for both first class and regular tickets
	public int getGrandTicketCount(){
		return (ticketCount + FCTicketCount);
	}

	//gets total number of tickets for first class tickets
	public int getFCTicketCount(){
		return FCTicketCount;
	}

	//gets the amount needed to complete a ticket
	public int getAmountRequired(){
		return amountRequired;
	}

	//gets the amount of money needed to complete a ticket
	public int getRefundAmount(){
		return refundAmount;
	}

	//gets the number of of regular tickets sold
	public int getTicketCount(){
		return ticketCount;
	}

}	// end - class TicketMachine