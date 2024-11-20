package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
        System.out.println("Employé ajouté : " + employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (listeEmployes.remove(employe)) {
            System.out.println("Employé supprimé : " + employe);
        } else {
            System.out.println("Employé non trouvé : " + employe);
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getId));
        System.out.println("Liste triée par ID.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        listeEmployes.sort(Comparator.comparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println("Liste triée par département et grade.");
    }
}
