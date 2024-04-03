import java.util.Vector;
import java.util.Comparator;

/**
 * @author Laeticia Tamufor
 * Date: 1 April 2024
 */
public class SortableVector<E> extends Vector<E>
{
	/**
	 *  This method performs a selection sort on the vector
	 * 
	 *  @param c 
	 */
	public void selectionSort(Comparator<E> c)
	{
		for (int i = 0; i < this.size() - 1; i++) //loops through each element in the vector
		{
        	int minIndex = i;
	        for (int j = i + 1; j < this.size(); j++) 
	        {
	            if (c.compare(this.get(j), this.get(minIndex)) < 0) //current element smaller than the current smallest element, update the minIndex
	            {
	                minIndex = j; 
	            }
        	}
        //swaps the current element with the smallest element found
        E temp = this.get(minIndex);
        this.set(minIndex, this.get(i));
        this.set(i, temp);
    	}
	}

	/**
	 *  This method performs a selection sort on the vector
	 * 
	 *  @param c 
	 */
	public void insertionSort(Comparator<E> c) 
	{
        for (int i = 1; i < this.size(); i++) //loops through the vector starting from the second element
        {
            E current = this.get(i); //gets current element
            int j = i - 1;

            //checks if j is greater than or equal to 0, and if j is greater than current
            while (j >= 0 && c.compare(this.get(j), current) > 0) 
            {
                this.set(j + 1, this.get(j)); //moves the element at index j + 1 to index j
                j = j - 1;
            }
            this.set(j + 1, current);
        }
    }

}