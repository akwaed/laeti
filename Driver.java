import java.util.Scanner; 
import java.io.File; 
import java.io.IOException;

/**
 * @author Laeticia Tamufor
 * Date: 1 April 2024
 */
public class Driver
{
    /**
     * Method to read data from a file and populate a SortableVector<VotesByState>
     * @param data file
     */
    public static void readFromFile(String fileName, SortableVector<VotesByState> data) 
    {
        try 
        {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);// scanner reads from the file
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine(); // Read a line from the file
                String[] parts = line.split(","); // Splits the line into parts based on comma
                if(parts.length == 3)
                {
                	String state = parts[0];
                	int trumpVotes = Integer.parseInt(parts[1].trim());
                	int bidenVotes = Integer.parseInt(parts[2].trim());
                	VotesByState votesByState = new VotesByState(state, trumpVotes, bidenVotes); // Create a VotesByState object with the extracted information 
                	data.add(votesByState); // Add the VotesByState object to the SortableVector
                } 
                
            }
            scanner.close();// Close the Scanner to release resources
        } 
        catch (IOException e) 
        {
            // If an IOException occurs during file reading, print the stack trace
            e.printStackTrace();
        }
    }
}
