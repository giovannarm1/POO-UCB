import java.util.Scanner;
public class SistemaContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Tipo de contato (Pessoa ou Empresa): ");
                    String tipoContato = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    if (tipoContato.equalsIgnoreCase("Pessoa")) {
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        agenda.cadastrar(new Pessoa(nome, telefone, cpf));
                    } else if (tipoContato.equalsIgnoreCase("Empresa")) {
                        System.out.print("CNPJ: ");
                        String cnpj = scanner.nextLine();
                        agenda.cadastrar(new Empresa(nome, telefone, cnpj));
                    } else {
                        System.out.println("Tipo de contato inválido.");
                    }
                    break;

                case 2:
                    agenda.consultar();
                    break;

                case 3:
                    System.out.print("Digite o nome do contato a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo número de telefone: ");
                    String novoTelefone = scanner.nextLine();
                    agenda.atualizar(nomeAtualizar, novoTelefone);
                    break;

                case 4:
                    System.out.print("Digite o nome do contato a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    agenda.excluir(nomeExcluir);
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
