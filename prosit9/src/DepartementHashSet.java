import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class DepartementHashSet implements Idepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        if (departements.add(departement)) {
            System.out.println("Département ajouté : " + departement);
        } else {
            System.out.println("Département déjà existant : " + departement);
        }
    }
    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                System.out.println("Département trouvé : " + d);
                return true;
            }
        }
        System.out.println("Département introuvable : " + nomDepartement);
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        if (departements.contains(departement)) {
            System.out.println("Département trouvé : " + departement);
            return true;
        }
        System.out.println("Département introuvable : " + departement);
        return false;
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        if (departements.remove(departement)) {
            System.out.println("Département supprimé : " + departement);
        } else {
            System.out.println("Département introuvable, suppression impossible.");
        }
    }
    @Override
    public void afficherDepartements() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département enregistré.");
            return;
        }
        System.out.println("Liste des départements ");
        for (Departement d : departements) {
            System.out.println(d);
        }
    }
    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparingInt(Departement:getId));
        System.out.println(" Départements triés par ID ");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparing(Departement::getNomDepartement)
                .thenComparingInt(Departement::getNombreEmployes));
        System.out.println("Départements triés par nom puis nombre d'employés");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}
