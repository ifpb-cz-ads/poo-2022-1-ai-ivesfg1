package PokemonPackage;

public class Pokemon {

    private String nome;
    private int hp;
    private int ataque;
    private int defesa;
    private int ataqueEspecial;
    private int defesaEspecial;
    private int velocidade;

    public Pokemon(String nome, int hp, int ataque, int defesa, int ataqueEspecial, int defesaEspecial, int velocidade) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataqueEspecial = ataqueEspecial;
        this.defesaEspecial = defesaEspecial;
        this.velocidade = velocidade;
    }

    public void atacar(Pokemon pokemonAdversario){
        pokemonAdversario.sofrerAtaque(this.ataque);
    }

    public void sofrerAtaque(int valorDoDano){
        this.hp -= valorDoDano;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefesaEspecial() {
        return defesaEspecial;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
