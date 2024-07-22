package Oracle07;

/**
 *
 * @author kunca
 */
public class Terminal {
     private Card card;
    
    public Terminal(Card card) {
        this.card = card;
    }
    
    public void addCredits(int amountInDollars) {
        int creditsToAdd = amountInDollars * 2; // 2 credits for every $1
        card.addCredits(creditsToAdd);
        System.out.println("Added " + creditsToAdd + " credits to card " + card.getCardNumber() +
                           ". New credit balance: " + card.getCreditBalance());
    }
    
    public void checkBalances() {
        System.out.println("Card " + card.getCardNumber() +
                           " - Credit Balance: " + card.getCreditBalance() +
                           ", Ticket Balance: " + card.getTicketBalance());
    }
    
    public void transferCreditsAndTickets(Card targetCard, int credits, int tickets) {
        card.transfer(targetCard, credits, tickets);
        System.out.println("Transferred " + credits + " credits and " + tickets + " tickets from card " +
                           card.getCardNumber() + " to card " + targetCard.getCardNumber());
        System.out.println("Card " + card.getCardNumber() + " balances: Credit = " + card.getCreditBalance() +
                           ", Tickets = " + card.getTicketBalance());
        System.out.println("Card " + targetCard.getCardNumber() + " balances: Credit = " + targetCard.getCreditBalance() +
                           ", Tickets = " + targetCard.getTicketBalance());
    }
    
    public void exchangeTicketsForPrize(PrizeCategory prizeCategory) {
        if (card.getTicketBalance() < prizeCategory.getTicketsRequired()) {
            System.out.println("Card " + card.getCardNumber() + " has insufficient tickets for " + prizeCategory.getName());
            return;
        }
        
        prizeCategory.awardPrize();
        card.subtractTickets(prizeCategory.getTicketsRequired());
        System.out.println("Card " + card.getCardNumber() + " exchanged tickets for prize from category " +
                           prizeCategory.getName() + ". New ticket balance: " + card.getTicketBalance());
    }
}
