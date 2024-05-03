public class VeiculoAereo extends Veiculo{
    int numeroMotores;

    public VeiculoAereo(String modelo, int ano, String cor, boolean ligado, int numeroMotores) {
        super(modelo, ano, cor, ligado);
        this.numeroMotores = numeroMotores;
    }

}
