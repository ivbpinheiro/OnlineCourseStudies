public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(4, 1, "Eletricidade");
        Moto moto1 = new Moto(2, 1, "Combustão");
        carro1.setTracao("4x4");
        System.out.println("O veículo é: "+ carro1.getClass().getSimpleName() +
                ", possui um motor a " + carro1.getTipoMotor() + " e possuí " +
                carro1.getMotor() + " motor. " + "Sua tração é: " + carro1.getTracao() + carro1.ligaVeiculo() + carro1.ligarRadio());
        System.out.println("O veículo é: "+ moto1.getClass().getSimpleName() +
                ", possui um motor a " + moto1.getTipoMotor() + " e possuí " +
                moto1.getMotor() + " motor!");
    }
}