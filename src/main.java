import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
        ArrayList<Document> document = new ArrayList<>();

        Livre livre = new Livre(1,"Yaounde","Eto'o","Livre",100,2026);
        Revue revue = new Revue(10,"Bafoussam","Penka","Revue",200,2021);
        Ebook ebook = new Ebook(8,"AbongMbang","Mazeka","Ebook",150,2019);

        document.add(livre);
        document.add(revue);
        document.add(ebook);
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
              clavier.nextLine();

              switch (choix) {
                  case 1:
                      System.out.println("entrer le titre du livre à afficher");
                      String titrerech= clavier.nextLine();

                      for(document doc:document){
                      if(doc.getTitre().equalsIgnoreCase(titrerech)){
                         doc.afficherDetail();
                      break;}
                      else{
                          System.out.println("Aucun document trouvé")
                      }
                      }}
              }
                      break;
                  case 2:
        System.out.print("Id du document : ");
        int id = clavier.nextInt();
        clavier.nextLine();

        System.out.print("Titre du document : ");
        String titre = clavier.nextLine();

        System.out.print("Auteur du document : ");
        String auteur = clavier.nextLine();

        System.out.print("Type du document (Livre/Revue/Ebook) : ");
        String type = clavier.nextLine();

        System.out.print("Nombre de pages : ");
        int page = clavier.nextInt();

        System.out.print("Année de publication : ");
        int annee = clavier.nextInt();
        clavier.nextLine();
        // Création du document selon le type choisi

        if (type.equalsIgnoreCase("Livre")) {

            document.add(new Livre(id, titre, auteur, type, page, annee));

        } else if (type.equalsIgnoreCase("Revue")) {

            document.add(new Revue(id, titre, auteur, type, page, annee));

        } else if (type.equalsIgnoreCase("Ebook")) {

            document.add(new Ebook(id, titre, auteur, type, page, annee));

        } else {

            System.out.println("Type de document invalide.");

        }


        System.out.println("Document ajouté avec succès.");

        break;
                  case 3:
        System.out.print("Entrez le titre du document à emprunter : ");
        String titreEmprunt = clavier.nextLine();
        for (Document doc : document) {
            if (doc.getTitre().equalsIgnoreCase(titreEmprunt)) {
                doc.emprunter();
                break;
            }else{
            System.out.println("Aucun document trouvé");
        }
        break;
                  case 4:
        System.out.print("Entrez le titre du document à retourner : ");
        String titreRetour = clavier.nextLine();
        for (Document doc : document) {

            if (doc.getTitre().equalsIgnoreCase(titreRetour)) {
                doc.retourner();
                break;
            }else {
            System.out.println("Aucun document trouvé ");
        }
                      break;

                  case 5:
                      System.out.println("Documents disponibles");
        for (Document doc : documents) {
            if (doc.estdisponible()) {
                doc.afficherDetail();}
            else{ System.out.println("Aucun document disponible.");}
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
          }while(choix!=7);
               clavier.close();


