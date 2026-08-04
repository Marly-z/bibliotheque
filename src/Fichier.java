import java.io.FileWriter; // ecrire le texte ds notre fichier
import java.io.IOException;
public class Fichier {
    public static void main(String[]args){ // départ du prog
        try{// ce code pt avoir des erreurs
            FileWriter fichier = new FileWriter("document.csv");// si doc.csv existe remplcé sinon créeé

            fichier.write("id,titre,auteur,type,page,annee,disponible");//entete

            fichier.write("1,Yaounde,Eto'o,Livre,100,2026,true\n");
            fichier.write("2,Douala,Essomba,Livre,120,2025,true\n");
            fichier.write("3,Bertoua,Takam,Livre,90,2024,true\n");
            fichier.write("4,Ebolowa,Souley,Livre,50,2023,true\n");
            fichier.write("5,Bamenda,Soufo,Livre,60,2022,true\n");
            fichier.write("6,Nkongsamba,Effoudou,Livre,70,2021,true\n");
            fichier.write("7,Eseka,Panda,Livre,200,2020,true\n");
            fichier.write("8,AbongMbang,Mazeka,Livre,150,2019,true\n");
            fichier.write("9,Garoua,Bell,Ebook,130,2020,true\n");
            fichier.write("10,Bafoussam,Penka,Revue,200,2021,true\n");
            fichier.write("11,Lolodorf,mava'ala,Livre,160,2022,true\n");
            fichier.write("12,Mfou,Folere,Revue,98,2023,true\n");
            fichier.write("13,Limbe,Epoh,Ebook,170,2024,true\n");
            fichier.write("14,Maroua,Ndoumbe,Livre,102,2025,true\n");
            fichier.write("15,Kribi,Etoo'o,Livre,100,2026,true\n");
            fichier.write("16,Yaounde,Etoo'o,Livre,-100,2020,true\n");
            fichier.close();// fermer le fichier
            System.out.println("Fichier créé");
        } catch (IOException e) {// si erreur affiche ce message
            System.out.println("Erreur:" +e.getMessage());
        }
    }

}