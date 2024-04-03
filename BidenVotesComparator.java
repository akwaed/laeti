import java.util.Comparator;

/**
 * This class compares VotesByState objects based on the count of electoral votes won by Biden
 * @author Laeticia Tamufor
 * Date: 1 April 2024
 */
public class BidenVotesComparator implements Comparator<VotesByState>
{
	public int compare(VotesByState o1, VotesByState o2) 
	{
        return Integer.compare(o1.getBidenVotes(), o2.getBidenVotes());
    }
}