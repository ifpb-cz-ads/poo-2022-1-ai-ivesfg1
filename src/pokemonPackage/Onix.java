package pokemonPackage;

public class Onix extends Pokemon {

    public Onix() {
        super("Onix", 45, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Niiiiiix");
    }
}
