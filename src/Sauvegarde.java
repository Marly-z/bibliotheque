
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

    public class Sauvegarde {

        public void sauvegarderCSV(ArrayList<Document> documents)  {
            try {
                FileWriter fichier = new FileWriter("documents.csv");

                fichier.write("id,titre,auteur,type,page,annee\n");
                for (Document doc:documents) {
                    fichier.write(doc.getId()+","+doc.getTitre() +","+doc.getAuteur()+","+doc.getType()+","+doc.getPage()+","+doc.getAnnee()+"\n");
                }

                fichier.close();
                System.out.println("Sauvegardé avec succès");
            } catch (IOException e) {
                System.out.println("Erreur survenue: " + e.getMessage());
            }
        }
    }