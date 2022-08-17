package pokemonPackage;

public class Blastoise extends Pokemon implements Tank {


    public Blastoise() {
        super("Blastoise", 83, 100);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Blassstooooise!");
    }

    @Override // blastoise eh top
    public int getDeffense() {
        return 70;
    }

    @Override
    public void sufferDamage(int damageValue) {
        damageValue -= this.getDeffense();
        super.sufferDamage(damageValue);
    }
}
