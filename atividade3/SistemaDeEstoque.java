import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeEstoque {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Atualizar Quantidade");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    atualizarQuantidade();
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(nome, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void removerProduto() {
        listarProdutos();
        System.out.print("Digite o número do produto que deseja remover: ");
        int numeroProduto = scanner.nextInt();

        if (numeroProduto >= 0 && numeroProduto < estoque.size()) {
            estoque.remove(numeroProduto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Número de produto inválido.");
        }
    }

    private static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos em estoque:");
            for (int i = 0; i < estoque.size(); i++) {
                System.out.println(i + " - " + estoque.get(i));
            }
        }
    }

    private static void atualizarQuantidade() {
        listarProdutos();
        System.out.print("Digite o número do produto que deseja atualizar: ");
        int numeroProduto = scanner.nextInt();

        if (numeroProduto >= 0 && numeroProduto < estoque.size()) {
            System.out.print("Digite a nova quantidade: ");
            int novaQuantidade = scanner.nextInt();
            estoque.get(numeroProduto).setQuantidade(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Número de produto inválido.");
        }
    }
}