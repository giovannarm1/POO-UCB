import java.util.Scanner;

public class verificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();
        
        boolean ehPrimo = verificaPrimo(numero);
        
        if (ehPrimo) {
            System.out.println(numero + " e um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }
    }
    
    public static boolean verificaPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}