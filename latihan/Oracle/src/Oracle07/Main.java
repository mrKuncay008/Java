
package Oracle07;

/**
 *
 * @author kunca
 */
public class Main {
    public static void main(String[] args) {
        // Instantiate 2 cards
        Card card1 = new Card(1);
        Card card2 = new Card(2);
        
        // Load credits onto each card
        card1.addCredits(20); // Assuming $10 converted to credits (2 credits per $1)
        card2.addCredits(30); // Assuming $15 converted to credits (2 credits per $1)
        
        // Instantiate games
        Game game1 = new Game("Jumping Jacks", 5, 10); // Requires 5 credits, awards up to 10 tickets
        Game game2 = new Game("Whack-a-Mole", 3, 8);  // Requires 3 credits, awards up to 8 tickets
        
        // Instantiate prize categories
        PrizeCategory category1 = new PrizeCategory("Plush Toys", 15, 5);   // Requires 15 tickets, 5 items available
        PrizeCategory category2 = new PrizeCategory("Keychains", 10, 3);   // Requires 10 tickets, 3 items available
        
        // Instantiate terminals
        Terminal terminal1 = new Terminal(card1);
        Terminal terminal2 = new Terminal(card2);
        
        // Simulate actions
        // Play games using both cards
        game1.play(card1);
        game2.play(card2);
        
        // Transfer balances from card1 to card2
        terminal1.transferCreditsAndTickets(card2, 10, 5); // Transfer 10 credits and 5 tickets
        
        // Request prizes using card2
        terminal2.exchangeTicketsForPrize(category1); // Try to get a plush toy
        terminal2.exchangeTicketsForPrize(category2); // Try to get a keychain
        
        // Try to play a game and request a prize using card1
        game1.play(card1);
        terminal1.exchangeTicketsForPrize(category2); // Try to get a keychain
        
        // Check final balances
        terminal1.checkBalances();
        terminal2.checkBalances();
    }
 }

