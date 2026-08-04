
import java.io.FileWriter;
import java.io.IOException;

    public class Sauvegarde {

        public void sauvegarderCSV() throws IOException {

            FileWriter fichier = new FileWriter("documents.csv");

            fichier.write("id,titre,auteur,type,page,annee\n");

            fichier.close();
        }
    }
