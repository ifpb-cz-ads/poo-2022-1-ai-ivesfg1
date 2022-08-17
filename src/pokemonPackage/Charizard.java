package pokemonPackage;

public class Charizard extends Pokemon {
    public Charizard() {
        super("Charizard", 84, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("GRRRRRRRRRRRRR!");
    }
}
