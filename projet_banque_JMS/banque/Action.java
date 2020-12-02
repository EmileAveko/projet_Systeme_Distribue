package banque;
import java.util.*;

public class Action{
       private String theme;
       private double valeur;
       private List <Action>  sous_actions;


       public Action(String theme, double valeur , List <Action> sous_actions){
           this.theme = theme ;
           this.valeur = valeur ;
           this.sous_actions = sous_actions;

       }
    
    public String getTheme(){
       return this.theme;
    }
     
     public double getValeur(){
      return this.valeur;
     }
     
     public List<Action> getSous_actions(){
         return this.sous_actions;
     }

     public void setTheme(String theme){
         this.theme =theme;

     }

     public void setValeur(double valeur){

        this.valeur = valeur;
     }

     public void setSous_actions(List <Action> sous_actions){
        this.sous_actions = sous_actions;
     }

     public void rajoutAction(Action action){
         this.sous_actions.add(action);
     }
}

