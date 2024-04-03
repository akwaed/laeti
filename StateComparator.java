import java.util.Comparator;

/**
 * This class compares VotesByState objects based on their state names.
 * @author Laeticia Tamufor
 * Date: 1 April 2024
 */
public class StateComparator implements Comparator<VotesByState>
{
	public int compare(VotesByState o1, VotesByState o2) 
	{
		return o1.getState().compareTo(o2.getState());
    }
}