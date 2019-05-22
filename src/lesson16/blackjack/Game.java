package lesson16.blackjack;

import java.util.ArrayList;

public class Game {
    private Cards cards = new Cards();
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void doFirstDeal() {
        System.out.println("Каждый игрок получает по две карты от дилера");
        for (Player player : players) {
            Card randomCard = cards.getRandomCard();
            player.addCardToHand(randomCard);
        }
        for (Player player : players) {
            Card randomCard = cards.getRandomCard();
            player.addCardToHand(randomCard);
        }
    }

    public void doRound() {
        for (Player player : players) {
            boolean ifNeedCard = player.doAction();
            if (ifNeedCard) {
                Card randomCard = cards.getRandomCard();
                player.addCardToHand(randomCard);
            }
        }
    }

    public boolean needDoRound() {
        for (Player player : players) {
            if (player.isContinue()) {
                return true;
            }
        }
        return false;
    }

    public void printResult() {
        for (int i = 0; i < players.size(); i++) {
            Player pl = players.get(i);
            System.out.println("Игрок " + i + " " + pl);
        }
        System.out.println("+++++++++++++++++++++++");
    }

    public void printWinner() {
        ArrayList<Player> list = new ArrayList<>(players);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPoints() > 21) {
                System.out.println(list.get(i) + " - проиграл");
                players.remove(list.get(i));
            }
        }

        Player winner;
        try {
             winner = players.get(0);
        }
        catch (Exception e) {
            return;
        }
        for( Player player: players) {
            if (player.getPoints() > winner.getPoints()) {
                winner = player;
            }
        }
        players.remove(winner);

        System.out.println(winner + " - Выйграл");

        for (Player player: players) {
            System.out.println(player + " - проиграл");
        }

    }
}
