class Atendente extends Funcionario {
    private String setor;

    public Atendente(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    public void atenderCliente() {
        System.out.println(getNome() + " está atendendo um cliente no setor de " + setor);
    }


    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Setor: " + setor);
    }
}
