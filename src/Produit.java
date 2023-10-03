import java.util.Date;

public class Produit {

    int id ;
    String libelle,marque ;
    float prix ;

    Date dateExp;
    static  int nbrproduit ;
    Produit(){
nbrproduit++;
    }
    Produit(int id ,String libelle,String marque ){
    this.id=id;
    this.libelle=libelle;
    this.marque=marque;
        nbrproduit++;
    }

    Produit(int id ,String libelle,String marque,float prix ){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        nbrproduit++;
    }
    Produit(int id ,String libelle,String marque,float prix,Date date ){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        this.dateExp=date;
        nbrproduit++;
    }
    void afficher(){
        System.out.println("l'id :"+id);
        System.out.println("le libelle :"+libelle);
        System.out.println("la marque  :"+this.marque);
        System.out.println("le prix :"+this.prix);
    }


    @Override
    public String toString(){
        return "l'id :"+id+"\nle libelle :"+libelle+"\nla marque  :"+this.marque+"\nle prix :"+this.prix+"\n date "+this.dateExp;
    }
}
