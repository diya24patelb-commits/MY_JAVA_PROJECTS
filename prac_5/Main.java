abstract class Media {

    String title;
    int daysLate;

    Media(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double lateFee();
}


// Book class
class Book extends Media {

    Book(String title, int daysLate) {
        super(title, daysLate);
    }

    double lateFee() {
        return daysLate * 2;
    }
}

class Movie extends Media {

    Movie(String title, int daysLate) {
        super(title, daysLate);
    }

    double lateFee() {
        return daysLate * 5;
    }
}

class Game extends Media {

    Game(String title, int daysLate) {
        super(title, daysLate);
    }

    double lateFee() {
        return daysLate * 10;
    }
}

public class Main {

    public static void main(String[] args) {

        Media[] items = {
            new Book("Java Programming", 3),
            new Movie("Avengers", 2),
            new Game("GTA", 4),
            new Book("DSA", 5)
        };

        double total = 0;
        double highest = 0;

        for (Media m : items) {

            double fee = m.lateFee();

            System.out.println(
                m.title + " -> Late Fee = Rs. " + fee
            );

            total = total + fee;

            if (fee > highest) {
                highest = fee;
            }
        }

        System.out.println("-------------------------");
        System.out.println("Total Late Fees = Rs. " + total);
        System.out.println("Highest Late Fee = Rs. " + highest);
    }
}