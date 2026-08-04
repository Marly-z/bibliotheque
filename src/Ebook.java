public class Ebook extends Document{
    //constructeur
    public Ebook(int id,String titre,String auteur,String type,int page,int annee){
        super(id,titre,auteur,type,page,annee);
    }
    @Override
    public  void afficherDetail(){
        System.out.println("Id:" + id +"; Auteur:" +auteur+ "; année:" +annee+ "titre:"+titre );
    }
}