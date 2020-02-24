import java.util.*;

public class Territory{
   private String territoryName;
   private ArrayList<Territory> borders;
   private boolean isOccupied;
   private Player occupying;
   private int numTroops;
   
   public Territory(String s){
      territoryName = s;
      occupying = null;
      isOccupied = false;
      numTroops = 0;
   }
   
   public void addBorder(Territory t){
      //numBorders++;
      //add to log
   }
   
   public void deployTroops(Territory t, Player p, int n)
   {
      isOccupied = true;
      occupying = p;
      n = numTroops;
   }
   
   public String getName(){
      return territoryName;
   }
}