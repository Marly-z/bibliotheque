import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
        int choix;
          do {
            System.out.println("      BIBLIOTHÈQUE NUMÉRIQUE");
        
            System.out.println("1. Afficher un document");
            System.out.println("2. Ajouter un document");
            System.out.println("3. Emprunter un document");
            System.out.println("4. Retourner un document");
            System.out.println("5. Afficher les documents disponibles");
            System.out.println("6. Sauvegarder dans le fichier CSV");
            System.out.println("7. Quitter");
            System.out.print("\nVotre choix : ");

            choix = clavier.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Affichage un document");
                    break;
                case 2:
                    System.out.println("Ajout d'un document");
                    break;
                case 3:
                    System.out.println("Emprunt d'un document");
                    break;
                case 4:
                    System.out.println("Retour d'un document");
                    break;
                case 5:
                    System.out.println("Documents disponibles");
                    break;

                case 6:
                    System.out.println("Sauvegarde du fichier CSV");
                    break;
                case 7:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
               clavier.close();

        document.add(livre);
        document.add(Revue);
        document.add(Ebook);
        livre.emprunter();
        Revue.emprunter();
        livre.retourner();
        revue.retourner();
