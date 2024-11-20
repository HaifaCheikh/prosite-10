package Set;

public class Main {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 10);
        Departement d3 = new Departement(3, "Marketing", 30);

        DepartementHashSet departementHashSet = new DepartementHashSet();

        departementHashSet.ajouterDepartement(d1);
        departementHashSet.ajouterDepartement(d2);
        departementHashSet.ajouterDepartement(d3);

        System.out.println("Liste des départements:");
        departementHashSet.displayDepartement();

        System.out.println("\nRecherche du département 'Informatique': " + departementHashSet.rechercherDepartement("Informatique"));

        System.out.println("Recherche du département d3: " + departementHashSet.rechercherDepartement(d3));

        departementHashSet.supprimerDepartement(d2);
        System.out.println("\nListe des départements après suppression de 'Ressources Humaines':");
        departementHashSet.displayDepartement();

        System.out.println("\nListe des départements triée par ID:");
        departementHashSet.trierDepartementById().forEach(System.out::println);
    }
}

