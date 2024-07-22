
package Oracle07;

/**
 *
 * @author kunca
 */
public class PrizeCategory {
    private String name;
    private int ticketsRequired;
    private int count;
    
    public PrizeCategory(String name, int ticketsRequired, int count) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.count = count;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTicketsRequired() {
        return ticketsRequired;
    }
    
    public int getCount() {
        return count;
    }
    
    public void awardPrize() {
        if (count > 0) {
            count--;
            System.out.println("Prize awarded from category " + name + ". Remaining: " + count);
        } else {
            System.out.println("No more prizes left in category " + name);
        }
    }
}
