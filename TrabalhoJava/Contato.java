
class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }
}





