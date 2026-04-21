//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet service = new DepartementHashSet();
        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Finance", 15);
        Departement d4 = new Departement(4, "Marketing", 8);
        Departement d5 = new Departement(2, "RH", 10);

        service.ajouterDepartement(d1);
        service.ajouterDepartement(d2);
        service.ajouterDepartement(d3);
        service.ajouterDepartement(d4);
        service.ajouterDepartement(d5);
        System.out.println();
        service.afficherDepartements();
        System.out.println();
        service.rechercherDepartement("Finance");
        service.rechercherDepartement("Juridique");
        System.out.println();
        service.rechercherDepartement(d1);
        System.out.println();
        service.supprimerDepartement(d3);
        service.afficherDepartements();
        System.out.println();
        service.trierDepartementsParId();
        System.out.println();
        service.trierDepartementsParNomEtNombreEmployes();
    }
}