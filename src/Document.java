public abstract class Document implements Empruntable {
    //attribut commun
    protected int id;
    protected String titre;
    protected String auteur;
    protected String type;
    protected int page;
    protected int annee;
    protected boolean disponible;

    //constructeur
    public Document(int id, String titre, String auteur, String type, int page, int annee) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.type = type;
        this.page = page;
        this.annee = annee;
        this.disponible = true;
    }
    public String getTitre(){
        return titre;
    }
    public abstract void afficherDetail();

    // appelle les méthodes de l'interface

    @Override
    public void emprunter() {

        if (disponible =true){
            System.out.println("Le document:" + titre + "est disponible");
            disponible=false;
            System.out.println("Le document:" + titre + "emprunté avec succes");
        } else {
            System.out.println("Le document:" +titre+ "n'est pas disponible");
        }

        if (disponible = false){
        System.out.println("Le document:" + titre + "est déjà emprunté");
        }
        else {
        System.out.println("Le document:" +titre+ "est disponible");
    }}

    @Override
    public void retourner() {
        if (disponible = true) {
            System.out.println("Le document:" + titre + "a été retouné");
        }else{
            disponible=true;
            System.out.println("Le document:" + titre + "reourné avec succes");
        }
    }
    @Override
    public boolean estdisponible() {
        return disponible;
    }
}