public class Animal {
    String family;
    String name;
    int age;
    boolean isM;

    public Animal(String family, String name, int age, boolean isM) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isM = isM;
    }

    public void displayinfo() {
        System.out.println("Race: " + family + ", Nom: " + name + ", Age: " + age + ", Mammifère?: " + isM);
    }
}
