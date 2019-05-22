package lesson16.blackjack;

public class Card {
    private String title;
    private int points;

    public Card() { }

    public Card(String title, int points) {
        this.title = title;
        this.points = points;
    }

    public String getTitle() {
        return title;
    }

    public int getPoints() {
        return points;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return title + ", " + points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getPoints() != card.getPoints()) return false;
        return getTitle() != null ? getTitle().equals(card.getTitle()) : card.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + getPoints();
        return result;
    }
}
