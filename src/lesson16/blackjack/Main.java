package lesson16.blackjack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Новая игра");
        Computer computer = new Computer();
        Human human = new Human();
        human.setName("Player1");
        Game game = new Game();
        game.addPlayer(computer);
        game.addPlayer(human);
        game.doFirstDeal();
        human.printHand();
        while (game.needDoRound()) {
            game.doRound();
            human.printHand();
        }
        game.printResult();
        game.printWinner();
    }
}
