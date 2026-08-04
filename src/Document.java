public abstract class Document implements Empruntable {
    //attribut commun
    protected int id;
    protected String titre;
    protected String auteur;
    protected String type;
    protected int page;
    protected int annee;
    protected boolean disponible;
    protected int nbreEmprunt;

    //constructeur
    public Document(int id, String titre, String auteur, String type, int page, int annee) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.type = type;
        this.page = page;
        this.annee = annee;
        this.disponible = true;
        this.nbreEmprunt=0;
    }
    public String getTitre(){

        return titre;
    }

    public int getId(){

        return id;
    }

    public String getAuteur(){

        return auteur;
    }

    public int getPage(){

        return page;
    }
    public String getType(){

        return type;
    }

    public int getAnnee(){

        return annee;
    }

    public int getNbreEmprunt(){
        return nbreEmprunt;
    }

    public abstract void afficherDetail();


    @Override
    public void emprunter() {

        if (disponible){
            System.out.println("Le document:" + titre + "est disponible");
            disponible=false;
            nbreEmprunt++;
            System.out.println("Le document:" + titre + "emprunté avec succes");
        } else {
            System.out.println("Le document:" +titre+ "n'est pas disponible");
        }
    }

    @Override
    public void retourner() {
        if (disponible) {
            System.out.println("Le document:" + titre + "a été retouné");
             disponible=true;
        }else{
            System.out.println("Le document:" + titre + "reourné avec succes");
        }
    }
    @Override
    public boolean estDisponible() {

        return disponible;
    }
}