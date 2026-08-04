public class Revue extends Document {
    //constructeur
    public Revue(int id, String titre, String auteur, String type, int page, int annee) {

        super(id, titre, auteur, type, page, annee);


    }

    @Override
    public void afficherDetail() {
        System.out.println("Auteur:" + auteur + "; année:" + annee + "titre:" + titre);
    }
}