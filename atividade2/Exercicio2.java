import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int escolha;
        double temperatura = 0;
        double resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("_______________________________________________");
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("_______________________________________________");
        System.out.println("Insira a temperatura que você deseja converter:");
        temperatura = sc.nextDouble();

        System.out.println("Digite a temperatura que deseja converter:\n 1- Celsius para Fahrenheit\n 2- Fahrenheit para Celsius ");
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                resultado = (temperatura * 9/5) + 32;
                System.out.printf("O resultado da conversão é: %.2f", resultado);
                break;
            case 2:
                resultado = (temperatura - 32) * 5/9;
                System.out.printf("O resultado da conversão é: %.2f", resultado);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        sc.close();
    }
}
