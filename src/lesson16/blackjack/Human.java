package lesson16.blackjack;

import java.util.Scanner;

public class Human extends Player {
    private String name;
    @Override
    public boolean doAction() {
        if (isContinue() == false) {
            return false;
        }
        System.out.println("Ваши действия?");
        System.out.println("любая клавиша - не брать карту");
        System.out.println("1 - взять еще карту");
        Scanner sc = new Scanner(System.in);
        String humanInput = sc.nextLine();
        if (humanInput.equals("1")){
            System.out.println(this.name + " - Вы берете карту");
            return true;
        }
        this.setContinue(false);
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + getPoints() + " очков";
    }
}
