import java.util.ArrayList;
public class Statistique {
    private ArrayList<Document> document;

    public Statistique(ArrayList<Document> document) {
        this.document = document;
    }

    public void nbreEmpruntCat() {
        int livre = 0;
        int revue = 0;
        int ebook = 0;
        for (Document doc : document) {
            if (doc instanceof Livre) {
                livre++;
            }
            else if (doc instanceof Revue) {
                revue++;
            }
            else if (doc instanceof Ebook) {
                ebook++;
            }
        }
     System.out.println("Livre emprunté:"+livre+"revue empruntéé:"+revue);
}
// doc le + emprunté
public void docplusEmprunt(){
    Document maxi=null;
    int max=0;
            for(Document doc:document){
                if(doc.getNbreEmprunt()>max){
                    max=doc.getNbreEmprunt();
                    maxi=doc;
                }
              }
            if(max!=0){
                System.out.println("le document le plus emprunté est:"+maxi.getTitre()+ "avec "+max+ " emprunts");
            }else{
                System.out.println("pas d'emprunt");
            }}
}