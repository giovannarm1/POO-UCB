import java.util.ArrayList;
class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void cadastrar(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato cadastrado com sucesso.");
    }

    public void consultar() {
        for (Contato contato : contatos) {
            contato.exibir();
        }
    }

    public void atualizar(String nome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
               
                ((Contato) contato).exibir();
                System.out.println("Telefone atualizado para: " + novoTelefone);
                ((Contato) contato).exibir();
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void excluir(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                System.out.println("Contato excluído com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}