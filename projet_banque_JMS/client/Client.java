package client;



public class Client {

    private String nom;
    private String profession;

    public Client( String nom , String profession)
     {
         this.nom = nom;
         this.profession = profession;

     }

     public void setNom( String nom){
         this.nom = nom;
     }

      public void setProfession( String profession){
         this.profession = profession;
     }

      public String getProfession(){
             return this.profession;
     }

      public String getNom( ){
         return  this.nom;
     }

}