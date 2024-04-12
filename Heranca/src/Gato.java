public class Gato extends Animal{
    private String pelagem;
    private Boolean caçando;

    public Gato(String name, String sex, int age, String pelagem, Boolean caçando) {
        super(name, sex, age);
        this.pelagem = pelagem;
        this.caçando = caçando;
    }

    public Boolean getCaçando() {
        return caçando;
    }

    public void mudarCaçando(Boolean caçando) {
        this.caçando = caçando;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String toString(){
        return "Gato: " + getName() + ", Pelagem: " + getPelagem() + ", Está caçando: " + getCaçando() + ", Idade: "
                + getAge() + ", Sexo: " + getSex();
    }
}
