public class Aviao extends VeiculoAereo{
    float envergaduraAsa;
    String tipoCombustivel;

    public Aviao(String modelo, int ano, String cor, boolean ligado,
                 int numeroMotores, float envergaduraAsa, String tipoCombustivel) {
        super(modelo, ano, cor, ligado, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void decolar(){

    }

    public void pousar(){

    }
}
