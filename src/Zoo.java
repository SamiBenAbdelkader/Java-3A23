public class Zoo {

    static final int nbrCages = 25;
    int nbrAnimaux;
    Animal[] animals;

    public Zoo() {
        this.nbrAnimaux = 0;
        this.animals = new Animal[nbrCages]; // Initialize the animals array
    }

    public boolean addAnimal(Animal a) {
        if (nbrAnimaux < nbrCages) {
            animals[nbrAnimaux] = a;
            nbrAnimaux++;
            return true;
        } else {
            return false;
        }
    }

    public void displayAnimaux() {
        for (int i = 0; i < nbrAnimaux; i++) {
            System.out.println(animals[i].name); // Display the animal's name
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimals(Animal a) {
        if (nbrAnimaux < nbrCages) {
            if (searchAnimal(a) == -1) {
                animals[nbrAnimaux] = a;
                nbrAnimaux++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean removeAnimals(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            // Shift animals to fill the gap
            for (int i = index; i < nbrAnimaux - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimaux - 1] = null; // Clear the last element
            nbrAnimaux--;
            return true;
        } else {
            return false;
        }
    }

    public boolean isZooFull() {
        return nbrAnimaux == nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else if (z1.nbrAnimaux < z2.nbrAnimaux) {
            return z2;
        } else {
            return null;
        }
    }
}
