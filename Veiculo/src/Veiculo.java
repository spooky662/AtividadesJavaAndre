public class Veiculo {
    String modelo;
    int ano;
    String cor;
    boolean ligado;

    public Veiculo(String modelo, int ano, String cor, boolean ligado) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar(){
        if(ligado == false) {
            ligado = true;
        }
    }

    public void desligar(){
        if(ligado == true) {
            ligado = false;
        }
    }

    public void acelerar(){}
    public void frear(){}
    public void virar(){}
}
