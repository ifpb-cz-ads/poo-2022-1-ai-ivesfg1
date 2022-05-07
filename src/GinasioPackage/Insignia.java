package GinasioPackage;

public abstract class Insignia {
    protected String nome;
    protected String descricao;

    public Insignia(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
