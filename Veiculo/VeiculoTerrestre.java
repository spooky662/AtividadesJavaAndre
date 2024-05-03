public class VeiculoTerrestre extends Veiculo{
    int numeroRodas;

    public VeiculoTerrestre(String modelo, int ano, String cor, boolean ligado, int numeroRodas) {
        super(modelo, ano, cor, ligado);
        this.numeroRodas = numeroRodas;
    }
}
