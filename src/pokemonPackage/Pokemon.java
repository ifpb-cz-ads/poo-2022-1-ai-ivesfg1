package pokemonPackage;

public class Pokemon {

    private String nome;
    private int ataque;
    private int vida;

    public Pokemon(String nome, int ataque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
