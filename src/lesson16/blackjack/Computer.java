package lesson16.blackjack;

public class Computer extends Player {

    @Override
    public boolean doAction() {

        if (getPoints() < 16) {
            System.out.println("Компьютер берет карту");
            System.out.println("***********************");
            return true;
        }
        this.setContinue(false);
        return false;
    }

    @Override
    public String toString() {
        return "Computer " + getPoints() + " очков";
    }
}
