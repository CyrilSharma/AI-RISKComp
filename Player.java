import java.util.*;

public class Player{
   private String name;
   private int numTerritory;
   private int numCards;
   private Hand cards;
   private Player ally;
   
   
   
   public int calculateTroops(){ //no contenent bonus
      if((numTerritory / 3) > 3)
         return numTerritory / 3;
      else
         return 3;
   }

}