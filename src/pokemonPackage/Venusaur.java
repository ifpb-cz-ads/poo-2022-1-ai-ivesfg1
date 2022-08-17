package pokemonPackage;

public class Venusaur extends Pokemon {
    public Venusaur() {
        super("Venusaur", 82, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Venuuusssauuur!");
    }
}
