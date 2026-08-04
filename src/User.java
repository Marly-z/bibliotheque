import java.util.ArrayList;
public class User {
    private int id;
    private String nom;
    private ArrayList<Document> doc_emprunte;
    private int max_emprunt = 3;

    public User(int id, String nom) {
        this.id = id;
        this.nom = nom;
        doc_emprunte = new ArrayList<>();
    }

    public void emprunterDoc(Document document) {
        max_emprunt=3
        if (doc_emprunte.size() >= max_emprunt) {
            System.out.println("Nombre maximal atteint");
            return;
        } else {
            if (document.estDisponible()) {
                document.emprunter();
                doc_emprunte.add(document);
                System.out.println(nom + " a emprunté " + document.getTitre());
            } else {
                System.out.println("Document non disponible");
            }
        }}
        public void retournerDoc (Document document){
            if (doc_emprunte.contains(document)) {
        document.retourner();
            doc_emprunte.remove(document);
            System.out.println("Document retourné : " + document.getTitre());
             }
            else{
                System.out.println(
                        "Cet utilisateur n'a pas emprunté ce document"
                );}
        }
    }
