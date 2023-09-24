class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        velocidade += valor;
    }

    public void frear(int valor) {
        velocidade -= valor;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
    }
}