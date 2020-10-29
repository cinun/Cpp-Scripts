import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

public class PlayerHand {

//wanted to use some of the info from CreateDeck
  public CreateDeck decks = new CreateDeck();

  public final CardUno[] hand = new CardUno[8];

  String Workout[]  = {"Push Ups", "Squat","Sit Ups", "Lounges"};


  public void player_hand(){


  //This works
    for(int j = 0; j < 7; j++) {
      CardUno deck1 = new CardUno(CardUno.Ranks[j % CardUno.Ranks.length], CardUno.Colors[j % CardUno.Colors.length]);
      hand[j] = deck1;
      System.out.println(hand[j].getRank() + hand[j].getColor());


    }

    System.out.println();
    System.out.println("Workout Regimen: ");
    System.out.println();

    for (int j = 0; j < 7; j++){

      if (CardUno.Colors[j% CardUno.Colors.length] == "BLUE")
        System.out.println(Workout[0]);
      if (CardUno.Colors[j% CardUno.Colors.length] == "YELLOW")
        System.out.println(Workout[1]);
      if (CardUno.Colors[j% CardUno.Colors.length] == "RED")
        System.out.println(Workout[2]);
      if (CardUno.Colors[j % CardUno.Colors.length] == "GREEN")
        System.out.println(Workout[3]);

    }
  }

  public void sortHand(){
    String temp;


//    System.out.println("Here is the sorted hand");
//    for(int j = 0; j < hand.length; j++){
//      for (int i = j + 1; i < hand.length; i++){
//        if(hand[i].getColor()== hand[j].getColor()){
//          temp = hand[j].getColor();
//          hand[j].getColor() = hand[i].getColor();
//          hand[i].getColor() = temp;
//        }
//      }
//    }
//
  }

}