public class Onibus extends Veiculo{
    int capacidadePassageiros;
    int portasAcesso;
    int numeroParadas;

    public Onibus(String modelo, int ano, String cor, boolean ligado,
                  int capacidadePassageiros, int portasAcesso, int numeroParadas) {
        super(modelo, ano, cor, ligado);
        this.capacidadePassageiros = capacidadePassageiros;
        this.portasAcesso = portasAcesso;
        this.numeroParadas = numeroParadas;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getPortasAcesso() {
        return portasAcesso;
    }

    public void setPortasAcesso(int portasAcesso) {
        this.portasAcesso = portasAcesso;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public void abrirPortaDianteira(){

    }

    public void anunciarParadaProxima(){

    }
}
