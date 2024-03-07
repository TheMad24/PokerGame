public class Card {
    int num;
    String sym;
    /*
    clubs (♣),
    diamonds (♦),
    hearts (♥)
    spades (♠)
     */

    public Card(int num,String sym){
        this.num = num;
        this.sym = sym;
    }

    void showCard(){
        System.out.println(num+sym);
    }

    Card[] createDeck(){
        Card[] d ={} ;

        Card[] deck = new Card[52] ;
        for (int i=0;i<52;i++){
            int count = 0;
            int j=i+1;
            while (j>13){
                j = j -13;
                count++;
            }
            if (count == 0){
                deck[i] = new Card(j,"♣");

            }else if (count == 1){
                deck[i] = new Card(j,"♦");

            }else if (count == 2){
                deck[i] = new Card(j,"♥");
            }else {
                deck[i] = new Card(j,"♠");
            }
        }
        return deck;
    }

    public static void main(String[] args) {
        Card obj = new Card(5,"♣");
        Card[] arr = obj.createDeck();
        for(int i=0;i<52;i++){

            arr[i].showCard();
        }
    }
}
