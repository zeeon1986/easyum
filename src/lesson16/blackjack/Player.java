package lesson16.blackjack;

import java.util.ArrayList;

public abstract class Player {
    protected ArrayList<Card> hand = new ArrayList<>();
    private boolean isContinue = true;

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public void printHand(){
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Ваши карты:");
        for (Card card: hand) {
            System.out.println(card);
        }
        System.out.println("+++++++++++++++++++++++");
    }

    public boolean isContinue() {
        return isContinue;
    }

    public void setContinue(boolean aContinue) {
        isContinue = aContinue;
    }

    public int getPoints(){
        int countPoints = 0;
        for (Card card : hand) {
            countPoints = countPoints + card.getPoints();
        }
        return countPoints;
    }

    public abstract boolean doAction();
}
