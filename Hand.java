import java.util.*;
  
public class Hand{
   private int size;
   private ArrayList<Card> cards;
   
   public Hand(){
      size = 0;
      cards = new ArrayList<Card>(); 
   }
   
   public void addCard(Card c){
      cards.add(c);
      size++;
   }
   
   public int numCards(){
      return size;
   }
   
   public ArrayList<Card> getCards(){
      return cards;
   }
   
   public boolean canTurnIn(){
      if(cards.size() < 3){
         return false;
      }
      else{
         //if 
      }
   }
   
   public boolean mustTurnIn(){
      if(size >= 5)
         return true;
      return false;
   }
   
   public int remove(int i1, int i2, int i3){
      if(cards[i1].getType() == cards[i2].getType() && cards[i3].getType() == cards[i2].getType()){
         return 
      }
   } 
   
   
}