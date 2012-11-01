package psupickanumber;

public class NumberComparisonSelectionStrategy implements SelectionStrategy {

    private Boolean matchMade = false;
    private int tallyOfGuesses = 0;
    private String resultsString;

    @Override
    public String compareTheNumbers(RandomNumberGenerator rng, String theChoice) {
        this.tallyOfGuesses ++;
        if (rng.getSecretNumber() == Integer.parseInt(theChoice)) {
            matchMade = true;
            resultsString = "Secret number found. That took " + 
                    getNumberOfGuesses() + " attempt(s).";
            this.tallyOfGuesses = 0;
        } else {
            resultsString = "You have not matched the secret number.";
        }
        return this.getTheResults();

    }

    public String getTheResults() {
        return resultsString;
    }
    
    private int getNumberOfGuesses(){
        return this.tallyOfGuesses;
    }
}
