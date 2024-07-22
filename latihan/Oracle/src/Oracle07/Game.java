package Oracle07;

/**
 *
 * @author kunca
 */
public class Game {
    private String name;
    private int creditsRequired;
    private int ticketAwarded;
    
    public Game(String name, int creditsRequired, int ticketAwarded) {
        this.name = name;
        this.creditsRequired = creditsRequired;
        this.ticketAwarded = ticketAwarded;
    }
    
    public void play(Card card) {
        if (card.getCreditBalance() < creditsRequired) {
            System.out.println("Card " + card.getCardNumber() + " has insufficient credits to play " + name);
            return;
        }
        
        card.subtractCredits(creditsRequired);
        int ticketsWon = (int) (Math.random() * ticketAwarded); // Simulating random tickets won
        card.addTickets(ticketsWon);
        
        System.out.println("Card " + card.getCardNumber() + " played " + name +
                           ". Tickets won: " + ticketsWon +
                           ". New ticket balance: " + card.getTicketBalance());
    }
}
