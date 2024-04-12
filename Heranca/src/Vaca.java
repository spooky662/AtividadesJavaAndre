public class Vaca extends Animal{
    private String dieta;
    private String manchas;

    public Vaca(String name, String sex, int age, String dieta, String manchas) {
        super(name, sex, age);
        this.dieta = dieta;
        this.manchas = manchas;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getManchas() {
        return manchas;
    }

    public void setManchas(String manchas) {
        this.manchas = manchas;
    }

    public void pastar(){
        System.out.println("A vaca está pastando.");
    }

    public void produzirLeite(){
        System.out.println("A vaca produziu leite.");
    }

    public String toString(){
        return "Vaca: " + getName() + ", Manchas: " + getManchas() + ", Dieta: " + getDieta() + ", Idade: "
                + getAge() + ", Sexo: " + getSex();
    }
}
