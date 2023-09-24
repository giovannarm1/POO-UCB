class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    // Método específico para gerentes
    public void gerenciar() {
        System.out.println(getNome() + " está gerenciando o departamento de " + departamento);
    }

    // Sobrescrevendo o método mostrarInformacoes para incluir informações específicas
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}
