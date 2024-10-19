public class Desenvolvedor extends Funcionario {

    private Double salarioBase;
    private int horasExtras;
    private Double valorHoraExtra;
    public Desenvolvedor(String nome, Double salarioBase, int horasExtras, Double valorHoraExtra) {
        super(nome);
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }
    @Override
    public Double calcularSalario() {
        return salarioBase + (horasExtras * valorHoraExtra);
    }
    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver sistemas, escrever código e implementar soluções técnicas.";
    }
}