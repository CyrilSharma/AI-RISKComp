import java.util.*;
  
public class Hand
{
   private int size;
   private ArrayList<Card> cards;
   private ArrayList<Card> infantry;
   private ArrayList<Card> calvary;
   private ArrayList<Card> artillery;
  
   public Hand(){
      size = 0;
      cards = new ArrayList<Card>(); 
   }
   
   public void addCard(Card c){
      cards.add(c);
      size++;
      if (c.getType().equals("artillery"))
      {
         artillery.add(c);
         size++;
      }
      if (c.getType().equals("calvary"))
      {
         calvary.add(c);
         size++;
      }
      if (c.getType().equals("infantry"))
      {
         infantry.add(c);
         size++;
      }
   }
   
   public int numCards(){
      return size;
   }
   
   public ArrayList<Card> getCards(){
      return cards;
   }
   
   public boolean canTurnIn(Player p){
      if(artillery.size() >= 3)
      {
         return true;
      }
      if(calvary.size() >= 3)
      {
         return true;
      }
      if(infantry.size() >= 3)
      {
         return true;
      }
      if((infantry.size() >= 1) && (calvary.size() >= 1) && (infantry.size() >= 1))
      {
         return true;
      }
   }
   
   public boolean mustTurnIn(){
      if(size >= 5)
         return true;
      return false;
   }
   
   public int remove(int i1, int i2, int i3)
   {
      if(cards[i1].getType().equals(cards[i2].getType()) && cards[i3].getType().equals(cards[i2].getType()))
      {
      //return 
      }
   } 
   
   
}