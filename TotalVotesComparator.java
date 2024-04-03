import java.util.Comparator;

/**
 * This class compares VotesByState objects based on the total count of electoral votes won by Trump and Biden combined
 * @author Laeticia Tamufor
 * Date: 1 April 2024
 */

// public class TotalVotesComparator implements Comparator<VotesByState>
 public class TotalVotesComparator implements Comparator<VotesByState>
{
    public int compare(VotesByState o1, VotesByState o2) 
    {
        return Integer.compare(o1.getTotalVotes(), o2.getTotalVotes());
    }
}