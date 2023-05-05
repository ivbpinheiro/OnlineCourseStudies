public class Carro extends Veiculo implements Radio, Ligar {
    private int quantidadeDePortas;

    private String tracao;

    public Carro(int rodas, int motor, String tipoMotor) {
        super(rodas, motor, tipoMotor);
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public boolean ligaVeiculo() {
        System.out.println("Veículo Ligado!");
        return true;
    }
    @Override
    public String getTipoMotor() {
        return super.getTipoMotor() + " Motor com transmissão";
    }

    @Override
    public String ligarRadio() {
        return "Rádio Ligado!";
    }
}
