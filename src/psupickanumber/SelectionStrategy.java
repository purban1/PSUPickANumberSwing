package psupickanumber;

public interface SelectionStrategy {
    public abstract String determineIfThereWasAMatch(RandomNumberGenerator rng, String theChoice);
}
