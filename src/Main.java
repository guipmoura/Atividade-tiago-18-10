public class Main {
        public static void main(String[] args) {
            Gerente gerente = new Gerente("Fernando", 8333.0, 2000.0);
            Desenvolvedor desenvolvedor = new Desenvolvedor("Fernanda", 5432.0, 10, 50.0);
            System.out.println("Gerente:");
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Salário: R$ " + gerente.calcularSalario());
            System.out.println("Responsabilidades: " + gerente.descreverResponsabilidades());
            System.out.println();
            System.out.println("Desenvolvedor:");
            System.out.println("Nome: " + desenvolvedor.getNome());
            System.out.println("Salário: R$ " + desenvolvedor.calcularSalario());
            System.out.println("Responsabilidades: " + desenvolvedor.descreverResponsabilidades());
        }
    }