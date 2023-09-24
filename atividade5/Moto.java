class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}