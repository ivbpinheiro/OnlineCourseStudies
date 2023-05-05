public class Moto extends Veiculo {
    private int potencia;
    public Moto(int rodas, int motor, String tipoMotor) {
        super(rodas, motor, tipoMotor);
    }

    @Override
    public boolean ligaVeiculo() {
        return false;
    }
}
