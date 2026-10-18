public class Veiculo {

    private String placa;
    private String modelo;

    public VeiculO(String placa,String modelo){
        this.placa = placa;
        this.modelo = modelo;

    }
    public String  getPlaca() {
        return placa
    }
    public String getModelo() {
        return modelo;
 
   }
   public void exibirDados(){
    System.out.println("placa:" + placa);
    System.out.println("modelo:" + modelo);
   }
}