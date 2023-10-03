public class Magazin {
    int id ;
    String adresse ;
    int capacity;
    Produit[] produits ;
    final int MAX_CAPA = 50;

    Magazin(){
        this.produits= new Produit[MAX_CAPA];
      }
    Magazin(int id,String adresse,int capacity){
        this.id=id;
        this.adresse=adresse;
        this.capacity=capacity;
        this.produits= new Produit[MAX_CAPA];

    }

    boolean addProduct (Produit p ){
        for (int i =0 ;i<this.capacity;i++){
            if(this.produits[i]==null){
                this.produits[i]=p;
                //nbrproduit++
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString (){
        String str ="";

for (int i = 0 ;i<this.capacity;i++ ){
if (this.produits[i]!=null){
    str +="\n nom "+this.produits[i].libelle+"\nPrix "+this.produits[i].prix;
}
}
        return "id :"+this.id+"\n adresse "+this.adresse+"\n capacite"+this.capacity+str;

}

}
