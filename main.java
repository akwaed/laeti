// Write the main() method to compute and print answers to the following questions by reading from data.txt to create a SortedVector of VotesByState, and sorting it as necessary. You may define additional methods to answer the questions if you wish. Be sure to include the answers in the class header comment for the Driver class to help with grading.
// a. What is the 25th state when states are ordered alphabetically?
// b. What are the top 3 states where Trump won the most votes? Print the states in the order of decreasing number of votes. If there’s a tie, print any 3.
// c. What are the top 3 states where Biden won the most votes? Print the states in the order of decreasing number of votes. If there’s a tie, print any 3.
// d. What is the most common number of electoral votes (i.e., the mode), and which states have this number of electoral votes? [Hint: If the SortableVector is properly sorted, you can compute the mode by going through the Vector just once!]

import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Driver {
    public static void main(String[] args) {
        SortableVector<VotesByState> data = new SortableVector<VotesByState>();
        readFromFile("data.txt", data);
        data.sort(new StateComparator());
        // a. What is the 25th state when states are ordered alphabetically?
        System.out.println("25th state when states are ordered alphabetically: " + data.get(24).getState());
        // b. What are the top 3 states where Trump won the most votes? Print the states in the order of decreasing number of votes. If there’s a tie, print any 3.
        data.sort(new TrumpVotesComparator());
        System.out.println("Top 3 states where Trump won the most votes: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(data.get(i).getState());
        }
        // c. What are the top 3 states where Biden won the most votes? Print the states in the order of decreasing number of votes. If there’s a tie, print any 3.
        data.sort(new BidenVotesComparator());
        System.out.println("Top 3 states where Biden won the most votes: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(data.get(i).getState());
        }
        // d. What is the most common number of electoral votes (i.e., the mode), and which states have this number of electoral votes? [Hint: If the SortableVector is properly sorted, you can compute the mode by going through the Vector just once!]
        int maxVotes = 0;
        int count = 0;
        int mode = 0;
        Vector<String> states = new Vector<String>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getTotalVotes() == maxVotes) {
                count++;
                states.add(data.get(i).getState());
            } else {
                if (count > mode) {
                    mode = count;
                }
                count = 1;
                maxVotes = data.get(i).getTotalVotes();
                states.clear();
                states.add(data.get(i).getState());
            }
        }
        System.out.println("Most common number of electoral votes: " + maxVotes);
        System.out.println("States with this number of electoral votes: ");
        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }
    }
}