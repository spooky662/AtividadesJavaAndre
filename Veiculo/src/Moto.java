public class Moto extends Veiculo{
    int cilindradas;
    String tipoCombustivel;
    String tipoFreio;

    public Moto(String modelo, int ano, String cor, boolean ligado,
                int cilindradas, String tipoCombustivel, String tipoFreio) {
        super(modelo, ano, cor, ligado);
        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoFreio = tipoFreio;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public void ativarModoEsportivo(){

    }

    public void ligarPartidaEletrica(){

    }
}
