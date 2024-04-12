public class Main {
    public static void main(String[] args) {
        Cachorro a1 = new Cachorro("Rex", "M", 6, "Boxer", "Grande");
        System.out.println(a1);
        a1.buscarOsso();
        a1.barulho();
        a1.envelhecer();
        System.out.println(a1);
        Gato a2 = new Gato("Luna", "F", 8, "Laranja", true);
        System.out.println(a2);
        a2.mudarCaçando(false);
        a2.barulho();
        a2.envelhecer();
        System.out.println(a2);
        Vaca a3 = new Vaca("Margarida", "F", 5, "Pasto", "Marrons");
        System.out.println(a3);
        a3.pastar();
        a3.produzirLeite();
        a3.barulho();
        a3.envelhecer();
        System.out.println(a3);
    }
}