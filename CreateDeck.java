import java.util.Random;

public class CreateDeck {
    private String Colors;
//     public static Node[] Deck = new Node[56];

    static class Node{

        String rank;
        String color;
        Node next;


        public Node(String rank, String color){
            this.color = color;
            this.rank = rank;
            this.next = null;
        }
    }
    public static Node[] Deck = new Node[56]; //Goes here

    public Node head = null;
    public Node tail = null;

    //You dont need this
    public void NodeAdd(String rank, String color){

        Node new_node = new Node(rank, color);


        if(head == null){
            head = new_node;
        }
        else {
            tail.next = new_node;
        }
        tail = new_node;

    }
    //You dont need this either
    public void addinfo(){

        int count = 1;

        for (int i = 0; i < 4; i++){
            if (count == 1){
                Colors = CardUno.Colors[1];
                //Colors = "BLUE"
            }
            else if (count == 2)
                Colors = CardUno.Colors[2];
                //Colors = "YELLOW";
            else if (count == 3)
                Colors = CardUno.Colors[3];
                //Colors = "RED"; THIS WORKS AS WELL
            else if (count == 4)
                Colors = CardUno.Colors[4];
            //Colors = "GREEN";

            for(String elem: CardUno.Ranks){
                NodeAdd(elem,Colors);

            }
            count ++;

        }

        return;
    }
    //Get rid of this
    public static void swap(Node temp, Node temp2){

       Node decks = temp;
        temp = temp2;
        temp2 = decks;

    }
    
    public  void shuffle() {

//         Node decks = temp;
//         temp = temp2;
//         temp2 = decks;

        Node curr = head;

        Random rand = new Random();

        for(int i = 0; i < 56; i++){
            int random =  rand.nextInt(56);
            //swap it here
        }
    }

    public void display(){
        
        for (int i = 0; i < 56; i++){
            printf("%s %s\n", deck[i].rank, ceck[i].color);  
        }
    }

}

/***

 public void createDeck(){
    for (int i = 0; i < 56; i++){
        use the ranks thing form the other class you made
        node[i].rank = ranks[i]; 
        do the color thing in the C file that i gave you. 
    }
 }
**/
