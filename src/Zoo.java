public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;

    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }

    public void ajouteranimal(Animal a, int id) {
        if (id >= 0 && id < animals.length) {
            animals[id] = a;
        } else {
            System.out.println("L'animal n'est pas valide");
        }
    }

    public void displayzoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Nombre de cages: " + nbrCages);
        System.out.println("Animaux dans le zoo:");
        for (Animal a : animals) {
            if (a != null) {
                a.displayinfo();
            }
        }
    }
}
