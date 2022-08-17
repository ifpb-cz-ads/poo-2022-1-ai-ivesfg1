package pokemonPackage;

public class Pokemon {

    private String name;
    private int attack;
    private int health;

    public Pokemon(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void makeNoise() {
        System.out.print(this.getName() + " says: ");
    }

    public void attack(Pokemon foe) {
        int damageValue = this.getAttack();
        foe.sufferDamage(damageValue);
    }

    public void sufferDamage(int damageValue) {
        this.health -= damageValue;
        System.out.println(this.getName() + " sofreu " + damageValue + " de dano.");
    }

}
