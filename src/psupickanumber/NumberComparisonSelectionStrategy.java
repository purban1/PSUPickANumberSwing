package psupickanumber;

public class NumberComparisonSelectionStrategy implements SelectionStrategy {

    private String result;
    private int tallyOfGuesses = 0;
    private final String ansCorrect = "Secret number found. Number of"
             + " attempt(s): ";
    private final String ansIncorrect = "You have not matched the secret number.";
    NumberGuessResult numberGuessResult;
    // MAKES RESULTS TYPE SAFE

    @Override
    public String compareTheNumbers(RandomNumberGenerator rng, String theChoice) {
        this.tallyOfGuesses++;
        if (rng.getSecretNumber() == Integer.parseInt(theChoice)) {
//            matchMade = true;
//            resultsString = NumberGuessResult.CORRECT;
            result = getResultString(numberGuessResult.CORRECT);
//            this.tallyOfGuesses = 0;
        } else {
//            resultsString = NumberGuessResult.INCORRECT;
            result = getResultString(numberGuessResult.INCORRECT);
        }
        return result;
    }

    private String getResultString(NumberGuessResult result) {
        String enumResults="";
        switch (result) {
            case CORRECT : enumResults=this.ansCorrect + getNumberOfGuesses();
                break;
            case INCORRECT : enumResults=this.ansIncorrect;                       
        }
        return enumResults;
    }

    private int getNumberOfGuesses() {
        return this.tallyOfGuesses;
        // Insert switch code to check enum result

    }
}
