public class Carro extends Veiculo{
    int numeroPortas;
    String tipoTransmissao;
    float capacidadePortamalas;

    public Carro(String modelo, int ano, String cor, boolean ligado, int numeroPortas,
                 String tipoTransmissao, float capacidadePortamalas) {
        super(modelo, ano, cor, ligado);
        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.capacidadePortamalas = capacidadePortamalas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public float getCapacidadePortamalas() {
        return capacidadePortamalas;
    }

    public void setCapacidadePortamalas(float capacidadePortamalas) {
        this.capacidadePortamalas = capacidadePortamalas;
    }

    public void ligarFarolNeblina(){

    }

    public void abrirTetoSolar(){

    }
}
