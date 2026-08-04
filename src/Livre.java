public class Livre extends Document {
    //constructeur
    public Livre(int id, String titre, String auteur, String type, int page, int annee) {
        super(id, titre, auteur, type, page, annee);
    }


    @Override
    public void afficherDetail() {
        System.out.println("Livre-id:" + id + " Titre: " + titre + "Auteur: " + " Page:" + " Année: " +
        annee);
    }
}

   


