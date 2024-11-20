package List;
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ahmed", "Ali", "IT", 5);
        Employe e2 = new Employe(2, "Salma", "Ben Said", "Finance", 3);
        Employe e3 = new Employe(3, "Youssef", "Mansour", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        System.out.println("Recherche par nom 'Ahmed' : " + societe.rechercherEmploye("Ahmed"));
        System.out.println("Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        societe.supprimerEmploye(e1);
        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
