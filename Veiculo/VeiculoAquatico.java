public class VeiculoAquatico extends Veiculo{
    float comprimento;

    public VeiculoAquatico(String modelo, int ano, String cor, boolean ligado, float comprimento) {
        super(modelo, ano, cor, ligado);
        this.comprimento = comprimento;
    }
}
