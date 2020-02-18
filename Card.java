import java.util.*;

public class Card{
   private String kind;
   //Infantry, Calvary, Artillary
   private Territory t;
   private boolean isBonus;
   //For +2
   
   public Card(String k, Territory ter, boolean b){
      kind = k;
      t = ter;
      isBonus = b;
   }
   
   public String getType(){
      return kind;
   }
   
   public Territory getTerr(){
      return t;
   }
   
   public String toString(){
      if(isBonus)
         return kind + " Card - " + t.getName() + " (has Bonus)";
      else
         return kind + " Card - " + t.getName();
   }
}