package pokemonPackage;

public class Starmie extends Pokemon {

    public Starmie() {
        super("Starmie", 75, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("STaaarmie!!!!");
    }
}
