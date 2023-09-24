public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CBR500R", 2021, 500);
        Bicicleta bicicleta = new Bicicleta("Trek", "X-Caliber", 2020, "Mountain Bike");

        carro.acelerar(60);
        moto.acelerar(80);
        bicicleta.acelerar(20);

        carro.frear(10);
        moto.frear(15);
        bicicleta.frear(5);

        System.out.println("Informações do Carro:");
        carro.mostrarInformacoes();
        System.out.println("\nInformações da Moto:");
        moto.mostrarInformacoes();
        System.out.println("\nInformações da Bicicleta:");
        bicicleta.mostrarInformacoes();
    }
}