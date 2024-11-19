public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        societe.ajouterEmploye(new employe(1, "Ben Abdelkader", "Sami", "Informatique", 5));
        societe.ajouterEmploye(new employe(2, "Ronaldo", "Cristiano", "Football", 3));
        societe.ajouterEmploye(new employe(3, "Salah", "Mohamed", "PingPong", 4));
        System.out.println("Afficher les employes");
        societe.displayEmploye();
        societe.trierEmployeParId();
        System.out.println("\nAfficher les employes en fonction de leur id:");
        societe.displayEmploye();
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\nAfficher les employesen fonction de leur nom, département et grade:");
        societe.displayEmploye();
        System.out.println("\nRechercher l'employe Sami : " + societe.rechercherEmploye("Ben Abdelkader"));
        societe.supprimerEmploye(new employe(2, "Inoxtag", "Ines", "Videaste", 3));
        System.out.println("\nEmployes apres la suppression:");
        societe.displayEmploye();
    }
}
