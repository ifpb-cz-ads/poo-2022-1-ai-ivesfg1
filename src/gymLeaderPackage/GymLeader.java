package gymLeaderPackage;

import pokemonPackage.Pokemon;
import trainerPackage.Trainer;

public abstract class GymLeader extends Trainer {
    public GymLeader(String name) {
        super(name);
    }

    public abstract void initialPhrase();
    public abstract void finalPhrase();
}
