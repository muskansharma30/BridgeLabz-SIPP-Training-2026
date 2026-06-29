package oops.interfaces;

public interface TextModeration {

    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive content allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad")
                || post.toLowerCase().contains("hate")
                || post.toLowerCase().contains("abuse");
    }

    public static void main(String[] args) {

        ContentModerator moderator = new ContentModerator();

        String[] posts = {
                "I love Java programming",
                "This is a spam offer",
                "I hate everyone",
                "Buy now spam deal",
                "Have a nice day"
        };

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.checkSpam(post)) {
                System.out.println(post + " --> Spam Post");
            }
            else if (moderator.checkOffensiveContent(post)) {
                System.out.println(post + " --> Offensive Post");
            }
            else {
                System.out.println(post + " --> Valid Post");
            }
        }
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("spam");
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {
        System.out.println("Platform Moderation Policy:");
        System.out.println("1. No Spam");
        System.out.println("2. No Offensive Content");
    }
}
