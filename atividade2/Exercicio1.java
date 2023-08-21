import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

            int operador;
            double num1 = 0;
            double num2 = 0;
            double resultado = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Bem-vindo(a) a nossa calculadora!!");
            System.out.println("_____________________________________");
            System.out.println("Insira o primeiro numero para começar: ");
            num1 = sc.nextDouble();
            System.out.println("Insira o segundo numero: ");
            num2 = sc.nextDouble();
            System.out.println("Insira o operador: ");
            System.out.println("digite:\n 1 para + \n 2 para - \n 3 para * \n 4 para / ");
            operador = sc.nextInt();
            System.out.println("_____________________________________");

            switch (operador){
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("A operação é %.2f + %.2f = %.2f", num1, num2, resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.printf("A operação é %.2f - %.2f = %.2f", num1, num2, resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.printf("A operação é %.2f * %.2f = %.2f", num1, num2, resultado);
                    break;

                case 4:
                    resultado = num1 / num2;

                    if (num2 != 0){
                        System.out.printf("A operação é %.2f / %.2f = %.2f", num1, num2, resultado);
                    }
                    else {
                        System.out.println("Não é possivel dividir numeros por 0!");
                    }
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
            sc.close();
        }
    }

