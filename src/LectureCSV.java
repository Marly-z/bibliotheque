
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectureCSV{
    public ArrayList<Document>lireCSV(String document){
    ArrayList<Document>documents=new ArrayList<>();

    try(BufferedReader lecteur=new BufferedReader(new FileReader(document))){
    lecteur.readLine();// lire l'entete ss la traiter

    String ligne;
    while((ligne=lecteur.readLine())!=null) {
    String[]donnees=ligne.split(",");

            int id=Integer.parseInt(donnees[0]);
            String titre=donnees[1];
           String auteur=donnees[2];
        String type=donnees[3];
        int annee=Integer.parseInt(donnees[5]);
        int page=Integer.parseInt(donnees[4]);

        Document doc;

        if (type.equalsIgnoreCase("Livre")) {
            doc = new Livre(id, titre, auteur, type, page, annee);
        } else if (type.equalsIgnoreCase("Revue")) {
            doc = new Revue(id, titre, auteur, type, page, annee);
        } else if (type.equalsIgnoreCase("Ebook")) {
            doc = new Ebook(id, titre, auteur, type, page, annee);
        } else {
            System.out.println("Type inconnu:" + type);
            break;
        }
        documents.add(doc);
    }}
    catch(IOException e){
        System.out.println("erreur de lecture:"+e.getMessage());
    } return documents;}
}