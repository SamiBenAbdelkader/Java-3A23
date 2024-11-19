import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<employe> {
    private List<employe> employes;


    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(employe t) {
        employes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (employe employe : employes) {
            if (employe.getnom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe t) {
        return employes.contains(t);
    }

    @Override
    public void supprimerEmploye(employe t) {
        employes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                return Integer.compare(e1.getid(), e2.getid());
            }
        });
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int result = e1.getnom().compareTo(e2.getnom());
                if (result == 0) {
                    result = e1.getnomD().compareTo(e2.getnomD());
                }
                if (result == 0) {
                    result = Integer.compare(e1.getGrade(), e2.getGrade());
                }
                return result;
            }
        });
    }

}
