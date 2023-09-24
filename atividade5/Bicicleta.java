class Bicicleta extends Veiculo {
    private String tipo;

    public Bicicleta(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }
}
