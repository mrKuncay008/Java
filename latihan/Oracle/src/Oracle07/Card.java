package Oracle07;

/**
 *
 * @author kunca
 */
public class Card {
    private int cardNumber;
    private int creditBalance;
    private int ticketBalance;
    
    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public int getCreditBalance() {
        return creditBalance;
    }
    
    public int getTicketBalance() {
        return ticketBalance;
    }
    
    public void addCredits(int credits) {
        this.creditBalance += credits;
    }
    
    public void subtractCredits(int credits) {
        this.creditBalance -= credits;
        if (this.creditBalance < 0) {
            this.creditBalance = 0; // Ensure balance does not go negative
        }
    }
    
    public void addTickets(int tickets) {
        this.ticketBalance += tickets;
    }
    
    public void subtractTickets(int tickets) {
        this.ticketBalance -= tickets;
        if (this.ticketBalance < 0) {
            this.ticketBalance = 0; // Ensure balance does not go negative
        }
    }
    
    // Method to transfer credits and tickets from this card to another card
    public void transfer(Card targetCard, int credits, int tickets) {
        this.subtractCredits(credits);
        targetCard.addCredits(credits);
        
        this.subtractTickets(tickets);
        targetCard.addTickets(tickets);
    }
}

