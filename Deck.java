import java.util.ArrayList;



import java.util.Random;



class Deck{

 ArrayList<Card> usedCard ;

 public int nUsed;

 private ArrayList<Card> cards;
 private ArrayList<Card> openCard; 

 //TODO: Please implement the constructor

 public Deck(int nDeck){

  cards=new ArrayList<Card>();

  

  int n = nDeck;

  for(int s = 0;s< n;s++){

      for(Card.Suit x : Card.Suit.values()){

      for(int  i= 1;i<= 13;i++){

       Card card = new Card(x,i);

       cards.add(card);

      }

      }

      }

  shuffle();

 } 

 //TODO: Please implement the method to print all cards on screen

 public void printDeck(){

  //Hint: print all items in ArrayList<Card> cards, 

  //please implement and reuse printCard method in Card class

  for(Card c : cards){

    c.printCard();

    System.out.print("\n");

  }

 }

 public ArrayList<Card> getAllCards(){

  return cards;

 }

 public void shuffle()

 {

  for(int i = 0;i<cards.size();i++){

  Random ra = new Random();

  int j = ra.nextInt(52);

  Card kk = cards.get(i);

  cards.set(i, cards.get(j));

  cards.set(j, kk);

  }

   usedCard = new ArrayList<Card>() ;
   openCard=new ArrayList<Card>() ;
  nUsed = 0;

 }

 public Card getOneCard(boolean isOpened)

 {

  

  if(nUsed == cards.size())

  {

   shuffle();

   usedCard.add(cards.get(nUsed));

   nUsed++;

   return usedCard.get(nUsed-1);

  }

  else

  {

   usedCard.add(cards.get(nUsed));

   nUsed++;

   return usedCard.get(nUsed-1);

  }

 }
public ArrayList<Card> getOpenedCard(){
	return openCard;
}
}
