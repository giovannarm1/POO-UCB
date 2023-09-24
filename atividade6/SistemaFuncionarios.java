public class SistemaFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Giovanna", 21, 7000.0, "Dev");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alice", 20, 6500.0, "Python");
        Atendente atendente = new Atendente("João", 22, 3000.0, "Suporte");

        gerente.mostrarInformacoes();
        gerente.gerenciar();

        desenvolvedor.mostrarInformacoes();
        desenvolvedor.programar();

        atendente.mostrarInformacoes();
        atendente.atenderCliente();
    }
}