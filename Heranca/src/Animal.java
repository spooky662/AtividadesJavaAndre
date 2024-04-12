public class Animal {
    private String name;
    private String sex;
    private int age;

    public void envelhecer(){
        this.setAge(this.getAge()+1);
    }

    public void barulho(){
        System.out.println("O animal está fazendo barulho...");
    }

    public Animal(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
