public class ZooManagement {
    // Déclaration des variables
    int nbrCages = 20;
    String zooName = "my zoo";

    // Méthode principale
    public static void main(String[] args) {
        // Création d'une instance de la classe ZooManagement
        ZooManagement zoo = new ZooManagement();
        // Appel de la méthode pour afficher le message
        zoo.displayZooInfo();
    }

    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}