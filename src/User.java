import java.util.ArrayList;
public class User {
    private int id;
    private String nom;
    private ArrayList<Document> doc_Emprunte;
    private int max_emprunt = 3;

    public User(int id, String nom) {
        this.id = id;
        this.nom = nom;
        doc_Emprunte = new ArrayList<>();
    }

    public void emprunterDoc(Document document) {

        if (doc_Emprunte.size() >= max_emprunt) {
            System.out.println("Nombre maximal atteint");
            return;
        }
            if (document.estDisponible()) {
                document.emprunter();
                doc_Emprunte.add(document);
                System.out.println(nom + " a emprunté " + document.getTitre());
            } else{System.out.println("non disponible");
            }
}
        public void retournerDoc (Document document){
            if (doc_Emprunte.contains(document)) {
        document.retourner();
            System.out.println("Document retourné : " + document.getTitre());
                doc_Emprunte.remove(document);
            }
            else{
                System.out.println(
                        "Cet utilisateur n'a pas emprunté ce document");
            }
        }
        }