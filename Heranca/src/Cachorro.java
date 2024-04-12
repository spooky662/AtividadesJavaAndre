public class Cachorro extends Animal{
    private String raca;
    private String porte;

    public void buscarOsso(){
        System.out.println("Auuuuu... mim dê o osso!");
    }

    public Cachorro(String name, String sex, int age, String raca, String porte) {
        super(name, sex, age);
        this.raca = raca;
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String toString(){
        return "Cachorro: " + getName() + ", Raça: " + getRaca() + " " + getPorte() + ", "
                + getAge() + ", Sexo: " + getSex();
    }
}
