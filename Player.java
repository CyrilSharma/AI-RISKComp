import java.util.*;

public class Player{
   private String name;
   private int numTerritory;
   private int numCards;
   private Hand cards;
   private Player ally;
   
   
   
   public int territoryBonus()
   { //no contenent bonus
      if((numTerritory / 3) > 3)
         return numTerritory / 3;
      else
         return 3;
   }
   
   public int getTroops(){
   //territoryBonus
   //if cards.canturnin
   //
   }
   
   public int continentBonus()
   {
   //once we get the graph running
   }
   public int cardBonus()
   {
   
   
   }

}