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
   
   public void manageTroops(int x){
      numTroops += x;
   }
   
   public String getName(){
      return territoryName;
   }
}