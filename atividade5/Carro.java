class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de Portas: " + numPortas);
    }
}
