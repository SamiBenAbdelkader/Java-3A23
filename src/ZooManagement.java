public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();

        Animal A = new Animal("lion", "Zizou", 12, true);
        Animal B = new Animal("tiger", "Pistou", 24, true);
        Animal C = new Animal("lion", "Mimou", 5, true);


        System.out.println("A dans Zoo 1: " + zoo1.addAnimal(A)); // true
        System.out.println("B dans Zoo 1: " + zoo1.addAnimal(B)); // true
        System.out.println("C dans Zoo 1: " + zoo1.addAnimals(C)); // false (duplicate)

        System.out.println("Animaux dans le Zoo 1:");
        zoo1.displayAnimaux();


        System.out.println("Retirer l'animal A du Zoo: " + zoo1.removeAnimals(A));

        // Display animals in zoo1 after removal
        System.out.println("Animaux restants après le retrait de l'animal A:");
        zoo1.displayAnimaux();


        System.out.println("Comparaison entre le Zoo 1 et 2: " + (zoo1.comparerZoo(zoo1, zoo2) == zoo1 ? "Zoo 1 a plus d'animaux" : "Zoo 2 a plus d'animaux ou ils sont egaux"));
    }
}
