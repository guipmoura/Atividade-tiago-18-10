public class Gerente extends Funcionario {

    private Double salarioBase;
    private Double bonus;
    public Gerente(String nome, Double salarioBase, Double bonus) {
        super(nome);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }
    @Override
    public Double calcularSalario() {
        return salarioBase + bonus;
    }
    @Override
    public String descreverResponsabilidades() {
        return "Gerenciar a equipe, definir metas e garantir a execução dos projetos.";
    }
}