class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, int idade, double salario, String linguagem) {
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }

    // Método específico para desenvolvedores
    public void programar() {
        System.out.println(getNome() + " está programando em " + linguagem);
    }

    // Sobrescrevendo o método mostrarInformacoes para incluir informações específicas
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Linguagem de Programação: " + linguagem);
    }
}
