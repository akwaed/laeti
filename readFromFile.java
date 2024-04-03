import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {
    public static void readFromFile(String fileName, SortableVector<VotesByState> data) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String state = parts[0];
                int trumpVotes = Integer.parseInt(parts[1]);
                int bidenVotes = Integer.parseInt(parts[2]);
                VotesByState votes = new VotesByState(state, trumpVotes, bidenVotes);
                data.add(votes);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
