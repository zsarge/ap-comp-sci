public class WordMatch {  
  /** The secret string. */  
  private String secret;  
  /** Constructs a WordMatch object with the given secret string of lowercase letters. */  
  public WordMatch(String word) 
  {  
    secret = word;  /* implementation not shown */  
  }  
  /** Returns a score for guess, as described in part (a).  
    * Precondition: 0 < guess.length() <= secret.length()  
    */  
  public int scoreGuess(String guess) {
  /* to be implemented in part (a) */
    int output = 0;
    int gLen = guess.length(), sLen = secret.length();
    for(int i = 0; i <= sLen - gLen; i++) {
      if(guess.equals(secret.substring(i, i + gLen) ) ) {
        output++;
      }
    }
    return output * gLen * gLen;
  }
  /** Returns the better of two guesses, as determined by scoreGuess and the rules for a  * tie-breaker that are described in part (b).  
    * Precondition: guess1 and guess2 contain all lowercase letters.  
    * guess1 is not the same as guess2.  
    */  
  public String findBetterGuess(String guess1, String guess2)  {
    /* to be implemented in part (b) */
    if( this.scoreGuess(guess1) > this.scoreGuess(guess2) ) {
      return guess1;
    }
    else if( this.scoreGuess(guess1) < this.scoreGuess(guess2) ) {
      return guess2;
    }
    else {
      if( guess1.compareTo(guess2) >= 0 ) {
        return guess1;
      }
      else {
        return guess2;
      }
    }
  }
  
  public static void main(String[] args) {
    WordMatch game1 = new WordMatch("mississippi");
    System.out.println( game1.scoreGuess("i") );
    System.out.println( game1.scoreGuess("iss") );
    System.out.println( game1.scoreGuess("issipp") );
    System.out.println( game1.scoreGuess("mississippi") );

    System.out.println("-----");
    WordMatch game2 = new WordMatch("aaaabb");
    System.out.println( game2.scoreGuess("a") );
    System.out.println( game2.scoreGuess("aa") );
    System.out.println( game2.scoreGuess("aaa") );
    System.out.println( game2.scoreGuess("aabb") );
    System.out.println( game2.scoreGuess("c") );
  }
}  
