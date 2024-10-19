public abstract class Funcionario extends IFuncionario{
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
