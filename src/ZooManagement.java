public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        // Instruction 1
        zoo.afficherMessage();

        // Instruction 2
        /*Scanner scanner = new Scanner(System.in);

        String nom;
        do {
            System.out.print("Entrez le nom du zoo : ");
            nom = scanner.nextLine().trim();
            if (nom.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne doit pas être vide.");
            }
        } while (nom.isEmpty());
        zoo.zooName = nom;
        int cages = 0;
        boolean valide = false;
        do {
            System.out.print("Entrez le nombre de cages : ");
            String saisie = scanner.nextLine().trim();
            try {
                cages = Integer.parseInt(saisie);
                if (cages > 0) {
                    valide = true;
                } else {
                    System.out.println("Erreur : le nombre de cages doit être un entier positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : veuillez entrer un entier valide.");
            }
        } while (!valide);
        zoo.nbrCages = cages;

        // Instruction 3 : affichage des changements
        zoo.afficherMessage();

        scanner.close();*/
    }
}
