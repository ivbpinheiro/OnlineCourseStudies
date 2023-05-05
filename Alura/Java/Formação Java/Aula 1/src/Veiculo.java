public abstract class Veiculo implements Ligar {
    private int rodas;
    private int motor;
    private String tipoMotor;

    public Veiculo(int rodas, int motor, String tipoMotor) {
        this.rodas = rodas;
        this.motor = motor;
        this.tipoMotor = tipoMotor;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
