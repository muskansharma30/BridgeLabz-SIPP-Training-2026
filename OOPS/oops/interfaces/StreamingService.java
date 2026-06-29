package oops.interfaces;

public interface StreamingService {

    void streamContent();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        tv.streamContent();
        System.out.println();

        tv.playGame();
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {
            "Avengers",
            "Inception",
            "Interstellar"
    };

    String[] games = {
            "Minecraft",
            "FIFA",
            "GTA V"
    };

    @Override
    public void streamContent() {

        System.out.println("Available Movies:");

        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void playGame() {

        System.out.println("Available Games:");

        for (String game : games) {
            System.out.println(game);
        }
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}
