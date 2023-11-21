
class Empresa extends Contato {
    private String cnpj;

    public Empresa(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CNPJ: " + cnpj);
    }
}
