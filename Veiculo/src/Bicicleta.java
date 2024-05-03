public class Bicicleta extends Veiculo{
    int numeroMarchas;
    String tipoFreio;
    String estiloQuadro;

    public Bicicleta(String modelo, int ano, String cor, boolean ligado,
                     int numeroMarchas, String tipoFreio, String estiloQuadro) {
        super(modelo, ano, cor, ligado);
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
        this.estiloQuadro = estiloQuadro;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String getEstiloQuadro() {
        return estiloQuadro;
    }

    public void setEstiloQuadro(String estiloQuadro) {
        this.estiloQuadro = estiloQuadro;
    }

    public void pedalar(){

    }

    public void parar(){

    }
}
