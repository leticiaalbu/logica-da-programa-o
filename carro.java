public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, int quantidadePortas) {
        super(placa, modelo);
        this.quantidadePortas = quantidadePortas;
    } 
    public int getQuantidadePortas() {
        return quantidadePortas;

    }
     @Override
     public void exibirDados() {
        super.exibirDados();
        System.err.println("quantidade de ortas:" + quantidadePortas);
     }
}