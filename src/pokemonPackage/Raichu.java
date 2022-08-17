package pokemonPackage;

public class Raichu extends Pokemon {

    public Raichu() {
        super("Raichu", 90, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("rai RAI RAI RAI");
    }
}
