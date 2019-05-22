package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Turnir turnir = new Turnir();
        turnir.addTeam("Spartak", 3);
        turnir.addTeam("Dinamo", 5);
        turnir.addTeam("Dinamo", 5);
        turnir.addTeam("Locomotiv", 7);
        turnir.addTeam("Chelsea", 15);
        turnir.addTeam("Valencia", 1);
        turnir.addTeam("Manchester", 7);
        int num = 10;
//        turnir.printTable();
//        turnir.printWinner();
//        turnir.printLoser();
        turnir.printSortedTable();
    }


}
