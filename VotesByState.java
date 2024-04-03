/**
 * This class stores 2020 presidential election results by state.
 */
public class VotesByState {
  private String state;
  private int trumpVotes;
  private int bidenVotes;
  
  /**
   * Initializes the member variables to the respective arguments.
   * 
   * @param state 2-letter code for the state
   * @param trumpVotes number of electoral votes won by Trump
   * @param bidenVotes number of electoral votes won by Biden
   */
  public VotesByState(String state, int trumpVotes, int bidenVotes) {
    this.state = state;
    this.trumpVotes = trumpVotes;
    this.bidenVotes = bidenVotes;
  }

  /**
   * Returns the name of the state.
   * 
   * @return a 2-letter state code
   */
  public String getState() {
    return state;
  }
  
  /**
   * Returns the number of electoral votes won by Trump. 
   * 
   * @return number of electoral votes won by Trump
   */
  public int getTrumpVotes() {
    return trumpVotes;
  }
  
  /**
   * Returns the number of electoral votes won by Biden.
   * 
   * @return number of electoral votes won by Biden
   */
  public int getBidenVotes(){
    return bidenVotes;
  }

  /**
   * Constructs a string representation of the object
   *
   * @return A string representing the state, votes won by Trump, and votes won by Biden
   */
  public String toString(){
    return "(" + state + ", " + trumpVotes + ", " + bidenVotes + ")";
  }

    public int getTotalVotes() {
        return trumpVotes + bidenVotes;
    }
}

