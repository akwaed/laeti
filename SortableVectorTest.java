import static org.junit.Assert.*;
import org.junit.Test;

// Import comparator classes
import java.util.Comparator;

// import java complied classes BidenVotesComparator.java, StateComparator.java, TotalVotesComparator.java, TrumpVotesComparator.java

public class SortableVectorTest {

    @Test
    public void testStateComparator() {
        SortableVector<VotesByState> vector = new SortableVector<>();
        vector.sort(new StateComparator());
    }

    @Test
    public void testTrumpVotesComparator() {
        SortableVector<VotesByState> vector = new SortableVector<>();
        vector.sort(new TrumpVotesComparator());
    }

    @Test
    public void testBidenVotesComparator() {
        SortableVector<VotesByState> vector = new SortableVector<>();
        vector.sort(new BidenVotesComparator());
    }

    @Test
    public void testTotalVotesComparator() {
        SortableVector<VotesByState> vector = new SortableVector<>();
        vector.sort(new TotalVotesComparator());
    }
}
